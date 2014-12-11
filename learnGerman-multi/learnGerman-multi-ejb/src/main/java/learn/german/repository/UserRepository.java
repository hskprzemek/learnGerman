package learn.german.repository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

@ApplicationScoped
public class UserRepository {

    @Inject
    EntityManager entityManager;

    public boolean loginUser(String userLogin, String pass) {
        Query createNamedQuery = entityManager.createNamedQuery("checkCredentials");
        return createNamedQuery.getResultList().size() > 0;
    }
}
