
public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;


public Pessoa(String no, int id, String s){
    this.setNome(no);
    this.setIdade(id);
    this.setSexo(s);

}



public void fazerAniver(){

this.idade++;
System.out.println(" Vamos fazero Aniversario de " + this.getNome());
System.out.println(" Que esta completando " + this.getIdade() + " anos de idade");

}

// Metodos especiais
protected String getNome() {
    return nome;
}
private void setNome(String no) {
    this.nome = no;
}
private int getIdade() {
    return idade;
}
private void setIdade(int id) {
    this.idade = id;
}
protected String getSexo(){
    return sexo;
}

private void setSexo( String s){
    this.sexo=s;
}

}
