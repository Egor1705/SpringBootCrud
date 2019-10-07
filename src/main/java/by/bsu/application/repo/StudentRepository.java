package by.bsu.application.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import by.bsu.application.models.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student,Integer> {

}
