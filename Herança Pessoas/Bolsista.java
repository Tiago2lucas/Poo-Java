public class Bolsista extends Aluno {
    
private float bolsa;



public Bolsista (String no, int id, String se, int mar, String cur, float bo){
super(no, id, se, mar, cur);
this.setBolsa(bo);
}

@Override
public String toString() {
    // TODO Auto-generated method stub
    return super.toString() + " Bolsa de Estudo.:"+ bolsa;
}

public void renovarBolsa(){

System.out.println("Renovando bolsa de " + this.getNome());

}
@Override
public void pagarMensalidade(){
System.out.println( this.getNome() + " e bolsista ! Pagamento facilitado");
}

protected float getBolsa() {
    return bolsa;
}protected void setBolsa(float bo) {
    this.bolsa = bo;
}
}
