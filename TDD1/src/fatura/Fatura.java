package fatura;

public class Fatura {
	private String dataFatura;
	private String nomeClienteFatura;
	private double valorTotalFatura;
	
	public Fatura(String dataFatura, String nomeClienteFatura, double valorTotalFatura) {
		super();
		this.dataFatura = dataFatura;
		this.nomeClienteFatura = nomeClienteFatura;
		this.valorTotalFatura = valorTotalFatura;
	}
	
	public String getDataFatura() {
		return dataFatura;
	}
	public void setDataFatura(String dataFatura) {
		this.dataFatura = dataFatura;
	}
	public String getNomeClienteFatura() {
		return nomeClienteFatura;
	}
	public void setNomeClienteFatura(String nomeClienteFatura) {
		this.nomeClienteFatura = nomeClienteFatura;
	}
	public double getValorTotalFatura() {
		return valorTotalFatura;
	}
	public void setValorTotalFatura(double valorTotalFatura) {
		this.valorTotalFatura = valorTotalFatura;
	}
}