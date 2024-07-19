package com.filochowski.filosoft.events

import com.filochowski.filosoft.EventId
import org.springframework.context.ApplicationEvent
import java.util.*

abstract class Event(
    eventSource: Any
): ApplicationEvent(eventSource) {
    val eventId: EventId = EventId(UUID.randomUUID())
    val createdAt: Date = Date()
}