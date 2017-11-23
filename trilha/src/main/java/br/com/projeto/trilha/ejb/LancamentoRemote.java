package br.com.projeto.trilha.ejb;

import javax.ejb.Remote;

import br.com.projeto.trilha.model.Lancamento;

@Remote
public interface LancamentoRemote {
	
	public Lancamento adicionarLancamento(Lancamento lancamento);

}
