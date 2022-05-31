package com.yencheng.event.management.model.response

import java.time.LocalDate
import java.time.LocalTime

data class Event(
    val eventId: Int,
    val eventName: String,
    val eventDate: LocalDate,
    val eventStartTime: LocalTime,
    val eventEndTime: LocalTime,
    val eventHolder: EventHolder
) {
    data class EventHolder(
        val holderId: Int,
        val firstName: String,
        val lastName: String
    )
}
