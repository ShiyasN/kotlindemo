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

    fun getCustomers1(): List<Customer>? {
        var customer = customerRepository1?.findAll()
        println("Cutomer1"+ customer)
        return customer as List<Customer>?
    }

    fun getCustomer(customerId: Long): Customer? {
        val customerEntity = customerRepository?.findByCustomerId(customerId) as CustomerEntity
        return Customer(customerEntity)
    }


}