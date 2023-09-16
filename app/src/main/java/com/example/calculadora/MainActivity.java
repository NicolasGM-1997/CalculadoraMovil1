package com.example.calculadora;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    private EditText num1, num2;
    private TextView titulo, info, valor;
    private Button botonSumar, botonRestar, botonMultiplicar, botonDividir;
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        titulo = findViewById(R.id.titulo);
        info = findViewById(R.id.info);
        valor = findViewById(R.id.valor);

        botonSumar = findViewById(R.id.botonSumar);
        botonRestar = findViewById(R.id.botonRestar);
        botonMultiplicar = findViewById(R.id.botonMultiplicar);
        botonDividir = findViewById(R.id.botonDividir);

        botonSumar.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                sumar();
            }
        });

        botonRestar.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                restar();
            }
        });

        botonMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                multiplicar();
            }
        });

        botonDividir.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                dividir();
            }
        });
    }
    public void sumar(){
        double total = Double.valueOf(num1.getText().toString())+Double.valueOf(num2.getText().toString());
        valor.setText(""+total);
    }
    public void restar(){
        double total = Double.valueOf(num1.getText().toString())-Double.valueOf(num2.getText().toString());
        valor.setText(""+total);
    }
    public void multiplicar(){
        double total = Double.valueOf(num1.getText().toString())*Double.valueOf(num2.getText().toString());
        valor.setText(""+total);
    }
    public void dividir(){
        if(Double.valueOf(num1.getText().toString())==0 || Double.valueOf(num2.getText().toString())==0){
            valor.setText("No se puede dividir por cero");
        } else {
            double total = Double.valueOf(num1.getText().toString())/Double.valueOf(num2.getText().toString());
            valor.setText("" + total);
        }
    }
}