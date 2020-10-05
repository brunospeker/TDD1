package carrinho;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import produto.Produto;
import produto.ProdutoNaoEncontradoException;

@DisplayName("Teste da Classe Carrinho")
public class CarrinhoTest {
	
	private Carrinho car = new Carrinho();
	private Produto prod;
	
	@BeforeEach
	public void inicializa() {
		car = new Carrinho();
	}
	
	
	@DisplayName("Testa o Objeto carrinho se está vazio")
	@Test
	public void testCarrinhoVazio() {
		int vazio = car.getQtdeItems();
		Assertions.assertEquals(0, vazio);
	}
	
	@DisplayName("Testa o método de adicionar itens")
	@Test
	public void testAddItensCarrinho() {
		prod = new Produto("Introdução ao Teste de Software", 100.00);
		car.addItem(prod);
		int additem = car.getQtdeItems();
		Assertions.assertEquals(1, additem);
	}
	
	@DisplayName("Testa o método de remover itens")
	@Test
	public void testRemoverItemCarrinho() throws ProdutoNaoEncontradoException {
		Produto livro = new Produto("Livro de JUnit", 120.00);
		car.addItem(livro);
		int removeritem = car.getQtdeItems();
		Assertions.assertEquals(1, removeritem);
		car.removeItem(livro);
		removeritem = car.getQtdeItems();
		Assertions.assertEquals(0, removeritem);
	}
	
	@DisplayName("Testa o método de quantidade de itens no carrinho")
	@Test
	public void testQuantItensCarrinho() {
		prod = new Produto("Introdução ao Teste de Software", 100.00);
		Produto sgbd = new Produto("Livro de Banco de Dados", 120.00);
		Produto ia = new Produto("Introdução a Inteligencia Artificial", 500.00);
		car.addItem(prod);
		car.addItem(sgbd);
		car.addItem(ia);
		int quant = car.getQtdeItems();
		Assertions.assertSame(3, quant);
	}
	
	@DisplayName("Testa o método de valor total dos itens no carrinho")
	@Test
	public void testValorTotalCarrinho() {
		prod = new Produto("Introdução ao Teste de Software", 100.00);
		Produto sgbd = new Produto("Livro de Banco de Dados", 120.00);
		Produto ia = new Produto("Introdução a Inteligencia Artificial", 500.00);
		car.addItem(prod);
		car.addItem(sgbd);
		car.addItem(ia);
		double total = car.getValorTotal();
		Assertions.assertEquals(720, total);
	}
	
	@DisplayName("Testa o método de esvaziar o carrinho")
	@Test
	public void testEsvaziarCarrinho() {
		prod = new Produto("Introdução ao Teste de Software", 100.00);
		car.addItem(prod);
		int esvazia = car.getQtdeItems();
		Assertions.assertEquals(1, esvazia);
		car.esvazia();
		esvazia = car.getQtdeItems();
		Assertions.assertEquals(0, esvazia);
	}
	
	@DisplayName("Testa se carrinhos são iguais")
	@Test
	public void testCarrinhosIguais() {
		prod = new Produto("Introdução ao Teste de Software", 100.00);
		car.addItem(prod);
		Carrinho cesta = new Carrinho();
		cesta.addItem(prod);
		Assertions.assertNotSame(cesta, car);
		Assertions.assertFalse(cesta == car);
	}
}