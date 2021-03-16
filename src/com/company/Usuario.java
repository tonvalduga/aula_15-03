package com.company;

public class Usuario {


    public boolean verificarMaiorIdade(int idade) {

        if (idade >= 18) {
            System.out.println("O candidato é maior de idade");
            return true;
        } else {
            System.out.println("O candidato é menor de idade");
            return false;
        }
    }

    public boolean verificaNacionalidadeCompativel(boolean nacionalidade) {

        if (nacionalidade) {
            System.out.println("O candidato é Brasileiro");
            return true;
        } else {
            System.out.println("O candidato é estrangeiro");
            return false;
        }
    }


    public boolean verificaDisponibilidade(boolean disponibilidade) {

        if (disponibilidade) {
            System.out.println("O candidato é disponível para trabalhar a tarde");
            return true;
        } else {
            System.out.println("O candidato não é disponível para trabalhar a tarde");
            return false;
        }
    }


    public boolean cadastrar(int idade, boolean nacionalidade, boolean disponibilidade) {
        if (verificarMaiorIdade(idade)) {
            if (verificaNacionalidadeCompativel(nacionalidade)) {
                if (verificaDisponibilidade(disponibilidade)) {
                    System.out.println("Usuário Cadastrado com Sucesso");
                    return true;
                } else {
                    return false;
                    
                }
            }
        }
        return false;

    }

}
