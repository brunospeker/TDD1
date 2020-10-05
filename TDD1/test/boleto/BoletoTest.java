package boleto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BoletoTest {
	
	@Test
	public void testBoleto() {
	
	Boleto boletotest = new Boleto("2103","21/03/2020", 200.00);
	
	Assertions.assertEquals("2103", boletotest.getCodBoleto());
	Assertions.assertEquals("21/03/2020", boletotest.getDataBoleto());
	Assertions.assertEquals(200, boletotest.getValorPagoBoleto());

	}
}
