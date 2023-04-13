public  class Aluno extends Pessoa {
    private int matricula;
    private String curso;


public Aluno (String no, int id, String se, int mar, String cur){

this.setNome(no);
this.setIdade(id);
this.setSexo(se);
this.setMatricula(mar);
this.setCurso(cur);


}

@Override
public String toString() {
    // TODO Auto-generated method stub
    return super.toString()+ " Matricula.: " + matricula + " Curso.: " + curso ;
}


    public   void pagarMensalidade(){

        System.out.println("Pagando mensalidade do aluno :"+ this.getNome());
    }


protected String getCurso() {
    return curso;
}

protected int getMatricula() {
    return matricula;
}

protected void setCurso(String c ){
    this.curso =c;
}

protected void setMatricula(int ma){
this.matricula= ma;
}

}
