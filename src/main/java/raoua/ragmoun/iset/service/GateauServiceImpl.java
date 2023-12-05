package raoua.ragmoun.iset.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import raoua.ragmoun.iset.entities.Gateau;
import raoua.ragmoun.iset.entities.Type;
import raoua.ragmoun.iset.repos.GateauRepository;

@Service
public class GateauServiceImpl implements GateauService {  // Change Pr;

    @Autowired
    GateauRepository gateauRepository;
    
    public Gateau saveGateau(Gateau g) {
        return gateauRepository.save(g);  
    }

   

	@Override
	public Gateau updateGateau(Gateau g) {
		return gateauRepository.save(g);
	}

	@Override
	public void deleteGateau(Gateau g) {
		gateauRepository.delete(g);
		
	}

	@Override
	public void deleteGateauById(Long id) {
		gateauRepository.deleteById(id);
		
	}

	@Override
	public Gateau getGateau(Long id) {
		return gateauRepository.findById(id).get();
	}



	@Override
	public List<Gateau> getAllGateaux() {
		return gateauRepository.findAll();
	}



	@Override
	public List<Gateau> findByNomGateau(String nom) {
		 return gateauRepository.findByNomGateau(nom);
	}



	@Override
	public List<Gateau> findByNomGateauContains(String nom) {
		return gateauRepository.findByNomGateauContains(nom);
	}



	/*@Override
	public List<Gateau> findByNomPrix(String nom, Double prix) {
		 return gateauRepository.findByNomPrix(nom, prix);
	}*/



	@Override
	public List<Gateau> findByType(Type type) {
		return gateauRepository.findByType(type);
	}



	@Override
	public List<Gateau> findByType_IdType(Long id) {
		return gateauRepository.findByType_IdType(id);
	}



	@Override
	public List<Gateau> findByOrderByNomGateauAsc() {
		return gateauRepository.findByOrderByNomGateauAsc();
	}



	@Override
	public List<Gateau> trierGateauxNomsPrix() {
        return gateauRepository.trierGateauNomsPrix();

	}
}
