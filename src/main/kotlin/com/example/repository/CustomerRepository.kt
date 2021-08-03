package com.example.repository

import com.example.models.db.CustomerEntity
import io.micronaut.data.jdbc.annotation.JdbcRepository
import io.micronaut.data.model.query.builder.sql.Dialect
import io.micronaut.data.repository.CrudRepository


@JdbcRepository(dialect = Dialect.ORACLE)
interface CustomerRepository: CrudRepository<CustomerEntity, Long> {

    override fun findAll(): MutableIterable<CustomerEntity>?

    fun findByCustomerId(customerId: Long): CustomerEntity
}