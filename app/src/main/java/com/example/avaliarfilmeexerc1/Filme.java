package com.example.avaliarfilmeexerc1;

public class Filme {

    private String nome;
    private String genero;
    private int nota;

    public Filme(){}

    public Filme(String nome, String Genero, int nota){
        this.nome = nome;
        this.genero = genero;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
}
