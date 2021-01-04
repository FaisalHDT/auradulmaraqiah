package com.daskull.auradulmaraqiyah.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.daskull.auradulmaraqiyah.R;
import com.daskull.auradulmaraqiyah.model.Doa;
import com.daskull.auradulmaraqiyah.model.IDoaItemListener;
import com.daskull.auradulmaraqiyah.model.Surah;

import java.util.ArrayList;

public class SurahAdapter extends RecyclerView.Adapter<SurahAdapter.MyViewHolder> {

    private ArrayList<Surah> surahs;
    private Context mContext;
    private ISurahListener iSurahListener;

    public SurahAdapter(ArrayList<Surah> surahs, Context mContext, ISurahListener iSurahListener) {
        this.surahs = surahs;
        this.mContext = mContext;
        this.iSurahListener = iSurahListener;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_surah,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.surah.setText(surahs.get(position).getNamaSurah());
    }

    @Override
    public int getItemCount() {
        return surahs.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView surah;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            surah=itemView.findViewById(R.id.surah);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    iSurahListener.onSurahCLickListener(getAdapterPosition());
                }
            });
        }
    }

    public interface ISurahListener{
        void onSurahCLickListener(int position);
    }
}
