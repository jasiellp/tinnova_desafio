package br.com.tinnova.voto;

public class Votos {

	private static Integer totalEleitores = 1000;
	private static Integer votosValidos = 800;
	private static Integer votosBrancos = 150;
	private static Integer nulos = 50;

	public static void main(String[] args) {

		try {
			System.out.println(new Votos().percentualVotosValidos(votosValidos, totalEleitores) + "% Percentual Votos Validos ");

			System.out.println(new Votos().percentualVotosBrancos(votosBrancos, totalEleitores) + "% Percentual Votos Brancos");

			System.out.println(new Votos().percentualVotosNulos(nulos, totalEleitores) + "% Percentual Votos Nulos");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public Double percentualVotosValidos(Integer votosValidos, Integer totalVotos) throws Exception {
		return percentual(votosValidos, totalVotos);
	}

	public Double percentualVotosBrancos(Integer votosBranco, Integer totalVotos) throws Exception {
		return percentual(votosBranco, totalVotos);
	}

	public Double percentualVotosNulos(Integer nulos, Integer totalVotos) throws Exception {
		return percentual(nulos, totalVotos);
	}

	public Double percentual(Integer valos, Integer total) throws Exception {

		try {
			if (valos == null) {
				throw new Exception("O Valor nao pode ser nulo");
			} else if (total == null) {
				throw new Exception("O Total nao pode ser nulo");
			} else {
				if (total != 0) {
					return (double) ((valos * 100) / total);
				} else {
					throw new Exception("O Total nao pode ser 0");
				}
			}
		} catch (Exception e) {
			throw new Exception(e);
		}

	}

}
