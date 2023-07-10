package principal;

import java.util.Scanner;

import seguranca.login;

public class Base {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		login log = new login();
		
		
		String login;
		String senha;
		
		do {
		System.out.println("Digite seu login");
		login = teclado.nextLine();
		System.out.println("Digite sua senha");
		senha = teclado.nextLine();
		
		}while (!(log.testelogin(login) || !log.testesenha(senha)));
		
		
		
		teclado.close();
	}

}
