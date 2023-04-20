package in.eshwar.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.eshwar.entity.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {

}
