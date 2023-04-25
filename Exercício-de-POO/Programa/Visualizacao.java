public class Visualizacao{
    private Video filme; 
    private  Gafanhoto espectador;


//Metodo contrustor
public Visualizacao( Gafanhoto espectador, Video filme ){
this.filme= filme;
this.espectador=espectador;
this.espectador.experiencia++;
this.filme.setReproduzindo(true);
this.espectador.setTotAssistido(this.espectador.getTotAssistido()+1);
this.filme.setViews(this.filme.getViews()+1);
}
// Metodo getters e setters
public Gafanhoto getEspectador() {
    return espectador;
}
public Video getFilme() {
    return filme;
}
public void setEspectador(Gafanhoto espectador) {
    this.espectador = espectador;
}
public void setFilme(Video filme) {
    this.filme = filme;
}

//Usando metodo de Sobrecarga
public void avaliar(){
    this.filme.setAvaliacao(5);
}

public void avaliar( int nota){

this.filme.setAvaliacao(nota);
}

public void avaliar(float por){
int tot=0;
if(por<=20){
    tot=3;
}else if( por <=50){
    tot=5;
} else if( por <= 90){
    tot=8;
} else {
    tot=10;
}
this.filme.setAvaliacao(tot);
}

//Sobrescrevendo toString
@Override
public String toString() {
    
    return "Visualizador=[" + espectador + " Assistindo:" + filme.getTitulo() +"]";
}


}
