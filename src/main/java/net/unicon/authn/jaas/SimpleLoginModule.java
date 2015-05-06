package net.unicon.authn.jaas;

import javax.security.auth.Subject;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.login.LoginException;
import javax.security.auth.spi.LoginModule;
import java.util.Map;

/**
 * @author Misagh Moayyed
 */
public class SimpleLoginModule implements LoginModule {
    private Subject subject;
    private CallbackHandler callbackHandler;
    private Map<String, Object> sharedState;
    private Map<String, ?> options;

    private static final String USERNAME_KEY = "javax.security.auth.login.name";
    private static final String PASSWORD_KEY =
            "javax.security.auth.login.password";

    public void initialize(final Subject subject, final CallbackHandler callbackHandler, final Map<String, ?> sharedState, final Map<String, ?> options) {
        this.subject = subject;
        this.callbackHandler = callbackHandler;
        this.sharedState = (Map<String, Object>) sharedState;
        this.options = options;
    }

    public boolean login() throws LoginException {
        return true;
    }

    public boolean commit() throws LoginException {
        return true;
    }

    public boolean abort() throws LoginException {
        return true;
    }

    public boolean logout() throws LoginException {
        return true;
    }

}
