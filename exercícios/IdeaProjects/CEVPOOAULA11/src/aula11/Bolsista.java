package aula11;

public class Bolsista extends Aluno{
    // Atributos

    private float bolsa;

    // Métodos Especiais

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }


    // Métodos Públicos

    public void renovarBolsa(){
        System.out.println("Bolsa do aluno " + this.getNome() + " renovada com sucesso");

    }

    @Override
    public void pagarMensalidade(){
        System.out.println(this.getNome() + " é bolsista. Pagamento realizado com sucesso");
    }

}
