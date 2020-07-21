package com.daskull.auradulmaraqiyah.Fragment;

import android.Manifest;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager.widget.ViewPager;

import android.telecom.Call;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import com.daskull.auradulmaraqiyah.R;
import com.daskull.auradulmaraqiyah.ViewPagerAdapter;
import com.daskull.auradulmaraqiyah.model.Items;
import com.daskull.auradulmaraqiyah.model.Jadwal;
import com.daskull.auradulmaraqiyah.network.ApiClient;
import com.daskull.auradulmaraqiyah.network.ApiInterface;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static android.content.Context.MODE_PRIVATE;
import static androidx.core.content.ContextCompat.checkSelfPermission;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment implements AdapterView.OnItemSelectedListener {

    String username_key_new = "";
    LocationManager locationManager;
    TextView txtSubuh, txttanggal ;
    EditText alamat;
    TextView txtDzuhur;
    TextView txtAshar;
    TextView txtMaghrib;
    TextView txtIsya;
    double latitude;
    double longitude;
    ViewPager viewPager;
    String lok_long, lok_lat;
    ImageView yasin, doa_kmpl, sejarah, audio;
    AdView ads1;

    String USERNAME_KEY = "usernamekey";
    String username_key = "";
    public static final int MY_PERMISSIONS_REQUEST_LOCATION = 99;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View itemView = inflater.inflate(R.layout.fragment_home, container, false);
        viewPager = itemView.findViewById(R.id.viewpager);
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getActivity());
        txtSubuh = itemView.findViewById(R.id.txtSubuh);
        txtDzuhur = itemView.findViewById(R.id.txtDzuhur);
        txtAshar = itemView.findViewById(R.id.txtAshar);
        txtMaghrib = itemView.findViewById(R.id.txtMaghrib);
        txtIsya = itemView.findViewById(R.id.txtIsya);
        txttanggal = itemView.findViewById(R.id.tanggal);
        yasin = itemView.findViewById(R.id.yasin);
        doa_kmpl = itemView.findViewById(R.id.doa_kmpl);
        sejarah = itemView.findViewById(R.id.sejarah);
        audio = itemView.findViewById(R.id.audio);
        ads1 = itemView.findViewById(R.id.adStream);
        alamat = itemView.findViewById(R.id.alamat);

        Spinner spinner = itemView.findViewById(R.id.spinner);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getActivity(),R.array.kabupaten,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(HomeFragment.this);
        MobileAds.initialize(getActivity(), "ca-app-pub-6617430244106452~9153275293");

        AdRequest request = new AdRequest.Builder().build();
        ads1.loadAd(request);

        doa_kmpl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentKumpulanDoa fragmentKumpulanDoa = new FragmentKumpulanDoa();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, fragmentKumpulanDoa)
                        .addToBackStack(null)
                        .commit();
            }
        });

        yasin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                YasinFragment yasinFragment = new YasinFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, yasinFragment)
                        .addToBackStack(null)
                        .commit();

            }
        });


        audio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AudioFragment audioFragment = new AudioFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, audioFragment)
                        .addToBackStack(null)
                        .commit();
            }
        });


        sejarah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentSejarah fragmentSejarah = new FragmentSejarah();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, fragmentSejarah)
                        .addToBackStack(null)
                        .commit();
            }
        });


        viewPager.setAdapter(viewPagerAdapter);




       // actionLoad();
        return itemView;
    }


    private void actionLoad() {
        ApiInterface apiInterface = ApiClient.getClient().create(ApiInterface.class);
        Call<Items> call = apiInterface.getJadwalSholat(alamat.getText().toString());
        call.enqueue(new Callback<Items>() {
            @Override
            public void onResponse(Call<Items> call, Response<Items> response) {
                Log.d("Data ", "" + response.body().getItems());
                List<Jadwal> jadwal = response.body().getItems();
                loadData(jadwal);
            }

            @Override
            public void onFailure(Call<Items> call, Throwable t) {
                Log.d("Data ", "" + t.getMessage());
            }
        });


    }

    private void loadData(List<Jadwal> jadwal) {
        for (Jadwal data : jadwal) {
            txttanggal.setText(data.getTanggal());
            txtSubuh.setText(data.getFajar());
            txtDzuhur.setText(data.getZuhur());
            txtAshar.setText(data.getAshar());
            txtMaghrib.setText(data.getMaghrib());
            txtIsya.setText(data.getIsya());
        }
    }


    private void checkPermission() {
        if (ActivityCompat.checkSelfPermission(getActivity(), Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED ||
                ActivityCompat.checkSelfPermission(getActivity(), Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED
        ) {//Can add more as per requirement

            ActivityCompat.requestPermissions(getActivity(),
                    new String[]{Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION},
                    123);
        }

    }

    public boolean checkLocationPermission() {
        if (ContextCompat.checkSelfPermission(getActivity(),
                Manifest.permission.ACCESS_FINE_LOCATION)
                != PackageManager.PERMISSION_GRANTED) {

            // Should we show an explanation?
            if (ActivityCompat.shouldShowRequestPermissionRationale(getActivity(),
                    Manifest.permission.ACCESS_FINE_LOCATION)) {

                // Show an explanation to the user *asynchronously* -- don't block
                // this thread waiting for the user's response! After the user
                // sees the explanation, try again to request the permission.
                new AlertDialog.Builder(getActivity())
                        .setTitle(R.string.title_location_permission)
                        .setMessage(R.string.text_location_permission)
                        .setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                //Prompt the user once explanation has been shown
                                ActivityCompat.requestPermissions(getActivity(),
                                        new String[]{Manifest.permission.ACCESS_FINE_LOCATION},
                                        MY_PERMISSIONS_REQUEST_LOCATION);
                            }
                        })
                        .create()
                        .show();


            } else {
                // No explanation needed, we can request the permission.
                ActivityCompat.requestPermissions(getActivity(),
                        new String[]{Manifest.permission.ACCESS_FINE_LOCATION},
                        MY_PERMISSIONS_REQUEST_LOCATION);
            }
            return false;
        } else {
            return true;
        }
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        lok_long = parent.getItemAtPosition(position).toString();
        alamat.setText(lok_long);
        lok_lat = String.valueOf(alamat);
        actionLoad();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}


