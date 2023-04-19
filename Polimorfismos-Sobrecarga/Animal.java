public abstract class Animal {
    protected float peso;
    protected int idade;
    protected int membros;

    // Metodo Abstrato 
public abstract void emitirSom();

//Metodo Acessores Getters e setters
public int getIdade() {
    return idade;
}public int getMembros() {
    return membros;
}
public float getPeso() {
    return peso;
}public void setIdade(int idade) {
    this.idade = idade;
}
public void setMembros(int membros) {
    this.membros = membros;
}public void setPeso(float peso) {
    this.peso = peso;
}


}
