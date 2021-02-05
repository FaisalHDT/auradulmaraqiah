package com.daskull.auradulmaraqiyah.Fragment;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.LinearLayout;


import com.daskull.auradulmaraqiyah.AboutActivity;
import com.daskull.auradulmaraqiyah.R;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment  {

    LinearLayout yasin, doa_kmpl, sejarah, audio,tentang,tasbih;
    AdView ads1;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View itemView = inflater.inflate(R.layout.fragment_home, container, false);
        yasin = itemView.findViewById(R.id.yasin);
        doa_kmpl = itemView.findViewById(R.id.doa_kmpl);
        sejarah = itemView.findViewById(R.id.sejarah);
        tasbih=itemView.findViewById(R.id.tasbih);
        tentang=itemView.findViewById(R.id.tentang);
        audio = itemView.findViewById(R.id.audio);
        ads1 = itemView.findViewById(R.id.adStream);


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


        tasbih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TasbihFragment tasbihFragment = new TasbihFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, tasbihFragment)
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

        tentang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah =new Intent(getActivity(), AboutActivity.class);
                startActivity(pindah);
            }
        });

        return itemView;
    }

}


