package br.com.developmente.eduardosn.clientes.model.repository;

import br.com.developmente.eduardosn.clientes.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
