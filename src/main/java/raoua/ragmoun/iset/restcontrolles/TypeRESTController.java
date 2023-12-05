package raoua.ragmoun.iset.restcontrolles;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import raoua.ragmoun.iset.entities.Gateau;
import raoua.ragmoun.iset.entities.Type;
import raoua.ragmoun.iset.repos.TypeRepository;
import raoua.ragmoun.iset.service.GateauService;

@RestController
@RequestMapping("/api/typ")
@CrossOrigin("*")
public class TypeRESTController {
	GateauService gateauService;

	@Autowired
	TypeRepository typeRepository;
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Type> getAllTypes()
	{
	return typeRepository.findAll();
	}
	@RequestMapping(value="typs/{id}",method = RequestMethod.GET)
	public Type getCategorieById(@PathVariable("id") Long id) {
	return typeRepository.findById(id).get();
	}
	
	@RequestMapping(value="/prodsByName/{nom}",method = RequestMethod.GET)
	public List<Gateau> findByNomProduitContains(@PathVariable("nom") String nom) {
	return gateauService.findByNomGateauContains(nom);
	}

}
