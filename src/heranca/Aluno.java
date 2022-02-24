package heranca;

public /*final*/ class Aluno extends Pessoa { //final da erro por nao poder ter filho.

    //Herança para diferença, a classe filha herda os atributos da classe pai (Pessoa), e os seus proprios atributos
    private int matricula;
    private String curso;

    public void pagarMensalidade() {

        System.out.println("pagando mensalidade" + this.getNome() /*this.nome*/);
    }


    @Override
    public String toString() {
        return "Aluno{" +
                " \n matricula=" + matricula +
                ", \n curso='" + curso + '\'' +
                ", \n nome='" + nome + '\'' +
                ", \n idade=" + idade +
                ", \n sexo='" + sexo + '\'' +
                '}';
    }

    public int getMatricula() {

        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
