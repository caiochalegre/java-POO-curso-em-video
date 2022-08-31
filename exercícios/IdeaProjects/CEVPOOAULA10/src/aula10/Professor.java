package aula10;

public class Professor extends Pessoa {
    // Atributos

    private String especialidade;

    private float salario;

    // Métodos Especiais

    public String getEspecialidade() {
        return this.especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return this.salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    // Métodos Publicos

    public void receberAumento(float aumento){
        setSalario(getSalario() + aumento);


    }
}
