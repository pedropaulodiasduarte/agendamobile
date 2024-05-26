package com.agenda.ppdd.dao;

import com.agenda.ppdd.model.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class PessoaDAO {
    private final static List<Pessoa> listaPessoa = new ArrayList<>();

    public void salva(Pessoa pessoa) {
        listaPessoa.add(pessoa);
    }

    public List<Pessoa> retornaSalvo() {
        return new ArrayList<>(listaPessoa);
        //Se criou nova, para se ter uma cópia, afim de não modificar a lista
    }
}
