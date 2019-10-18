package br.com.unipac.cliente.api.clienteapi.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.unipac.cliente.api.clienteapi.model.domain.Cliente;

@Repository
public class ClienteDAOImpl implements ClienteDAO {

	List<Cliente> clientes = new ArrayList<>();

	@Override
	public boolean salvar(Cliente cliente) {
		return clientes.add(cliente);
		}

	@Override
	public boolean alterar(Long id, Cliente cliente) {
		cliente.update(id, cliente);
		return clientes.add(cliente);
	}

	@Override
	public List<Cliente> listartodos() {
		return clientes;
	}

	@Override
	public boolean buscarPorId(Cliente cliente) {
		return clientes.contains(cliente);
	}

	@Override
	public boolean removerPorId(Cliente cliente) {
		return clientes.remove(cliente);
		
	}

	@Override
	public boolean salvar(Cliente cliente) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean alterar(Long id, Cliente cliente) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removerPorId(Cliente cliente) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean buscarPorId(Cliente cliente) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
}