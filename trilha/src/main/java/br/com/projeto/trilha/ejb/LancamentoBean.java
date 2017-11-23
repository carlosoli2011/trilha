package br.com.projeto.trilha.ejb;

import javax.ejb.Stateless;

import br.com.projeto.trilha.dao.LancamentoDao;
import br.com.projeto.trilha.model.Lancamento;

@Stateless
public class LancamentoBean implements LancamentoLocal{

	LancamentoDao dao;

	public Lancamento adicionarLancamento(Lancamento lancamento) {
		// TODO 
		Lancamento retornoLancamento = new Lancamento();
		
		return retornoLancamento = dao.adicionarLancamento(lancamento);
	}

}
