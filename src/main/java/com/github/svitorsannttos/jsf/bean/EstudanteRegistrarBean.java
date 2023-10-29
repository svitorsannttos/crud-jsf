package com.github.svitorsannttos.jsf.bean;

import com.github.svitorsannttos.jsf.model.Estudante;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named
@ViewScoped
public class EstudanteRegistrarBean implements Serializable {

    private Estudante estudante = new Estudante();
    private List<Estudante> estudantes = new ArrayList<>();

    public void registrarEstudante(){
        Estudante newEstudante = new Estudante(estudante.getNome(), estudante.getSobrenome(), estudante.getNota1(), estudante.getNota2(),
                estudante.getNota3(), estudante.getNota4(), estudante.getTurno());
        estudantes.add(newEstudante);
    }

    public boolean estudantesIsNotEmpty(){
        return !estudantes.isEmpty();
    }

    public void clean(){
        this.estudante = null;
    }

    public Estudante getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }

    public List<Estudante> getEstudantes() {
        return estudantes;
    }

    public void setEstudantes(List<Estudante> estudantes) {
        this.estudantes = estudantes;
    }
}
