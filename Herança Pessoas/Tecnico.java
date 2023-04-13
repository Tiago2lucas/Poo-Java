public class Tecnico extends Aluno {
    private String registroProfissional;
    
    



    public Tecnico (String no, int id, String se, int mar, String cur){

       super(no, id, se, mar, cur);
      
        this.setRegistroProfissional(cur);
        
        }

        @Override
        public String toString() {
            // TODO Auto-generated method stub
            return super.toString()+ "Registro Profissional.:" + registroProfissional;
        }
    public void praticar(){

        System.out.println( this.getNome()+ " Esta praticando ");

    }

public String getRegistroProfissional() {
    return registroProfissional;
}
public void setRegistroProfissional(String re) {
    this.registroProfissional = re;
}
}
