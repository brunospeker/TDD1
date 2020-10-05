package boleto;

public class Boleto {
	private String codBoleto;
	private String dataBoleto;
	private double valorPagoBoleto;
	
	public Boleto(String codBoleto, String dataBoleto, double valorPagoBoleto) {
		super();
		this.codBoleto = codBoleto;
		this.dataBoleto = dataBoleto;
		this.valorPagoBoleto = valorPagoBoleto;
	}
	
	public String getCodBoleto() {
		return codBoleto;
	}
	public void setCodBoleto(String codBoleto) {
		this.codBoleto = codBoleto;
	}
	public String getDataBoleto() {
		return dataBoleto;
	}
	public void setDataBoleto(String dataBoleto) {
		this.dataBoleto = dataBoleto;
	}
	public double getValorPagoBoleto() {
		return valorPagoBoleto;
	}
	public void setValorPagoBoleto(double valorPagoBoleto) {
		this.valorPagoBoleto = valorPagoBoleto;
	}
}