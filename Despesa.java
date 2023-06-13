import java.util.Date;
public class Despesa {

    private Integer numeroDespesa;
    private Integer numeroProjeto;
    private Date dataDespesa;
    private double valorDespesa;
    private String descricaoDespesa;

    public Despesa(Integer numeroDespesa, Integer numeroProjeto, Date
            dataDespesa, double valorDespesa, String descricaoDespesa) {
        this.setNumeroDespesa(numeroDespesa);
        this.setNumeroProjeto(numeroProjeto);
        this.setDataDespesa(dataDespesa);
        this.setValorDespesa(valorDespesa);
        this.setDescricaoDespesa(descricaoDespesa);
    }

    public Integer getNumeroDespesa() {

        return this.numeroDespesa;
    }
    public void setNumeroDespesa(Integer numeroDespesa) {
        this.numeroDespesa = numeroDespesa;
    }
    public Integer getNumeroProjeto() {
        return this.numeroProjeto;
    }
    public void setNumeroProjeto(Integer numeroProjeto) {
        this.numeroProjeto = numeroProjeto;
    }
    public Date getDataDespesa() {
        return this.dataDespesa;
    }
    public void setDataDespesa(Date dataDespesa) {
        this.dataDespesa = dataDespesa;
    }
    public double getValorDespesa() {
        return this.valorDespesa;
    }
    public void setValorDespesa(double valorDespesa) {
        this.valorDespesa = valorDespesa;
    }
    public String getDescricaoDespesa() {
        return this.descricaoDespesa;
    }
    public void setDescricaoDespesa(String descricaoDespesa) {
        this.descricaoDespesa = descricaoDespesa;
    }

}
