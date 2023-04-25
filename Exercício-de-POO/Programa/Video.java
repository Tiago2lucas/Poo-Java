public class Video implements AcoesVideo{

    private String titulo;
    private int avaliacao;
    private float views;
    private float curtidas;
    private boolean reproduzindo;
    
    //Metodo Construtor
    public Video (String ti){
    this.setTitulo(ti);
    this.avaliacao= 1;
    this.curtidas= 0;
    this.views= 0;
    this.setReproduzindo(false);
    }
    
    
    // Métodos Acessores
    protected int getAvaliacao() {
        return avaliacao;
    }
    protected float getCurtidas() {
        return curtidas;
    }
    protected String getTitulo() {
        return titulo;
    }
    protected float getViews() {
        return views;
    }
    protected boolean getReproduzindo() {
        return reproduzindo;
    }
    // Nova Avaliação e Média de Availiação do Video
    protected void setAvaliacao(int av) {
     int nova;
     nova = (int) ((this.avaliacao + av)/ this.views);
        
        this.avaliacao = nova;
    }
    protected void setCurtidas(float cur) {
        this.curtidas = cur;
    }
    protected void setReproduzindo(boolean re) {
        this.reproduzindo = re;
    }protected void setTitulo(String ti) {
        this.titulo = ti;
    }
    protected void setViews(float vie) {
        this.views = vie;
    }
    
    //Implementando os metodos abstratos
    @Override
    public void play(){
    this.setReproduzindo(true);
    
        }
    @Override
    public void pause (){
    this.setReproduzindo(false);
    }
    @Override
    public void like (){
    this.curtidas++;
    }
    
    }