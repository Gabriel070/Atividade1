/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gabriel.objeto;

import java.util.ArrayList;
/**
 *
 * @author gabriel.154917
 */
public class Professor{
    private ArrayList<Disciplina> disciplinas;
    private int cargaHoraria;
    private float valorHora;
    private float salario;
    
     private float calcularSalario(int cargaHoraria, float valorHora) {
        float salario = cargaHoraria*valorHora;
        return 0;
    }
    @Override
    public String toString() {
        return "Professor{" + "disciplinas=" + disciplinas + ", cargaHoraria=" + cargaHoraria + ", valorHora=" + valorHora + ", salario=" + salario + '}';
    }

    public Professor(int cargaHoraria, float valorHora, float salario) {
        this.cargaHoraria = cargaHoraria;
        this.valorHora = valorHora;
        this.salario = salario;
    }
    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}