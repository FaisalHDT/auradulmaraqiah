package com.daskull.auradulmaraqiyah.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.daskull.auradulmaraqiyah.R;
import com.daskull.auradulmaraqiyah.model.Yasin;

import java.util.ArrayList;

public class YasinAdapter extends RecyclerView.Adapter<YasinAdapter.MyViewHolder> {

    private ArrayList<Yasin> yasins;
    private Context mContext;

    public YasinAdapter(ArrayList<Yasin> yasins, Context mContext) {
        this.yasins = yasins;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.yasin_item,parent,false);


        return new MyViewHolder(view) ;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.yasin_ayat.setText(yasins.get(position).getAyat());
        holder.yasin_arti.setText(yasins.get(position).getArtinya());

    }

    @Override
    public int getItemCount() {
        return yasins.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView yasin_ayat,yasin_arti;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            yasin_ayat = itemView.findViewById(R.id.ayat_yasin);
            yasin_arti = itemView.findViewById(R.id.artinya_yasin);
        }
    }
}
