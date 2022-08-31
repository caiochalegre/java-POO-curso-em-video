package aula10;

public class Funcionario extends Pessoa {
    // Atributos

    private String setor;

    private  boolean trabalhando;

    // Métodos Especiais

    public String getSetor() {
        return this.setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalhando() {
        return this.trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

    // Métodos Publicos

    public void mudarTrabalhando(){
         this.trabalhando = ! this.trabalhando;

    }
}
