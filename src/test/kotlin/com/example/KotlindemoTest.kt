package com.example
import io.kotest.core.spec.style.DescribeSpec
import io.micronaut.runtime.EmbeddedApplication
import io.micronaut.test.extensions.kotest.annotation.MicronautTest
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

@MicronautTest
class KotlindemoTest(private val application: EmbeddedApplication<*>): StringSpec({

})




