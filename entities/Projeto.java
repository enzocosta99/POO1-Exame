package entities;

import java.util.Date;

public class Projeto {

	private Integer num_projeto;
	private String tit_projeto;
	private String dsc_projeto;
	private Date dti_projeto;
	private Date dtf_projeto; 
	
	public Projeto() {}
	public Projeto(String tit_projeto, String dsc_projeto, Date dti_projeto, Date dtf_projeto, Integer num_projeto) {
		this.tit_projeto = tit_projeto;
		this.dsc_projeto = dsc_projeto;
		this.dti_projeto = dti_projeto;
		this.dtf_projeto = dtf_projeto;
		this.num_projeto = num_projeto;
	}
	
	public Projeto(Integer num_projeto) {
		this.num_projeto = num_projeto;
	}
	
	public Integer getNum_projeto() {
		return num_projeto; 
	}
	public void setNum_projeto(Integer num_projeto) {
		this.num_projeto = num_projeto;
	}
	public String getTit_projeto() {
		return tit_projeto;
	}
	public void setTit_projeto(String tit_projeto) {
		this.tit_projeto = tit_projeto;
	}
	public String getDsc_projeto() {
		return dsc_projeto;
	}
	public void setDsc_projeto(String dsc_projeto) {
		this.dsc_projeto = dsc_projeto;
	}
	public Date getDti_projeto() {
		return dti_projeto;
	}
	public void setDti_projeto(Date dti_projeto) {
		this.dti_projeto = dti_projeto;
	}
	public Date getDtf_projeto() {
		return dtf_projeto;
	}
	public void setDtf_projeto(Date dtf_projeto) {
		this.dtf_projeto = dtf_projeto;
	}
	
	
}
