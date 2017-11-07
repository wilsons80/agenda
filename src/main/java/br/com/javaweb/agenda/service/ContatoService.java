package br.com.javaweb.agenda.service;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import br.com.javaweb.agenda.cmd.AtualizarContatoCmd;
import br.com.javaweb.agenda.cmd.BuscarContatosPorCodigoCmd;
import br.com.javaweb.agenda.cmd.BuscarEmailsContatosCmd;
import br.com.javaweb.agenda.cmd.ExcluirContatoCmd;
import br.com.javaweb.agenda.cmd.BuscarTodosContatosCmd;
import br.com.javaweb.agenda.cmd.IncluirContatoCmd;
import br.com.javaweb.agenda.to.ContatoTO;
import br.com.javaweb.agenda.to.EmailContatoTO;

@Component
@Path("/contato")
public class ContatoService {

	@Autowired
	private BuscarTodosContatosCmd getContatosCmd;
	
	@Autowired
	private BuscarContatosPorCodigoCmd buscarContatosPorCodigoCmd; 
	
	@Autowired
	private IncluirContatoCmd incluirContatoCmd;
	
	@Autowired
	private ExcluirContatoCmd excluirContatoCmd;

	@Autowired
	private AtualizarContatoCmd atualizarContatoCmd;
	
	@Autowired
	private BuscarEmailsContatosCmd buscarEmailsContatosCmd;

	
	@Path("")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Transactional
	public List<ContatoTO> getContatos(){
		return getContatosCmd.getAll();
	}

	
	@GET
	@Path("/{idContato}")
	@Produces(MediaType.APPLICATION_JSON)
	@Transactional
	public ContatoTO getContato(@PathParam("idContato") Integer idContato){
		return buscarContatosPorCodigoCmd.getByCodigo(idContato);
	}
	
	@POST
	@Path("")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Transactional
	public ContatoTO incluir(ContatoTO contato){
		return incluirContatoCmd.incluir(contato);
	}
	
	@PUT
	@Path("")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Transactional
	public ContatoTO atualizar(ContatoTO contato){
		return atualizarContatoCmd.atualizar(contato);
	}

	
	@DELETE
	@Path("/{idContato}")
	@Produces(MediaType.TEXT_HTML)
	@Transactional
	public String excluir(@PathParam("idContato") Integer codigo){
		return "O contato " + excluirContatoCmd.excluir(codigo).getNome() + " foi excluído com sucesso.";
	}
	
	
	@GET
	@Path("/email")
	@Produces(MediaType.APPLICATION_JSON)
	@Transactional
	public List<EmailContatoTO> getEmailsContatos(){
		return buscarEmailsContatosCmd.get();
	}
}
