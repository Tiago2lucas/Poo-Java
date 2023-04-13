public class  Main{

public static void main(String[] args ) {
    Pessoa p[] = new Pessoa[5];

    p[1]= new Bolsista("Guanabara", 20 , "Masculino", 5421, "PHP iniciante", 12.4f);

    Aluno a[] = new Aluno [5];
    a[0]=new Aluno("Lucas", 28, "Masculino", 254, "Educacao Fisica");
    a[2]= new Aluno( "Maria ", 25, "Transexual", 627, "Enfermagem");


    System.out.println(a[0].toString());
    System.out.println(a[2].toString());
    System.out.println(p[1].toString());
}


}