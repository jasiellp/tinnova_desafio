package br.com.tinnova.ordenar;

public class Ordenacao {
	public static void main(String[] args) {
		int[] vet = {5 ,3,2,4,7,1,0,6};
		new Ordenacao().ordenar(vet);
	}

	public int[]  ordenar(int[] vetorInicial) {
		int recebeValor = 0;
		
		for (int i = 0; i < vetorInicial.length; i++) {
			for (int j = 0; j < vetorInicial.length - 1; j++) {
				if (vetorInicial[j] > vetorInicial[j + 1]) {
					recebeValor = vetorInicial[j];
					vetorInicial[j] = vetorInicial[j + 1];
					vetorInicial[j + 1] = recebeValor;
				}
			}
		} 
		
		return vetorInicial ;
	}
}


