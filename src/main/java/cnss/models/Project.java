package cnss.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 * @author Serkin Arewa Ibrahim
 *
 * @version 1.0
 *
 * @since 19 oct. 2017 
 *
 */

@Entity
public class Project implements Serializable {
	
	@Id
	private long id;
	
	@ManyToMany(mappedBy="projects")
	private List<Employe> employes;

}
