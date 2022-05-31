package com.yencheng.event.management.repository

import com.yencheng.event.management.Tables.EVENTS
import com.yencheng.event.management.tables.records.EventsRecord
import org.jooq.DSLContext
import org.springframework.stereotype.Repository

@Repository
class EventRepository(
    val dsl: DSLContext
) {
    fun findById(): List<EventsRecord> {
        val query = dsl.selectQuery(EVENTS)
        query.addSelect(setOf(
            EVENTS.EVENT_ID
        ))
        return query.fetch()
    }
}