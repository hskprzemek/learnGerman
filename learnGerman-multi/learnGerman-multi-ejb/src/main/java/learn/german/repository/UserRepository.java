package learn.german.repository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import learn.german.model.User;
import learn.german.service.UserService;

@ApplicationScoped
public class UserRepository {

    @Inject
    EntityManager entityManager;
    
    public boolean loginUser(String userLogin, String pass) {
        Query createNamedQuery = entityManager.createNamedQuery("checkCredentials");
        createNamedQuery.setParameter("login", userLogin);
        createNamedQuery.setParameter("password", pass);
        return createNamedQuery.getResultList().size() > 0;
    }

    public User getUser(String login) {
        Query createNamedQuery = entityManager.createNamedQuery("findByLogin");
        createNamedQuery.setParameter("login", login);
        return (User) createNamedQuery.getSingleResult();
    }
    
}
