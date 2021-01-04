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
import androidx.cardview.widget.CardView;
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


import retrofit2.Callback;
import retrofit2.Response;

import static android.content.Context.MODE_PRIVATE;
import static androidx.core.content.ContextCompat.checkSelfPermission;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment  {

    ViewPager viewPager;

    LinearLayout yasin, doa_kmpl, sejarah, audio;
    AdView ads1;



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
        yasin = itemView.findViewById(R.id.yasin);
        doa_kmpl = itemView.findViewById(R.id.doa_kmpl);
        sejarah = itemView.findViewById(R.id.sejarah);
        audio = itemView.findViewById(R.id.audio);
        ads1 = itemView.findViewById(R.id.adStream);


        MobileAds.initialize(getActivity(), "ca-app-pub-3940256099942544~3347511713");

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

                AlquranFragment alquranFragment = new AlquranFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, alquranFragment)
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
                TasbihFragment tasbihFragment = new TasbihFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, tasbihFragment)
                        .addToBackStack(null)
                        .commit();
            }
        });


        viewPager.setAdapter(viewPagerAdapter);




       // actionLoad();
        return itemView;
    }

}


