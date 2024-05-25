package com.agenda.ppdd.activity.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText; // Importar EditText
import android.widget.Toast;

import com.agenda.ppdd.R;
import com.agenda.ppdd.model.Aluno;

public class FormsActivity extends AppCompatActivity {
    private Button btSalvar;
    private EditText etNome;
    private EditText etEmail;
    private EditText etTelefone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forms);

        btSalvar = findViewById(R.id.activity_forms_bt_salvar);
        etNome = findViewById(R.id.activity_forms_et_nome);
        etTelefone = findViewById(R.id.activity_forms_et_telefone);
        etEmail = findViewById(R.id.activity_forms_et_email);

        btSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nome = etNome.getText().toString(); // Obter o texto do campo Nome
                String telefone = etTelefone.getText().toString(); // Obter o texto do campo Telefone
                String email = etEmail.getText().toString(); // Obter o texto do campo Email

                Aluno aluno = new Aluno(nome, telefone, email);
                Toast.makeText(getApplicationContext(), "Aluno: " + aluno.getNome(), Toast.LENGTH_LONG).show();

            }
        });
    }
}