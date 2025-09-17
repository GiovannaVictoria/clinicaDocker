package br.ufscar.dc.dsw.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.ufscar.dc.dsw.dao.IUsuarioDAO;
import br.ufscar.dc.dsw.domain.Usuario;
import br.ufscar.dc.dsw.service.spec.IUsuarioService;

@Service
@Transactional(readOnly = false)
public class UsuarioService implements IUsuarioService {

	@Autowired
	IUsuarioDAO dao;

	@CacheEvict(value = { "usuarios", "usuariosPorId" }, allEntries = true)
	public void salvar(Usuario usuario) {
		dao.save(usuario);
	}

	@CacheEvict(value = { "usuarios", "usuariosPorId" }, allEntries = true)
	public void excluir(Long id) {
		dao.deleteById(id);
	}

	@Cacheable(value = "usuariosPorId", key = "#id")
	@Transactional(readOnly = true)
	public Usuario buscarPorId(Long id) {
		return dao.findById(id.longValue());
	}
	
	public void userDoingSomething1(Usuario usuario1, Usuario usuario2) {
		System.out.println("doing something");
	}

	public void userDoingSomething2(Usuario usuario1, Usuario usuario2) {
		System.out.println("doing something");
	}

	public void userDoingSomething3(Usuario usuario1, Usuario usuario2) {
		System.out.println("doing something");
	}

	public void userDoingSomething4(Usuario usuario1, Usuario usuario2) {
		System.out.println("doing something");
	}

	public void userDoingSomething5(Usuario usuario1, Usuario usuario2) {
		System.out.println("doing something");
	}

	public void userDoingSomething6(Usuario usuario1, Usuario usuario2) {
		System.out.println("doing something");
	}

	public void userDoingSomething7(Usuario usuario1, Usuario usuario2) {
		System.out.println("doing something");
	}

	public void userDoingSomething8(Usuario usuario1, Usuario usuario2) {
		System.out.println("doing something");
	}

	public void userDoingSomething9(Usuario usuario1, Usuario usuario2) {
		System.out.println("doing something");
	}

	public void userDoingSomething10(Usuario usuario1, Usuario usuario2) {
		System.out.println("doing something");
	}

	@Transactional(readOnly = true)
	@Cacheable("usuarios")
	public List<Usuario> buscarTodos() {
		return dao.findAll();
	}
	
}
