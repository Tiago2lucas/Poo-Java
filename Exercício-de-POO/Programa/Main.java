public class Main{


     public static void main(String[] args) {
          
        Video v[]= new Video[5];
        v[0]= new Video("Aula  2 para JavaScript iniciante");
        v[1]= new Video("Aula 10 de PHP ");
        v[2]= new Video("Aula de POO em Java ");

        Gafanhoto g[] = new Gafanhoto[5];
        g[0]=new Gafanhoto("Lucas", 25, "M", "Ukins");
        g[1]=new Gafanhoto("tIAGO", 25, "M","dKTIK" );

        Visualizacao vis[]= new Visualizacao[3];
        vis[0]= new Visualizacao(g[1],v[1]);

        
        System.out.println(vis[0].toString());



     
    }
}