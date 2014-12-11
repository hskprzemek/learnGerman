package learn.german.controller;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.enterprise.inject.Produces;
import javax.faces.bean.SessionScoped;
import javax.inject.Named;

import learn.german.dto.LoginForm;

@Model
@SessionScoped
public class LoginController {

    private boolean loggedIn = false;

    private LoginForm login;

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

        System.out.println(login.getUser());
        return "";
    }

}
