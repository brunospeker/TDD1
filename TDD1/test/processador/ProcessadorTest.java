package processador;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import boleto.Boleto;
import fatura.Fatura;

public class ProcessadorTest {

	@Test
	public void testProcessador() {
		Boleto boleto1 = new Boleto("01001","01/10/2020",500.00);
		Boleto boleto2 = new Boleto("01002","02/10/2020",400.00);
		Boleto boleto3 = new Boleto("01003","03/10/2020",600.00);
		Fatura fatura1 = new Fatura("00210","Antonio Bruno",1500);
		
		Processador p = new Processador();
		p.addBoleto(boleto1);
		p.addBoleto(boleto2);
		p.addBoleto(boleto3);
		p.addFatura(fatura1);
		
		p.setDataProcessador("05/10/2020");
		p.valorPagoTotal();
		
		double vpt = p.valorPagoTotal();
		p.checkProc(vpt, fatura1.getValorTotalFatura());
		Assertions.assertEquals(vpt, fatura1.getValorTotalFatura());
		
		p.imprimir(); //"impressão" da fatura
		
	}
}
