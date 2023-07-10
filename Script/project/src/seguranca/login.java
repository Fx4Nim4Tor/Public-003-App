package seguranca;

public class login {
	private String login;
	private String senha;
	
	
	public login() {
		this.login = "admin";
		this.senha = "admin";
	}
	
	public login(String login, String senha) {
		this.login = login;
		this.senha = senha;
	}


	public String getLogin() {
		return login;
	}


	public String getSenha() {
		return senha;
	}
	
	
	public boolean testelogin(String login){
		if(login.equals(this.login)){
			return true;
		}else{
			System.out.println("O usuario esta incorreto!!");
			return false;
		}
	}
	
	public boolean testesenha(String senha){
		if(senha.equals(this.senha)){
			return true;
		}else{
			System.out.println("Senha incorreta!!");
			return false;
		}
	}
}
