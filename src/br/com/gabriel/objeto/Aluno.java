/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gabriel.objeto;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author gabriel.154917
 */
public class Aluno extends Disciplina{
    private int matricula;
    private Date dataMatricula;
    private ArrayList<Disciplina> disciplinas;

    @Override
    public String toString() {
        return "Aluno{" + "matricula=" + matricula + ", dataMatricula=" + dataMatricula + ", disciplinas=" + disciplinas + '}';
    }

    public Aluno(int matricula, Date dataMatricula, String nome, String departamento, char status) {
        super(nome, departamento, status);
        this.matricula = matricula;
        this.dataMatricula = dataMatricula;
    }
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Date getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(Date dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }
}