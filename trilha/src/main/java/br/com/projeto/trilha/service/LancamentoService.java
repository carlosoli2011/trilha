package br.com.projeto.trilha.service;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.projeto.trilha.ejb.LancamentoLocal;
import br.com.projeto.trilha.model.Lancamento;

@Path("/lancamento")
public class LancamentoService {
	
	@EJB
	LancamentoLocal lancamentoLocal;
	
	@POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
	public Lancamento adicionarLancamento(Lancamento lancamento) {
        Lancamento retornoLancamento = lancamentoLocal.adicionarLancamento(lancamento);
        return retornoLancamento;
    }

}
