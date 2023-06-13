package entities;

import java.util.Date;
import java.util.List;

public class Despesa {

	private Integer num_despesa;
	private List<Projeto> projeto;
	private Date dta_despesa;
	private Double vlr_despesa;
	private String dsc_despesa;

	public Despesa() {}

	public Despesa(Integer num_despesa, List<Projeto> projeto, Date dta_despesa, Double vlr_despesa, String dsc_despesa) {
		this.num_despesa = num_despesa;
		this.projeto = projeto;
		this.dta_despesa = dta_despesa;
		this.vlr_despesa = vlr_despesa;
		this.dsc_despesa = dsc_despesa;
	}

	public Integer getNum_despesa() {
		return num_despesa;
	}

	public void setNum_despesa(Integer num_despesa) {
		this.num_despesa = num_despesa;
	}

	public List<Projeto> getProjeto() {
		return projeto;
	}

	public void setProjeto(List<Projeto> projeto) {
		this.projeto = projeto;
	}

	public Date getDta_despesa() {
		return dta_despesa;
	}

	public void setDta_despesa(Date dta_despesa) {
		this.dta_despesa = dta_despesa;
	}

	public Double getVlr_despesa() {
		return vlr_despesa;
	}

	public void setVlr_despesa(Double vlr_despesa) {
		this.vlr_despesa = vlr_despesa;
	}

	public String getDsc_despesa() {
		return dsc_despesa;
	}

	public void setDsc_despesa(String dsc_despesa) {
		this.dsc_despesa = dsc_despesa;
	}

	@Override
	public String toString() {
		return "Despesa{" +
				"num_despesa=" + num_despesa +
				", projeto=" + projeto +
				", dta_despesa=" + dta_despesa +
				", vlr_despesa=" + vlr_despesa +
				", dsc_despesa='" + dsc_despesa + '\'' +
				'}';
	}
}
