package raoua.ragmoun.iset;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import raoua.ragmoun.iset.entities.Gateau;
import java.util.Date;
import java.util.List;

import raoua.ragmoun.iset.repos.GateauRepository;

/**
 * @author Dell
 *
 */
@SpringBootTest
class ProjetSpringApplicationTests {

	@Autowired
	private GateauRepository gateauRepository;  // Change ProduitRepository to GateauRepository

	@Test
	public void testCreateGateau() {  // Change testCreateProduit to testCreateGateau
	    Gateau gateau = new Gateau("tarte", 2200.500, new Date());  // Change Produit to Gateau
	    gateauRepository.save(gateau);  // Change produitRepository to gateauRepository
	}

	@Test
	public void testFindGateau() {  // Change testFindProduit to testFindGateau
	    Gateau gateau = gateauRepository.findById(1L).get();  // Change Produit to Gateau
	    System.out.println(gateau);
	}

	@Test
	public void testUpdateGateau() {  // Change testUpdateProduit to testUpdateGateau
	    Gateau gateau = gateauRepository.findById(1L).get();  // Change Produit to Gateau
	    gateau.setPrixGateau(1000.0);  // Change setPrixProduit to setPrixGateau
	    gateauRepository.save(gateau);
	}

	
	@Test
	public void testDeleteGateau() {  // Change testDeleteProduit to testDeleteGateau
	    gateauRepository.deleteById(1L);  // Change produitRepository to gateauRepository
	}

	@Test
	public void testListerTousGateaux() {  // Change testListerTousProduits to testListerTousGateaux
	    List<Gateau> gateaux = gateauRepository.findAll();  // Change Produit to Gateau
	    for (Gateau g : gateaux) {  // Change Produit to Gateau
	        System.out.println(g);
	    }
	}
	
	@Test
	public void testFindByNomGateau() {
	    List<Gateau> gateaux = gateauRepository.findByNomGateau("biscuit");
	    for (Gateau g : gateaux) {
	        System.out.println(g);
	    }
	}

	@Test
	public void testFindByNomGateauContains() {
	    List<Gateau> gateaux = gateauRepository.findByNomGateauContains("tarte");
	    for (Gateau g : gateaux) {
	        System.out.println(g);
	    }
	}

	
	 @Test
	    public void findByType_IdType() {
	        List<Gateau> gateaux = gateauRepository.findByType_IdType(1L);
	        for (Gateau g : gateaux) {
	            System.out.println(g);
	        }
	    }
	 
	 
	 @Test
	    public void testFindByOrderByNomGateauAsc() {
	        List<Gateau> gateaux = gateauRepository.findByOrderByNomGateauAsc();
	        for (Gateau g : gateaux) {
	            System.out.println(g);
	        }
	    }
	 
	 
	 
	 
	}



