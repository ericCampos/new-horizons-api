/**
 * Append-only XP ledger. HUMAN ZONE for XpLedgerConsumer*: Eric writes the Kafka consumer.
 * <p>
 * Layer: application. Use cases (services). Orchestrates domain + ports, owns @Transactional boundaries.
 * Light hexagonal architecture: domain does not depend on infrastructure, never the other way round.
 */
package dev.ericcampos.newhorizons.ledger.application;
