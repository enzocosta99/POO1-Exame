import java.util.Date;
import java.util.List;

public class FuncCargo{

    private Date dti_func_cargo;
    private List<Cargo> cargo;
    private List<Funcionario> func;

    public FuncCargo() {}

    public FuncCargo(Date dti_func_cargo, List<Cargo> cargo, List<Funcionario> func) {
        setDti_func_cargo(dti_func_cargo);
        setCargo(cargo);
        setFunc(func);
    }

    public Date getDti_func_cargo() {
        return dti_func_cargo;
    }

    public void setDti_func_cargo(Date dti_func_cargo) {
        this.dti_func_cargo = dti_func_cargo;
    }

    public List<Cargo> getCargo() {
        return cargo;
    }

    public void setCargo(List<Cargo> cargo) {
        this.cargo = cargo;
    }

    public List<Funcionario> getFunc() {
        return func;
    }

    public void setFunc(List<Funcionario> func) {
        this.func = func;
    }


    @Override
    public String toString() {
        return "FuncCargo{" +
                "dti_func_cargo=" + dti_func_cargo +
                ", cargo=" + cargo +
                ", func=" + func +
                '}';
    }
}
