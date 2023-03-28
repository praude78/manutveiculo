package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Manutencao;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o fabricante/marca do seu veículo");
		String marca = sc.nextLine();
		System.out.print("Digite o modelo do seu veículo");
		String modelo = sc.nextLine();
		System.out.print("Digite a placa/matrícula do seu veículo");
		String matricula = sc.nextLine();
		System.out.print("Digite o ano de fabricaçao do seu veículo");
		int anoFabricacao = sc.nextInt();
		System.out.print("Digite a quilometragem atual do seu veículo");
		int kmAtual = sc.nextInt();
		
		
		 Manutencao manutencao = new Manutencao();

		    // adiciona itens de manutenção

		    manutencao.exibirRelatorio();
		
		
		sc.close();

	}

}
