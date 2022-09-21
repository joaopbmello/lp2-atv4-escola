package br.ufrn.imd.main;

import br.ufrn.imd.dominio.Aluno;
import br.ufrn.imd.dominio.Prova;
import br.ufrn.imd.dominio.Turma;

public class Main {
    public static void main(String[] args) {
        Prova prova11 = new Prova(3.0, 3.5);
        Prova prova12 = new Prova(4.0, 4.0);
        Aluno aluno1 = new Aluno(prova11, prova12);

        Prova prova21 = new Prova(5.0, 4.5);
        Prova prova22 = new Prova(1.5, 1.5);
        Aluno aluno2 = new Aluno(prova21, prova22);

        Prova prova31 = new Prova(4.0, 3.5);
        Prova prova32 = new Prova(4.5, 4.5);
        Aluno aluno3 = new Aluno(prova31, prova32);

        Turma turma = new Turma(aluno1, aluno2, aluno3);

        System.out.println("Média do 1º aluno: " + aluno1.calcularMedia());
        System.out.println("Média do 2º aluno: " + aluno2.calcularMedia());
        System.out.println("Média do 3º aluno: " + aluno3.calcularMedia());
        System.out.println("Média da turma: " + turma.calcularMedia());
    }
}
