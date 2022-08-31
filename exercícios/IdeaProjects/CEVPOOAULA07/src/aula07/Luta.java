package aula07;

import java.util.Random;

public class Luta {
    // Atributos

     private Lutador desafiado;
     private Lutador desafiante;
     private int rounds;
     private boolean aprovada;

     // Métodos Especiais

     public Lutador getDesafiado() {
          return this.desafiado;
     }

     public void setDesafiado(Lutador desafiado) {
          this.desafiado = desafiado;
     }

     public Lutador getDesafiante() {
          return this.desafiante;
     }

     public void setDesafiante(Lutador desafiante) {
          this.desafiante = desafiante;
     }

     public int getRounds() {
          return this.rounds;
     }

     public void setRounds(int rounds) {
          this.rounds = rounds;
     }

     public boolean isAprovada() {
          return this.aprovada;
     }

     public void setAprovada(boolean aprovada) {
          this.aprovada = aprovada;
     }

     // Métodos Públicos

     public void marcarLuta(Lutador l1, Lutador l2){
          if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
               this.setAprovada(true);
               this.setDesafiado(l1);
               this.setDesafiante(l2);
          } else{
               this.setAprovada(false);
               this.setDesafiado(null);
               this.setDesafiante(null);
          }

     }

     public void lutar(){
         if(this.aprovada){
              System.out.println("### DESAFIADO ###");
             this.desafiado.apresentar();
              System.out.println("### DESAFIANTE ###");
             this.desafiante.apresentar();

              Random aleatorio = new Random();
              int vencedor  = aleatorio.nextInt(3); // 0 1 2
              System.out.println(" ==== RESULTADO DA LUTA ==== ");
              switch (vencedor){
                   case 0:  // Empate
                        System.out.println("Empatou! ");
                        this.desafiado.empatarLuta();
                        this.desafiante.empatarLuta();
                        break;
                   case 1:  // Vitória do desafiado
                        System.out.println("Vitória do " + this.desafiado.getNome());
                        this.desafiado.ganharLuta();
                        this.desafiante.perderLuta();
                        break;
                   case 2: // Vitória do  desafiante
                        System.out.println("Vitória do " + this.desafiante.getNome());
                        this.desafiado.perderLuta();
                        this.desafiante.ganharLuta();
                        break;
              }
              System.out.println("==========================");
         } else{
              System.out.println("A luta não pode acontecer ");
         }

     }


}
