import java.util.Date;
public class Projeto {

    private Integer numeroProjeto;
    private String tituloProjeto;
    private String descricaoProjeto;
    private Date dataInicioProjeto;
    private Date dataFimProjeto;

    public Projeto(Integer numeroProjeto, String tituloProjeto, String
            descricaoProjeto, Date dataInicioProjeto, Date dataFimProjeto) {

        this.setNumeroProjeto(numeroProjeto);
        this.setTituloProjeto(tituloProjeto);
        this.setDescricaoProjeto(descricaoProjeto);
        this.setDataInicioProjeto(dataInicioProjeto);
        this.setDataFimProjeto(dataFimProjeto);
    }

    public Integer getNumeroProjeto() {
        return this.numeroProjeto;
    }
    public void setNumeroProjeto(Integer numero) {
        this.numeroProjeto = numero;
    }
    public String getTituloProjeto() {
        return this.tituloProjeto;
    }
    public void setTituloProjeto(String titulo) {
        this.tituloProjeto = titulo;
    }
    public String getDescricaoProjeto() {
        return this.descricaoProjeto;
    }
    public void setDescricaoProjeto(String descricao) {
        this.descricaoProjeto = descricao;
    }
    public Date getDataInicioProjeto() {
        return this.dataInicioProjeto;
    }
    public void setDataInicioProjeto(Date dataInicio) {
        this.dataInicioProjeto = dataInicio;
    }
    public Date getDataFimProjeto() {
        return this.dataFimProjeto;
    }
    public void setDataFimProjeto(Date dataFim) {
        this.dataFimProjeto = dataFim;
    }

}
