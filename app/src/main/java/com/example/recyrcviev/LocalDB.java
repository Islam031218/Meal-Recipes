package com.example.recyrcviev;

import android.util.Log;

import java.util.ArrayList;

public class LocalDB {

    public static ArrayList<Good> arrayList = new ArrayList<>();
    public static ArrayList<Good> goodArrayList = MainActivity.goods;

    public static void addGood(Good good){
        arrayList.add(good);
    }

    public ArrayList<Good> getArrayList() {
        return arrayList;
    }


    public static void  removeGood(int position){
        arrayList.remove(arrayList.get(position));
    }

    public static Good DataBeath(int position){
        return LocalDB.goodArrayList.get(position);
    }


}
