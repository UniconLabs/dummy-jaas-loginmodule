# dummy-jaas-loginmodule
A super dumb Jaas login module that welcomes all credentials. 

## Build

```bash
mvn clean package
```

Grab the jar from the `target` directory and put it into `WEB-INF/lib` of the application.

## Config

```
UserPassAuth {
    net.unicon.authn.jaas.SimpleLoginModule required;
};
```
