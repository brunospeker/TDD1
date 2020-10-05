package processador;

import java.util.ArrayList;
import java.util.Iterator;

import boleto.Boleto;
import fatura.Fatura;

public class Processador {
	private ArrayList<Boleto> bol;
	private Fatura fat;
	private String check;
	private String dataProcessador;
	private String tipoPagamento = "BOLETO";
	
	public Processador() {
		bol = new ArrayList<Boleto>();
	}
	
	public void addBoleto(Boleto bole) {
		bol.add(bole);
		System.out.println("Pagamento tipo "+tipoPagamento+" foi criado!\n");
	}
	
	public void addFatura(Fatura fatu) {
		this.fat = fatu;
	}
	
	public double valorFatura() {
		return fat.getValorTotalFatura();
	}
	
	public double valorPagoTotal() {
		double total = 0.0;

		for (Iterator t = bol.iterator(); t.hasNext();) {
			Boleto bo = (Boleto) t.next();
			total += bo.getValorPagoBoleto();
		}
		
		return total;
	}

	public String getDataProcessador() {
		return dataProcessador;
	}

	public void setDataProcessador(String dataProcessador) {
		this.dataProcessador = dataProcessador;
	}
	
	public void checkProc(double valorPagoTotal, double valorFatura ) {
		if(fat.getValorTotalFatura() <= valorPagoTotal) {
			this.check = "PAGA";
		}
		else {
			this.check = "";
		}
	}
	
	public void imprimir() {
		System.out.println("FATURA "+check);
		System.out.println("Data: "+fat.getDataFatura());
		System.out.println("Cliente: "+fat.getNomeClienteFatura());
		System.out.println("Valor Total: "+fat.getValorTotalFatura());
		System.out.println("\n\n");
		System.out.println("Tipo de pagamento: "+tipoPagamento);
		System.out.println("Valor total: "+valorPagoTotal());
		
	}
}
