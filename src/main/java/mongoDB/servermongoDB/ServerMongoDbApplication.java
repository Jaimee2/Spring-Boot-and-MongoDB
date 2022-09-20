package mongoDB.servermongoDB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServerMongoDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerMongoDbApplication.class, args);
		System.out.println("Servidor con mongoDB Running !!!!!");
	}

}
