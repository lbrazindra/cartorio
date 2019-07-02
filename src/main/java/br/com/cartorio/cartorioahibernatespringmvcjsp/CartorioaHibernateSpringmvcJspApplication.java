package br.com.cartorio.cartorioahibernatespringmvcjsp;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import br.com.cartorio.cartorioahibernatespringmvcjsp.domains.Cartorio;
import br.com.cartorio.cartorioahibernatespringmvcjsp.repository.CartorioRepository;

@SpringBootApplication
public class CartorioaHibernateSpringmvcJspApplication extends SpringBootServletInitializer implements CommandLineRunner{
	
	@Autowired
	private CartorioRepository cartorioRepository;
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(CartorioaHibernateSpringmvcJspApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(CartorioaHibernateSpringmvcJspApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Cartorio cartorio1 = new Cartorio("Primeiro Cartorio");
		Cartorio cartorio2 = new Cartorio("Segundo Cartorio");
		Cartorio cartorio3 = new Cartorio("Terceuro Cartorio");
		
		cartorioRepository.saveAll(Arrays.asList(cartorio1, cartorio2, cartorio3));
	}

}
