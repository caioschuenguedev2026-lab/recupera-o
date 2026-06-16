package rcp;

import java.util.Scanner;

public class rcp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner recuperação = new Scanner(System.in);

        System.out.print("digite a quantidade de alunos *maximo 5 alnos* : ");
        int quantidadeAlunos = recuperação.nextInt();
        while (quantidadeAlunos < 1 || quantidadeAlunos > 5) {
            System.out.print("quantidade errada digite um valor entre 1 e 5: ");
            quantidadeAlunos = recuperação.nextInt();
        }
        String[] nomes = new String[quantidadeAlunos];
        double[][] notas = new double[quantidadeAlunos][2];
        double[] medias = new double[quantidadeAlunos];

        recuperação.nextLine();
        for (int i = 0; i < quantidadeAlunos; i++) {
            System.out.println("\naluno " + (i + 1));
            System.out.print("nome: ");
            nomes[i] = recuperação.nextLine();
            System.out.print("nota 1: ");
            notas[i][0] = recuperação.nextDouble();
            System.out.print("nota 2: ");
            notas[i][1] = recuperação.nextDouble();
            recuperação.nextLine();
        }
        for (int i = 0; i < quantidadeAlunos; i++) {
            medias[i] = (notas[i][0] + notas[i][1]) / 2;
        }
        int aprovados = 0;
        System.out.println("\nsituacao dos alunos");
        for (int i = 0; i < quantidadeAlunos; i++) {
            System.out.println("\naluno: " + nomes[i]);
            System.out.println("media: " + medias[i]);
            if (medias[i] >= 7) {
                System.out.println("situacao: aprovado");
                aprovados++;

            } else if (medias[i] >= 5 && medias[i] <= 6.9) {
                System.out.println("situacao: recuperacao");
            } else {
                System.out.println("situacao: reprovado");
            }
        }
        System.out.println("\nquantidade de aprovados: " + aprovados);
        double somaMedias = 0;
        for (int i = 0; i < quantidadeAlunos; i++) {
            somaMedias += medias[i];
        }
        double mediaGeral = somaMedias / quantidadeAlunos;
        System.out.println("media geral da turma: " + mediaGeral);
        System.out.println("\nlista completa dos alunos e suas medias");
        for (int i = 0; i < quantidadeAlunos; i++) {
            System.out.println(nomes[i] + " - media: " + medias[i]);
        }
        recuperação.close();
    }

}