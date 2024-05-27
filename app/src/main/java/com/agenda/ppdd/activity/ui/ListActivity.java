package com.agenda.ppdd.activity.ui;

import android.content.Intent;
import android.view.View;
import android.widget.ListView; // Importação necessária para a classe ListView
import android.widget.ArrayAdapter; // Importação necessária para a classe ArrayAdapter
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.agenda.ppdd.R;
import com.agenda.ppdd.dao.PessoaDAO;
import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class ListActivity extends AppCompatActivity {
    private FloatingActionButton fabNovoContato;
    private ListView lista;
    private PessoaDAO dao = new PessoaDAO();
    //Instanciada para exibir dados salvo na lista

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        //anotação @Nullable está sendo utilizada para indicar que o parâmetro savedInstanceState do método onCreate pode ser nulo.
        //Bundle é utilizado para armazenar e recuperar o estado da Activity, permitindo que a Activity seja restaurada para um estado consistente em diferentes situações.
        //Bundle é uma classe que permite troca de informações entre activity ou a partir do cíclo de vida
        super.onCreate(savedInstanceState);
        //Quando se chama o onCreate, também se chama o método superActivity, que é da classe mãe e é responsável por resolver problemas para o Android

        setContentView(R.layout.activity_list);
        //Define um layout para a view

        fabNovoContato = findViewById(R.id.activity_list_fab_novo_contato);

        setTitle("AGENDA");
        //Adiciona título no app bar


        lista = findViewById(R.id.activity_list_list_view_contatos);

        lista.setAdapter(new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                dao.retornaSalvo()));
        fabNovoContato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirFormsActivity();
            }
        });
    }

    private void abrirFormsActivity() {
        startActivity(new Intent(ListActivity.this, FormsActivity.class));
    }

}
