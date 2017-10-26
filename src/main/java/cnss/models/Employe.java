package cnss.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/**
 * @author Serkin Arewa Ibrahim
 *
 * @version 1.0
 *
 * @since 19 oct. 2017 
 *
 */

@Entity
public class Employe implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@ManyToOne
	//@JoinColumn(name="DEPT_ID") //Pour éviter de faire @JoinColumn => @PrimaryKeyJoinColumn
	private Departement departement;
	private String nom;
	private String prenom;
	
	public Employe() {
		// TODO Auto-generated constructor stub
	}
	
	@ManyToMany
	private List<Project> projects;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Override
	public String toString() {
		return "Employe [id=" + id + ", nom=" + nom + ", prenom=" + prenom + "]";
	}
	

}
