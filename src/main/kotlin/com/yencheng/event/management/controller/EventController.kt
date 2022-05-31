package com.yencheng.event.management.controller

import com.yencheng.event.management.model.response.Event
import com.yencheng.event.management.repository.EventRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDate
import java.time.LocalTime

@RestController
class EventController(
    val eventRepository: EventRepository
) {

    @GetMapping("/event")
    fun get(): Event {
        val eventId = 1
        val test = eventRepository.findById()

        return Event(
            1,
            "temp event",
            LocalDate.now(),
            LocalTime.now(),
            LocalTime.now().plusHours(3),
            Event.EventHolder(
                1,
                "yencheng",
                "Liu"
            )
        )
    }
}