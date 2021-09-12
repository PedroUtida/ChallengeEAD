package br.com.gs.main;

import java.util.Scanner;

import br.com.gs.entity.Chuveiro;
import br.com.gs.entity.Usuario;

public class UsuarioTeste {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int opcao;
		
		// cadastrando usuário
		 Usuario user = new Usuario(); 
		
		 
		user.cadastro();
		user.menuLogin();
		opcao = scan.nextInt();
		user.escolheOpcao(opcao);
	
	}

}
