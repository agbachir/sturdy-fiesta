package cnss.repositories;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cnss.models.Employe;
import junit.framework.Assert;

/**
 * @author Serkin Arewa Ibrahim
 *
 * @version 1.0
 *
 * @since 19 oct. 2017 
 *
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeRepositoryTest {
	
	@Autowired
	public EmployeRepository employeRepository;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		Long number = employeRepository.count();
		assertThat("Test KO", number, is(0L));
		//fail("Not yet implemented");
	}
	@Test
	public void testSave() {
		Employe employe = new Employe();
		
		employe.setNom("HARIRA");
		employe.setPrenom("Ada");
		
		employeRepository.save(employe);//
		
		Employe employeresuslt = employeRepository.save(employe);
		assertEquals("HARIRA", employeresuslt.getNom());
	}
	@Test
	public void testFindNom() {
		
		Employe employe = new Employe();
		
		List<Employe> employes = employeRepository.findByNom("HARIRA");
		
		assertEquals("HARIRA", employes.get(0).getNom());
		
	}

}
