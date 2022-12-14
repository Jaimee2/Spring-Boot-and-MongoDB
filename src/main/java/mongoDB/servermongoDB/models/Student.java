package mongoDB.servermongoDB.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.List;

@Data
@Document
public class Student {

    @Id
    private String id;
    private String FirstName;
    private String LastName;
    @Indexed(unique = true)
    private String email;
    private Gender gender;
    private Adress adress;
    private List<String> favouriteSubjects;
    private BigDecimal totalSpentInBooks;
    private LocalDateTime created;

    public Student() {
        super();
    }

    public Student(String firstName, String lastName, String email, Gender gender, Adress adress, List<String> favouriteSubjects, BigDecimal totalSpentInBooks, LocalDateTime created) {
        FirstName = firstName;
        LastName = lastName;
        this.email = email;
        this.gender = gender;
        this.adress = adress;
        this.favouriteSubjects = favouriteSubjects;
        this.totalSpentInBooks = totalSpentInBooks;
        this.created = created;
    }
}
