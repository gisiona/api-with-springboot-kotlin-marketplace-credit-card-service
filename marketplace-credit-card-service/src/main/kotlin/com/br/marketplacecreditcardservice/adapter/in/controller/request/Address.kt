package com.br.marketplacecreditcardservice.adapter.`in`.controller.request

import com.fasterxml.jackson.annotation.JsonProperty
import lombok.Builder
import lombok.Data

@Builder
@Data
data class Address (

    @JsonProperty("zip_code")
    val zipCode: String,

    @JsonProperty("patio_type")
    val patioType: PatioType,

    @JsonProperty("patio")
    private val patio: String,

    @JsonProperty("neighborhood")
    val neighborhood: String,

    @JsonProperty("city")
    val city: String,

    @JsonProperty("uf")
    val uf: String,

    @JsonProperty("number")
    val number: String,

    @JsonProperty("complement")
    val complement: String

)