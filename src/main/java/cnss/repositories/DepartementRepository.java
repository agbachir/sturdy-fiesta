package cnss.repositories;

import org.springframework.data.repository.CrudRepository;

import cnss.models.Employe;

public interface DepartementRepository extends CrudRepository<Employe, Long> {

}
