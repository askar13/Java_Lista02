package Questoes2;

public class Atividade03 {
    public static void main(String[] args) {
    	Metodo calculos = new Metodo();

        int[] vetor1 = {2, 35, 8, 21, 4, 45, 14, 27, 18, 9};
        int[] vetor2 = {3, 5, 9, 7, 15};
        
        int[] primeiroResultante = new int[vetor1.length];
        int[] segundoResultante = new int[vetor1.length];
        
        calculos.resultantes(vetor1, vetor2, primeiroResultante, segundoResultante);
        
        System.out.println("Primeiro Vetor Resultante:");
        calculos.imprimirVetor(primeiroResultante);
       
        System.out.println("Segundo Vetor Resultante:");
        calculos.imprimirVetor(segundoResultante);
    }
    
    
}
