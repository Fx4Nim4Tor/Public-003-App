package listas;

public class Tickets {
	private int codigo;
	private String descricao;
	private int prioridade;

	
	public Tickets() {
	}
	
	public Tickets(String descricao) {
		this.descricao = descricao;
	}
	
	public Tickets(String descricao, int prioridade) {
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

	
	
	@Override
	public String toString() {
		return "Tickets [codigo=" + codigo + ", descricao=" + descricao + ", prioridade=" + prioridade + "]";
	}
	
	
}
