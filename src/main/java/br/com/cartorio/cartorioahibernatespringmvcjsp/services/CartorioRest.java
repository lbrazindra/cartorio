package br.com.cartorio.cartorioahibernatespringmvcjsp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cartorio.cartorioahibernatespringmvcjsp.domains.Cartorio;
import br.com.cartorio.cartorioahibernatespringmvcjsp.repository.CartorioRepository;

@RestController
@RequestMapping(value = "listarCartorios")
public class CartorioRest {

	@Autowired
	private CartorioRepository cartorioRepository;

	@GetMapping(produces = "application/json")
	public List<Cartorio> listarCartorios() {
		List<Cartorio> cartorio = cartorioRepository.findAll();
		return cartorio;
	}
}
