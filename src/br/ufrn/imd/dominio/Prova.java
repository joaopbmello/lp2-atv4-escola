package br.ufrn.imd.dominio;

/**
 * Classe que representa uma prova
 *
 * @author João Mello
 */
public class Prova {
    private double notaParte1;
    private double notaParte2;

    public Prova(double notaParte1, double notaParte2) {
        this.notaParte1 = notaParte1;
        this.notaParte2 = notaParte2;
    }

    public double getNotaParte1() {
        return notaParte1;
    }

    public void setNotaParte1(double notaParte1) {
        this.notaParte1 = notaParte1;
    }

    public double getNotaParte2() {
        return notaParte2;
    }

    public void setNotaParte2(double notaParte2) {
        this.notaParte2 = notaParte2;
    }

    /**
     * Calcula a nota total da prova pela soma das notas da parte 1 e 2.
     * A nota total não pode ultrapassar 10,0.
     * @return a nota total da prova
     */
    public double calcularNotaTotal() {
        double soma = notaParte1 + notaParte2;
        if (soma <= 10) {
            return soma;
        } else {
            throw new RuntimeException("A soma das notas não pode ser maior que 10.0");
        }
    }
}
