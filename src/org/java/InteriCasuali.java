package org.java;

import java.util.Random;

public class InteriCasuali {
	public static void main(String[] args) {
		Random r = new Random(1);
		int[] array = new int[8];
		
		for (int i = 0; i < array.length; i++) {

			array[i] = r.nextInt(0, 101);
			System.out.println(i+1 + ": " + array[i]);
		}
		
		int numeroMassimo = Integer.MIN_VALUE;

		for (int i = 0; i < array.length; i++) {

			int number = array[i];

			if (number > numeroMassimo) {

				numeroMassimo = number;
			}
		}

		System.out.println("\nNumero massimo: " + numeroMassimo);
		
		int numeroMinimo = Integer.MAX_VALUE;

		for (int i = 0; i < array.length; i++) {

			int number = array[i];

			if (number < numeroMinimo) {

				numeroMinimo = number;
			}
		}

		System.out.println("\nNumero minimo: " + numeroMinimo);
		
		double avg = 0;

		for (int i = 0; i < array.length; i++) {

			int number = array[i];

			avg += number;
		}

		avg /= array.length;

		System.out.println("\nValore medio: " + avg);
	}
}
