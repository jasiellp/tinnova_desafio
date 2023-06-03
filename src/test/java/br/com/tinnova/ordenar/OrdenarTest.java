package br.com.tinnova.ordenar;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class OrdenarTest {
	int[] vetor = {5 ,3,2,4,7,1,0,6};
 
	 
	@Test
	public void testVetor() throws Exception {
		assertEquals(new Ordenacao().ordenar(vetor)[6] , 6);
	} 

}
