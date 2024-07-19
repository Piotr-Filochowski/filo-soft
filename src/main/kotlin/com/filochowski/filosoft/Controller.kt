package com.filochowski.filosoft

import com.filochowski.filosoft.events.EventPublisher
import com.filochowski.filosoft.events.HouseForSaleEvent
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/houses")
class Controller(
    private val publisher: EventPublisher
) {


    @PostMapping("/sell")
    fun houseSoldEvent(@RequestBody requestDto: HouseSoldDto) {
        counter++
        publisher.publish(HouseForSaleEvent(HouseId(counter), this))
    }

    companion object {
        var counter: Long = 0
    }
}

data class HouseSoldDto(
    val id: Long
)