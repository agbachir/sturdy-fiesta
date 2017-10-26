package cnss.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * @author Serkin Arewa Ibrahim
 *
 * @version 1.0
 *
 * @since 19 oct. 2017 
 *
 */

@Entity
public class Departement implements Serializable {
	@Id
	private long id;
	//private String name;
	
	@OneToMany(mappedBy="departement")
	private List<Employe> employes;

}
