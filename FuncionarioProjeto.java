public class FuncionarioProjeto {

    private Integer codigoFuncionario;
    private Integer numeroProjeto;

    public FuncionarioProjeto(Integer codigoFuncionario, Integer numeroProjeto)
    {

        this.setCodigoFuncionario(codigoFuncionario);
        this.setNumeroProjeto(numeroProjeto);
    }

    public Integer getCodigoFuncionario() {
        return this.codigoFuncionario;
    }
    public void setCodigoFuncionario(Integer codigoFuncionario) {
        this.codigoFuncionario = codigoFuncionario;
    }
    public Integer getNumeroProjeto() {
        return this.numeroProjeto;
    }
    public void setNumeroProjeto(Integer numeroProjeto) {
        this.numeroProjeto = numeroProjeto;
    }

}
