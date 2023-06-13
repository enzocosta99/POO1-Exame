import java.util.Date;

public class Pessoa {

    private String nome;

    private Date dtaNasc;

    public Pessoa(String nome, Date dtaNasc ) {
        this.nome = nome;
        this.dtaNasc = dtaNasc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getdtaNasc() {
        return dtaNasc;
    }

    public void setDtNasc(Date dtaNasc) {
        this.dtaNasc = dtaNasc;
    }

}
