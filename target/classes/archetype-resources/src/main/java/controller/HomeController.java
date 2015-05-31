#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import ${package}.entities.Person;
import ${package}.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@Autowired
	private PersonRepository personRepository;

	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		Person person = new Person();
		person.setName("Paul");
//		person = personRepository.getByName("Paul");
		personRepository.save(person);
		return new ModelAndView("home");
	}
}
