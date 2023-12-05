package raoua.ragmoun.iset.service;

import java.util.List;


import raoua.ragmoun.iset.entities.Gateau;
import raoua.ragmoun.iset.entities.Type;

public interface GateauService {

    Gateau saveGateau(Gateau g);  
    Gateau updateGateau(Gateau g);  
    void deleteGateau(Gateau g);  
    void deleteGateauById(Long id);  
    Gateau getGateau(Long id);  
    List<Gateau> getAllGateaux();  
    List<Gateau> findByNomGateau(String nom);
    
    List<Gateau> findByNomGateauContains(String nom);
    
   // List<Gateau> findByNomPrix(String nom, Double prix);
    
    List<Gateau> findByType(Type type);
    
    List<Gateau> findByType_IdType(Long id);
    
    List<Gateau> findByOrderByNomGateauAsc();
    
    List<Gateau> trierGateauxNomsPrix();

}
