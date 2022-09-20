package mongoDB.servermongoDB.controllers;

import mongoDB.servermongoDB.Dao.StudentRepository;
import mongoDB.servermongoDB.models.Adress;
import mongoDB.servermongoDB.models.Gender;
import mongoDB.servermongoDB.models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;


@RestController
@RequestMapping("/")
public class StudentController {

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    MongoTemplate mongoTemplate;

    @RequestMapping("add")
    public void AddStudent() {

        Adress adress = new Adress("Spain", "Madrid", "22222");

        ArrayList<String> favoriteSubjects = new ArrayList<>();
        favoriteSubjects.add("math");
        favoriteSubjects.add("física");

        String email = "jaime_otro2@email.com";
        Student student = new Student(
                "Jaime",
                "Higueras",
                email,
                Gender.MALE,
                adress,
                favoriteSubjects,
                BigDecimal.TEN,
                LocalDateTime.now()
        );
        //Check if already exit email

        //usingMongoTemplateAndQuery(email);

        if(studentRepository.findStudentByEmail(email).isPresent()){
            System.out.println("Email already registered");
        }else {
            studentRepository.insert(student);
        }

    }

    private void usingMongoTemplateAndQuery(String email) {
        Query query = new Query();
        query.addCriteria(Criteria.where("email").is(email));

        List<Student> studentList = mongoTemplate.find(query,Student.class); //Return list

        if(studentList.size() >= 1){
            System.out.println("Etro aquí");
            throw new IllegalStateException("Found many student with email" + email);
        }
    }

}
