package com.agenda.ppdd.activity.ui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText; // Importar EditText

import com.agenda.ppdd.R;
import com.agenda.ppdd.dao.PessoaDAO;
import com.agenda.ppdd.model.Pessoa;

public class FormsActivity extends AppCompatActivity {
    public static final String TITULO_APPBAR = "Novo Contato";
    private Button btSalvar;
    private EditText etNome;
    private EditText etEmail;
    private EditText etTelefone;
    private Pessoa pessoa;
    private PessoaDAO dao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forms);
        setTitle(TITULO_APPBAR);
        configurarElementos();
        salvarContato();
    }

    private void salvarContato() {
        btSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                criarPessoa();
                chamarListActivity();
            }
        });
    }

    private void configurarElementos() {
        btSalvar = findViewById(R.id.activity_forms_bt_salvar);
        etNome = findViewById(R.id.activity_forms_et_nome);
        etTelefone = findViewById(R.id.activity_forms_et_telefone);
        etEmail = findViewById(R.id.activity_forms_et_email);
    }

    private void chamarListActivity() {
        startActivity(new Intent(FormsActivity.this, ListActivity.class));
        finish();
        //Finaliza activity, para não criar activity em pilhas ou task
    }

    @NonNull
    private void criarPessoa() {
        String nome = etNome.getText().toString(); // Obter o texto do campo Nome
        String telefone = etTelefone.getText().toString(); // Obter o texto do campo Telefone
        String email = etEmail.getText().toString(); // Obter o texto do campo Email
        pessoa = new Pessoa(nome, telefone, email);
        //Instancia a classe Pessoa, envia via construtor dados da pessoa

    }
}