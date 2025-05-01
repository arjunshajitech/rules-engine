# Taxi Fare Rule Engine

This is a Spring Boot application integrated with **Drools**, a Business Rule Management System (BRMS), to calculate taxi fares based on dynamic rules defined in `.drl` files in
``
resources/com.example.rules.engine``
---

### Clone and Run 🚀

```bash
git https://github.com/arjunshajitech/rules-engine.git
cd taxi-fare-rule-engine
````

```
curl --location 'http://localhost:8080/taxi-fare?distance=5&night=true'
```

```angular2html
curl --location 'http://localhost:8080/taxi-fare?distance=5&night=false'
```