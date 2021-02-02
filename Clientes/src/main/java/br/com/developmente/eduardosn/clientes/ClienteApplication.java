package br.com.developmente.eduardosn.clientes;

import br.com.developmente.eduardosn.clientes.model.entity.Cliente;
import br.com.developmente.eduardosn.clientes.model.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ClienteApplication {

    /*@Bean
    public CommandLineRunner run(@Autowired ClienteRepository repository){
        return args -> {
            Cliente cliente = Cliente.builder().nome("Marcelo").cpf("12345678900").build();
            repository.save(cliente);
        };
    }*/

    public static void main(String[] args) {

        SpringApplication.run(ClienteApplication.class, args);
    }
}
