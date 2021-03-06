package gov.wilaya.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.NotBlank;
@Entity
public class Marche implements Serializable {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idMarche;
	@NotBlank
	private String numeroMarche;
	@Min(value=0)
	private double montantMarche;
	@Min(value=0)
	private double montantTravauxRealises;
	private String delaiExecution;
	private float tauxAvancement;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="ID_NATUREMARCHE")
	private NatureMarche nature;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="ID_PROJET")
	private Projet projet;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="ID_ENTREPRISE")
	private Entreprise entreprise;
	
	public Marche(String numeroMarche, double montantMarche, double montantTravauxRealises, String delaiExecution,
			float tauxAvancement) {
		super();
		this.numeroMarche = numeroMarche;
		this.montantMarche = montantMarche;
		this.montantTravauxRealises = montantTravauxRealises;
		this.delaiExecution = delaiExecution;
		this.tauxAvancement = tauxAvancement;
	}
	public Long getIdMarche() {
		return idMarche;
	}
	public void setIdMarche(Long idMarche) {
		this.idMarche = idMarche;
	}
	public String getNumeroMarche() {
		return numeroMarche;
	}
	public void setNumeroMarche(String numeroMarche) {
		this.numeroMarche = numeroMarche;
	}
	public double getMontantMarche() {
		return montantMarche;
	}
	public void setMontantMarche(double montantMarche) {
		this.montantMarche = montantMarche;
	}
	public double getMontantTravauxRealises() {
		return montantTravauxRealises;
	}
	public void setMontantTravauxRealises(double montantTravauxRealises) {
		this.montantTravauxRealises = montantTravauxRealises;
	}
	public String getDelaiExecution() {
		return delaiExecution;
	}
	public void setDelaiExecution(String delaiExecution) {
		this.delaiExecution = delaiExecution;
	}
	public float getTauxAvancement() {
		return tauxAvancement;
	}
	public void setTauxAvancement(float tauxAvancement) {
		this.tauxAvancement = tauxAvancement;
	}
	public NatureMarche getNature() {
		return nature;
	}
	public void setNature(NatureMarche nature) {
		this.nature = nature;
	}
	public Projet getProjet() {
		return projet;
	}
	public void setProjet(Projet projet) {
		this.projet = projet;
	}
	public Entreprise getEntreprise() {
		return entreprise;
	}
	public void setEntreprise(Entreprise entreprise) {
		this.entreprise = entreprise;
	}
}
