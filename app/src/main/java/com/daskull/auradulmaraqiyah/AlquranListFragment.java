package com.daskull.auradulmaraqiyah;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.os.AsyncTask;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.daskull.auradulmaraqiyah.Adapter.Adapter;
import com.daskull.auradulmaraqiyah.Adapter.DBHelper;
import com.daskull.auradulmaraqiyah.Adapter.Item;
import com.daskull.auradulmaraqiyah.Adapter.QuranDAO;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;


/**
 * A simple {@link Fragment} subclass.
 */
public class AlquranListFragment extends Fragment {
    TextView keterangan;
    AlertDialog.Builder dialog;
    private SharedPreferences preferences;
    private SharedPreferences.Editor editor;
    //general
    private SQLiteDatabase db;
    private String[] surahName = {"Al-Fatihah", "Al-Baqarah", "AliImran", "An-Nisaa", "Al-Maidah", "Al-An'am", "Al-A'raf", "Al-Anfaal", "At-Taubah", "Yunus", "Huud",
            "Yusuf", "Ar-Ra'd", "Ibrahim", "Al-Hijr", "An-Nahl", "Al-Israa'", "Al-Kahfi", "Maryam", "Thaahaa", "Al-Anbiyaa", "Al-Hajj", "Al-Mu'minuun", "An-Nuur",
            "Al-Furqaan", "Asy-Syu'araa", "An-Naml", "Al-Qashash", "Al-'Ankabuut", "Ar-Ruum", "Luqman", "As-Sajdah", "Al-Ahzab", "Saba'", "Faathir", "YaaSiin",
            "Ash-Shaaffat", "Shaad", "Az-Zumar", "Al-Mu'min", "Fushshilat", "Asy-Syuura", "Az-Zukhruf", "Ad-Dukhaan", "Al-Jaatsiyah", "Al-Ahqaaf", "Muhammad",
            "Al-Fat-h", "Al-Hujuraat", "Qaaf", "Adz-Dzaariyat", "Ath-Thuur", "An-Najm", "Al-Qamar", "Ar-Rahmaan", "Al-Waaqi'ah", "Al-Hadiid", "Al-Mujaadilah",
            "Al-Hasyr", "Al-Mumtahanah", "Ash-Shaff", "Al-Jumuah", "Al-Munaafiqun", "At-Taghaabun", "Ath-Thalaaq", "At-Tahriim", "Al-Mulk", "Al-Qalam", "Al-Haaqqah",
            "Al-Ma'aarij", "Nuh", "Al-Jin", "Al-Muzzammil", "Al-Muddatstsir", "Al-Qiyaamah", "Al-Insaan", "Al-Mursalaat", "An-Naba'", "An-Naazi'aat", "'Abasa,42",
            "At-Takwiir", "Al-Infithaar", "Al-Muthaffif", "Al-Insyiqaaq", "Al-Buruuj", "Ath-Thaariq", "Al-A'laa", "Al-Ghaasyiyah", "Al-Fajr", "Al-Balad", "Asy-Syams",
            "Al-Lail", "Adh-Dhuhaa", "Al-Insyirah", "At-Tiin", "Al-'Alaq", "Al-Qadr", "Al-Bayyinah", "Az-Zalzalah", "Al-'Aadiyaat", "1Al-Qaari'ah", "At-Takaatsur",
            "Al-'Ashr", "Al-Humazah", "Al-Fiil", "Quraisy", "Al-Maa'uun", "Al-Kautsar", "Al-Kaafiruun", "An-Nashr", "Al-Lahab", "Al-Ikhlash", "Al-Falaq", "An-Naas"};
    private SharedPreferences settings;

    //component
    private ListView listview;
    private AutoCompleteTextView autoCompleteTextView;
    private ProgressBar pBar;
    private TextView txtSilahkanCari;

    public AlquranListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View itemView= inflater.inflate(R.layout.fragment_alquran_list, container, false);
        dialog = new AlertDialog.Builder(getActivity());
        listview = itemView.findViewById(R.id.listview);
        pBar = itemView.findViewById(R.id.pBar);
        txtSilahkanCari = itemView.findViewById(R.id.txtSilahkanCari);
        autoCompleteTextView = itemView.findViewById(R.id.autocomplete);
        keterangan=itemView.findViewById(R.id.keterangan);

        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                onLoadingCari();
                String selection = (String) adapterView.getItemAtPosition(i);
                int pos = -1;

                for (int j = 0; j < surahName.length; j++) {
                    if (surahName[j].equals(selection)) {
                        pos = j;
                        break;
                    }
                }



