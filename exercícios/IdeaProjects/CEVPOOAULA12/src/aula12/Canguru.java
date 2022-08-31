package aula12;

public class Canguru extends Mamifero{
    // Métodos Públicos

    public void usarBolsa(){
        System.out.println("Usando a bolsa");
    }

    @Override
    public void locomover(){
        System.out.println("Pulando");
    }
}
