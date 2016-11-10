package com.example.a1.listview;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//
//        String[] arrBuah = {"Buah Mangga", "Buah Durian", "Buah Nanas", "Buah Salak",
//                        "Buah Mengkudu", "Buah Jambu", "Buah Kesemek"};
//
//        ArrayAdapter adapter = new ArrayAdapter(
//                this, android.R.layout.simple_list_item_1, arrBuah);
//
//        ListView listView = (ListView) findViewById(R.id.id_list);
//        listView.setAdapter(adapter);

        ArrayList arrayList = new ArrayList();
        arrayList.add(new Buah("Buah Mangga","Manis"));
        arrayList.add(new Buah("Buah Jeruk", "Kecut'"));
        arrayList.add(new Buah("Buah Durian", "Manis"));
        arrayList.add(new Buah("Buah Nanas", "Asem, Manis"));
        arrayList.add(new Buah("Buah Salak", "Asem"));
        arrayList.add(new Buah("Buah Mengkudu", "Pahit"));
        arrayList.add(new Buah("Buah Jambu", "Manis"));
        arrayList.add(new Buah("Buah kesemek", "Manis"));


        ListAdapter listAdapter = new ListAdapter(this, arrayList);

        ListView listView = (ListView) findViewById(R.id.id_list);
        listView.setAdapter(listAdapter);




    }
}
