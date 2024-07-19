package com.filochowski.filosoft

import java.util.UUID

data class HouseId(val id: Long) {
    init {
        check(id > 0) { "Invalid id value $id" }
    }
}
data class EventId(val id: UUID)
