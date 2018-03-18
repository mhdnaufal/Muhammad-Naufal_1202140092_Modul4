package com.zoang.MuhammadNaufal_1202140092_studycase4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup allin;
    RadioButton listMahasiswa, pencariGambar;
    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        allin = findViewById(R.id.radioGroup);
        listMahasiswa = findViewById(R.id.list_mahasiswa);
        pencariGambar = findViewById(R.id.mencari_gambar);
        next = findViewById(R.id.next);
    }

    public void next(View view) {
        int bebas = allin.getCheckedRadioButtonId();
        if(bebas == listMahasiswa.getId()){
            Intent pindah = new Intent(MainActivity.this, ListNamaMahasiswa.class);
            startActivity(pindah);
            Toast.makeText(MainActivity.this, "List Nama Mahasiswa", Toast.LENGTH_LONG).show();
        } else {
            Intent pindah = new Intent(MainActivity.this, MencariGambar.class);
            startActivity(pindah);
            Toast.makeText(MainActivity.this, "Mencari Gambar", Toast.LENGTH_LONG).show();
        }
    }
}
