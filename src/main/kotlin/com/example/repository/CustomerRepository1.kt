package com.example.repository

import com.example.models.out.Customer
import io.micronaut.data.repository.CrudRepository

interface CustomerRepository1: CrudRepository<Customer, Long> {

}