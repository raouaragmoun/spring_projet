package raoua.ragmoun.iset.repos;

import java.util.List;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import raoua.ragmoun.iset.entities.Type;

import raoua.ragmoun.iset.entities.Gateau;

@RepositoryRestResource(path = "rest")
public interface GateauRepository extends JpaRepository<Gateau, Long> {  
	List<Gateau> findByNomGateau(String nom);
    List<Gateau> findByNomGateauContains(String nom);
  
    
    List<Gateau> findByType_IdType(Long typeId);
    
    List<Gateau> findByOrderByNomGateauAsc();
    @Query("select g from Gateau g order by g.nomGateau ASC, g.prixGateau DESC")
    List<Gateau> trierGateauNomsPrix ();
    
    //List<Gateau> findByNomGateau1(String nom);

    List<Gateau> findByType(Type type);

    


}
