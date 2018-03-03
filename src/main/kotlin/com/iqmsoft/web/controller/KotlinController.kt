package com.iqmsoft.web.controller

import com.iqmsoft.web.beans.Person
import com.iqmsoft.web.service.KotlinService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class KotlinController {
    @Autowired
    private var kotlinService: KotlinService? = null

    @Autowired
    private var person: Person? = null

    @RequestMapping("/kotlin")
    fun home() = mapOf("kotlin" to kotlinService?.kotlin(), "map" to kotlinService?.map(), "person" to person)
}