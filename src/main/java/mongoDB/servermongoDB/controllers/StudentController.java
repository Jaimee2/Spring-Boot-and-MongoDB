package mongoDB.servermongoDB.controllers;

import mongoDB.servermongoDB.Dao.StudentRepository;
import mongoDB.servermongoDB.models.Adress;
import mongoDB.servermongoDB.models.Gender;
import mongoDB.servermongoDB.models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.ArrayList;


@RestController
@RequestMapping("/")
public class StudentController {

    @Autowired
    StudentRepository studentRepository;

    @RequestMapping("add")
    public void AddStudent (){

        System.out.println("Entro");
        Adress adress = new Adress("Spain","Madrid", "22222");

        ArrayList<String> favoriteSubjects = new ArrayList<>();
        favoriteSubjects.add("math");

        Student student = new Student(
                "Jaime",
                "Higueras",
                "jaime@email.com",
                Gender.MALE,
                adress,
                favoriteSubjects,
                BigDecimal.TEN,
                LocalDateTime.now()
        );
        studentRepository.insert(student);
    }

}
