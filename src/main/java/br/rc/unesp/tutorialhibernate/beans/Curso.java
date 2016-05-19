package br.rc.unesp.tutorialhibernate.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CURSO")
public class Curso {
    @Id @GeneratedValue
    @Column(name = "ID")
    private long id;
    
    @Column(name = "NOME")
    private String nome;

    public Curso() {
    }

    public Curso(long id, String nome) {
        this.id = id;
        this.nome = nome;
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
}
