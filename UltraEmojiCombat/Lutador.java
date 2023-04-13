 
 public class Lutador{

    //Atributos
private String nome;
private String nacionalidade;
private int idade;
private float altura;
private  float peso;
private String categoria;
private int vitorias, derrotas, empates;


// Metodos Públicos de uma interface simples

public void apresentar(){
    System.out.println("---------------------------");
System.out.println("ESTA CHEGANDO A HORA! Apresentamos o Lutador "+ this.getNome());
System.out.println("Diretamente de: " + this.getNacionalidade());
System.out.println("com " + this.getIdade() + " anos e " + this.getAltura() + " altura");
System.out.println("Pesando: " + this.getPeso() +" kg" );
System.out.println("Com " + this.getVitorias() + " Vitorias");
System.out.println("e " + this.getDerrotas() + " Derrotas");
System.out.println("e "+ this.getEmpates() + " Empates");

}

public void status(){
    System.out.println("-------Status do Lutador-------");
System.out.println(this.getNome()+ " é um peso "+ this.getCategoria());
System.out.println("Ganhou "+ this.getVitorias() +" vezes");
System.out.println("Perdeu "+ this.getDerrotas() +" vezes");
System.out.println("Empatou "+ this.getEmpates() +" vezes");

}

public void ganharLuta(){

this.setVitorias(this.getVitorias() +1);

}

public  void perderLuta(){

    this.setDerrotas(this.getDerrotas()+1);
}

public void empatarLuta(){

    this.setEmpates(this.getEmpates()+1);
}

// Métodos Especiais

// Metodo construtor
public Lutador(String no, String na, int id, float al, float pe,int vi,int de, int em) {

this.nome=no;
this.nacionalidade=na;
this.idade= id;
this.altura= al;
this.setPeso(pe);
this.vitorias=vi;
this.derrotas= de;
this.empates= em;

}   

public String getNome() {
    return nome;
}

public void setNome(String no ){
this.nome=no;

}

public String getNacionalidade() {
    return nacionalidade;

}
public void setNacionalidade(String na) {
    this.nacionalidade = na;
}
public float getAltura() {
    return altura;
}
public void setAltura(float al) {
    this.altura = al;
}

public int getIdade() {
    return idade;
}
public void setIdade(int id) {
    this.idade = id;
}
public float getPeso() {
    return peso;
    
}
public void setPeso(float pe) {
    this.peso = pe;
    this.setCategoria();
}
public String getCategoria() {
    return categoria;
}
private void setCategoria() {
   if(this.peso <52.2){
    this.categoria= "inválido";
   } else if(this.peso <= 70.3){
    this.categoria= "Leve";
   }else if(this.peso <= 83.9){
    this.categoria="Médio";
   }else if(this.peso <=120.2){
    this.categoria ="Pesado";
   } else {
    this.categoria= "Inválido";
   }
}


public int getVitorias(){
return vitorias;
}
public void setVitorias(int vi) {
    this.vitorias = vi;
}
public int getDerrotas(){
    return derrotas;
}
public void setDerrotas(int de) {
    this.derrotas = de;
}
public int getEmpates() {
    return empates;
}public void setEmpates(int em) {
    this.empates = em;
}




}