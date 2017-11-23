package br.com.projeto.trilha.ejb;

import javax.ejb.Local;

import br.com.projeto.trilha.model.Lancamento;

@Local
public interface LancamentoLocal {
	
	public Lancamento adicionarLancamento(Lancamento lancamento);

}
