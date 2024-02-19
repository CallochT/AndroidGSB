package com.example.andoidgsb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button buttonAjout = (Button) findViewById(R.id.buttonAjoutEchan);
    Button buttonListe = (Button) findViewById(R.id.buttonListeEchan);
    Button buttonMaj = (Button) findViewById(R.id.buttonMajEchan);

    //

    @Override
    // OnCreatz
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonAjout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, AjoutEchantillon.class));
            }
        });

        buttonListe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ListeEchantillon.class));
            }
        });

        buttonMaj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MajEchantillon.class));
            }
        });

    }
}