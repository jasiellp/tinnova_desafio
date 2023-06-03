package br.com.tinnova.voto;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class VotosTest {

	private Integer totalEleitores = 1000;
	private Integer votosValidos = 800;
	private Integer votosBrancos = 150;
	private Integer nulos = 50;

	// Teste unitario Votos Validos
	@Test
	public void testVotosValidos() throws Exception {
		assertEquals(new Votos().percentualVotosValidos(this.votosValidos, this.totalEleitores), Double.valueOf(80));
	}

	@Test
	public void testVotosValidosErrorTotal() throws Exception {
		Boolean exception = false;
		try {
			new Votos().percentualVotosValidos(this.votosValidos, null);
		} catch (Exception e) {
			exception = true;
		}
		assertTrue(exception);
	}

	@Test
	public void testVotosValidosErrorValor() throws Exception {
		Boolean exception = false;
		try {
			new Votos().percentualVotosValidos(null, this.totalEleitores);
		} catch (Exception e) {
			exception = true;
		}
		assertTrue(exception);
	}

	// Teste unitario Votos Brancos
	@Test
	public void testVotosBrancos() throws Exception {
		assertEquals(new Votos().percentualVotosBrancos(this.votosBrancos, this.totalEleitores), Double.valueOf(15));
	}

	@Test
	public void testVotosBrancosErrorTotal() throws Exception {
		Boolean exception = false;
		try {
			new Votos().percentualVotosBrancos(this.votosBrancos, null);
		} catch (Exception e) {
			exception = true;
		}
		assertTrue(exception);
	}

	@Test
	public void testVotosBrancosErrorValor() throws Exception {
		Boolean exception = false;
		try {
			new Votos().percentualVotosBrancos(null, this.totalEleitores);
		} catch (Exception e) {
			exception = true;
		}
		assertTrue(exception);
	}

	// Teste unitario Votos Nulos
	@Test
	public void testVotosNulos() throws Exception {
		assertEquals(new Votos().percentualVotosNulos(this.nulos, this.totalEleitores), Double.valueOf(5));
	}

	@Test
	public void testVotosNulosErrorTotal() throws Exception {
		Boolean exception = false;
		try {
			new Votos().percentualVotosNulos(this.nulos, null);
		} catch (Exception e) {
			exception = true;
		}
		assertTrue(exception);
	}

	@Test
	public void testVotosNulosErrorValor() throws Exception {
		Boolean exception = false;
		try {
			new Votos().percentualVotosNulos(null, this.totalEleitores);
		} catch (Exception e) {
			exception = true;
		}
		assertTrue(exception);
	}

}
