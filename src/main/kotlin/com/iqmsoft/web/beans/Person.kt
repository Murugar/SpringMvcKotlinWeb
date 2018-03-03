package com.iqmsoft.web.beans

import org.springframework.stereotype.Component


@Component
data class Person(var name: String? = "test", var id: Int? = 1)
