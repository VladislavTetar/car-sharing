package sharing.service;

import java.util.Optional;
import sharing.dao.DriverDao;
import sharing.lib.Injector;
import sharing.lib.Service;
import sharing.lib.exception.AuthenticationException;
import sharing.model.Driver;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {
    private static final Injector injector = Injector.getInstance("sharing");
    private DriverDao driverDao =
            (DriverDao) injector.getInstance(DriverDao.class);

    @Override
    public Driver login(String login, String password) throws AuthenticationException {
        Optional<Driver> driver = driverDao.findByLogin(login);
        if (driver.isEmpty()) {
            throw new AuthenticationException("Login or password was incorrect");
        }
        if (driver.get().getPassword().equals(password)) {
            return driver.get();
        }
        throw new AuthenticationException("Login or password was incorrect");
    }
}
