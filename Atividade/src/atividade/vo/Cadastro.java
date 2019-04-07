
package atividade.vo;

import java.util.ArrayList;
import java.util.Scanner;


public class Cadastro {
    ArrayList <Funcionario> listaDeFuncionario = new ArrayList();  
    ArrayList <Setor> listaDeSetor = new ArrayList();
   
 
    public void cadastrarFuncionario(){
        Scanner ler = new Scanner (System.in);
        Funcionario fun = new Funcionario();
        System.out.println("----------Cadastramento de funcionario-----------------");
        System.out.println("Informe o codigo do funcionario");
        fun.setCodigo(ler.nextInt());
        
        ler = new Scanner (System.in);
        System.out.println("Informe o nome do funcionario");
        fun.setNome(ler.nextLine());
        
        ler = new Scanner (System.in);
        System.out.println("Informe a idade do funcionario");
        fun.setIdade(ler.nextInt());
        System.out.println("-------------------------------------------------------");
        System.out.println("");
        
        listaDeFuncionario.add(fun);
        
    }
    public void deletarFuncionario(){                        // problema no deletar                   
        Scanner ler = new Scanner (System.in);
        Funcionario fun = new Funcionario();
        listaDeFuncionario = new ArrayList();
        System.out.println("------Informe o funcionario que deseja deletar---------");
        fun.setCodigo(ler.nextInt());
        listaDeFuncionario.remove(fun);
        System.out.println("O funcionario foi removido com sucesso!!!");
        System.out.println("-------------------------------------------------------");
        System.out.println("");
        
        
    }
    public void listarFuncionario(){   // tratar se estiver vazio
        for(int i = 0; i < listaDeFuncionario.size(); i++ ){
            System.out.println("--------------Lista de funcionarios------------------");
            System.out.println("Codigo do funcionario: " +listaDeFuncionario.get(i).getCodigo());
            System.out.println("Nome do funcionario: "  +listaDeFuncionario.get(i).getNome());
            System.out.println("Idade do funcionario: " +listaDeFuncionario.get(i).getIdade()); 
            System.out.println("-----------------------------------------------------");
            System.out.println("");
        }   
    }
    public void cadastrarSetor(){
        Scanner ler = new Scanner(System.in);
        Setor setor = new Setor();
        System.out.println("------------Cadrastamento do Setor---------------------");
        System.out.println("Informe o codigo do setor: ");
        setor.setCodigo(ler.nextInt());
        
        ler = new Scanner(System.in);
        System.out.println("Informe o nome do setor:");
        setor.setNome(ler.nextLine());
        System.out.println("-------------------------------------------------------");
        System.out.println("");
        
        listaDeSetor.add(setor);
    }
    public void listarSetor(){
        for (int j = 0; j < listaDeSetor.size(); j++){
            System.out.println("------------Listar de setor--------------------------");
            System.out.println("Codigo do setor: " +listaDeSetor.get(j).getCodigo());
            System.out.println("Nome do setor: " +listaDeSetor.get(j).getNome());
            System.out.println("-----------------------------------------------------");
            System.out.println("");
        }
    }


}

