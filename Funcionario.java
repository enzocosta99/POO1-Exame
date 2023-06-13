import java.util.Date;
public class Funcionario{

    private Integer codigoFuncionario;
    private Date dataAdmissaoFuncionario;
    private String ctpsFuncionario;
    private Pessoa pessoa;

    public Funcionario(Integer codigoFuncionario, Date dataAdmissaoFuncionario, String ctpsFuncionario, Pessoa pessoa)
    {

        this.setCodigoFuncionario(codigoFuncionario);
        this.setDataAdmissaoFuncionario(dataAdmissaoFuncionario);
        this.setCtpsFuncionario(ctpsFuncionario);
        this.setPessoa(pessoa);

    }

    public Integer getCodigoFuncionario() {
        return this.codigoFuncionario;
    }
    public void setCodigoFuncionario(Integer codigo) {
        this.codigoFuncionario = codigo;
    }
    public String getNomeFuncionario() {
        return this.getPessoa().getNome();
    }
    public void setNomeFuncionario(String nome) {
        this.getPessoa().setNome(nome);
    }
    public Date getDataNascimentoFuncionario() {
        return this.getPessoa().getdtaNasc();
    }
    public void setDataNascimentoFuncionario(Date dataNascimento) {
        this.getPessoa().setDtNasc(dataNascimento);
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
    public Pessoa getPessoa() {
        return this.pessoa;
    }
    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

}
