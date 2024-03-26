package com.example.andoidgsb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AjoutEchantillon extends AppCompatActivity {

    Button buttonAjout;
    Button buttonQuit;
    EditText TextStock;
    EditText TextCode;
    EditText TextLibelle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajout_echantillon);

        buttonAjout = findViewById(R.id.buttonAjout);
        buttonQuit = findViewById(R.id.buttonQuit);

        TextCode = findViewById(R.id.TextCode);
        TextLibelle = findViewById(R.id.TextLibelle);
        TextStock = findViewById(R.id.TextStock);

        buttonAjout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String code = TextCode.getText().toString();
                String libelle = TextLibelle.getText().toString();
                String stock = TextStock.getText().toString();

            }
        });

        buttonQuit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AjoutEchantillon.this, MainActivity.class));
            }
        });
    }
}
