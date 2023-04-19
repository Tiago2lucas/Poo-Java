public abstract class  Animal {
// Atributos de Animal
protected  float peso;
protected int idade;
protected int membros;

// Metodo abstratos de Animal
public abstract void locomover();
public abstract void alimentar();
public abstract void emitirSom();

// Metodos especiais
protected int getIdade() {
    return idade;
}
protected int getMembros() {
    return membros;
}
protected float getPeso() {
    return peso;
}
protected void setIdade(int id) {
    this.idade = id;
}
protected void setMembros(int me) {
    this.membros = me;
}
protected void setPeso(float pe) {
    this.peso = pe;
}
}