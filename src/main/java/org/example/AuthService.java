package org.example;

public class AuthService {
    private boolean loggedIn = false;

    public boolean login(String username, String password) {
        if (username.equals("admin") && password.equals("password")) {
            loggedIn = true;
            return true;
        }
        return false;
    }

    public void logout() {
        loggedIn = false;
    }

    public boolean isUserLoggedIn() {
        return loggedIn;
    }
}
