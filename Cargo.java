public class Cargo {

    private Integer cod_cargo;
    private String nom_cargo;

    public Cargo() {}
    public Cargo(Integer cod_cargo, String nom_cargo) {
        this.setCod_cargo(cod_cargo);
        this.setNom_cargo(nom_cargo);
    }

    public Integer getCod_cargo() {
        return cod_cargo;
    }

    public void setCod_cargo(Integer cod_cargo) {
        this.cod_cargo = cod_cargo;
    }

    public String getNom_cargo() {
        return nom_cargo;
    }

    public void setNom_cargo(String nom_cargo) {
        this.nom_cargo = nom_cargo;
    }

    @Override
    public String toString() {
        return "Cargo{" +
                "cod_cargo=" + cod_cargo +
                ", nom_cargo='" + nom_cargo + '\'' +
                '}';
    }
}
