public class Professor extends Pessoa {
    private String especialidade;
    private float salario;


public Professor (String no, int id, String se, String es, float sa){

this.setNome(no);
this.setIdade(id);
this.setSexo(se);
this.setEspecialidade(es);
this.setSalario(sa);

}
@Override
public String toString() {
    // TODO Auto-generated method stub
    return super.toString() + "Especialidade.:" + especialidade + "Salario.:" + salario;
}

    public void recebeAum(float sa){

    this.salario += sa;
    }



public void setEspecialidade(String es) {
    this.especialidade = es;
}

public void setSalario(float sa) {
    this.salario = sa;
}
public String getEspecialidade() {
    return especialidade;
}
public float getSalario() {
    return salario;
}
}
