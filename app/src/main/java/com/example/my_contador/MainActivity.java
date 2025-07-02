package com.example.my_contador;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editTextNumber;

    private Button btnIncrementar, btnDecrementar;

    private EditText editTextNumberTo_I_D;

    private int contador = 0;
    private int numero = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNumber = findViewById(R.id.editTextNumber);
        btnIncrementar = findViewById(R.id.btnIncrementar);
        btnDecrementar = findViewById(R.id.btnDecrementar);
        editTextNumberTo_I_D = findViewById(R.id.editTextNumberTo_I_D);

        editTextNumberTo_I_D.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                try{
                    numero = Integer.parseInt(String.valueOf(editable.toString()));
                } catch (Exception e){
                    numero = 1;
                }
            }
        });




        btnIncrementar.setOnClickListener(v -> {
            contador += numero;
            editTextNumber.setText(String.valueOf(contador));
        });

        btnDecrementar.setOnClickListener(v -> {
            contador += numero;
            editTextNumber.setText(String.valueOf(contador));
        });

    }
}