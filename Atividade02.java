package Questoes2;

public class Atividade02 {
	public static void main(String[] args) {
		Metodo calculos = new Metodo();
		
		int[] vetorResultado = {};
		int[] vetor1 = {20, 18, 16, 14, 12, 1, 3, 5, 7, 9};
        int[] vetor2 = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int[] vetorNaoComum = new int[vetor1.length + vetor2.length];
        
        vetorResultado = calculos.valorComum(vetor1, vetor2, vetorNaoComum, vetorResultado);

        System.out.print("Vetor número 1: ");
        calculos.imprimirVetor(vetor1);
        System.out.print("Vetor número 2: ");
        calculos.imprimirVetor(vetor2);
        System.out.print("Vetor Não é Comum: ");
        calculos.imprimirVetor(vetorResultado);
    }

}
