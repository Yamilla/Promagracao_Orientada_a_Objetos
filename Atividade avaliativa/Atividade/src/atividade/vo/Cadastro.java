package atividade.vo;

import java.util.ArrayList;
import java.util.Scanner;
import atividade.vo.Funcionario;
import atividade.vo.Setor;

public class Cadastro {

    ArrayList<Funcionario> listaDeFuncionario = new ArrayList();
    ArrayList<Setor> listaDeSetor = new ArrayList();
    private Setor setor;
    
    public void cadastrarFuncionario() {                           
        Scanner ler = new Scanner(System.in);
       Funcionario fun = new Funcionario();
        if(listaDeSetor.isEmpty()){
            System.out.println("Por favor!! Cadastre um setor antes de iniciar");
        }else{
            System.out.println("----------Cadastramento de funcionario-----------------");
            System.out.println("Informe o codigo do funcionario");
            fun.setCodigo(ler.nextInt());

            ler = new Scanner(System.in);
            System.out.println("Informe o nome do funcionario");
            fun.setNome(ler.nextLine());

            ler = new Scanner(System.in);
            System.out.println("Informe a idade do funcionario");
            fun.setIdade(ler.nextInt());

            ler = new Scanner(System.in);
            System.out.println("Informe um codigo do setor");
            int novo = Integer.parseInt(ler.next());
            setor = usarSetor(novo);
            fun.setSetor(setor);

            System.out.println("O cadastro foi realizado com sucesso");
            System.out.println("-------------------------------------------------------");
            System.out.println("");
            
            listaDeFuncionario.add(fun);
        }
    }

    public void deletarFuncionario() {          
        Scanner ler = new Scanner(System.in);
        if (listaDeFuncionario.isEmpty()) {
            System.out.println("Não há funcionario cadastrado");
        } else {
            System.out.println("------Informe o funcionario que deseja deletar---------");
            Integer aux;
            aux = ler.nextInt();
            for (int k = 0; k < listaDeFuncionario.size(); k++) {
                if (listaDeFuncionario.get(k).getCodigo().equals(aux)) {
                    listaDeFuncionario.remove(k);
                    System.out.println("O funcionario foi removido com sucesso!!!");
                    System.out.println("-----------------------------------------------");
                    System.out.println("");
                    break;
                }
            }
        }
    }

    public void listarFuncionario() {
        if (listaDeFuncionario.isEmpty()) {
            System.out.println("Não há funcionario cadastrado");
        } else {
            for (int i = 0; i < listaDeFuncionario.size(); i++) {
                System.out.println("--------------Lista de funcionarios------------------");
                System.out.println("Codigo do funcionario: " + listaDeFuncionario.get(i).getCodigo());
                System.out.println("Nome do funcionario: " + listaDeFuncionario.get(i).getNome());
                System.out.println("Idade do funcionario: " + listaDeFuncionario.get(i).getIdade());
                System.out.println("Nome do setor: " +listaDeFuncionario.get(i).getSetor().getNome());
                System.out.println("-----------------------------------------------------");
                System.out.println("");
            }
        }
    }

    public void cadastrarSetor() {
            
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

    public void listarSetor() {
        if (listaDeSetor.isEmpty()) {
            System.out.println("Nao há setor cadastrado");
        }else{
            for (int j = 0; j < listaDeSetor.size(); j++) {
                System.out.println("------------Listar de setor--------------------------");
                System.out.println("Codigo do setor: " + listaDeSetor.get(j).getCodigo());
                System.out.println("Nome do setor: " + listaDeSetor.get(j).getNome());
                System.out.println("-----------------------------------------------------");
                System.out.println("");
             }
        }
    }
    public void deletarSetor(){
        Scanner ler = new Scanner (System.in);
        if (listaDeSetor.isEmpty()) {
            System.out.println("Nao há setor cadastrado");
        }else{
            System.out.println("---------Informe um setor para deletar------------------");
            Integer contador;
            contador = ler.nextInt();
            for(int l =0; l < listaDeSetor.size(); l++){
                if(listaDeSetor.get(l).getCodigo().equals(contador)){
                    listaDeSetor.remove(l);
                    System.out.println("O setor foi removido com sucesso!!!");
                    System.out.println("-----------------------------------------------");
                    System.out.println("");
                    break;
                }
            }
        }
    }
    private Setor usarSetor(int codigo){
        for(int i = 0; i< listaDeSetor.size(); i++ ){
            if (listaDeSetor.get(i).getCodigo()==codigo)
                return listaDeSetor.get(i);
        } 
        return null;
    }
}

