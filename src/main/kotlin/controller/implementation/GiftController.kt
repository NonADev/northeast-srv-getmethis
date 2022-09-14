package getmethis.kotlin.controller.implementation

import org.springframework.http.ResponseEntity

interface  GiftController {
    fun searchGift(userId: Int) : ResponseEntity<Any>;
}