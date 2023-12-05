package raoua.ragmoun.iset.restcontrolles;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import raoua.ragmoun.iset.entities.Gateau;
import raoua.ragmoun.iset.service.GateauService;

@RestController
@RequestMapping("/api")
@CrossOrigin
	
public class GateauRESTControlleur {
	


	@Autowired
	GateauService gateauService;
	
	 @GetMapping("/hello")
	    public String helloWorld() {
	        return "Hello, World!";
	    }
	
	@RequestMapping(path="all", method = RequestMethod.GET)
	public List<Gateau> getAllGateaus() {
		return gateauService.getAllGateaux();
	}
	
	
	
	@RequestMapping(value="/getbyId/{id}",method = RequestMethod.GET)
	
	public Gateau getGateauById(@PathVariable("id") Long id) {
				return gateauService.getGateau(id);
	 }
	
	@RequestMapping(value="/addgat",method = RequestMethod.POST)
	public Gateau createGateau(@RequestBody Gateau gateau) {
	return gateauService.saveGateau(gateau);
	}
	
	
	@RequestMapping(value="/updget",method = RequestMethod.PUT)
	public Gateau updateGateau(@RequestBody Gateau gateau) {
	return gateauService.updateGateau(gateau);
	}
	
	
	@RequestMapping(value="/delget/{id}",method = RequestMethod.DELETE)
	public void deleteGateau(@PathVariable("id") Long id)
	{
		gateauService.deleteGateauById(id);
	}
	
	
	@RequestMapping(value="/gateautyp/{idTyp}",method = RequestMethod.GET)
	public List<Gateau> getProduitsByCatId(@PathVariable("idTyp") Long idTyp) {
		return gateauService.findByType_IdType(idTyp);
	}




}



