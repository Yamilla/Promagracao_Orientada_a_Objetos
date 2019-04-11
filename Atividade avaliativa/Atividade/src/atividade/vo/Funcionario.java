
package atividade.vo;

import java.util.Objects;


public class Funcionario extends Pessoa{
  
    private Setor setor;

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }    
}
