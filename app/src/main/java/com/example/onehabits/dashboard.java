package com.example.onehabits;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

public class dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        LinearLayout cardContainer = findViewById(R.id.card_dou);

        // Infla la vista de la tarjeta desde el modelo XML
        CardView cardView = (CardView) LayoutInflater.from(this).inflate(R.layout.card, cardContainer, false);

        // Configura elementos dentro de la tarjeta
        TextView textTitle = cardView.findViewById(R.id.title);
        textTitle.setText("Nuevo Título");

        // Agrega la tarjeta al contenedor
        cardContainer.addView(cardView);
    }
}