/**
 * Append-only XP ledger. HUMAN ZONE for XpLedgerConsumer*: Eric writes the Kafka consumer.
 * <p>
 * Layer: infrastructure. Adapters: REST controllers, JPA repositories, Kafka producers/consumers.
 * Light hexagonal architecture: domain does not depend on infrastructure, never the other way round.
 */
package dev.ericcampos.newhorizons.ledger.infrastructure;
