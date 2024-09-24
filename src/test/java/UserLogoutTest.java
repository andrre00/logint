// Teste de Logout

import org.example.AuthService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserLogoutTest {

    private AuthService authService;

    @BeforeEach
    public void setUp() {
        authService = new AuthService();
    }

    @Test
    public void testLogout() {
        // Primeiro, fazer login
        authService.login("admin", "password");
        assertTrue(authService.isUserLoggedIn(), "Usuário deve estar logado antes do logout.");

        // Agora, testar o logout
        authService.logout();
        assertFalse(authService.isUserLoggedIn(), "Usuário deve ser deslogado após o logout.");
    }
}

