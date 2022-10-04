package com.example.conversordemoedas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    TextView valor;
    Button btn_dolar, btn_peso, btn_euro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valor = findViewById(R.id.valor);
        btn_dolar = findViewById(R.id.btn_dolar);
        btn_peso = findViewById(R.id.btn_peso);
        btn_euro = findViewById(R.id.btn_euro);

        btn_dolar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String real = valor.getText().toString();

                if (real.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Nenhum valor digitado", Toast.LENGTH_SHORT).show();
                }else {
                    double reais = Double.parseDouble(valor.getText().toString());
                    double valor_convertido = reais * 5.17;

                    Toast.makeText(MainActivity.this, "O valor em dólar é " + valor_convertido, Toast.LENGTH_SHORT).show();
                }
            }
        });

        btn_euro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String real = valor.getText().toString();

                if (real.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Nenhum valor digitado", Toast.LENGTH_SHORT).show();
                }else {
                    double reais = Double.parseDouble(valor.getText().toString());
                    double valor_convertido = reais * 5.06;

                    Toast.makeText(MainActivity.this, "O valor em euro é " + valor_convertido, Toast.LENGTH_SHORT).show();
                }
            }
        });

        btn_peso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String real = valor.getText().toString();

                if (real.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Nenhum valor digitado", Toast.LENGTH_SHORT).show();
                }else {
                    double reais = Double.parseDouble(valor.getText().toString());
                    double valor_convertido = reais * 0.035;

                    Toast.makeText(MainActivity.this, "O valor em pesos é " + valor_convertido, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}