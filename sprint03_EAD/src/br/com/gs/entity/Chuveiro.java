package br.com.gs.entity;

import java.util.Scanner;

public class Chuveiro {

	private int temperatura;
	
	private int pressao;
	
	private int tempo;
	
	private boolean status;
	
	Scanner scan = new Scanner(System.in);
	
	public void ajustaTemperatura() {
		int recebeTemp;
		System.out.println("\nQual a temperatura desejada: ");
		recebeTemp = scan.nextInt();
		this.setTemperatura(recebeTemp);
		System.out.println("Temperatura ajustada para "+ this.getTemperatura() + 
				"°C com sucesso! \n");
	}
	
	public void ajustaPressao() {
		int recebePressao;
		System.out.println("\nQual a pressão desejada(1-FRACA/2-MEDIA/3-FORTE): ");
		recebePressao = scan.nextInt();
		if (recebePressao == 1 || recebePressao == 2 || recebePressao == 3) {
			this.setPressao(recebePressao);
			System.out.println("Pressão ajustada com sucesso! \n");			
		}else {
			System.out.println("Opção inválida");			
		}
	}
	
	public void ajustaTempo() {
		int recebeTempo;
		System.out.println("\nQual o tempo desejado(em minutos): ");
		recebeTempo = scan.nextInt();
		this.setTempo(recebeTempo);
		System.out.println("Tempo do banho ajustado para " + this.getTempo() +
				" minutos! \n");
	}
	
	public void ligaChuveiro() {
		this.setStatus(true);
		System.out.println("Chuveiro foi ligado! \n");
	}
	
	public void desligaChuveiro() {
		this.setStatus(false);
		System.out.println("Chuveiro foi desligado! \n");
	}
	
	public void menuChuveiro() {
		System.out.println("\n\t Escolha a opção desejada");
		System.out.println("1 - Temperatura do Chuveiro");
		System.out.println("2 - Pressão da Água");
		System.out.println("3 - Temporizador");
		System.out.println("4 - Ligar Chuveiro");
		System.out.println("5 - Desligar Chuveiro");
		System.out.println("6 - Sair");
	}
	
	public void escolheOpcao2(int opcao) {
		
		while (opcao != 6) {
			
			
			
			switch( opcao ) {
			case 1:
				this.ajustaTemperatura();
				break;
			case 2:
				this.ajustaPressao();
				break;
			case 3:
				this.ajustaTempo();
				break;
			case 4:
				this.ligaChuveiro();
				break;
			case 5:
				this.desligaChuveiro();
				break;
			default:
				System.out.println("Opção inválida");
			}
			
			System.out.println("\t Escolha a opção desejada");
			System.out.println("1 - Temperatura do Chuveiro");
			System.out.println("2 - Pressão da Água");
			System.out.println("3 - Temporizador");
			System.out.println("4 - Ligar Chuveiro");
			System.out.println("5 - Desligar Chuveiro");
			System.out.println("6 - Sair");
			
			opcao = scan.nextInt();
		}
		System.out.println("Sistema encerrado");
	}
	
	public Chuveiro() {}

	public Chuveiro(int temperatura, int pressao, int tempo) {
		super();
		this.temperatura = temperatura;
		this.pressao = pressao;
		this.tempo = tempo;
		this.status = false;
	}

	public int getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}

	public int getPressao() {
		return pressao;
	}

	public void setPressao(int pressao) {
		this.pressao = pressao;
	}

	public int getTempo() {
		return tempo;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
}
