public class FuncionarioProjeto {

    private Funcionario funcionario;
    private Projeto projeto;

    public FuncionarioProjeto(Funcionario funcionario, Projeto projeto)
    {
        this.setFuncionario(funcionario);
        this.setProjeto(projeto);
    }

    public Funcionario getFuncionario() {
        return this.funcionario;
    }
    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    public Projeto getProjeto() {
        return this.projeto;
    }
    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }

}
