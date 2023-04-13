public class ControleRemoto implements Controlador{
    
    //Atributos
private int volume;
private boolean ligado;
private boolean tocando;

//Métodos especias
public ControleRemoto(){
 setVolume(50);
 setLigado(false);
 setTocando(false);

}
private int getVolume() {
    return volume;
}
private void setVolume( int v ){
this.volume= v;
}
private boolean getLigado(){
   return ligado; 
}
private void setLigado( boolean l){
this.ligado= l;
}
private boolean getTocando() {
    return tocando;
}
private void setTocando(boolean t) {
    this.tocando = t;
}

//Sobrescrevendo Métodos
@Override
public void ligar() {
    setLigado(true);
  
}
@Override
public void desligar() {
setLigado(false);

}
@Override
public void abrirMenu() {
  if(this.getLigado()== true){
 System.out.println("---MENU----");
System.out.println(" Esta ligado ?"+this.getLigado());
System.out.println("Esta tocando ?" +this.getTocando());
System.out.print("Volume:" + this.getVolume());
for( int i=1; i <= this.getVolume(); i+=10){
    System.out.print("|");
   }
   System.out.println("");
  } else {
    System.out.println("Não é possivel ver o Menu, Tv estar "+ this.getLigado());
  }
}
@Override
public void fechaMenu() {
System.out.println("Fechando Menu...");
}

@Override
public void maisVolume() {
  if (this.getLigado()){
    this.setVolume(this.getVolume() +5);
  } else{
    System.out.println("Impossivel aumenta o volume");

  } 
  
}
@Override
public void menosVolume() {
    if (this.getLigado()){
        this.setVolume(this.getVolume() -5);
    } else {
        System.out.println("Impossivel diminuir o volume");
    }
}
@Override
public void ligarMudo() {
if(this.getLigado()&& this.getVolume() >0 ){
setVolume(0);
}
}
@Override
public void desligarMudo() {
  if(this.getLigado() && this.getVolume() == 0  ){
setVolume(50);
  }
}
@Override
public void play() {
   if(this.getLigado() && !(this.getTocando())){
setTocando(true);
   } else {
    System.out.println("Não conseguir reproduzir!");
   }
}
@Override
public void pause() {
    if(this.getLigado() && this.getTocando()){
        setTocando(false);
           } else{
            System.out.println("Não conseguir pausar !");
           }


}

}
