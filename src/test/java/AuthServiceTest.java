// Teste de Login com Credenciais Válidas

import org.example.AuthService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AuthServiceTest {

    private AuthService authService;

    @BeforeEach
    public void setUp() {
        authService = new AuthService();
    }

    @Test
    public void testLoginValidCredentials() {
        boolean result = authService.login("admin", "password");
        assertTrue(result, "Login deve ser bem-sucedido com credenciais válidas.");
        assertTrue(authService.isUserLoggedIn(), "Usuário deve estar logado após login bem-sucedido.");
    }
}
