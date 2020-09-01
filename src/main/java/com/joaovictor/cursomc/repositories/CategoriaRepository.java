package com.joaovictor.cursomc.repositories;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;
import com.joaovictor.cursomc.domain.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria,Integer>{

	
	
}
