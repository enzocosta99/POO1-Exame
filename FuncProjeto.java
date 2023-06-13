import java.util.List;

public class FuncProjeto{
    private List<Funcionario> func;
    private List<Projeto> projeto;

    public FuncProjeto() {}

    public FuncProjeto(List<Funcionario> func, List<Projeto> projeto) {
        this.func = func;
        this.projeto = projeto;
    }

    public List<Funcionario> getFunc() {
        return func;
    }

    public void setFunc(List<Funcionario> func) {
        this.func = func;
    }

    public List<Projeto> getProjeto() {
        return projeto;
    }

    public void setProjeto(List<Projeto> projeto) {
        this.projeto = projeto;
    }

    @Override
    public String toString() {
        return "FuncProjeto{" +
                "func=" + func +
                ", projeto=" + projeto +
                '}';
    }
}
