package com.example

import com.example.models.db.CustomerEntity
import com.example.models.out.Customer
import com.example.repository.CustomerRepository
import com.example.repository.CustomerRepository1
import com.example.service.CustomerService
import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe
import io.micronaut.test.extensions.kotest.annotation.MicronautTest
import io.mockk.every
import io.mockk.mockk

@MicronautTest
class CustomerControllerTest : ShouldSpec({
    print("Inside test")
    val customerRepository = mockk<CustomerRepository>()
    val customerRepository1 = mockk<CustomerRepository1>()
    print("Inside test11")
    val customerService = CustomerService(customerRepository, customerRepository1)
    print("Inside test222")
    context("get cusrtomers") {
        should("get all customers") {
            val customerList = listOf<Customer> (
                Customer(1, "test", "test", "test", "test", "test", "test", "test"),
                Customer(2, "test", "test", "test", "test", "test", "test", "test")
            )
            print("before ***")
            every { customerRepository1.findAll() }.returns(customerList)
            print("after ****")
            customerService.getCustomers1() shouldBe customerList
        }
    }
})