package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class TotalActivity extends AppCompatActivity {
    private TextView textViewTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_total);

        textViewTotal = findViewById(R.id.textViewTotal);

        Intent intent = getIntent();
        double total = intent.getDoubleExtra("TOTAL_AMOUNT", 0.0);
        textViewTotal.setText("Total: $" + String.format("%.2f", total));
    }
}