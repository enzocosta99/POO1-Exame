import java.util.Date;

public class Funcionario {

    private Integer cod_funcionario;
    private Pessoa pessoa;
    private Date dtn_funcionario;
    private Date dta_funcionario;
    private String ctps_funcionario;

    public Funcionario() {}

    public Funcionario(Integer cod_funcionario, Pessoa pessoa, Date dtn_funcionario, Date dta_funcionario, String ctps_funcionario) {
        this.cod_funcionario = cod_funcionario;
        this.pessoa = pessoa;
        this.dtn_funcionario = dtn_funcionario;
        this.dta_funcionario = dta_funcionario;
        this.ctps_funcionario = ctps_funcionario;
    }

    public Integer getCod_funcionario() {
        return cod_funcionario;
    }

    public void setCod_funcionario(Integer cod_funcionario) {
        this.cod_funcionario = cod_funcionario;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Date getDtn_funcionario() {
        return dtn_funcionario;
    }

    public void setDtn_funcionario(Date dtn_funcionario) {
        this.dtn_funcionario = dtn_funcionario;
    }

    public Date getDta_funcionario() {
        return dta_funcionario;
    }

    public void setDta_funcionario(Date dta_funcionario) {
        this.dta_funcionario = dta_funcionario;
    }

    public String getCtps_funcionario() {
        return ctps_funcionario;
    }

    public void setCtps_funcionario(String ctps_funcionario) {
        this.ctps_funcionario = ctps_funcionario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "cod_funcionario=" + cod_funcionario +
                ", pessoa=" + pessoa +
                ", dtn_funcionario=" + dtn_funcionario +
                ", dta_funcionario=" + dta_funcionario +
                ", ctps_funcionario='" + ctps_funcionario + '\'' +
                '}';
    }
}
