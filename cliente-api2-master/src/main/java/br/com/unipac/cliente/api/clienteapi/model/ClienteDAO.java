package br.com.unipac.cliente.api.clienteapi.model;

import java.util.List;

import br.com.unipac.cliente.api.clienteapi.model.domain.Cliente;


public interface ClienteDAO {

	boolean salvar(Cliente cliente);

	boolean alterar(Long id, Cliente cliente);

	List<Cliente> listartodos();

	boolean removerPorId(Cliente cliente);

	boolean buscarPorId(Cliente cliente);

}