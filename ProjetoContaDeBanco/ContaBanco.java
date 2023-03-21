public class ContaBanco {
    
    public  int numConta;
    protected String tipo;
    private String dono;
    private  float saldo;
    private boolean status;

     public void estadoAtual (){
        System.out.println("-----------------------------");
        System.out.println("Conta ..:"+ this.getNumConta());
        System.out.println("Tipo da conta..:" + this.getTipo());
        System.out.println( "Dono..:" + this.getDono());
        System.out.println("Status da conta ..:"+ this.getStatus());
        System.out.println("Saldo da conta..:" +this.getSaldo());
     }


    public void abrirConta( String t){
        
        setTipo(t);
            setStatus(true);
            //  CC é Conta Corrente
                if (t == "CC"){
                    setSaldo(50);
                 
                    // CP é Conta poupança
                             }else if (t == "CP" ){
                        setSaldo(150);
                       
                  }
                  System.out.println("Conta aberta com Sucesso!!");
             }

             

    public  void fechaConta (){
        if (saldo > 0){
                 System.out.println("A conta possuir valores nela, retire o dinheiro para pode fechar.");
                     } else if ( saldo < 0){
                         System.out.println(" A Conta possui débito, não é possivel fecha a conta.");
                     }  else if ( saldo == 0){
                  setStatus(false);
              System.out.println("Conta fechada com Sucesso!! ");
        }

    }

public void depositar(float v )
{
if (getStatus() == true){
        setSaldo(getSaldo() + v);
             System.out.println(" O Deposito realizado "+ v + " na conta de :" + this.getDono() +" valor atual é "+ this.getSaldo());
                } else if ( getStatus() == false) { 
            System.out.println(" Impossivel depositar");
        }
    }

public void  sacar( float v){

if(getStatus() == true ){
        if (getSaldo() >= v){


    System.out.println(" O valor sacado foi "+ v + " da conta de:" +  this.getDono());
    setSaldo(getSaldo() - v);
    } 
else if ( getSaldo() < v){
    System.out.println(" Seu Saldo é insuficiente para o Saque, seu Saldo atual é :"+ this.getSaldo());
}
 else if (getStatus() == false){
    System.out.println("Impossível sacar, você não tem contar aberta");
}
}
    }
    public  void pagarMensal(){

        float v=0;
          if( getTipo() == "CC"){
            v = 12;
      } else if ( getTipo() == "CP"){
            v = 20;
      }

      if  (getStatus() == true){
        if(getSaldo() >= v){
        setSaldo(getSaldo() - v);
            System.out.println(" Mensalidade pagar com Sucesso, seu saldo é :" + this.getSaldo() );
      } else {
        System.out.println(" Saldo insuficiente" + this.getSaldo());
      }
    } else {
        System.out.println(" Impossível pagar, não tem conta ativa !" + this.getStatus());
    }
    }
// Métodos Especiais
public ContaBanco() {
    this.setSaldo(0);
    this.setStatus(false);
}

public void setNumConta(int n){
    this.numConta = n;
}
public int getNumConta(){
    return this.numConta;
}
public void setTipo(String t){
this.tipo= t;
}
public String getTipo(){
    return this.tipo;
}
public void setDono(String d){
this.dono= d;
}
public String getDono(){
    return this.dono;
}
public void setSaldo( float s){
this.saldo= s;
}
public float getSaldo(){
return this.saldo;
}
public void setStatus(boolean st){
    this.status= st;
}
public boolean getStatus(){
    return this.status;
}

}
