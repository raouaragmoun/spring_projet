package raoua.ragmoun.iset.entities;


import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Gateau {
	@ManyToOne
	private Type type;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idGateau;  
    private String nomGateau;  
    private Double prixGateau;  
    private Date dateCreation;  

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    
    
    public Gateau() {
        super();
    }

    public Gateau(String nomGateau, Double prixGateau, Date dateCreation) {
        super();
        this.nomGateau = nomGateau;
        this.prixGateau = prixGateau;
        this.dateCreation = dateCreation;
    }

    public Long getIdGateau() {  // Change getIdProduit to getIdGateau
        return idGateau;
    }

    public void setIdGateau(Long idGateau) {  // Change setIdProduit to setIdGateau
        this.idGateau = idGateau;
    }

    public String getNomGateau() {  // Change getNomProduit to getNomGateau
        return nomGateau;
    }

    public void setNomGateau(String nomGateau) {  // Change setNomProduit to setNomGateau
        this.nomGateau = nomGateau;
    }

    public Double getPrixGateau() {  // Change getPrixProduit to getPrixGateau
        return prixGateau;
    }

    public void setPrixGateau(Double prixGateau) {  // Change setPrixProduit to setPrixGateau
        this.prixGateau = prixGateau;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    @Override
    public String toString() {
        return "Gateau [idGateau=" + idGateau + ", nomGateau=" + nomGateau + ", prixGateau=" + prixGateau
                + ", dateCreation=" + dateCreation + "]";
    }
}

