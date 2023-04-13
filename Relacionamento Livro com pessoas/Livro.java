

public class Livro implements Publicacao{
    // Atributos
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

// Construtor
public Livro (String ti, String aut, int to , Pessoa p1){

this.setTitulo(ti);
this.setAutor(aut);
this.setTotPaginas(to);
this.setLeitor(p1);
this.setAberto(false);
this.pagAtual= 0;

}
// Metodos Simples
    public void detalhes(){
       System.out.println("Título do livro >> " + this.getTitulo());
        System.out.println("Autor >> "+this.getAutor());
        System.out.println("Total de Página do Livro >> " + this.getTotPaginas()+ "Páginas");

    }

    public void status (){
        System.out.println("=====================");
        System.out.println("O livro foi aberto:" + this.getAberto());
        System.out.println("Leito do livro é : " + this.leitor.getNome());
        System.out.println("Sexo : " + this.leitor.getSexo());
        System.out.println(" O Titulo do livro é : " + this.getTitulo());
        System.out.println("Página atual da leitura é " + this.getPagAtual());
        
    }

    // Métodos especiais
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String ti) {
    this.titulo = ti;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String aut) {
        this.autor = aut;
    }
    public Pessoa getLeitor() {
        return leitor;
    }
    public void setLeitor(Pessoa le) {
        this.leitor = le;
    }
    public int getPagAtual() {
        return pagAtual;
    }
    public void setPagAtual(int pat) {
        this.pagAtual = pat;
    }
   
    public boolean getAberto() {
        return aberto;
    }
    public void setAberto(boolean abe) {
        this.aberto = abe;
    }
    public int getTotPaginas() {
        return totPaginas;
    }
    public void setTotPaginas(int top) {
        this.totPaginas = top;
    }

// Metodos  da interface

@Override
public void abrir(){
this.aberto=true;

}

@Override
public void fechar(){ 
this.aberto=false;
}

@Override
public void folhear(int p){
    if(p> this.totPaginas){
        this.pagAtual=0;
    } else{
this.pagAtual = p;
    }
}
@Override
public void avancarPag(){
   this.pagAtual++;
}

@Override
public void  voltarPag(){
    this.pagAtual--;
}
}
