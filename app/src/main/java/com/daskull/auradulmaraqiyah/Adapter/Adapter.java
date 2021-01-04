package com.daskull.auradulmaraqiyah.Adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.daskull.auradulmaraqiyah.R;

import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

public class Adapter extends ArrayAdapter<Item> {

    private Context context;
    private List<Item> listData;

    public Adapter(@NonNull Context context, int resource, List<Item> listData) {
        super(context, resource, listData);
        this.context = context;
        this.listData = listData;
    }

    @SuppressLint("SetTextI18n")
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View views = convertView;
        if (views == null)
            views = LayoutInflater.from(context).inflate(R.layout.item, parent, false);

        Item data = listData.get(position);

        TextView text = views.findViewById(R.id.text);
        TextView artinya=views.findViewById(R.id.artinya);
        //Typeface typeface = Typeface.createFromAsset(context.getAssets(), "LPMQ IsepMisbah.ttf");
        NumberFormat nf=NumberFormat.getInstance(new Locale("ar","IN"));
        //nf.format(i);
       //text.setTypeface(typeface);
        Integer ayat = data.getVerseID();
        text.setText(nf.format(ayat)+data.getAyahText());
        artinya.setText(data.getIndoText());

        return views;
    }
}
