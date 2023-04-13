
public class Main{ 
    
    public static void main(String[] args) {

        Pessoa p[] = new Pessoa [3];
        
        
       p[0]= new Pessoa ("Tiago Lucas", 29, "M");
        
        Livro n = new Livro("Harry Potter", "James web", 400, p[0]);
    
        n.abrir();
        n.avancarPag();
        n.folhear(200);
        n.status();
        
}   
} 