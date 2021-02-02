package br.com.developmente.eduardosn.clientes.model.repository;

import br.com.developmente.eduardosn.clientes.model.entity.Servico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoRepository extends JpaRepository<Servico, Integer> {
}
