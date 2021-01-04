package com.daskull.auradulmaraqiyah.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.daskull.auradulmaraqiyah.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentDetailDoa extends Fragment {

    TextView ayat,arti,judul;
    AdView ads6;

    public FragmentDetailDoa() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View itemView = inflater.inflate(R.layout.fragment_detail_doa, container, false);
        ayat =  itemView.findViewById(R.id.ayat_doa_detail);
        arti = itemView.findViewById(R.id.arti_doa_detail);
        judul = itemView.findViewById(R.id.judul);

        AdRequest request = new AdRequest.Builder().build();

        loadDetailDoa();
        return itemView;
    }

    private void loadDetailDoa() {
        Bundle argument = getArguments();
        if (argument!=null){
            ayat.setText(argument.getString("ayat"));
            arti.setText(argument.getString("arti"));
            judul.setText(argument.getString("title"));
        }
    }
}
