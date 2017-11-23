package br.com.projeto.trilha.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.projeto.trilha.model.Lancamento;

public class LancamentoDaoImpl implements LancamentoDao{

	//persiste no banco de dados
	
	public Lancamento adicionarLancamento(Lancamento novoLancamento) {
		// TODO regra
		Connection con = null;
		
		try {
			String insert_sql = "insert into lancamento (nome, tipolancamento, valor) values (?, ?, ?)";
			String update_sql = "update lancamento set nome = ?, tipolancamento = ?, valor = ? where id = ?";
			PreparedStatement pst;
			if (novoLancamento.getId() == null) {
				pst = con.prepareStatement(insert_sql);
			} else {
				pst = con.prepareStatement(update_sql);
				pst.setLong(4, novoLancamento.getId());
			}
			pst.setString(1, novoLancamento.getNome());
			pst.setString(2, novoLancamento.getTipoLancamento());
			pst.setFloat(3, (float) novoLancamento.getValor());
			
			pst.executeUpdate();
			
		} catch (Exception e) {
			//throw new DAOException("Operação não realizada com sucesso.", e);
		} finally {
			try {
				if (con != null)
					con.close();
			} catch (SQLException e) {
				//throw new DAOException("Não foi possível fechar a conexão.",e);
}
		}
		return null;
	}

}
