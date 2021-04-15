package com.example.recyrcviev;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class GoodAdapter extends RecyclerView.Adapter<GoodAdapter.GoodHolder> {

    private ArrayList<Good> goodsArrayList;



    //инитсализация listener
    private  GoodItemClickListener listener;

    public  void  setGoodClickListener(GoodItemClickListener listener){
        this.listener = listener;
    }

    //инитсализация interface
//    public interface  GoodItemClickListener{
//        void  onClickItem (int position);
//    }


    public GoodAdapter (ArrayList<Good>goods){
        goodsArrayList = goods;
    };

    public  static class GoodHolder extends  RecyclerView.ViewHolder{

        ImageView imageView, chose ;
        TextView header, description,time;
        Context context;



        public GoodHolder(@NonNull View itemView,GoodItemClickListener listener, ArrayList<Good> goods) {

            super(itemView);
            imageView = itemView.findViewById(R.id.imageView1);
            header = itemView.findViewById(R.id.header1);
            description = itemView.findViewById(R.id.description1);
            time = itemView.findViewById(R.id.time1);
            chose = itemView.findViewById(R.id.chosenImage);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position =getAdapterPosition();
                    listener.onClickItem(getAdapterPosition());
                }
            });

            chose.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    int position = getAdapterPosition();
                    chose.setImageResource(R.drawable.ic_baseline_delete_24);
                    LocalDB.addGood(new Good(goods.get(position).getImageResource(),goods.get(position).getHeader(),goods.get(position).getDescription()
                    ,goods.get(position).getTime()));

                }
            });
        }
    }
    class  arrayAdapter extends ArrayAdapter<Good>{

        public arrayAdapter(@NonNull Context context, int resource, @NonNull List<Good> objects) {
            super(context, resource, objects);

        }
    }


    @NonNull
    @Override
    public GoodHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerviev,parent,
                false);
        return new GoodHolder(view,listener,goodsArrayList);
    }

    @Override
    public void onBindViewHolder(@NonNull GoodHolder holder, int position) {
        Good currentItem = goodsArrayList.get(position);

        holder.imageView.setImageResource(currentItem.getImageResource());
        holder.header.setText(currentItem.getHeader());
        holder.description.setText(currentItem.getDescription());
        holder.time.setText(currentItem.getTime());


    }



    @Override
    public int getItemCount() {
        return goodsArrayList.size();
    }
}
