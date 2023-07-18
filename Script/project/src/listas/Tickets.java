package listas;

public class Tickets {
	private int codigo;
	private String descricao;
	private int prioridade;
	
	
	public Tickets(String descricao, int prioridade) {
		super();
		this.descricao = descricao;
		this.prioridade = prioridade;
	}


	public int getCodigo() {
		return codigo;
	}


	public String getDescricao() {
		return descricao;
	}


	public int getPrioridade() {
		return prioridade;
	}
	
	
}
