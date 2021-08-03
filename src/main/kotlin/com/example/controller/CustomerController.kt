package com.example.controller

import com.example.models.out.Customer
import com.example.service.CustomerService
import io.micronaut.http.HttpResponse
import io.micronaut.http.HttpStatus
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.*
import javax.inject.Inject

@Controller("/customer")
@Consumes("*/*")
class CustomerController {

    @Inject
    private var customerService: CustomerService? = null

    @Get("/")
    @Produces(MediaType.APPLICATION_JSON)
    fun getList(): HttpResponse<Any> {
        var customer: List<Customer>? = customerService?.getCustomers()
        val httpResponse: HttpResponse<Any>
        httpResponse = HttpResponse.status<Any>(HttpStatus.OK).body<Any>(customer)
        return httpResponse
    }


    @Get("/{customerId}")
    @Produces(MediaType.TEXT_PLAIN)
    fun getCustomer(@PathVariable customerId: Long): Customer? {
        return customerService?.getCustomer(customerId)
    }

}