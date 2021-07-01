package sharing.service;

import sharing.lib.exception.AuthenticationException;
import sharing.model.Driver;

public interface AuthenticationService {
    Driver login(String login, String password)
            throws AuthenticationException;
}
