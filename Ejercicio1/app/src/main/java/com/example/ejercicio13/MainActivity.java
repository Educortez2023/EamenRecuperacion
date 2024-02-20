package com.example.ejercicio13;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView textViewContador;
    private Button botonIncrementar;
    private Button botonReiniciar;

    private int contador = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Asignar elementos de diseño a variables
        textViewContador = findViewById(R.id.textViewContador);
        botonIncrementar = findViewById(R.id.botonIncrementar);
        botonReiniciar = findViewById(R.id.botonReiniciar);

        // Agregar OnClickListener al botón de incremento
        botonIncrementar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Incrementar el contador
                contador++;
                // Actualizar el TextView con el nuevo valor del contador
                textViewContador.setText(String.valueOf(contador));
            }
        });

        // Agregar OnClickListener al botón de reinicio
        botonReiniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Reiniciar el contador a cero
                contador = 0;
                // Actualizar el TextView con el nuevo valor del contador
                textViewContador.setText(String.valueOf(contador));
            }
        });
    }
}