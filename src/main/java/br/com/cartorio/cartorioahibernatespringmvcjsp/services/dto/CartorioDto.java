package br.com.cartorio.cartorioahibernatespringmvcjsp.services.dto;

import java.util.List;

import br.com.cartorio.cartorioahibernatespringmvcjsp.domains.Cartorio;

public class CartorioDto {

	private Integer id;
	private String name;

	public CartorioDto(Cartorio cartorio) {
		this.name = cartorio.getName();
		this.id = cartorio.getId();
	}

	public String getName() {
		return name;
	}

	public Integer getId() {
		return id;
	}

}