package com.farmacia.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.farmacia.project.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

	public List<Categoria> findAllBySetorContainingIgnoreCase(@Param("setor") String setor);

}
