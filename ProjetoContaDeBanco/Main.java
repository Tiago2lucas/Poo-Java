
public class Main {
    public static void main(String[] args) {
       
    ContaBanco p1 = new ContaBanco();
    p1.setNumConta(1115);
    p1.setDono("Alex");
    p1.abrirConta("CP");

    ContaBanco p2 = new ContaBanco();
    p2.setNumConta(5789);
    p2.setDono("Maria");
    p2.abrirConta("CC");



    p1.sacar(50);

    

    p1.estadoAtual();
  
   
    
}
}
