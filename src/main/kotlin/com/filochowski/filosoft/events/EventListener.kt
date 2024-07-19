package com.filochowski.filosoft.events

import org.slf4j.LoggerFactory
import org.springframework.context.ApplicationListener
import org.springframework.stereotype.Component
import kotlin.time.times

@Component
class EventListener : ApplicationListener<HouseForSaleEvent> {


    override fun onApplicationEvent(event: HouseForSaleEvent) {
        Thread.sleep(random())
        logger.info("Received event $event")
    }

    private fun random(): Long {
        val milis = Math.random() * 1000
        return Math.round(milis)
    }


    companion object {
        private val logger = LoggerFactory.getLogger(EventListener::class.java)
    }
}