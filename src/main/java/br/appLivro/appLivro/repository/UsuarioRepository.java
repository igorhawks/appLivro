package br.appLivro.appLivro.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.appLivro.appLivro.model.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, String>{

	Usuario findById(long id);
	
	@Query(value = "select * from applivro.usuario where email = :email and senha = :senha", nativeQuery = true)
	public Usuario login(String email, String senha);
	
}
