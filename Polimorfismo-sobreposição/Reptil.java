public class Reptil extends Animal {
    // Atributo
protected String corEscama;

// Metodo Especiais 
public String getCorEscama() {
    return corEscama;
}
public void setCorEscama(String corEs) {
    this.corEscama = corEs;
}

//  Usando o conceito de polimorfismo de sobreposição
@Override
public void locomover(){
System.out.println("Rastejando");

}

@Override
public void alimentar(){
    System.out.println("Comendo Vegetais");
}
@Override
public void emitirSom(){
    System.out.println("Som de Reptil");
}
}
