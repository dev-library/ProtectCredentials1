package devrary.wild.ProtectCredentials1.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class CredentialLoader {

    @Value("${db.endpoint}")
    private String endPoint;

    @Value("${db.username}")
    private String userName;

    @Value("${db.password}")
    private String password;

}
