public class Peixe extends Animal {
    // Atributo
    protected String corEscama;

// Metodo especial
    public String getCorEscama() {
        return corEscama;
    }
    public void setCorEscama(String corE) {
        this.corEscama = corE;
    }
// Usando o conceito de polimorfismo de sobreposição
@Override
public void locomover(){
System.out.println("Nadando"); 
}
@Override
public void alimentar(){
    System.out.println("Comendo substancias");
}
@Override
public void emitirSom(){
    System.out.println("Peixe não faz som");

}
// Metodo simples
public void soltarBolha(){
    System.out.println("Soltou uma Bolha");
}

}
