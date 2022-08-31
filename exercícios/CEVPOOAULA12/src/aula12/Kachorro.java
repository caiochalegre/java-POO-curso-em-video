package aula12;

public class Kachorro extends Mamifero{
    // Métodos Públicos

    public void enterrarOsso(){
        System.out.println("Enterrando um osso");
    }

    public void abanarRabo(){
        System.out.println("Abanando o rabo");
    }

    @Override
    public void emitirSom() {
        System.out.println("Au! au!");

    }
}
