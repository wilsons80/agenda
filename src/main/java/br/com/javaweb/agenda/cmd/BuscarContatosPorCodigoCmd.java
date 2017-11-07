package br.com.javaweb.agenda.cmd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.javaweb.agenda.builder.ContatoTOBuilder;
import br.com.javaweb.agenda.dao.ContatoDAO;
import br.com.javaweb.agenda.entity.Contato;
import br.com.javaweb.agenda.to.ContatoTO;

@Component
public class BuscarContatosPorCodigoCmd {
	
	public BuscarContatosPorCodigoCmd() {}
	
	@Autowired
	private ContatoTOBuilder contatoTOBuilder;
	
	@Autowired
	private ContatoDAO contatoDAO;
	
	public ContatoTO getByCodigo(Integer codigo){
		Contato contato = contatoDAO.getPorCodigo(codigo);
		return contatoTOBuilder.build( contato );
	}
}
