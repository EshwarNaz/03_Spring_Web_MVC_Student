package in.eshwar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.eshwar.binding.Student;
import in.eshwar.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	StudentService service;

	@GetMapping("/")
	public String loadIndexPage(Model model) {
		Model(model);
		return "index";
	}

	private void Model(Model model) {
		model.addAttribute("Students", new Student());
		model.addAttribute("course", StudentService.getCources());
		model.addAttribute("Timmings", StudentService.getTimmings());
	}

	@PostMapping("/save")
	public String handleSubmitRequest(Student s, Model model) {
		boolean saveStudent = service.saveStudent(s);
		if (saveStudent) {
			model.addAttribute("msg", "Data Saved....");
		}
		Model(model);
		return "index";
	}

}
