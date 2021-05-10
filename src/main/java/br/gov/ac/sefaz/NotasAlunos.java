package br.gov.ac.sefaz;

import java.util.Arrays;

public class NotasAlunos {
	public static void main(String[] args) {
		
		double[] alunoNtas = new double[4];
		alunoNtas[0] = 7.4;
		alunoNtas[1] = 10.0;
		alunoNtas[2] = 5.0;
		alunoNtas[3] = 8.0;
		
		
		System.out.println("Meu primeuro Array");
		System.out.println(Arrays.toString(alunoNtas));
		
		double total = 0;
		for (int i=0; i< 4; i++ ) {
			total +=alunoNtas[i];
		}
		//System.out.println(Arrays.toString(alunoNtas));
		System.out.println(" ");
		// aqui eu faço a media do aluno 
		System.out.println(total / 4);
	}
	
}
