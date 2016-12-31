package javaCods;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import javax.validation.Valid;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/student")
public class StudentAdmissionController implements TransData {
	
	Students stud;
	@InitBinder
	public void dataBinder(WebDataBinder binder) {
		binder.setDisallowedFields("studentAddress.zip"); // if want not to
															// update a specific
															// field, you have
															// to setDisallowed
															// under the
															// @InitBinder

		SimpleDateFormat date = new SimpleDateFormat("yyyy**dd**mm");
		binder.registerCustomEditor(Date.class, "dob", new CustomDateEditor(date, false));
		binder.registerCustomEditor(String.class, "studentName", new StudentNameEditor()); // we
																							// can
																							// customize
																							// like
																							// this
																							// one.
																							// spring
																							// mvc
																							// execures
																							// this
																							// code
																							// before
																							// it
																							// binds
																							// the
																							// information.
		// CustomDateEditor is used to customize input date
		// CustomBooleanEditor is used to customize input Boolean
		// CustomIntegerEditor is used to customize input Integer etc
		// go to
		// "docs.spring.io/spring/docs/current/spring-framework-reference/html/validation.html"
		// for full list
	}

	@RequestMapping(value = "/AdmissionForm.html", method = RequestMethod.GET)
	public ModelAndView getAdmissionForm() {
		ModelAndView mv = new ModelAndView("AdmissionForm");

		return mv;

	}

	@ResponseBody
	@RequestMapping(value="/data", method=RequestMethod.GET)
	public ArrayList<Students> studentsList() {
		
		Address address = new Address();
		Address address1 = new Address();
		address.setCity("Asmara");
		address.setState("California");
		address1.setCity("Massawa");
		address1.setState("Texas");
		address1.setZip(94609);

		Students student = new Students();
		Students student1 = new Students();
		// Students student2 = new Students();
		student.setStudentName("Gerie1");
		student.setStudentAddress(address);
		student.setStudentHoppy("Music");
		student1.setStudentHoppy("Music");
		student1.setStudentAddress(address1);

		student1.setStudentName("Teshome");

		ArrayList<Students> list = new ArrayList<>();
		list.add(student);
		list.add(student1);

		return list;
	}

	@ModelAttribute
	public void addToAll(Model model) {
		model.addAttribute("msg", "Details Submitted by you");
		model.addAttribute("msg2", "Please insert the information Here");
		/*
		 * if the method has @ModelAttribute annotation, it can hold all the
		 * information you want as objects and you can call it in your html
		 * files.
		 */
	}

	/*
	 * @RequestMapping(value = "/submitAdmissionForm.html", method = RequestMethod.POST) 
	 * public ModelAndView sumitAdmissionForm(@RequestParam Map<String, String> map) { // @RequestParam(value="StudentName") 
	 * String name, // @RequestParam("StudentHoppy") String hoppy){ Students student =
	 * new Students(); student.setStudentName(map.get("StudentName"));
	 * student.setStudentHoppy(map.get("StudentHoppy"));
	 * 
	 * ModelAndView mv = new ModelAndView("AdmissionSuccess");
	 * mv.addObject("msg", "Details Submitted by you"); // : "+" Name: "+name+
	 * // ", "+" Hoppy: // "+hoppy); mv.addObject("student", student);
	 * 
	 * return mv; }
	 */
	/*
	 * @ModelAttribute annotation extracts data from the ModelAndView object and
	 * it binds with the specified (Students) class it replaces:
	 * 
	 * @RequestParam(value="StudentName") String name,
	 * 
	 * @RequestParam("StudentHoppy") String hoppy){ Students student = new
	 * Students(); student.setStudentName(map.get("StudentName"));
	 * student.setStudentHoppy(map.get("StudentHoppy"));
	 * 
	 * 
	 * mv.addObject("student", student);
	 */

	@RequestMapping(value = "/submitAdmissionForm.html", method = RequestMethod.POST)
	public ModelAndView sumitAdmissionForm(@Valid @ModelAttribute("student") Students student, BindingResult result) {

		//stud = student;
		
		if (result.hasErrors()) {
			ModelAndView mv = new ModelAndView("AdmissionForm");
			return mv;

		}
		//StoreData stor = new StoreData(student);

		ModelAndView mv = new ModelAndView("AdmissionSuccess");
		// mv.addObject("msg", "Details Submitt by you");

		mv.addObject("student", student);// this can be replaced by the method
											// "addToAll" with the
											// @ModelAtrribute annotation, but
											// this one has priority.

		return mv;
	}

	
	public Students sendData() {
		// TODO Auto-generated method stub
		return stud;
	}

	

	
	

	// we can use "defaultvalue" in this context if we want default value
	// instead of empty value. @RequestParam(value="StudentName",
	// defaultValue="Abrehat") String name

}
