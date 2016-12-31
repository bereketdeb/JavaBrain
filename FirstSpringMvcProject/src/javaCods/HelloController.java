package javaCods;

import java.util.ArrayList;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
// if we are going to use with out annotation, we have to extend "AbstractController" class
/* all .html requests goes directly to web.xml from clients browser, the request is mapped to 
 * spring-dispatcher-servlet (front controller) of the mvc spring framework.
 * -> front controller reads the "spring-dispatcher-servlet.xml for further processing information
 * -> when it reads "context:component-scan in the xml file, it understands that we have 
 * used annotation based controller class in the specified "base-package"
 * -> so first, it loads all controller classes to memory then decides which "controller class methods" to invoke for further processing
 * -> it checks all methods with the annotation "@RequestMapping" and compares their value with the incoming request.
   for example, "http://localhost:8087/FirstSpringMvcProject/WELCOME.html" compare to "@RequestMapping("/welcome")"
   since "welcome" matches it will invoke the method "handleRequestInternal" 
   -> then it returns the "modelAndView" object by the name"HelloPage" back to the front-controller(spring-dispatcher-servlet.xml) 
   for further processing and checks the bean id "viewResolver" and contact the class to assign the appropriate view.
   then it finds the .jsp view file called "HelloPage" to the front controller 
   -> finally the front controller sends the response to the client as html page.
 */

@Controller
@RequestMapping("/greet")  //if we put @RequestMapping("/greet") at class level, it will say "Resorce not available" unless we write like .....greet/welcome.
public class HelloController  { //since it has more than one @RequestMapping methods, this class is called multi-action controller class

	@RequestMapping("/welcome1/{country}/{username}") // if we put any value inside curly brace, it means we can replace it.
	protected ModelAndView methodOne(@PathVariable("username") String name, @PathVariable("country") String country) throws Exception {
		//the @PathVariable annotation is used to bind the input from users to the String variable.
		ModelAndView mv = new ModelAndView("HelloPage");
		mv.addObject("welcomeMessage", "Hello "+name+" Welcome to our First page from "+ country);
		
		
		return mv;
	}
	@RequestMapping("/welcome2/{country}/{username}") 
	protected ModelAndView methodTwo(@PathVariable Map<String,String> pathvar) {
		//the @PathVariable annotation is used to provide the input from users to the String variable.
		String name = pathvar.get("username");
		String country = pathvar.get("country");
		ModelAndView mv = new ModelAndView("HelloPage");
		mv.addObject("welcomeMessage", "Hello "+name+" Welcome to our First page from "+ country);
		
		
		return mv;
	}
	
	

	
}
