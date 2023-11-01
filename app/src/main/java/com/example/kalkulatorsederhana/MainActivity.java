package com.example.kalkulatorsederhana;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv1 = findViewById(R.id.textView);
        TextView tv2 = findViewById(R.id.textView2);
        TextView tv3 = findViewById(R.id.textView3);
        EditText et1 = findViewById(R.id.editTextNumber);
        EditText et2 = findViewById(R.id.editTextNumber2);
        Button tambah = findViewById(R.id.button);
        Button kurang = findViewById(R.id.button2);
        Button kali = findViewById(R.id.button3);
        Button bagi = findViewById(R.id.button4);
        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer ank1,ank2,hasil;
                ank1 = Integer.valueOf(et1.getText().toString().trim());
                ank2 = Integer.valueOf(et2.getText().toString().trim());
                hasil = ank1 + ank2;
                String hasil1 = String.valueOf(hasil);
                tv3.setText(hasil1);
            }
        });

        kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer ank1,ank2,hasil;
                ank1 = Integer.valueOf(et1.getText().toString().trim());
                ank2 = Integer.valueOf(et2.getText().toString().trim());
                hasil = ank1 - ank2;
                String hasil1 = String.valueOf(hasil);
                tv3.setText(hasil1);
            }
        });

        kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer ank1,ank2,hasil;
                ank1 = Integer.valueOf(et1.getText().toString().trim());
                ank2 = Integer.valueOf(et2.getText().toString().trim());
                hasil = ank1 * ank2;
                String hasil1 = String.valueOf(hasil);
                tv3.setText(hasil1);
            }
        });

        bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer ank1,ank2,hasil;
                ank1 = Integer.valueOf(et1.getText().toString().trim());
                ank2 = Integer.valueOf(et2.getText().toString().trim());
                hasil = ank1 / ank2;
                String hasil1 = String.valueOf(hasil);
                tv3.setText(hasil1);
            }
        });
    }
}