                onAfterLoadingCari();
            }
        });

        //init data pas pertama kali buka android saja
        settings = getActivity().getSharedPreferences("myalqruans", 0);
        if (settings.getBoolean("firsttime", true)) {
            initData();
        } else {
            //onAfterLoadingFirst();
        }
        setToListView();

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            View dialogView;
            LayoutInflater inflater;
            TextView suratTerahir,ayatTerahir;

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                inflater = getLayoutInflater();
                dialogView = inflater.inflate(R.layout.costum_history_dialog, null);
                dialog.setView(dialogView);
                dialog.setCancelable(true);
                dialog.setTitle("Tandai bacaan terahir");
                Bundle bundle=getArguments();
                NumberFormat nf=NumberFormat.getInstance(new Locale("ar","EG"));
                ayatTerahir=dialogView.findViewById(R.id.ayatTerahir);
                suratTerahir=dialogView.findViewById(R.id.suratTerahir);
                suratTerahir.setText(bundle.getString("surat"));
                ayatTerahir.setText(nf.format(position+1));

                dialog.setPositiveButton("Tandai", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        Toast.makeText(getActivity(), "tandai", Toast.LENGTH_SHORT).show();
                        preferences = getActivity().getSharedPreferences("batas", Context.MODE_PRIVATE);
                        //Digunakan Untuk Pengaturan Konfigurasi SharedPreferences
                        editor = preferences.edit();

                        //Memasukan Data Pada Editor SharedPreferences dengan key (data_saya)
                        editor.putString("suratTerahir", suratTerahir.getText().toString());
                        editor.putString("ayatTerahir", ayatTerahir.getText().toString());

                        //Menjalankan Operasi
                        editor.apply();
                        keterangan.setText("Surat terahir yang dibaca :"+preferences.getString("suratTerahir","belum ada")+
                                preferences.getString("ayatTerahir","belum ada"));


                    }
                });

                dialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });

        return  itemView;
    }



    private void initData() {
        DBHelper dbHelper = new DBHelper(getContext());
        db = dbHelper.getWritableDatabase();
        new doBackground().execute();
    }

    class doBackground extends AsyncTask<Void, Integer, Void> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            onLoadingFirst();
        }

        @Override
        protected Void doInBackground(Void... voids) {
            insertFromFile(getActivity(), R.raw.quran);
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            onAfterLoadingFirst();
        }
    }

    public void insertFromFile(Context context, int resourceId) {
        try {
            InputStream insertsStream = context.getResources().openRawResource(resourceId);
            BufferedReader insertReader = new BufferedReader(new InputStreamReader(insertsStream));

            db.beginTransaction();

            while (insertReader.ready()) {
                String insertStmt = insertReader.readLine();
                db.execSQL(insertStmt);
            }

            db.setTransactionSuccessful();
            db.endTransaction();

            insertReader.close();

            settings.edit().putBoolean("firsttime", false).apply();
        } catch (IOException e) {
            onAfterLoadingFirst();
            txtSilahkanCari.setText("Gagal Memasukkan Quran");
            e.printStackTrace();
        }
    }

    private void setToListView() {
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity(),
                android.R.layout.simple_dropdown_item_1line, surahName);
        autoCompleteTextView.setAdapter(adapter);
    }

    private void onLoadingFirst() {
        txtSilahkanCari.setVisibility(View.GONE);
        listview.setVisibility(View.VISIBLE);
        pBar.setVisibility(View.VISIBLE);
    }

    private void onAfterLoadingFirst() {
        pBar.setVisibility(View.GONE);
        listview.setVisibility(View.VISIBLE);
        txtSilahkanCari.setVisibility(View.GONE);
    }

    private void onLoadingCari() {
        txtSilahkanCari.setVisibility(View.GONE);
        listview.setVisibility(View.GONE);
        pBar.setVisibility(View.VISIBLE);
    }

    private void onAfterLoadingCari() {
        pBar.setVisibility(View.GONE);
        txtSilahkanCari.setVisibility(View.GONE);
        listview.setVisibility(View.VISIBLE);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onStart() {
        super.onStart();
        SharedPreferences ket = getActivity().getSharedPreferences("batas", Context.MODE_PRIVATE);
        keterangan.setText("Surat terahir yang dibaca\n"+ket.getString("suratTerahir","belum ada")+" ayat : "+
                ket.getString("ayatTerahir","belum ada"));
        onAfterLoadingCari();
        Bundle bundle=getArguments();
        List<Item> listData = new QuranDAO(getActivity()).getListDataWhereCriteria("suraId", bundle.getInt("pos"));
        String[] ayat = new String[listData.size()];
        for (int j = 0; j < listData.size(); j++) {
            ayat[j] = listData.get(j).getAyahText();
        }

        Adapter adapter = new Adapter(getActivity(), R.layout.item, listData);
        listview.setAdapter(adapter);

    }
}
