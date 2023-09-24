package Questoes2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Metodo {

//	GERAL ***************************************************************************************************************
	public void imprimirVetor(int[] vetor) {	
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i]);
			if (i < vetor.length - 1) {
				System.out.print(", ");
			}
		}
			System.out.println();
		}

//	Atividade 01 *******************************************************************************************************
	void mostrarTabela(ArrayList<Float> valor){
		
		for(int i=0;i<valor.size();i++) {
	        float cubo = (float) Math.pow(valor.get(i), 3);
	        float raiz = (float) Math.sqrt(valor.get(i));
	        if (i%20 == 0)
	            System.out.println("\tNum\tCubo\tRaiz");
	        System.out.printf("%d\t%.2f\t%.2f\t%.2f\n", i, valor.get(i), cubo, raiz);
	    }
	}

//	Atividade 02 *******************************************************************************************************
	int[] valorComum(int vetor1[], int vetor2[], int vetorNaoComum[], int vetorResultado[]) {
		int cont = 0;
		
		for (int num : vetor1) {
		    boolean naoConstaVetor2 = true;
		    for (int num2 : vetor2) {
		        if (num == num2) {
		        	naoConstaVetor2 = false;
		            break;
		        }
		    }
		    
		    if (naoConstaVetor2) {
		        boolean naoConstaResultado = true;
		        for (int resultado : vetorNaoComum) {
		            if (num == resultado) {
		            	naoConstaResultado = false;
		                break;
		            }
		        }
		        
		        if (naoConstaResultado) {
		            vetorNaoComum[cont] = num;
		            cont++;
		        }
		    }
		}
		
		for (int num : vetor2) {
		    boolean naoConstaVetor1 = true;
		    for (int num1 : vetor1) {
		        if (num == num1) {
		        	naoConstaVetor1 = false;
		            break;
		        }
		    }
		    
		    if (naoConstaVetor1) {
		        boolean naoConstaResultado = true;
		        for (int resultado : vetorNaoComum) {
		            if (num == resultado) {
		            	naoConstaResultado = false;
		                break;
		            }
		        }
		        
		        if (naoConstaResultado) {
		            vetorNaoComum[cont] = num;
		            cont++;
		        }
		    }
		}
		vetorResultado = Arrays.copyOfRange(vetorNaoComum, 0, cont);
		
		return vetorResultado;
	}

//	Atividade 03 *******************************************************************************************************
	void resultantes(int vetor1[], int vetor2[], int primeiroResultante[], int segundoResultante[]) {
		
		for (int i = 0; i < vetor1.length; i++) {
		  int soma = 0;
		  int divisores = 0;
		  	
		  for (int j = 0; j < vetor2.length; j++) {
		      soma += vetor1[i] + vetor2[j];
		  }
		  primeiroResultante[i] = soma;
		  if (vetor1[i] % 2 != 0) {
		      for (int j = 0; j < vetor2.length; j++) {
		          if (vetor2[j] != 0 && vetor1[i] % vetor2[j] == 0) {
		              divisores++;
		          }
		      }
		  }
		  segundoResultante[i] = divisores;
		}
	}
	
	
//	Atividade 04 *******************************************************************************************************
	boolean codigoUtilizado(int[] codigoEmContas, int codigo) {
        for (int cod : codigoEmContas) {
            if (cod == codigo) {
                return true;
            }
        }
        return false;
    }

    void fazerDeposito(int[] codigoEmContas, double[] saldoEmContas, Scanner teclado) {
        System.out.print("Informe o código da conta da qual deseja depositar: ");
        int codigo = teclado.nextInt();

        int indice = -1;
        for (int i = 0; i < codigoEmContas.length; i++) {
            if (codigoEmContas[i] == codigo) {
                indice = i;
                break;
            }
        }

        if (indice == -1) {
            System.out.println("Não foi possível encontrar a conta.");
            return;
        }

        System.out.print("Informe o valor do depósito: R$");
        double valor = teclado.nextDouble();
        saldoEmContas[indice] += valor;

        System.out.println("Sucesso ao realizar depósito.");
    }

    void fazerSaque(int[] codigoEmContas, double[] saldoEmContas, Scanner teclado) {
        System.out.print("Informe o código da conta da qual deseja sacar: ");
        int codigo = teclado.nextInt();

        int indice = -1;
        for (int i = 0; i < codigoEmContas.length; i++) {
            if (codigoEmContas[i] == codigo) {
                indice = i;
                break;
            }
        }

        if (indice == -1) {
            System.out.println("Não foi possível encontrar a conta.");
            return;
        }

        System.out.print("Digite o valor do saque: R$");
        double valor = teclado.nextDouble();

        if (valor <= saldoEmContas[indice]) {
        	saldoEmContas[indice] -= valor;
            System.out.println("Sucesso ao realizar saque.");
        } else {
            System.out.println("Saldo insuficiente para realizar essa operação.");
        }
    }

    void verAtivoBancario(double[] saldoEmContas) {
        double ativoTotal = 0;
        for (double saldo : saldoEmContas) {
            ativoTotal += saldo;
        }
        System.out.println("Ativo bancário total: R$ " + ativoTotal);
    }
}




