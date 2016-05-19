package br.rc.unesp.tutorialhibernate.beans;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Pessoa implements Serializable {

    private long id;
    private String nome;
    private String email;
    private Set enderecos;
    private Set cursosRealizados;

    public Pessoa() {
        this.enderecos = new HashSet();
    }

    public Pessoa(long id, String nome, String email, Set enderecos) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.enderecos = enderecos;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public Set getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(Set enderecos) {
        this.enderecos = enderecos;
    }

    public Set getCursosRealizados() {
        return cursosRealizados;
    }

    public void setCursosRealizados(Set cursosRealizados) {
        this.cursosRealizados = cursosRealizados;
    }
}
