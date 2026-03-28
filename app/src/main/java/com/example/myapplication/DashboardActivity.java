package com.example.myapplication; // Tu nombre de paquete

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard); // El nombre de tu XML para el Dashboard

        // 1. Buscas el botón del perfil por su ID
        Button btnProfile = findViewById(R.id.btnProfile);

        // 2. Configuras el clic
        btnProfile.setOnClickListener(view -> {
            // 3. Creas el Intent para ir a ProfileActivity
            Intent intent = new Intent(this, ProfileActivity.class);
            startActivity(intent);
        });
    }
}