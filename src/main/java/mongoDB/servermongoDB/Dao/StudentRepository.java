package mongoDB.servermongoDB.Dao;

import mongoDB.servermongoDB.models.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


public interface StudentRepository extends MongoRepository<Student,String> {
}
