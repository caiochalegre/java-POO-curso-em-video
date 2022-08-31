package aula09;

public class Livro implements Publicacao {

    // Atributos


    private String titulo;

    private String autor;

    private int totPaginas;

    private int pagAtual;

    private boolean aberto;

    private Pessoa leitor;

    // Métodos Especiais


    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.aberto = false;
        this.pagAtual = 0;
        this.leitor = leitor;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return this.totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return this.pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return this.aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return this.leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    // Métodos Publicos


    public void detalhes(){
        System.out.println("==========================");
        System.out.println("Detalhes do livro: ");
        System.out.println("Título: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Total de páginas: " + this.getTotPaginas());
        System.out.println("Página atual: " + this.getPagAtual());
        System.out.println("Livro aberto? " + this.getAberto());
        System.out.println("Leitor: " + leitor.getNome());
        System.out.println("Idade do leitor: " + leitor.getIdade());
        System.out.println("Sexo do leitor: " + leitor.getSexo());
        System.out.println("==========================");

    }

    @Override
    public void abrir() {
        this.setAberto(true);

    }

    @Override
    public void fechar() {
        this.setAberto(false);

    }

    @Override
    public void folhear(int p) {
        if(p > this.getTotPaginas()){
            this.setPagAtual(0);
        } else{
            this.setPagAtual(p);

        }

    }

    @Override
    public void avancarPag() {
        if(this.getAberto()){
            this.setPagAtual(this.getPagAtual() + 1);

        }

    }

    @Override
    public void voltarPag() {
        if(this.getAberto()){
            this.setPagAtual(this.getPagAtual() - 1);

        }

    }
}
