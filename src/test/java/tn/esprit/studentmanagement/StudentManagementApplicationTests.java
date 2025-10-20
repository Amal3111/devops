package tn.esprit.studentmanagement;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import tn.esprit.studentmanagement.entities.Student;
import tn.esprit.studentmanagement.services.StudentService;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class StudentManagementApplicationTests {
    @Autowired
    private StudentService studentService;

    @Test
    public void testGetAllStudents() {
        List<Student> students = studentService.getAllStudents();
        assertThat(students).isNotEmpty();
    }
    @Test
    void contextLoads() {
    }
}