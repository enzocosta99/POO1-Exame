public class Cargo {

    private Integer codigoCargo;
    private String nomeCargo;

    public Cargo(Integer codigoCargo, String nomeCargo) {
        this.setCodigoCargo(codigoCargo);
        this.setNomeCargo(nomeCargo);
    }

    public Integer getCodigoCargo() {
        return this.codigoCargo;
    }
    public void setCodigoCargo(Integer codigo) {
        this.codigoCargo = codigo;
    }
    public String getNomeCargo() {
        return this.nomeCargo;
    }
    public void setNomeCargo(String nome) {
        this.nomeCargo = nome;
    }

}
