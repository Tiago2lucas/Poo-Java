import java.util.Random;

public class Luta {
    
    // Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovado;

// Métodos Públicos

public void marcarLuta( Lutador l1, Lutador l2){

if( l1.getCategoria() == l2.getCategoria() 
        && l1 != l2){
            this.aprovado= true;
            this.desafiado= l1;
            this.desafiante= l2;
            System.out.println(" ### A Luta foi marcada ###");
} else {
    this.aprovado= false;
    this.desafiado= null;
    this.desafiante= null;
System.out.println("A Luta não pode ser marcada");

}

}

public void lutar(){
if (this.aprovado){
System.out.println("### DESAFIADO ###");
this.desafiado.apresentar();
System.out.println("### DESAFIANTE ###");
this.desafiante.apresentar();

Random aleatorio = new Random();
int vencedor = aleatorio.nextInt(3);

 switch(vencedor){
 case 0: // Empate
 System.out.println("A Luta Empatou !!");
this.desafiado.empatarLuta();
this.desafiante.empatarLuta();
 break;

 case 1:// o Desafiado Ganhou
 System.out.println("Vitória do  " + this.desafiado.getNome());
this.desafiado.ganharLuta();
this.desafiante.perderLuta();

 break;
 case 2: // O Desafiante Ganhou
 System.out.println("Vitória do " + this.desafiante.getNome());
this.desafiado.perderLuta();
this.desafiante.ganharLuta();
 break;
 }
} else {
    System.out.println("A Lutaa não pode acontecer");
}

}

// Métodos especiais

public Lutador getDesafiado() {
    return desafiado;
}
public Lutador getDesafiante() {
    return desafiante;
}public int getRounds() {
    return rounds;
}
public boolean getAprovado() {
    return aprovado;
}
public void setAprovado(boolean aprovado) {
    this.aprovado = aprovado;
}
public void setDesafiado(Lutador desafiado) {
    this.desafiado = desafiado;
}

public void setDesafiante(Lutador desafiante) {
    this.desafiante = desafiante;
}
public void setRounds(int rounds) {
    this.rounds = rounds;
}
}
