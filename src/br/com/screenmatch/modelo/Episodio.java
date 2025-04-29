package br.com.screenmatch.modelo;

import br.com.screenmatch.calculo.Classificavel;

public class Episodio implements Classificavel {
    private int numero;
    private String nome;
    private Serie serie;
    private int totalVisualizavoes;

    public int getTotalVisualizavoes() {
        return totalVisualizavoes;
    }

    public void setTotalVisualizavoes(int totalVisualizavoes) {
        this.totalVisualizavoes = totalVisualizavoes;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getClassificacao() {
        if (totalVisualizavoes > 100) {
            return 4;
        } else {
            return 2;
        }
    }
}
