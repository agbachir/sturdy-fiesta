package cnss.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import cnss.models.Employe;

/**
 * @author Serkin Arewa Ibrahim
 *
 * @version 1.0
 *
 * @since 19 oct. 2017 
 *
 */
public interface EmployeRepository extends JpaRepository<Employe, Long> {
	
	public List<Employe> findByNom(String nom);

}
