package sharing.dao;

import java.util.Optional;
import sharing.model.Driver;

public interface DriverDao extends GenericDao<Driver> {
    Optional<Driver> findByLogin(String login);
}
