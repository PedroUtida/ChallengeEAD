package br.com.gs.entity;

import java.util.Scanner;

public class Usuario {

	private String nome;
	
	private String nomeCompleto;
	
	private String email;
	
	private String senha;
	
	private int opcao2;
	
	Scanner scan = new Scanner(System.in);
	
	// Instanciando um chuveiro dentro do usuario para ser modificado a vontade 
	// pelo mesmo posteriormente
	Chuveiro chuv = new Chuveiro(35, 1, 30);
	
	public void cadastro() {
		String userCadastro;
		String nomeCadastro;
		String emailCadastro;
		String senhaCadastro;
		
		System.out.println("\t BEM VINDO A TELA DE CADASTRO");
		System.out.println("Informe o nome do Usuário: ");
		userCadastro = scan.nextLine();
		this.setNome(userCadastro);
		System.out.println("Informe seu nome Completo: ");
		nomeCadastro = scan.nextLine();
		this.setNomeCompleto(nomeCadastro);
		System.out.println("Informe seu e-mail: ");
		emailCadastro = scan.nextLine();
		this.setEmail(emailCadastro);
		System.out.println("Informe sua senha: ");
		senhaCadastro = scan.nextLine();
		this.setSenha(senhaCadastro);
		
	}
	
	public void login() {
		String valorEmail;
		String valorSenha;
		
		if (this.getEmail() == null || this.getSenha() == null) {
			System.out.println("Usuário não cadastrado.");
		}else{			
			System.out.println("Login do usuário");
			System.out.println("E-mail: ");
			valorEmail = scan.nextLine();
			System.out.println("Senha: ");
			valorSenha = scan.nextLine();
			if (!valorEmail.equals(this.getEmail())) {
				System.out.println("E-mail incorreto.");
			}else if (!valorSenha.equals(this.getSenha())) {
				System.out.println("Senha incorreta.");
			}else {
				System.out.println("\nLOGIN EFETUADO COM SUCESSO!");
				chuv.menuChuveiro();
				opcao2 = scan.nextInt();
				chuv.escolheOpcao2(opcao2);
			}
		}
	}
	
	public void menuLogin() {
		System.out.println("\n\t Escolha a opção desejada");
		System.out.println("1 - Fazer Login");
		System.out.println("2 - Sair");
	}
	
	public void escolheOpcao(int opcao) {
		
		switch( opcao ) {
		case 1:
			this.login();
			break;
		case 2:
			System.out.println("Sistema encerrado");
			break;
		default:
			System.out.println("Opção inválida");
		}
	}
	
	public Usuario() {}
	
	public Usuario(String nome, String nomeCompleto, String email, String senha) {
		super();
		this.nome = nome;
		this.nomeCompleto = nomeCompleto;
		this.email = email;
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}
