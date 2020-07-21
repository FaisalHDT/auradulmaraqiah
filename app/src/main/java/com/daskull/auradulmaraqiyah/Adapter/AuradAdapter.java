package com.daskull.auradulmaraqiyah.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.daskull.auradulmaraqiyah.R;
import com.daskull.auradulmaraqiyah.model.Aurad;

import java.util.ArrayList;

public class AuradAdapter extends RecyclerView.Adapter<AuradAdapter.MyViewHolder> {

    private ArrayList<Aurad> aurads;
    private Context mContext;

    public AuradAdapter(ArrayList<Aurad> aurads, Context mContext) {
        this.aurads = aurads;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_aurad,parent,false);


        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.ayat.setText(aurads.get(position).getAyat());
        holder.artinya.setText(aurads.get(position).getArtinya());

    }

    @Override
    public int getItemCount() {
        return aurads.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView ayat,artinya;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            ayat = itemView.findViewById(R.id.ayat);
            artinya = itemView.findViewById(R.id.artinya);

        }
    }
}
