package Questoes2;

public class Atividade05 {
	public static void main(String[] args) {
		Metodo calculos = new Metodo();
		
        int[] maiorNasLinhas = new int[7];
        int[] menorNasColunas = new int[7];
        int[][] matriz = new int[7][7];
        int l, c = 0;
        
        int valorMin = 1, valorMax = 100;
        int espacamento = (valorMax - valorMin);

        for(l= 0;l<matriz.length;l++) {
            for(c= 0;c<matriz.length;c++) {
                int resultado = (int) (Math.random() * espacamento) + 1;
                matriz[l][c] = resultado;
            }
        }
        
        for(c= 0;c<matriz.length;c++)
        	menorNasColunas[c] = matriz[0][c];
            
        for(l= 0;l<matriz.length;l++)
        	maiorNasLinhas[l] = matriz[l][0];
        
        for(l= 0;l<matriz.length;l++) {
            for(c= 0;c<matriz.length;c++) {
                if(matriz[l][c] > maiorNasLinhas[l]) {
                	maiorNasLinhas[l] = matriz[l][c];
                }
            }
        }
        
        for(c= 0;c<matriz.length;c++) {
            for(l= 0;l<matriz.length;l++) {
                if(matriz[l][c] < menorNasColunas[c]) {
                	menorNasColunas[c] = matriz[l][c];
                }
            }
        }
        
        System.out.printf("%22s\n", "Matriz");
        for(l= 0;l<matriz.length;l++) {
            for(c= 0;c<matriz.length;c++) {
                System.out.printf("%5d", matriz[l][c]);
            }
            System.out.printf("\n");
        }
        
        
            System.out.print("\nVetor Maior das Linhas: ");
        	calculos.imprimirVetor(maiorNasLinhas);
        	System.out.print("Vetor Menor das Colunas: ");
        	calculos.imprimirVetor(menorNasColunas);
	}
}
