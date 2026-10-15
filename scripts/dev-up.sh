#!/usr/bin/env bash
# Starts the local dev infrastructure (Postgres + Kafka) and waits until Postgres accepts connections.
set -euo pipefail
cd "$(dirname "$0")/.."
[ -f .env ] || { echo "Missing .env: copy .env.example to .env and set a password" >&2; exit 1; }
docker compose -f compose.dev.yml up -d
until docker exec nh-postgres pg_isready -q -d newhorizons; do sleep 1; done
echo "Postgres 127.0.0.1:5434 and Kafka 127.0.0.1:9094 are up."
