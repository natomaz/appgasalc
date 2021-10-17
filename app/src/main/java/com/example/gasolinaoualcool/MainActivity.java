package com.example.gasolinaoualcool;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText edtAlcool, edtGasolina;
    private Button btnCompara;
    private TextView txtResult1, txtResult2;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        iniciarComponentes();
    }

    private void iniciarComponentes() {
        edtAlcool = findViewById(R.id.edtAlcool);
        edtGasolina = findViewById(R.id.edtGasolina);
        btnCompara = findViewById(R.id.btnVerificar);
        txtResult1 = findViewById(R.id.txtResultado1);
        txtResult2 = findViewById(R.id.txtResultado2);

    }
}