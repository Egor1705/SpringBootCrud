package by.bsu.application.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import by.bsu.application.models.Student;
import by.bsu.application.repo.StudentRepository;
import by.bsu.application.services.StudentService;

@Controller
@RequestMapping("/students/")
public class MainController {

	private final StudentRepository studentRepository;

	 @Autowired
	    public MainController(StudentRepository studentRepository) {
	        this.studentRepository = studentRepository;
	    }

//	@RequestMapping("students/list")
//	public String list(Model model) {
//		model.addAttribute("students", studentService.listAllStudents());
//		return "students";
//	}
	
	@RequestMapping("list")
	public String showUpdateForm(Model model) {
		model.addAttribute("students", studentRepository.findAll());
		return "students";
	}
	
	@RequestMapping("add")
	public String addStudent(@Valid Student student, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "add-student";
		}

		studentRepository.save(student);
		return "redirect:list";
	}
	
	
	 @RequestMapping("update/{id}")
	    public String updateStudent(@PathVariable("id") long id, @Valid Student student, BindingResult result,
	        Model model) {
	        if (result.hasErrors()) {
	            student.setId(id);
	            return "update-student";
	        }

	        studentRepository.save(student);
	        model.addAttribute("students", studentRepository.findAll());
	        return "students";
	    }

//	@RequestMapping(value = "students/create",method = RequestMethod.POST)
//	public String newStudent(@RequestParam("firstname") String firstname,
//			@RequestParam("surname") String surname,@RequestParam("score") double score,Model model) {
//		Student st = new Student();
//		st.setFirstName(firstname);
//		st.setSurname(surname);
//		st.setAverageScore(score);
//		studentService.saveStudent(st);
//	
//		
//		return "studentForm";
//	}
//
//	@RequestMapping("/delete/{id}")
//	public String deleteUser(@PathVariable("id") int id, Model model) {
//		studentService.deleteStudent(id);
//		model.addAttribute("students", studentService.listAllStudents());
//		return "studentDelete";
//	}
//
//	 @RequestMapping("students/{id}")
//	 public String showStudent(@PathVariable Integer id, Model model) {
//	 model.addAttribute("students", studentService.getStudentById(id));
//	 return "studentshow";
//	 }
//
//	 @RequestMapping(value = "student", method = RequestMethod.POST)
//	 public String saveStudent(Student student) {
//	 studentService.saveStudent(student);
//	 return "redirect:/student/" + student.getId();
//	 }

}
