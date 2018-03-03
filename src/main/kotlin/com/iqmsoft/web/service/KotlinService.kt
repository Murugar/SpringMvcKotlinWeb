package com.iqmsoft.web.service

import org.springframework.stereotype.Service


@Service
class KotlinService {
    fun kotlin() = "kotlin"

    fun map() = mapOf("one" to 1, "two" to 2, "three" to 3)
}
