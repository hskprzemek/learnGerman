package learn.german.controller;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.enterprise.inject.Produces;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import learn.german.dto.LoginForm;
import learn.german.repository.UserRepository;

@Model
@SessionScoped
public class LoginController {

    private boolean loggedIn = false;

    private LoginForm login;

    @Inject
    private UserRepository userRepository;

    public boolean isLoggedIn() {
        return loggedIn;
    }

    public void setLoggedIn(boolean loggedIn) {
        this.loggedIn = loggedIn;
    }

    @Produces
    @Named
    public LoginForm getLogin() {
        return login;
    }

    @PostConstruct
    public void initBean() {
        login = new LoginForm();
    }

    public String logInToApp() {
        boolean successfulLogin = userRepository.loginUser(login.getUser(), login.getPass());
        if (successfulLogin) {
            loggedIn = true;
            return "index";
        }
        return "";
    }

}
