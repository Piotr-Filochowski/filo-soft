package com.filochowski.filosoft.events

import org.springframework.context.event.ApplicationEventMulticaster
import org.springframework.stereotype.Component

@Component
class EventPublisher(
    private val applicationEventMulticaster: ApplicationEventMulticaster
) {

    fun publish(houseForSaleEvent: HouseForSaleEvent) {
        applicationEventMulticaster.multicastEvent(houseForSaleEvent)
    }
}