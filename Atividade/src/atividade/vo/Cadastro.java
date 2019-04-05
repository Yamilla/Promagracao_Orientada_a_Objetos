
package atividade.vo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Cadastro {
    private List <Funcionario> listaDeFuncionario;                              //esta dando problema no arrar list 
   
 
    public void cadastrarFuncionario(){
        Scanner ler = new Scanner (System.in);
        Funcionario fun = new Funcionario();
       listaDeFuncionario = new ArrayList<>();
        System.out.println("Cadastramento de funcionario");
        System.out.println("Informe o codigo do funcionario");
        fun.setCodigo(ler.nextInt());
        
        ler = new Scanner (System.in);
        System.out.println("Informe o nome do funcionario");
        fun.setNome(ler.nextLine());
        
        ler = new Scanner (System.in);
        System.out.println("Informe a idade do funcionario");
        fun.setIdade(ler.nextInt());
        
         listaDeFuncionario.add(fun);
        
    }
    public void deletarFuncionario(){                                           //dando problema para remover 
        Scanner ler = new Scanner (System.in);
        Funcionario fun = new Funcionario();
        System.out.println("Informe o funcionario que deseja deletar");
        fun.setCodigo(ler.nextInt());
        listaDeFuncionario.remove(fun);
        System.out.println("O funcionario foi removido com sucesso!!!");
        
        
    }
    public void listarFuncionario(){
        for(int i = 0; i < listaDeFuncionario.size(); i++ ){
            System.out.println("Lista de funcionarios");
            System.out.println("Codigo do funcionario: " +listaDeFuncionario.get(i).getCodigo());
            System.out.println("Nome do funcionario: "  +listaDeFuncionario.get(i).getNome());
            System.out.println("Idade do funcionario: " +listaDeFuncionario.get(i).getIdade());     
        }
            
        
    }
}

