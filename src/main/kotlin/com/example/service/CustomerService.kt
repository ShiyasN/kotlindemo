package com.example.service

import com.example.models.db.CustomerEntity
import com.example.models.out.Customer
import com.example.repository.CustomerRepository
import com.example.repository.CustomerRepository1
import java.util.stream.Collectors
import javax.inject.Inject

class CustomerService(@Inject var customerRepository: CustomerRepository? = null,
                      @Inject var customerRepository1: CustomerRepository1? = null
) {

    fun getCustomers(): List<Customer>? {
        var customerEntity: MutableList<CustomerEntity>? = customerRepository?.findAll() as MutableList<CustomerEntity>?
        return customerEntity?.asSequence()?.map {customerEntity -> Customer(customerEntity)}?.toList()
    }

    fun getCustomer(customerId: Long): Customer? {
        val customerEntity = customerRepository?.findByCustomerId(customerId) as CustomerEntity
        return Customer(customerEntity)
    }


}