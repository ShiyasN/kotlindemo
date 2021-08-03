package com.example.models.db

import io.micronaut.data.annotation.Id
import io.micronaut.data.annotation.MappedEntity
import io.micronaut.data.annotation.MappedProperty
import javax.persistence.ManyToOne


@MappedEntity("accounts")
data class AccountEntity(
    @field:Id
    @MappedProperty("account_id")
    val accountId: Long?,
    @MappedProperty("account_type")
    private val accountType: String? ,
    @MappedProperty("branch")
    private val branch: String? ,
    @MappedProperty("branch_address")
    private val branchAddress: String? ,
    @MappedProperty("ifsc_code")
    private val ifscCode: String? ,
    @MappedProperty("micr_code")
    private val micrCode: String? ,
    @ManyToOne
    @MappedProperty("customer_id")
    private val customerEntity: CustomerEntity? 
)
