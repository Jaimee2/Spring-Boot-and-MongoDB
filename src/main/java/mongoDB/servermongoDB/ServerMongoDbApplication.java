package mongoDB.servermongoDB;

import mongoDB.servermongoDB.Dao.StudentRepository;
import mongoDB.servermongoDB.models.Adress;
import mongoDB.servermongoDB.models.Gender;
import mongoDB.servermongoDB.models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.ArrayList;

@SpringBootApplication
//@EnableMongoRepositories(basePackageClasses = StudentRepository.class)
public class ServerMongoDbApplication {


	public static void main(String[] args) {

		SpringApplication.run(ServerMongoDbApplication.class, args);

		System.out.println("Servidor con mongoDB Running !!!!!");
	}


}
