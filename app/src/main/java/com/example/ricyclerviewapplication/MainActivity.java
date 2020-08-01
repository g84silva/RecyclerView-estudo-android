package com.example.ricyclerviewapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.ricyclerviewapplication.model.Receitas;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {

    private LinkedList<Receitas> listaDeReceitas = new LinkedList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaDeReceitas.add(new Receitas("Pao", "Quentinho bla bla bla bla bla bla bla",
                getResources().getIdentifier("pao", "drawable", getPackageName())));
        listaDeReceitas.add(new Receitas("Bife", "Suculento bla bla bla bla bla bla bla",
                getResources().getIdentifier("bife", "drawable", getPackageName())));
        listaDeReceitas.add(new Receitas("Pipoca", "Crocante bla bla bla bla bla bla bla",
                getResources().getIdentifier("pipoca", "drawable", getPackageName())));
        listaDeReceitas.add(new Receitas("Batatas", "Rústicas bla bla bla bla bla bla bla",
                getResources().getIdentifier("batatas", "drawable", getPackageName())));
        listaDeReceitas.add(new Receitas("Bolo", "Fofinho bla bla bla bla bla bla bla",
                getResources().getIdentifier("bolo", "drawable", getPackageName())));
        listaDeReceitas.add(new Receitas("Salada", "Mista bla bla bla bla bla bla bla",
                getResources().getIdentifier("salada", "drawable", getPackageName())));

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        ListagemAdapter adapter = new ListagemAdapter(this, listaDeReceitas);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}