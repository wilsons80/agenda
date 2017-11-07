package br.com.javaweb.agenda.cmd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.javaweb.agenda.dao.ContatoDAO;
import br.com.javaweb.agenda.dao.GrupoDAO;
import br.com.javaweb.agenda.entity.Contato;
import br.com.javaweb.agenda.entity.Grupo;

@Component
public class VincularContatoGrupoCmd {
	
	@Autowired
	private ContatoDAO contatoDAO;
	@Autowired
	private GrupoDAO grupoDAO;
	
	/**** código da classe VincularContatoGrupoCmd ****/
	public void vincular(Integer idContato, Integer idGrupo) {
		Contato contato = contatoDAO.getPorCodigo(idContato);
		Grupo grupo = grupoDAO.getPorCodigo(idGrupo);

		contato.addGrupo(grupo);
		contatoDAO.insert(contato);
	}

}
