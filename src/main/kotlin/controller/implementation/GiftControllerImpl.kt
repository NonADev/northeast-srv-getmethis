package getmethis.kotlin.controller.implementation

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.lang.IllegalArgumentException

@RestController
@RequestMapping("/gift")
class GiftControllerImpl : GiftController {

    @GetMapping
    override fun searchGift(@RequestParam(name = "userId", defaultValue = "-1") userId: Int) : ResponseEntity<Any> {
//        try {
//            throw IllegalArgumentException("asdqweqweqewqweqweeqwe");
//        } catch (e: Exception) {
//            throw e
//        }

        return ResponseEntity("asdasdasd", HttpStatus.BAD_REQUEST)
    }

    //@ExceptionHandler
    fun handleIllegalStateException(ex: IllegalStateException): ResponseEntity<ErrorMessageModel> {

        val errorMessage = ErrorMessageModel(
            HttpStatus.NOT_FOUND.value(),
            ex.message
        )
        return ResponseEntity(errorMessage, HttpStatus.BAD_REQUEST)
    }
}