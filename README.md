# evalieu-api

## APIs

### Portfolio
./gradlew :portfolio:build

curl http://localhost:8080/api/projects

curl -X POST http://localhost:8080/api/projects \
-H "Content-Type: application/json" \
-d '{"name": "My Project", "description": "A sample project"}'

The H2 console is also available at http://localhost:8080/h2-console for database inspection during development.

### Newsletter