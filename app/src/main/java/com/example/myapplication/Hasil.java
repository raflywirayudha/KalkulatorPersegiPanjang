package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Hasil extends AppCompatActivity {

    private TextView panjangTextView, lebarTextView, luasTextView, kelilingTextView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        panjangTextView = findViewById(R.id.panjang_hasil);
        lebarTextView = findViewById(R.id.lebar_hasil);
        luasTextView = findViewById(R.id.luas);
        kelilingTextView = findViewById(R.id.keliling);


        Intent intent = getIntent();
        double panjang = intent.getDoubleExtra("panjang", 0);
        double lebar = intent.getDoubleExtra("lebar", 0);
        double luas = intent.getDoubleExtra("luas", 0);
        double keliling = intent.getDoubleExtra("keliling", 0);

        panjangTextView.setText("Panjang: " + panjang);
        lebarTextView.setText("Lebar: " + lebar);
        luasTextView.setText("Luas: " + luas);
        kelilingTextView.setText("Keliling: " + keliling);
    }
}