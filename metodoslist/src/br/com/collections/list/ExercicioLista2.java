package br.com.collections.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.sun.org.apache.bcel.internal.generic.SWITCH;

public class ExercicioLista2 {

	public static void main(String[] args) {
		/*
		 * Utilizando uma lista, faça um programa que faça 5 perguntas para uma pessoa
		 * sobre um crime. As perguntas são:
		 * 1. Telefonou para a vítima?
		 * 2. Esteve no local do crime?
		 * 3. Mora perto da vítima?
		 * 4. Devia para a vítima?
		 * 5. Já trabalhou com a vítima?
		 * 
		 * Se a pessoa responder com "Sim" a 2 questões, ela deve ser classificada como "Suspeita",
		 * entre 3 e 4 como "Cúmplice" e 5 como "Assassina". Caso contrário, ela será classificada como "Inocente".
		 * 
		 * Respostas esperadas para cada pergunta: "Sim" ou "Não".
		 */
		
		List<String> respostas = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int pergunta = 0;
		String temp;
		while(pergunta < 5) {
			temp = "";
			switch(pergunta) {
				case 0:
					System.out.println("Telefonou para a vítima?");
					temp = sc.nextLine();
					if (temp.equalsIgnoreCase("Sim")) {
						respostas.add(temp);
						pergunta++;
					}else if (temp.equalsIgnoreCase("Não"))
						pergunta++;
					break;
				case 1:
					System.out.println("Esteve no local do crime?");
					temp = sc.nextLine();
					if (temp.equalsIgnoreCase("Sim")) {
						respostas.add(temp);
						pergunta++;
					}else if (temp.equalsIgnoreCase("Não"))
						pergunta++;
					break;
				case 2:
					System.out.println("Mora perto da vítima?");
					temp = sc.nextLine();
					if (temp.equalsIgnoreCase("Sim")) {
						respostas.add(temp);
						pergunta++;
					}else if (temp.equalsIgnoreCase("Não"))
						pergunta++;
					break;
				case 3:
					System.out.println("Devia para a vítima?");
					temp = sc.nextLine();
					if (temp.equalsIgnoreCase("Sim")) {
						respostas.add(temp);
						pergunta++;
					}else if (temp.equalsIgnoreCase("Não"))
						pergunta++;
					break;
				case 4:
					System.out.println("Já trabalhou com a vítima?");
					temp = sc.nextLine();
					if (temp.equalsIgnoreCase("Sim")) {
						respostas.add(temp);
						pergunta++;
					}else if (temp.equalsIgnoreCase("Não"))
						pergunta++;
					break;
			}
		}
		
		int veredito = respostas.size();
		switch (veredito) {
		case 0:
		case 1:
			System.out.println("Inocente");
			break;
		case 2:
			System.out.println("Suspeita");
			break;
		case 3:
		case 4:
			System.out.println("Cúmplice");
			break;
		case 5:
			System.out.println("Assassina");
			break;
		default:
			break;
		}
		
	}

}
