package tn.esprit.studentmanagement;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import tn.esprit.studentmanagement.entities.Student;
import tn.esprit.studentmanagement.services.StudentService;
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
