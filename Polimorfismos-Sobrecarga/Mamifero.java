public class Mamifero  extends Animal{
    
    protected String corPelo;
// Usando o polimorfismo do tipo sobreposição 
 @Override   
public void emitirSom (){
    System.out.println("Som de mamifero");
}

protected void setCorPelo(String corPelo) {
    this.corPelo = corPelo;
}

protected String getCorPelo(){
    return this.corPelo;
}
}
