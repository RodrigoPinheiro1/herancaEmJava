package heranca;

public class Tecnico extends Aluno {

    private String registroProfssional;

    public void praticar(){

        System.out.println(nome+"está praticando " );
    }

    @Override
    public String toString() {
        return "Tecnico{" +
                " \n nome='" + nome + '\'' +
                ", \n idade=" + idade +
                ", \n sexo='" + sexo + '\'' +
                ", \n registroProfssional='" + registroProfssional + '\'' +
                '}';
    }

    public String getRegistroProfssional() {
        return registroProfssional;
    }

    public void setRegistroProfssional(String registroProfssional) {
        this.registroProfssional = registroProfssional;
    }
}
