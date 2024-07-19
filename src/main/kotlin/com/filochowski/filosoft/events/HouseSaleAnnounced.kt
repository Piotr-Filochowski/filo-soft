package com.filochowski.filosoft.events

import com.filochowski.filosoft.HouseId

data class HouseForSaleEvent(
    val houseId: HouseId,
    val ssource: Any
): Event(ssource)