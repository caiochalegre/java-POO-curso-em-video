package aula12;

public class Ave extends Animal{
    // Atributos

    private String corPena;

    // Métodos Especiais


    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    // Métodos Públicos

    @Override
    public void locomover() {
        System.out.println("Voando");

    }

    @Override
    public void alimentar() {
        System.out.println("Comendo frutas");

    }

    @Override
    public void emitirSom() {
        System.out.println("Som de ave");

    }

    public void fazerNinho(){
        System.out.println("Construindo um ninho");
    }
}
