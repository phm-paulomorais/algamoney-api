package com.example.algamoney.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.algamoney.api.model.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Long> {

	// Você pode ordenar suas consultas por meio dos métodos do Spring Data. 
	// Para isso, no final do nome do método, basta adicionar a seguinte informação: OrderBy + Nome do Atributo + Ordenação (Asc ou Desc)
	List<Cidade> findByEstadoCodigoOrderByNomeAsc(Long estadoCodigo);
}
