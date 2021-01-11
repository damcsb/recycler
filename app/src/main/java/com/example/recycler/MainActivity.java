package com.example.recycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView personarecycler;
    private List<Persona> personaList;
    private Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        personarecycler = findViewById(R.id.mainrecycler);
        personarecycler.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        personaList = new ArrayList<>();
        adapter = new Adapter(personaList);
        personarecycler.setAdapter(adapter);

        for (int i = 0; i<5;i++){
            Persona p = new Persona();
            p.setNombre("Clemente");
            p.setApellido("Santos");
            personaList.add(p);
        }
    }
}