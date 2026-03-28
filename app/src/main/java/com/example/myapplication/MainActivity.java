package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View; // Importación necesaria para el OnClickListener
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1. Buscamos el botón por el ID definido en activity_main.xml
        Button btn = findViewById(R.id.btnPrincipal);

        // 2. Configuramos el evento de clic
        // Usamos MainActivity.this para ser específicos con el contexto
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 3. Navegar a DashboardActivity
                // Asegúrate de que DashboardActivity esté creada en tu proyecto
                Intent intent = new Intent(MainActivity.this, DashboardActivity.class);
                startActivity(intent);
            }
        });
    }
}