package com.example.a1.listview;

/**
 * Created by 1 on 10/11/2016.
 */

public class Buah {
    private String nama_buah;
    private String keterangan;

    public Buah(String nama_buah, String keterangan){
        setNama_buah(nama_buah);
        setKeterangan(keterangan);
    }
    public String getNama_buah(){
        return nama_buah;

    }


    public void setNama_buah(String nama_buah) {
        this.nama_buah = nama_buah;
    }

    public String getKeterangan(){
        return keterangan;
    }


    public void setKeterangan(String keterangan) {

        this.keterangan = keterangan;
    }

}
