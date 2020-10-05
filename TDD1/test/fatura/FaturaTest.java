package fatura;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FaturaTest {

	@Test
	public void testFatura() {
		Fatura fat = new Fatura("04/06/2020","Bruno",300.00);
		
		Assertions.assertEquals("04/06/2020", fat.getDataFatura());
		Assertions.assertEquals("Bruno", fat.getNomeClienteFatura());
		Assertions.assertEquals(300, fat.getValorTotalFatura());
	}
}
