package br.com.cartorio.cartorioahibernatespringmvcjsp.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.cartorio.cartorioahibernatespringmvcjsp.domains.Cartorio;
import br.com.cartorio.cartorioahibernatespringmvcjsp.repository.CartorioRepository;

@Controller
public class CartorioController {

	@Autowired
	private CartorioRepository cartorioRepository;

	@RequestMapping(value = "/lista", method = RequestMethod.GET)
	public String lista(Model model) {
		model.addAttribute("cartorios", cartorioRepository.findAll());
		return "cartorioLista";
	}

	@RequestMapping(value = "/cadastra", method = RequestMethod.POST)
	public String cadastra(@ModelAttribute Cartorio cartorio, RedirectAttributes redirect) {
		cartorioRepository.save(cartorio);
		redirect.addFlashAttribute("message", "Cartorio salvo com sucesso!");
		return "redirect:/lista";
	}

	@RequestMapping(value = "/cadastra", method = RequestMethod.GET)
	public String cadastra(Model model) {
		model.addAttribute("cartorio", new Cartorio());
		return "cartorioForm";
	}

	@RequestMapping(value = "/deletarCartorio/{id}")
	public String deletarCartorio(@PathVariable int id, Model model, RedirectAttributes redirect) {
		Optional<Cartorio> cartorioOptional = cartorioRepository.findById(id);
		if (cartorioOptional.isPresent()) {
			cartorioRepository.delete(cartorioOptional.get());
			redirect.addFlashAttribute("message", "Cartorio deletado com sucesso!");
		}
		return "redirect:/lista";
	}

	@RequestMapping(value = "/editarCartorio/{id}")
	public String editarCartorio(@PathVariable int id, Model model) {
		Optional<Cartorio> cartorioOptional = cartorioRepository.findById(id);
		if (cartorioOptional.isPresent()) {
			model.addAttribute("cartorio", cartorioOptional.get());
			return "cartorioEditar";
		}
		return "redirect:/lista";
	}
	
	@RequestMapping(value="/cartorioEditado",method = RequestMethod.POST)    
    public String cartorioEditado(@ModelAttribute("cartorio") Cartorio cartorio, RedirectAttributes redirect){    
		cartorioRepository.save(cartorio);
		redirect.addFlashAttribute("message", "Cartorio editado e salvo com sucesso!");
        return "redirect:/lista";    
    } 

	@RequestMapping(value="/",method = RequestMethod.GET)    
	public String home(){    
		return "home";    
	}  
}
