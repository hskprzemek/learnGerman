package learn.german.controller;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.enterprise.inject.Model;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;

import learn.german.dto.LoginForm;
import learn.german.model.User;
import learn.german.repository.UserRepository;

@Model
@SessionScoped
public class LoginController implements Serializable{

    private boolean loggedIn = false;

    private LoginForm login;

    private User loggedInUser; 

    public User getLoggedInUser() {
        return loggedInUser;
    }

    public void setLoggedInUser(User loggedInUser) {
        this.loggedInUser = loggedInUser;
    }
    
    
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
            loggedInUser = userRepository.getUser(login.getUser());
            loggedIn = true;
            return "index";
        }
        return "";
    }

}
