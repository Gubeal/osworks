// Classe criada para apresentar apenas os dados persistidos no BD. Alterações na classe Service.
package com.gubeal.osworks.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gubeal.osworks.domain.model.Cliente;

@Repository 
public interface ClienteRepository extends JpaRepository<Cliente, Long>{
	
	List<Cliente> findByNome(String nome);
	List<Cliente> findByNomeContaining(String nome);
	Cliente findByEmail(String email);
	
}
