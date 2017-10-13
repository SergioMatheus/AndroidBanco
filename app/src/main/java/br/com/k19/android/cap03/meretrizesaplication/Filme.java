package br.com.k19.android.cap03.meretrizesaplication;

import java.io.Serializable;

public class Filme implements Serializable {

    private String local;
    private String nomeFilme;
    private String duracao;
    private String horarios;

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    private Categoria categoria;



    public Filme(String nomeFilme ,String local, String duracao, String horarios,String categoria) {
        Categoria c = Categoria.valueOf(categoria); //to enum
       // c.name(); //enum tu string
        this.nomeFilme = nomeFilme;
        this.local = local;
        this.duracao = duracao;
        this.horarios = horarios;
        this.categoria=c;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getHorarios() {
        return horarios;
    }

    public void setHorarios(String horarios) {
        this.horarios = horarios;
    }

    @Override
    public String toString() {
        return nomeFilme;
    }
}