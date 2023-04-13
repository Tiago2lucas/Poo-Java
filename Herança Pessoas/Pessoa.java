public  class Pessoa {
    private String nome;
    private int idade;
    private String sexo;





public void fazerAniv(){

    this.idade++;
}


protected String getNome() {
    return nome;
}

protected int getIdade() {
    return idade;
}
protected String getSexo() {
    return sexo;
}

protected void setNome(String no) {
    this.nome = no;
}
protected void setIdade(int id) {
    this.idade = id;
}

protected void setSexo(String se) {
    this.sexo = se;
}



@Override
public String toString() {
    
    return "Nome.: " + nome + " idade.: " + idade + " Sexo.: "+ sexo ;
}
}
