package getmethis.kotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class MainApplication

fun main() {
    runApplication<MainApplication>()
}