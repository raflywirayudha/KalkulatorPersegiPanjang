package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView panjangTextView, lebarTextView;
    EditText panjang, lebar ;
    Button hitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        panjang = findViewById(R.id.panjang);
        lebar = findViewById(R.id.lebar);
        hitung = findViewById(R.id.hitung);

        hitung.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        double panjangValue = Double.parseDouble(panjang.getText().toString());
        double lebarValue = Double.parseDouble(lebar.getText().toString());

        double luas = panjangValue * lebarValue;
        double keliling = 2 * (panjangValue + lebarValue);

        Intent intent = new Intent(MainActivity.this, Hasil.class);
        intent.putExtra("panjang", panjangValue);
        intent.putExtra("lebar", lebarValue);
        intent.putExtra("luas", luas);
        intent.putExtra("keliling", keliling);
        startActivity(intent);
    }

}