package Questoes2;

import java.util.ArrayList;
import java.util.Scanner;

public class Atividade01 {
	public static void main(String[] args) {
	    Scanner teclado = new Scanner(System.in);
	    Metodo calculos = new Metodo();
	    
	    ArrayList<Float> resultado = new ArrayList<>();
	    float valor;
	    
	    do {
	       System.out.print("Informe o número (digite valor 0 para sair) >> ");
	       valor = teclado.nextFloat();
	       if(valor>0)
	            resultado.add(valor);
	    } while(valor>0);
	   
	    calculos.mostrarTabela(resultado);
	    
	    teclado.close();
	}
}
