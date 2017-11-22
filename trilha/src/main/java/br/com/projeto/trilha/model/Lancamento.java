package br.com.projeto.trilha.model;

public class Lancamento {
	
	private Long id;
	private String nome;
	private String tipoLancamento;
	private double valor;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipoLancamento() {
		return tipoLancamento;
	}
	public void setTipoLancamento(String tipoLancamento) {
		this.tipoLancamento = tipoLancamento;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public Long getId() {
		return id;
	}
	
	@Override
	public String toString() {
		return "Lancamento [id=" + id + ", nome=" + nome + ", tipoLancamento=" + tipoLancamento + ", valor=" + valor
				+ "]";
	}
	
	

}
