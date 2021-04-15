package com.example.recyrcviev;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class AdapterGood extends ArrayAdapter<Good> {

    Context context;
    int resource;

    public AdapterGood(@NonNull Context context, int resource, @NonNull List<Good> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        int goodImage =getItem(position).getImageResource();
        String  header = getItem(position).getHeader();
        String  description = getItem(position).getDescription();
        String  time = getItem(position).getTime();


        LayoutInflater layoutInflater = LayoutInflater.from(context);
        convertView= layoutInflater.inflate(R.layout.list_item,parent, false);

        ImageView image_tv = convertView.findViewById(R.id.imageView1);
        TextView title_tv = convertView.findViewById(R.id.header1);
        TextView quantity_tv = convertView.findViewById(R.id.description1);
        TextView price_tv = convertView.findViewById(R.id.time1);
        ImageView delete = convertView.findViewById(R.id.deleteImage);

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LocalDB.removeGood(position);
                notifyDataSetChanged();
            }
        });


        image_tv.setImageResource(goodImage);
        title_tv.setText(header);
        quantity_tv.setText(String.valueOf(description));
        price_tv.setText(String.valueOf(time));

        return convertView;
    }

}
