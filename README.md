# New Horizons · api

A gamified spaced-repetition learning platform, built in 15 days while learning the stack.
Backend: Java 21 · Spring Boot 4.1 · PostgreSQL · Kafka · Flyway · Testcontainers.

> 🚧 Work in progress (Oct-Nov 2026). Full README, architecture diagram and ADRs land on day 15.

**How it is built:** Eric writes the human-zone code by hand (`.claude/human-zones.txt`, enforced by
Claude Code hooks); Claude Code acts as a tutor and writes the first instance of each pattern.
Authorship is measured, not claimed: `scripts/authorship.sh`.
