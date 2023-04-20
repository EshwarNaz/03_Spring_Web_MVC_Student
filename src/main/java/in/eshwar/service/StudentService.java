package in.eshwar.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.eshwar.binding.Student;
import in.eshwar.entity.StudentEntity;
import in.eshwar.repo.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository repo;

	public boolean saveStudent(Student s) {
		System.out.println(s);
		StudentEntity entity = new StudentEntity();
		BeanUtils.copyProperties(s, entity);
		entity.setTimings(Arrays.toString(s.getTimings()));
		System.out.println(entity);
		repo.save(entity);
		return true;
	}

	public static List<String> getCources() {
		return Arrays.asList("Dhoni", "Virat", "SKY", "Rohit", "Hardik");

	}

	public static List<String> getTimmings() {
		return Arrays.asList("Morning", "Noon", "Evining");
	}
}
