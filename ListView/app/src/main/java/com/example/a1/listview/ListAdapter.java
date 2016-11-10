package com.example.a1.listview;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 1 on 10/11/2016.
 */

public class ListAdapter extends ArrayAdapter{

    private ArrayList list;
    private Activity act;


    public ListAdapter(Activity context, ArrayList objects) {
        super(context, R.layout.list_item, objects);

        this.list = objects;
        this.act = context;

        }

        static class  ViewHolder{
            private TextView nama_buah;
            private TextView keterangan;
            private ImageView item_gambar;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent){
            View view = convertView;

            if(view == null){
                LayoutInflater inflater = act.getLayoutInflater();
                view = inflater.inflate(R.layout.list_item, null);

                ViewHolder holder = new ViewHolder();
                holder.item_gambar = (ImageView) view.findViewById(R.id.item_gambar);
                holder.nama_buah = (TextView) view.findViewById(R.id.item_nama);
                holder.keterangan = (TextView) view
                        .findViewById(R.id.item_keterangan);
                view.setTag(holder);

            }
            ViewHolder holder = (ViewHolder) view.getTag();
            //Phone phone = list.get(position);
            Buah buah = (Buah) list.get(position);

            holder.item_gambar.setImageResource(R.mipmap.ic_launcher);
            holder.nama_buah.setText(buah.getNama_buah());
            holder.keterangan.setText(buah.getKeterangan());

            return view;
        }

    }

