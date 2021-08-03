package com.example.models.db

import io.micronaut.data.annotation.Id
import io.micronaut.data.annotation.MappedEntity
import io.micronaut.data.annotation.MappedProperty
import javax.validation.constraints.NotNull

@MappedEntity("customers")
data class CustomerEntity(
    @field:Id
    @MappedProperty("customer_id")
    var customerId: Long,
    @MappedProperty("customer_name")
    var name: String,
    @MappedProperty("phone_number")
    var phoneNo: String,
    @MappedProperty("city")
    var city: String?,
    @MappedProperty("email")
    var email: String,
    @MappedProperty("address")
    var address: String?,
    @MappedProperty("address_line1")
    var addressLine1: String?,
    @MappedProperty("address_line2")
    var addressLine2: String?
)