package aula07;

public class Lutador {
    // Atributos

    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    // Métodos Especiais


    public Lutador(String no,
                   String na,
                   int id,
                   float al,
                   float pe,
                   int vi,
                   int de,
                   int em

    ) {
        this.setNome(no);
        this.setNacionalidade(na);
        this.setIdade(id);
        this.setAltura(al);
        this.setPeso(pe);
        this.setVitorias(vi);
        this.setDerrotas(de);
        this.setEmpates(em);

    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return this.nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return this.altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return this.peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return this.categoria;
    }

    private void setCategoria(){
        if(this.peso < 52.2){
            this.categoria = "Inválido ";
        } else if(this.peso <= 70.3){
            this.categoria = "Leve ";
        } else if(this.peso <= 83.9){
            this.categoria = "Médio ";
        } else if(this.peso <= 120.2){
            this.categoria = "Pesado ";
        } else{
            this.categoria = "Inválido ";
        }

    }

    public int getVitorias() {
        return this.vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return this.derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return this.empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    // Métodos Públicos

    public void apresentar(){
        System.out.println("--------------------------------------");
        System.out.println("CHEGOU A HORA! Apresentamos o lutador " + this.getNome());
        System.out.println("Diretamente de " + this.getNacionalidade());
        System.out.println("com " + this.getIdade() + " anos e " + getAltura() + " metros ");
        System.out.println("pesando " + this.getPeso() + " Kg ");
        System.out.println(this.getVitorias() + " vitórias ");
        System.out.println(this.getDerrotas() + " derrotas e ");
        System.out.println(this.getEmpates() + " empates ");
        System.out.println("--------------------------------------");

    }

    public void status(){
        System.out.println(this.getNome() + " é um peso " + this.getCategoria());
        System.out.println("Ganhou " + this.getVitorias() + " vezes ");
        System.out.println("Empatou " + this.getEmpates() + " vezes ");
        System.out.println("Perdeu " + this.getDerrotas() + " vezes ");
    }

    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);

    }

    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);

    }

    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);

    }
}
