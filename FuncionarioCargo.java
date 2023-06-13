import java.util.Date;
public class FuncionarioCargo {

    private Integer codigoFuncionario;
    private Integer codigoCargo;
    private Date dataInicioFuncionarioCargo;

    public FuncionarioCargo(Integer codigoFuncionario, Integer codigoCargo, Date
            dataInicioFuncionarioCargo) {

        this.setCodigoFuncionario(codigoFuncionario);
        this.setCodigoCargo(codigoCargo);
        this.setDataInicioFuncionarioCargo(dataInicioFuncionarioCargo);

    }

    public Integer getCodigoFuncionario() {
        return this.codigoFuncionario;
    }
    public void setCodigoFuncionario(Integer codigoFuncionario) {
        this.codigoFuncionario = codigoFuncionario;
    }
    public Integer getCodigoCargo() {
        return this.codigoCargo;
    }
    public void setCodigoCargo(Integer codigoCargo) {
        this.codigoCargo = codigoCargo;
    }
    public Date getDataInicioFuncionarioCargo() {
        return this.dataInicioFuncionarioCargo;
    }
    public void setDataInicioFuncionarioCargo(Date dataInicioFuncionarioCargo) {
        this.dataInicioFuncionarioCargo = dataInicioFuncionarioCargo;
    }

}
