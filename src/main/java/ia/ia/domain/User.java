package ia.ia.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor
@Document
public class User {
    @Id
    String id;
    String username;
    String email;
    String password;


}
