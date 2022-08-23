package com.example.calculadora2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editTextPrimeiroNumero, editTextSegundoNumero;
    private TextView textViewResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextPrimeiroNumero = findViewById(R.id.editTextPrimeiroNumero);
        editTextSegundoNumero = findViewById(R.id.editTextSegundoNumero);
        textViewResultado = findViewById(R.id.textViewResultado);
    }

    public void soma(View view){
        int x = Integer.parseInt(editTextPrimeiroNumero.getText().toString()), y = Integer.parseInt(editTextSegundoNumero.getText().toString());
        textViewResultado.setText(String.valueOf(x + y));
    }
    public void subtracao(View view){
        int x = Integer.parseInt(editTextPrimeiroNumero.getText().toString()), y = Integer.parseInt(editTextSegundoNumero.getText().toString());
        textViewResultado.setText(String.valueOf(x - y));
    }
    public void multiplicacao(View view){
        int x = Integer.parseInt(editTextPrimeiroNumero.getText().toString()), y = Integer.parseInt(editTextSegundoNumero.getText().toString());
        textViewResultado.setText(String.valueOf(x * y));
    }
    public void divisao(View view){
        int x = Integer.parseInt(editTextPrimeiroNumero.getText().toString()), y = Integer.parseInt(editTextSegundoNumero.getText().toString());
        textViewResultado.setText(String.valueOf(x / y));
    }
}