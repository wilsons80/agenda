package br.com.javaweb.agenda.cmd;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.javaweb.agenda.builder.ContatoTOBuilder;
import br.com.javaweb.agenda.dao.ContatoDAO;
import br.com.javaweb.agenda.entity.Contato;
import br.com.javaweb.agenda.to.ContatoTO;

@Component
public class BuscarTodosContatosCmd {
	
	public BuscarTodosContatosCmd() {}
	
	@Autowired
	private ContatoTOBuilder contatoTOBuilder;
	
	@Autowired
	private ContatoDAO contatoDAO;
	
	public List<ContatoTO> getAll(){
		List<Contato> contatos = contatoDAO.listAll();
		return contatoTOBuilder.build(contatos);
	}
}
