package br.com.projeto.trilha.ejb;

import javax.ejb.Stateless;

import br.com.projeto.trilha.model.Lancamento;

@Stateless
public class LancamentoBean implements LancamentoLocal{

	public Lancamento adicionarLancamento(Lancamento lancamento) {
		// TODO repository
		return null;
	}

}
