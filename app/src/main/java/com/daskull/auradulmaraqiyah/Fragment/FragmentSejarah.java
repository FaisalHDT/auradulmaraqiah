package com.daskull.auradulmaraqiyah.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.daskull.auradulmaraqiyah.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

/**
 * A simple {@link Fragment} subclass.
 * Use the  factory method to
 * create an instance of this fragment.
 */
public class FragmentSejarah extends Fragment {
    // TODO: Rename parameter arguments, choose names that match

    AdView ads2;
    public FragmentSejarah() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View itemView = inflater.inflate(R.layout.fragment_sejarah, container, false);
        ads2 = itemView.findViewById(R.id.ads2);

        MobileAds.initialize(getActivity(), "ca-app-pub-6617430244106452~9153275293");

        AdRequest request = new AdRequest.Builder().build();
        ads2.loadAd(request);

        return itemView;
    }
}
