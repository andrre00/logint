// Teste de Login com Credenciais Inválidas

import org.example.AuthService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class UserAuthenticationTest {

    private AuthService authService;

    @BeforeEach
    public void setUp() {
        authService = new AuthService();
    }

    @Test
    public void testLoginInvalidCredentials() {
        boolean result = authService.login("admin", "wrongpassword");
        assertFalse(result, "Login deve falhar com credenciais inválidas.");
        assertFalse(authService.isUserLoggedIn(), "Usuário não deve estar logado após falha no login.");
    }
}
