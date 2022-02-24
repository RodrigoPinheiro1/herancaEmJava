package heranca;

public class Bolsista extends Aluno {

    private float bolsa;


    public void renovarBolsa() {

    }

    @Override //metodo abstrato que está sendo sobreposto
    public void pagarMensalidade() {

        System.out.println(this.nome + " é bolsista! Pagamento de mensalidade");

    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
}
