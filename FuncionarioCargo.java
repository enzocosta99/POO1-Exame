import java.util.Date;
public class FuncionarioCargo {

    private Funcionario funcionario;
    private Cargo cargo;
    private Date dataInicioFuncionarioCargo;

    public FuncionarioCargo(Funcionario funcionario, Cargo cargo, Date dataInicioFuncionarioCargo) {

        this.setFuncionario(funcionario);
        this.setCargo(cargo);
        this.setDataInicioFuncionarioCargo(dataInicioFuncionarioCargo);
    }

    public Funcionario getFuncionario() {
        return this.funcionario;
    }
    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    public Cargo getCargo() {
        return this.cargo;
    }
    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
    public Date getDataInicioFuncionarioCargo() {
        return this.dataInicioFuncionarioCargo;
    }
    public void setDataInicioFuncionarioCargo(Date dataInicioFuncionarioCargo) {
        this.dataInicioFuncionarioCargo = dataInicioFuncionarioCargo;
    }

}
