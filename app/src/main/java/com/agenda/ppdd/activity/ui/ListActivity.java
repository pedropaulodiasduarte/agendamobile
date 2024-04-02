package com.agenda.ppdd.activity.ui;

import android.widget.ListView; // Importação necessária para a classe ListView
import android.widget.ArrayAdapter; // Importação necessária para a classe ArrayAdapter
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.agenda.ppdd.R;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class ListActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        //anotação @Nullable está sendo utilizada para indicar que o parâmetro savedInstanceState do método onCreate pode ser nulo.
        //Bundle é utilizado para armazenar e recuperar o estado da Activity, permitindo que a Activity seja restaurada para um estado consistente em diferentes situações.
        //Bundle é uma classe que permite troca de informações entre activity ou a partir do cíclo de vida
        super.onCreate(savedInstanceState);
        //Quando se chama o onCreate, também se chama o método superActivity, que é da classe mãe e é responsável por resolver problemas para o Android

        setContentView(R.layout.activity_list);
        //Define um layout para a view

        setTitle("AGENDA");
        //Adiciona título no app bar

        List<String> alunos = new ArrayList<>(
                Arrays.asList("Pedro Paulo", "Ivanilce", "Jânio", "Kelly", "Igor"));
        //se cria uma lista, cujo sua implementação é uma array list
        //Arrays.asList        : Por não saber qual fonte de dados concreta,  se utiliza está lista dinâmica

        ListView listaDeAlunos = findViewById(R.id.activity_list_list_view_contatos);

        listaDeAlunos.setAdapter(new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                alunos));
        //Comentário explicativo no readme.md

    }
}
