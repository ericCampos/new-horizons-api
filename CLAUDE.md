# CLAUDE.md: new-horizons-api

Backend of New Horizons (Java 21, Spring Boot 4.1, Maven). It is a **learning project**: the tutor rules,
the plan and the lessons live in the parent study repo (`../CLAUDE.md`). If you were opened here directly,
read `../CLAUDE.md` first.

## Commands
- Dev infra: `scripts/dev-up.sh` (Postgres 127.0.0.1:5434, Kafka 127.0.0.1:9094; credentials in `.env`, never print them)
- Run: `./mvnw spring-boot:run` → http://127.0.0.1:8940 (Swagger at `/swagger-ui/index.html` from day 3)
- Tests: `./mvnw test` (unit) · `./mvnw verify` (all; `*IT` integration tests run with failsafe, added on day 2 in lesson 2.3; Testcontainers needs Docker)
- Authorship KPI: `scripts/authorship.sh`

## Conventions
- Package `dev.ericcampos.newhorizons`, one package per module (`track`, `module`, `tramo`, `review`, `ledger`),
  each with `domain` / `application` / `infrastructure` (light hexagonal: domain never imports infrastructure).
- Schema only through Flyway (`src/main/resources/db/migration/V<n>__<name>.sql`); Hibernate `ddl-auto: validate`.
- Errors as `ProblemDetail` (RFC 9457). Write endpoints accept `Idempotency-Key`.
- Code, comments and commits in **English**. Comments explain **why**, for someone learning.
- **Human zones** (`.claude/human-zones.txt`): Eric writes them; hooks block Claude there. Leave `TODO(human)` elsewhere.
- Spring Boot 4.1 gotchas: modular starters (`spring-boot-starter-webmvc`), Jackson 3 (`tools.jackson.*`),
  Testcontainers 2 packages (`org.testcontainers.postgresql.*`). Security is open on purpose until day 3.
