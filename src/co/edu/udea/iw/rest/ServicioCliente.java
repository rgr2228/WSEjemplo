package co.edu.udea.iw.rest;



import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import co.edu.udea.iw.bl.ClienteBL;
import co.edu.udea.iw.dto.Cliente;
import co.edu.udea.iw.dto.ClienteWS;
import co.edu.udea.iw.exception.IWDaoException;


@Path("Cliente")
@Component
public class ServicioCliente {
	
	@Autowired
	private ClienteBL clienteBL;

	
	@Produces(MediaType.APPLICATION_JSON)
	@GET
	public List<ClienteWS> obtener() throws RemoteException{
		List<Cliente> clientesSpring = null;
		List<ClienteWS> clientesService = null;
		try{
			clientesSpring = new ArrayList<Cliente>();
			clientesService = new ArrayList<ClienteWS>();
			clientesSpring = clienteBL.obtener();
			for(Cliente cliente : clientesSpring){
				ClienteWS clienteWS = new ClienteWS();
				clienteWS.setNombres(cliente.getNombres());
				clienteWS.setApellidos(cliente.getApellidos());
				clienteWS.setCedula(cliente.getCedula());
				clienteWS.setCorreoElectronico(cliente.getCedula());
				clientesService.add(clienteWS);
			}
		}catch(IWDaoException e){
			System.out.println("Pasé por acá");
			throw new RemoteException(e.getMessage());
		}
		return clientesService;
	}
	
}
