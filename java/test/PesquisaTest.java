import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class PesquisaTest {
	
	private static Pesquisa pesquisa = new Pesquisa();
	private static Nodo[] listaOrdenada = new Nodo[15];
	private static int[] valores = {4 ,6, 9, 12, 15, 18, 19, 20, 22, 44, 45, 49, 52,  78, 88};
	
	@BeforeAll
	public static void init() {
		for (int i = 0; i < valores.length; i++) {
			listaOrdenada[i] = new Nodo(valores[i]);
		}
	}
	
	@Test
	public void pesquisaSequencialTestSuccess() {
		int key = 15;
		Nodo result = pesquisa.sequencial(listaOrdenada, key);

		assertNotEquals(null, result);
		assertEquals(key, result.getNumber());
	}
	
	@Test
	public void pesquisaSequencialTestFail() {
		int key = 200;
		Nodo result = pesquisa.sequencial(listaOrdenada, key);

		assertNull(result);
	}
	
	@Test
	public void pesquisaBinariaSuccess() {
		int key = 15;
		Nodo result = pesquisa.binaria(listaOrdenada, key);
		
		assertEquals(key, result.getNumber());
	}
	
	@Test
	public void pesquisaBinariaFail() {
		int key = 90;
		Nodo result = pesquisa.binaria(listaOrdenada, key);
		
		assertNull(result);
	}
	
	@Test
	public void pesquisaBinariaRecursivaSuccess() {
		int key = 15;
		Nodo result = pesquisa.binariaRecursiva(listaOrdenada, key);
		
		assertEquals(key, result.getNumber());
	}
	
	@Test
	public void pesquisaBinariaRecursivaFail() {
		int key = 100;
		Nodo result = pesquisa.binariaRecursiva(listaOrdenada, key);
		
		assertNull(result);
	}
}