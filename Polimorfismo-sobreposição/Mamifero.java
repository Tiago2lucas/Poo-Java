public class Mamifero extends Animal{
// Atributos 
    protected String corPelo;
// Metodos especiais
    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corP) {
        this.corPelo = corP;
    }
    // Usando o conceito de polimorfismo de sobreposição
    @Override
    public void locomover(){
        System.out.println("Correndo");
    }
    @Override
    public void alimentar ()
    {
    System.out.println("Mamando");
    }   
    
    @Override
    public void emitirSom(){
        System.out.println("Som de Mamifero");
    }

}
