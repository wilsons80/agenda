package br.com.javaweb.agenda.cmd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.javaweb.agenda.builder.ContatoTOBuilder;
import br.com.javaweb.agenda.dao.ContatoDAO;
import br.com.javaweb.agenda.entity.Contato;
import br.com.javaweb.agenda.to.ContatoTO;

@Component
public class AtualizarContatoCmd {

	@Autowired
	private ContatoDAO contatoDAO;
	
	@Autowired
	private ContatoTOBuilder contatoTOBuilder;
	
	
	public ContatoTO atualizar(ContatoTO contatoTo){
		Contato contato = contatoDAO.getPorCodigo(contatoTo.getId());
		contato.setNome( contatoTo.getNome() );
		contatoDAO.update( contato );
		return contatoTOBuilder.build(contato);
	}
}
