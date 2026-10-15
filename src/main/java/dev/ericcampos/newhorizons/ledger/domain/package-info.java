/**
 * Append-only XP ledger. HUMAN ZONE for XpLedgerConsumer*: Eric writes the Kafka consumer.
 * <p>
 * Layer: domain. Pure business rules: entities, value objects, ports. No Spring web or Kafka here.
 * Light hexagonal architecture: domain does not depend on infrastructure, never the other way round.
 */
package dev.ericcampos.newhorizons.ledger.domain;
