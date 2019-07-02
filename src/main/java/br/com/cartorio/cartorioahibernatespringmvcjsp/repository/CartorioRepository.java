package br.com.cartorio.cartorioahibernatespringmvcjsp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cartorio.cartorioahibernatespringmvcjsp.domains.Cartorio;

public interface CartorioRepository extends JpaRepository<Cartorio, Integer> {

}
