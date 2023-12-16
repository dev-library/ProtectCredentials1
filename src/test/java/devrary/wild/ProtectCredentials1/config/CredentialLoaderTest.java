package devrary.wild.ProtectCredentials1.config;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CredentialLoaderTest {

    @Autowired
    CredentialLoader credentialLoader;

    @Test
    @DisplayName("프로퍼티 값을 필드값으로 잘 주입해주는지 확인한다.")
    public void valueCheck(){
        final String ENDPOINT = "jdbc:mysql://database-2.cm0ukadjuhtr.ap-northeast-2.rds.amazonaws.com:3306/schema";
        final String USERNAME = "root";
        final String PASSWORD = "asdf1234";
        assertEquals(ENDPOINT, credentialLoader.getEndPoint());
        assertEquals(USERNAME, credentialLoader.getUserName());
        assertEquals(PASSWORD, credentialLoader.getPassword());
    }
}