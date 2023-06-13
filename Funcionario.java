import java.util.Date;
public class Funcionario {

    private Integer codigoFuncionario;
    private String nomeFuncionario;
    private Date dataNascimentoFuncionario;
    private Date dataAdmissaoFuncionario;
    private String ctpsFuncionario;

    public Funcionario(Integer codigoFuncionario, String nomeFuncionario, Date
            dataNascimentoFuncionario, Date dataAdmissaoFuncionario, String ctpsFuncionario)
    {

        this.setCodigoFuncionario(codigoFuncionario);
        this.setNomeFuncionario(nomeFuncionario);
        this.setDataNascimentoFuncionario(dataNascimentoFuncionario);
        this.setDataAdmissaoFuncionario(dataAdmissaoFuncionario);
        this.setCtpsFuncionario(ctpsFuncionario);

    }

    public Integer getCodigoFuncionario() {
        return this.codigoFuncionario;
    }
    public void setCodigoFuncionario(Integer codigo) {
        this.codigoFuncionario = codigo;
    }
    public String getNomeFuncionario() {
        return this.nomeFuncionario;
    }
    public void setNomeFuncionario(String nome) {
        this.nomeFuncionario = nome;
    }
    public Date getDataNascimentoFuncionario() {
        return this.dataNascimentoFuncionario;
    }
    public void setDataNascimentoFuncionario(Date dataNascimento) {
        this.dataNascimentoFuncionario = dataNascimento;
    }
    public Date getDataAdmissaoFuncionario() {
        return this.dataAdmissaoFuncionario;
    }
    public void setDataAdmissaoFuncionario(Date dataAdmissao) {
        this.dataAdmissaoFuncionario = dataAdmissao;
    }
    public String getCtpsFuncionario() {
        return this.ctpsFuncionario;
    }
    public void setCtpsFuncionario(String ctps) {
        this.ctpsFuncionario = ctps;
    }

}
