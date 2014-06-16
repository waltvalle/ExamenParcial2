import static org.junit.Assert.*;

import org.junit.Test;


public class Evaluar {

	@Test
	public void testEsMultiploDeTres() {
		assertEquals("5 no es multiplo de 3.", false, Ejercicios.esMultiploDeTres(5));
		assertEquals("9 si es multiplo de 3.", true, Ejercicios.esMultiploDeTres(9));
		assertEquals("36 si es multiplo de 3.", true, Ejercicios.esMultiploDeTres(36));
	}
	
	@Test
	public void testGetMenor() {
		assertEquals("1 deberia ser el menor entre 5,8,1", 1, Ejercicios.getMenor(5,8,1));
		assertEquals("-765 deberia ser el menor entre 4,-765,-71", -765, Ejercicios.getMenor(4,-765,-71));
		assertEquals("2 deberia ser el menor entre 8,2,7", 2, Ejercicios.getMenor(8,2,7));
	}
	
	@Test
	public void testGetPromedio() {
		int a1[]={10,30,20};
		assertEquals("El promedio de {10,30,20} deberia ser 20", 20, Ejercicios.getPromedio(a1));
		
		int a2[]={7,8,9,5,11};
		assertEquals("El promedio de {7,8,9,5,11} deberia ser 8", 8, Ejercicios.getPromedio(a2));
	}
	
	@Test
	public void testGetCapital() {
		assertEquals("La capital de Honduras deberia ser Tegucigalpa", "Tegucigalpa", Ejercicios.getCapital("Honduras"));
		assertEquals("La capital de Francia deberia ser Paris", "Paris", Ejercicios.getCapital("Francia"));
		assertEquals("La capital de Inglaterra deberia ser Londres", "Londres", Ejercicios.getCapital("Inglaterra"));
	}
	
	@Test
	public void testFuncionRecursiva() {
		assertEquals("funcionRecursiva(4) deberia retornar 10", 10, Ejercicios.funcionRecursiva(4));
		assertEquals("funcionRecursiva(3) deberia retornar 6", 6, Ejercicios.funcionRecursiva(3));
		assertEquals("funcionRecursiva(5) deberia retornar 15", 15, Ejercicios.funcionRecursiva(5));
	}
}
