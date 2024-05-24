package com.agenda.ppdd.activity.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.agenda.ppdd.R;

public class FormsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forms);
        Button btSalvar = findViewById(R.id.activity_forms_bt_salvar);
        EditText edNome = findViewById(R.id.activity_forms_et_nome)
        EditText edTelefone = findViewById(R.id.activity_forms_et_telefone)
        EditText edEmail = findViewById(R.id.activity_forms_et_email)
        btSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        }
    }
}