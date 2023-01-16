package com.example.recycleview_esercizio;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private Persona[] persone = {new Persona("Renzo", "tramaglino",R.drawable.albert_dera_ilip77sbmoe_unsplash),
            new Persona("Giulia", "Franceschini",R.drawable.austin_wade_x6uj51n5ce8_unsplash__1_),
            new Persona("Ronaldo", "Cristiano",R.drawable.jimmy_fermin_bqe0j0b26rq_unsplash),
            new Persona("Jessica", "Ferragni",R.drawable.albert_dera_ilip77sbmoe_unsplash),
            new Persona("Renzo", "tramaglino",R.drawable.albert_dera_ilip77sbmoe_unsplash),
            new Persona("Ronaldo", "Cristiano",R.drawable.jimmy_fermin_bqe0j0b26rq_unsplash),
            new Persona("Ronaldo", "Cristiano",R.drawable.jimmy_fermin_bqe0j0b26rq_unsplash)};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recycler_view_persona);
        PersonaAdapter personaAdapter = new PersonaAdapter(persone);
        recyclerView.setAdapter(personaAdapter);

    }
}