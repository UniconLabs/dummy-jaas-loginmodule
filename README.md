# dummy-jaas-loginmodule

A collection of super dumb Jaas login modules that welcomes all credentials of all shapes, sizes and colors. 

## Build

```bash
./mvnw[.bat] clean package
```

Grab the jar from the `target` directory and put it into `WEB-INF/lib` of the application.

## Config

- Accepts any username/password as credentials

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
