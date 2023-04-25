public  abstract class Pessoa {
    protected String nome;
    protected int idade; 
    protected String sexo;
    protected float experiencia;

// Construtor
public  Pessoa (String no, int id, String se){

this.setNome(no);
this.setIdade(id);
this.setSexo(se);
this.experiencia= 0;
}
// Usando  o função toString
@Override
public String toString() {
   
    return  "Pessoa[Nome="+ nome + " idade="+ idade + " Sexo=" + sexo +  " Experiencia=" + experiencia+"]";
}

// Metodos acessores 
public String getNome() {
    return nome;
}
public float getExperiencia() {
    return experiencia;
}
public int getIdade() {
    return idade;
}
public String getSexo() {
    return sexo;
}
public void setNome(String nome) {
    this.nome = nome;
}
public void setExperiencia(float experiencia) {
    this.experiencia = experiencia;
}
public void setIdade(int idade) {
    this.idade = idade;
}
public void setSexo(String sexo) {
    this.sexo = sexo;
}

protected void ganharExp(){

    this.experiencia ++;
}

}
