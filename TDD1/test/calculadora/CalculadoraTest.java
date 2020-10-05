package calculadora;

import static org.junit.jupiter.api.Assertions.*;

//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertThrows;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Teste da Classe Calculadora")
public class CalculadoraTest {
	
	private Calculadora calc;
	
	@BeforeEach
	public void inicializa() {
		calc = new Calculadora();
	}
	
	@DisplayName("Testa o método soma")
	@Test
	public void testSomaDoisNumeros() {
		int soma = calc.soma(4, 5);		
		Assertions.assertEquals(9, soma);		
	}
	
	@DisplayName("Testa o método soma com variaveis zero")
	@Test
	public void testSomaDeZeros() {
		int nulo = calc.soma(0, 0);
		Assertions.assertNotNull(nulo);
	}

	@DisplayName("Testa o método subtração")
	@Test
	public void testSubtracao() {
		int subt = calc.subtracao(5, 4);
		Assertions.assertEquals(1, subt);
	}

	@DisplayName("Testa o método subtração com numeros negativo")
	@Test
	public void testSubtracaoNegativa() {
		int subtn = calc.subtracao(-5, -4);
		Assertions.assertEquals(-1, subtn);
	}

	@DisplayName("Testa o método multiplicação")
	@Test
	public void testMultiplicacao() {
		int mult = calc.multiplicacao(5, 4);
		Assertions.assertEquals(20, mult);
	}

	@DisplayName("Testa o método multiplicação por zero")
	@Test
	public void testMultiplicacaoPorZero() {
		int multzero = calc.multiplicacao(5, 0);
		Assertions.assertEquals(0, multzero);
	}

	@DisplayName("Testa o método multiplicação por zero anula")
	@Test
	public void testMultiplicacaoPorZeroAnula() {
		int multanula = calc.multiplicacao(4, 0);
		Assertions.assertNotNull(multanula);
	}
	
	@DisplayName("Testa o método divisão")
	@Test
	public void testDivisaoDoisNumeros() {
		int divisao = calc.divisao(8, 4);
		Assertions.assertTrue(divisao == 2);
	}
	
	@DisplayName("Testa o método divisão por zero")
	@Test
	public void testDivisaoPorZero() {
		try {
			int divisao = calc.divisao(8, 0);
			fail("Exceção não lançada");
		}catch (ArithmeticException e) {
			Assertions.assertEquals("/ by zero", e.getMessage());
		}		
	}

	@DisplayName("Testa o método divisão por zero em throws")
	@Test
	public void testDivisaoPorZeroComAssertThrows() {
		Assertions.assertThrows(ArithmeticException.class,
				() -> calc.divisao(8, 0));
	}

	@DisplayName("Testa o método somatoria")
	@Test
	public void testSomatoria() {
		int somatoria = calc.somatoria(5);
		Assertions.assertTrue(somatoria == 15);
	}

	@DisplayName("Testa o método comparação com Equals")
	@Test
	public void testComparacaoEquals() {
		int compe = calc.compara(5, 5);
		Assertions.assertEquals(0, compe);
	}

	@DisplayName("Testa o método comparação com Same")
	@Test
	public void testComparacaoSame() {
		int comps = calc.compara(5, 4);
		Assertions.assertSame(1, comps);
	}

	@DisplayName("Testa o método ehpositivo com assertTrue")
	@Test
	public void testPositivoTrue() {
		boolean posi = calc.ehPositivo(5);
		Assertions.assertTrue(posi);
	}

	@DisplayName("Testa o método ehpositivo com assertFalse")
	@Test
	public void testPositivoFalse() {
		boolean nega = calc.ehPositivo(-4);
		Assertions.assertFalse(nega);
	}
}