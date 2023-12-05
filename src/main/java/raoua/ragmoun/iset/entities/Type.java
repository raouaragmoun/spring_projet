package raoua.ragmoun.iset.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;


@Entity
public class Type {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idType;
    private String nomType;
    private String couleurType;
    private String occasion;
    private String cout;
    
    @OneToMany(mappedBy = "type")
    @JsonIgnore
    private List<Gateau> gateaux;
    
    

    public Type() {
    }

    public Type(String nomType, String couleurType, String occasion, String cout, List<Gateau> gateaux) {
        super();
        this.nomType = nomType;
        this.couleurType = couleurType;
        this.occasion = occasion;
        this.cout = cout;
        this.gateaux = gateaux;
    }

    public Long getIdType() {
        return idType;
    }

    public void setIdType(Long idType) {
        this.idType = idType;
    }

    public String getNomType() {
        return nomType;
    }

    public void setNomType(String nomType) {
        this.nomType = nomType;
    }

    public String getCouleurType() {
        return couleurType;
    }

    public void setCouleurType(String couleurType) {
        this.couleurType = couleurType;
    }

    public String getOccasion() {
        return occasion;
    }

    public void setOccasion(String occasion) {
        this.occasion = occasion;
    }

   

    public String getCout() {
		return cout;
	}

	public void setCout(String cout) {
		this.cout = cout;
	}

	public List<Gateau> getGateaux() {
        return gateaux;
    }

    public void setGateaux(List<Gateau> gateaux) {
        this.gateaux = gateaux;
    }
}
