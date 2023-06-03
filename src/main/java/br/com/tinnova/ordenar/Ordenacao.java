package br.com.tinnova.ordenar;

public class Ordenacao {
	public static void main(String[] args) {
		int[] vet = {5 ,3,2,4,7,1,0,6};
		new Ordenacao().ordenar(vet);
	}

	public void ordenar(int[] vet) {
		int recebeValor = 0;
		
		for (int i = 0; i < vet.length; i++) {
			for (int j = 0; j < vet.length - 1; j++) {
				if (vet[j] > vet[j + 1]) {
					recebeValor = vet[j];
					vet[j] = vet[j + 1];
					vet[j + 1] = recebeValor;
				}
			}
		}
		
		System.out.println("Vetor organizado:");

		for (int i = 0; i < vet.length; i++) {
			System.out.println(" " + vet[i]);
		}
	}
}


