/**
 * 
 */
package com.project_spring_webapp.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.project_spring_webapp.services.SpringService;

/**
 * @author edgar
 *
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(locations = {"applicationContext-test.xml"})
class SpringJUnit5Test {
	
	@Autowired
	private SpringService springServiceImpl;
	

	@Test
	void test() {
		//fail("Not yet implemented");
		assertNotNull(this.springServiceImpl);
		System.out.println(this.springServiceImpl.mostrarNombreEmpleado());
	}

}
