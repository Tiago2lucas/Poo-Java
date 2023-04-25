public class Gafanhoto extends Pessoa {
private String login;
private int totAssistido;

// Construtor
    public Gafanhoto(String no, int id, String se, String lo) {
        super(no, id, se);
        this.login=lo;
        this.totAssistido= 0;
    }
    
//Sobrescrevendo toString
@Override
public String toString() {
   
    return  "Gafanhoto=[ "+ super.toString() + " Login=" + login + " Total Assistido=" + totAssistido + "]";
}

// Métodos Acessores 
public String getLogin() {
    return login;
}
public int getTotAssistido() {
    return totAssistido;
}
public void setLogin(String login) {
    this.login = login;
}
public void setTotAssistido(int totAssistido) {
    this.totAssistido = totAssistido;
}

// Método simples

public void viuMaisUm(){
    this.totAssistido++;
}

}
