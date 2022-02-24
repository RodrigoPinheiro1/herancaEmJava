package heranca;

public class Professor extends Pessoa {

    private String especialidade;
    private float salario;


    public void receberAumento(float aumento) {

        salario = aumento + salario;

        System.out.println("parabens pelo aumento, seu salario agora é " +salario);
    }


    @Override
    public String toString() {
        return "Professor{" +
                " \n nome='" + nome + '\'' +
                ", \n idade=" + idade +
                ", \n sexo='" + sexo + '\'' +
                ", \n especialidade='" + especialidade + '\'' +
                ", \n salario=" + salario +
                '}';
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
