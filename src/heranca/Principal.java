package heranca;

public class Principal  {


    public static void main (String [] args){


  //      Pessoa p1= new Pessoa(); NÃO é possivel instanciar uma classe abstrata

        Visitante v1 = new Visitante();
        v1.setNome("Juvenal");
        v1.setIdade(22);
        v1.setSexo("M");


        Aluno a1 = new Aluno();

        //herença para a diferença
        a1.setNome("Claudio");
        a1.setIdade(23);
        a1.setMatricula(1111);
        a1.setSexo("M");
        a1.setCurso("Java POO");



        Bolsista b1 = new Bolsista();

        b1.setMatricula(1222);
        b1.setIdade(25);
        b1.setNome("jubileu"); //herança da classe super mae
        b1.setBolsa(11.5f);
        b1.setSexo("M");



        Tecnico t1 = new Tecnico();

        t1.setNome("Comunista kkk");
        t1.setIdade(66);
        t1.setCurso("tecnico de informatica ");
        t1.setMatricula(33333);
        t1.setSexo("M");
        t1.setRegistroProfssional("CLT \n");

        Professor p1 = new Professor();

        p1.setNome("euclides");
        p1.setIdade(55);
        p1.setSexo("M");
        p1.setEspecialidade("java developer");
        p1.setSalario(1500);

        
        p1.receberAumento(500);

        a1.pagarMensalidade();

        b1.pagarMensalidade();


        System.out.println(v1.toString());
        System.out.println(b1.toString());
        System.out.println(t1.toString());
        System.out.println(p1.toString());

    }

}
