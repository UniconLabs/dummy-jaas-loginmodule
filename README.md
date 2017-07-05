# dummy-jaas-loginmodule
A super dumb Jaas login module that welcomes all credentials. 

## Build

```bash
mvn clean package
```

Grab the jar from the `target` directory and put it into `WEB-INF/lib` of the application.

## Config

- Accepts any username/password as credentials.

```
UserPassAuth {
    net.unicon.authn.jaas.SimpleLoginModule required;
};
```

- Username must equal password

```
UserPassAuth {
    net.unicon.authn.jaas.NotAsSimpleLoginModule required;
};
```
