public class Ave extends Animal {
// Atributos
protected String corPena;

// Metodos especiais
public String getCorPena() {
    return corPena;
    
}public void setCorPena(String corp) {
    this.corPena = corp;
}

// Usando o conceito de polimorfismo de sobreposição
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
// Metodo simples
public void fazerNinho(){
    System.out.println("Construiu um ninho");
}

}
