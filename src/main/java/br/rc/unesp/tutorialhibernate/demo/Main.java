package br.rc.unesp.tutorialhibernate.demo;

import br.rc.unesp.tutorialhibernate.beans.Curso;
import br.rc.unesp.tutorialhibernate.beans.Endereco;
import br.rc.unesp.tutorialhibernate.beans.Pessoa;
import br.rc.unesp.tutorialhibernate.service.PessoaService;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

    private static int leituraInt() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    private static int prompt() {
        System.out.println("========= Menu =======");
        System.out.println("1. Cadastrar pessoa");
        System.out.println("0. Sair");
        System.out.println("======================");
        System.out.println("Escolha uma opção : ");
        return leituraInt();
    }

    public static void main(String[] args) {
        int opcao = -1;
        PessoaService service = new PessoaService();
        while (opcao != 0) {
            opcao = prompt();
            switch (opcao) {
                case 0:
                    System.out.println("Saindo...");
                    break;
                case 1:
                    HashSet enderecos = new HashSet();
                    enderecos.add(new Endereco(0,"Rua 1", 1,"Rio Claro","SP",13506999));
                    enderecos.add(new Endereco(0,"Rua 14", 89,"Rio Claro","SP",13506888));
                    HashSet cursos = new HashSet();
                    cursos.add(new Curso(0,"Curso 1"));
                    cursos.add(new Curso(0,"Curso 2"));
                    Pessoa p = new Pessoa(0, "Vinicius Pfeifer", "vpfeifer20@gmail.com",enderecos);
                    p.setCursosRealizados(cursos);
                    service.inserir(p);
                    System.out.println("Inserido com sucesso!");
                    break;
            }
        }
    }
}
