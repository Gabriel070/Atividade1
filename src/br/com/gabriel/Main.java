/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gabriel;

import br.com.gabriel.objeto.Disciplina;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author gabriel.154917
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Disciplina> materias = new ArrayList();
        
    do{
        String nome;
        String departamento;
        char status;
        
        nome = JOptionPane.showInputDialog("Informe o nome da disciplina:");
        departamento = JOptionPane.showInputDialog("Qual o departamento?");
        status = JOptionPane.showInputDialog("Status [A]tivo ou [I]nativo").charAt(0);
        materias.add(new Disciplina(nome, departamento, status));
    
    } while ((JOptionPane.showConfirmDialog(null, "Deseja Continuar? ")) == 0);
        String disciplinasDisponiveis = "";
    for (Disciplina materia : materias){
        disciplinasDisponiveis +="\n"+ materias.lastIndexOf(materia) + " " + materia.getNome();
    }
    JOptionPane.showMessageDialog(null, disciplinasDisponiveis);
    
    String disciplinasDisponiveis = "";
    for (Disciplina materia : materias){
        disciplinasDisponiveis +="\n"+ materias.lastIndexOf(materia)+ " " + materia.getNome();
    }
    Date dataNascimento = new Date();
    materias.add(new Disciplina("POO", "Informática", 'A'));
    materias.add(new Disciplina("Redes", "Informática", 'A'));
    materias.add(new Disciplina("Estrutura de Dados", "Informática", 'A'));
    materias.add(new Disciplina("Linguagem de Programação", "Informática", 'A'));
    Professor markson = new Professor(20, 10, 5, "Markson",);
    String disciplinasDisponiveis = "";
    for (Disciplina materia : materias){
        disciplinasDisponiveis +="\n"+ materias.lastIndexOf(materia) + " " + materia.getNome();
    }
    do {
        int esc = Integer.parseInt(JOptionPane.showInputDialog(args));
        markson.getDisciplinas().add(materias.get(esc));
    } while ((JOptionPane.showConfirmDialog(null, "Deseja cadastrar"));
    JOptionPane.showMessageDialog(null, markson.getDisciplinas);
}
}