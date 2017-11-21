# Sample Akka-HTTP, Maven setup
RESTful API template using Scala, Maven and Akka-HTTP.

## Notes
- Tests can be run individually by IntelliJ
- Builds a fat jar using Maven Shade.
- Does not require a web server to run
- High performance

# Running from the Terminal
```bash
mvn clean package
java -jar target/myproject-{version}-allinone.jar
```

Navigate to http://localhost:8080/health
