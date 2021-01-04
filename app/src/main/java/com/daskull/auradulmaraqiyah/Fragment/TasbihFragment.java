package com.daskull.auradulmaraqiyah.Fragment;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;

import android.os.Vibrator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.daskull.auradulmaraqiyah.R;

import static android.content.Context.VIBRATOR_SERVICE;


public class TasbihFragment extends Fragment {

    LinearLayout tasbihTambah;
    TextView txtTasbih,txtRfresh;
    Integer jumlahTasbih=0;
    Vibrator vibr;


    public TasbihFragment() {
        // Required empty public constructor
    }


    @SuppressLint("SetTextI18n")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View itemView = inflater.inflate(R.layout.fragment_tasbih, container, false);
        tasbihTambah=itemView.findViewById(R.id.tombolTambah);
        txtTasbih=itemView.findViewById(R.id.txtTasbij);
        txtRfresh=itemView.findViewById(R.id.txtRefresh);
        vibr=(Vibrator)getActivity().getSystemService(VIBRATOR_SERVICE);

        txtTasbih.setText(jumlahTasbih.toString());
        tasbihTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jumlahTasbih++;
                txtTasbih.setText(jumlahTasbih.toString());
                vibr.vibrate(100);

            }
        });

        txtRfresh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jumlahTasbih=0;
                txtTasbih.setText(jumlahTasbih.toString());
            }
        });

        return itemView;
    }
}
