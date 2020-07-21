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

import java.util.ArrayList;

public class DoaAdapter extends RecyclerView.Adapter<DoaAdapter.MyViewHolder> {

    private ArrayList<Doa> doas;
    private Context mContext;
    private IDoaItemListener iDoaItemListener;

    public DoaAdapter(ArrayList<Doa> doas, Context mContext, IDoaItemListener iDoaItemListener) {
        this.doas = doas;
        this.mContext = mContext;
        this.iDoaItemListener = iDoaItemListener;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.doa_item,parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.title.setText(doas.get(position).getTitle());

    }

    @Override
    public int getItemCount() {
        return doas.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView title;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title_doa);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    iDoaItemListener.setOnClick(getAdapterPosition());
                }
            });
        }

    }
}
