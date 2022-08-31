package aula12;

public class Peixe extends Animal{
    // Atributos

    private String corEscama;

    // Métodos Especiais


    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    // Métodos Públicos

    @Override
    public void locomover() {
        System.out.println("Nadando");

    }

    @Override
    public void alimentar() {
        System.out.println("Comendo substâncias");

    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não faz som");

    }

    public void soltarBolha(){
        System.out.println("Soltando uma bolha");
    }

}
