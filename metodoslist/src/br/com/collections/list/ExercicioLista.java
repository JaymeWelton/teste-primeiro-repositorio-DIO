package br.com.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExercicioLista {

	public static void main(String[] args) {
		/*
		 * Faça um programa que receba a temperatura média dos 6
		 * primeiros meses do ano e armazene-as em uma lista.
		 * Após isto, calcule a média semestreal das temperaturas
		 * e mostre todas as temperaturas acima desta média, e em que 
		 * mês elas ocorreram (Mostrar o mês por extenso: 1-Janeiro,
		 * 2-Fevereiro, etc). 
		 */
		
		List<Double> temperaturas = new ArrayList<>();
		temperaturas.add(35d);
		temperaturas.add(40d);
		temperaturas.add(27d);
		temperaturas.add(20d);
		temperaturas.add(25d);
		temperaturas.add(30d);
		
		Iterator<Double> iterator = temperaturas.iterator();
		Double soma = 0d;
		while(iterator.hasNext()) {
			Double proximo = iterator.next();
			soma += proximo;
		}
		Double media = soma/temperaturas.size();
		System.out.println("A média semestral das temperaturas é: " + media);
		
		Iterator<Double> iterator1 = temperaturas.iterator();
		while(iterator1.hasNext()) {
			Double proximo = iterator1.next();
			if (proximo > media) {
				int index = temperaturas.indexOf(proximo);
				switch (index) {
				case 0:
					System.out.println("A tempratura " + proximo + " ocorreu em 1-Janeiro");
					break;
				case 1:
					System.out.println("A tempratura " + proximo + " ocorreu em 2-Fevereiro");
					break;
				case 2:
					System.out.println("A tempratura " + proximo + " ocorreu em 3-Março");
					break;
				case 3:
					System.out.println("A tempratura " + proximo + " ocorreu em 4-Abril");
					break;
				case 4:
					System.out.println("A tempratura " + proximo + " ocorreu em 5-Maio");
					break;
				case 5:
					System.out.println("A tempratura " + proximo + " ocorreu em 6-Junho");
					break;

				default:
					break;
				}
			}
		}
		
	}

}
