package atividade;

import atividade.vo.Cadastro;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Cadastro cadastro = new Cadastro();
        Scanner ler = new Scanner(System.in);
        int opcao = 0;

        whileSistema:

        while (true) {
            System.out.println("----------Informe a opção que deseja realizar:---------");
            System.out.println("[1] Casdastrar funcionario");
            System.out.println("[2] Listar funionario");
            System.out.println("[3] Delatar funcionaario");
            System.out.println("[4] Cadastrar Setor");
            System.out.println("[5] Listar setor");
            System.out.println("[6] Deletar setor");
            System.out.println("[7] Finalizar o sistema");
            System.out.println("-------------------------------------------------------");
            System.out.println();
            opcao = ler.nextInt();

            switch (opcao) {
                case 1:
                    cadastro.cadastrarFuncionario();
                    break;
                case 2:
                    cadastro.listarFuncionario();
                    break;
                case 3:
                    cadastro.deletarFuncionario();
                    break;
                case 4:
                    cadastro.cadastrarSetor();
                    break;
                case 5:
                    cadastro.listarSetor();
                    break;
                case 6:
                    cadastro.deletarSetor();
                    break;
                case 7:
                    break whileSistema;
            }

        }

    }

}
