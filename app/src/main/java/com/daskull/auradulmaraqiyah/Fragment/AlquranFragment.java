package com.daskull.auradulmaraqiyah.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.daskull.auradulmaraqiyah.Adapter.AuradAdapter;
import com.daskull.auradulmaraqiyah.Adapter.SurahAdapter;
import com.daskull.auradulmaraqiyah.AlquranListFragment;
import com.daskull.auradulmaraqiyah.R;
import com.daskull.auradulmaraqiyah.model.Aurad;
import com.daskull.auradulmaraqiyah.model.Surah;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class AlquranFragment extends Fragment implements SurahAdapter.ISurahListener {

    RecyclerView recyclerViewSUrah;
    ArrayList<Surah> list;
    SurahAdapter adapter;
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
    public AlquranFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View itemView =  inflater.inflate(R.layout.fragment_alquran, container, false);


        recyclerViewSUrah = itemView.findViewById(R.id.recyclerSurah);
        list = new ArrayList<Surah>();


        loadData();
        initView();
        return itemView;
    }

    private void initView() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        recyclerViewSUrah.setLayoutManager(linearLayoutManager);
        recyclerViewSUrah.setHasFixedSize(true);
    }

    private void loadData() {
        list.add(new Surah("Al-Fatihah"));
        list.add(new Surah("Al-Baqarah"));
        list.add(new Surah("AliImran"));
        list.add(new Surah("An-Nisaa"));
        list.add(new Surah("Al-Maidah"));
        list.add(new Surah("Al-An'am"));
        list.add(new Surah("Al-A'raf"));
        list.add(new Surah( "Al-Anfaal"));
        list.add(new Surah("At-Taubah"));
        list.add(new Surah("Yunus"));
        list.add(new Surah("Huud"));
        list.add(new Surah("Yusuf"));
        list.add(new Surah("Ar-Ra'd"));
        list.add(new Surah("Ibrahim"));
        list.add(new Surah("Al-Hijr"));
        list.add(new Surah("An-Nahl"));
        list.add(new Surah("Al-Israa'"));
        list.add(new Surah("Al-Kahfi"));
        list.add(new Surah("Maryam"));
        list.add(new Surah("Thaahaa"));
        list.add(new Surah("Al-Anbiyaa"));
        list.add(new Surah("Al-Hajj"));
        list.add(new Surah("Al-Mu'minuun"));
        list.add(new Surah("An-Nuur"));
        list.add(new Surah("Al-Furqaan"));
        list.add(new Surah("Asy-Syu'araa"));
        list.add(new Surah("An-Naml"));
        list.add(new Surah("Al-Qashash"));
        list.add(new Surah("Al-'Ankabuut"));
        list.add(new Surah("Ar-Ruum"));
        list.add(new Surah("Luqman"));
        list.add(new Surah("As-Sajdah"));
        list.add(new Surah("Al-Ahzab"));
        list.add(new Surah("Saba'"));
        list.add(new Surah("Faathir"));
        list.add(new Surah("YaaSiin"));
        list.add(new Surah("Ash-Shaaffat"));
        list.add(new Surah("Shaad"));
        list.add(new Surah("Az-Zumar"));
        list.add(new Surah("Al-Mu'min"));
        list.add(new Surah("Fushshilat"));
        list.add(new Surah("Asy-Syuura"));
        list.add(new Surah("Az-Zukhruf"));
        list.add(new Surah("Ad-Dukhaan"));
        list.add(new Surah("Al-Jaatsiyah"));
        list.add(new Surah("Al-Ahqaaf"));
        list.add(new Surah("Muhammad"));
        list.add(new Surah("Al-Fat-h"));
        list.add(new Surah("Al-Hujuraat"));
        list.add(new Surah("Qaaf"));
        list.add(new Surah("Adz-Dzaariyat"));
        list.add(new Surah("Ath-Thuur"));
        list.add(new Surah("An-Najm"));
        list.add(new Surah("Al-Qamar"));
        list.add(new Surah("Ar-Rahmaan"));
        list.add(new Surah("Al-Waaqi'ah"));
        list.add(new Surah("Al-Hadiid"));
        list.add(new Surah( "Al-Mujaadilah"));
        list.add(new Surah("Al-Hasyr"));
        list.add(new Surah("Al-Mumtahanah"));
        list.add(new Surah("Ash-Shaff"));
        list.add(new Surah("Al-Jumuah"));
        list.add(new Surah("Al-Munaafiqun"));
        list.add(new Surah("At-Taghaabun"));
        list.add(new Surah("Ath-Thalaaq"));
        list.add(new Surah("At-Tahriim"));
        list.add(new Surah("Al-Mulk"));
        list.add(new Surah("Al-Qalam"));
        list.add(new Surah("Al-Haaqqah"));
        list.add(new Surah("Al-Ma'aarij"));
        list.add(new Surah("Nuh"));
        list.add(new Surah("Al-Jin"));
        list.add(new Surah("Al-Muzzammil"));
        list.add(new Surah("Al-Muddatstsir"));
        list.add(new Surah("Al-Qiyaamah"));
        list.add(new Surah("Al-Insaan"));
        list.add(new Surah("Al-Mursalaat"));
        list.add(new Surah("An-Naba'"));
        list.add(new Surah("An-Naazi'aat"));
        list.add(new Surah("'Abasa,42"));
        list.add(new Surah("At-Takwiir"));
        list.add(new Surah("Al-Infithaar"));
        list.add(new Surah("Al-Muthaffif"));
        list.add(new Surah("Al-Insyiqaaq"));
        list.add(new Surah("Al-Buruuj"));
        list.add(new Surah("Ath-Thaariq"));
        list.add(new Surah("Al-A'laa"));
        list.add(new Surah("Al-Ghaasyiyah"));
        list.add(new Surah("Al-Fajr"));
        list.add(new Surah("Al-Balad"));
        list.add(new Surah("Asy-Syams"));
        list.add(new Surah("Al-Lail"));
        list.add(new Surah("Adh-Dhuhaa"));
        list.add(new Surah("Al-Insyirah"));
        list.add(new Surah("At-Tiin"));
        list.add(new Surah("Al-'Alaq"));
        list.add(new Surah("Al-Qadr"));
        list.add(new Surah("Al-Bayyinah"));
        list.add(new Surah("Az-Zalzalah"));
        list.add(new Surah("Al-'Aadiyaat"));
        list.add(new Surah("1Al-Qaari'ah"));
        list.add(new Surah("At-Takaatsur"));
        list.add(new Surah("Al-'Ashr"));
        list.add(new Surah("Al-Humazah"));
        list.add(new Surah("Al-Fiil"));
        list.add(new Surah("Quraisy"));
        list.add(new Surah("Al-Maa'uun"));
        list.add(new Surah("Al-Kautsar"));
        list.add(new Surah("Al-Kaafiruun"));
        list.add(new Surah("An-Nashr"));
        list.add(new Surah("Al-Lahab"));
        list.add(new Surah("Al-Ikhlash"));
        list.add(new Surah("Al-Falaq"));
        list.add(new Surah("An-Naas"));

        adapter = new SurahAdapter(list,getActivity(),AlquranFragment.this);
        recyclerViewSUrah.setAdapter(adapter);
    }

    @Override
    public void onSurahCLickListener(int position) {
        Bundle bundle = new Bundle();
        bundle.putInt("pos",position+1);
        bundle.putString("surat",list.get(position).getNamaSurah());

        AlquranListFragment alquranListFragment=new AlquranListFragment();
        alquranListFragment.setArguments(bundle);
        getActivity().getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container,alquranListFragment)
                .addToBackStack(null)
                .commit();

    }
}
