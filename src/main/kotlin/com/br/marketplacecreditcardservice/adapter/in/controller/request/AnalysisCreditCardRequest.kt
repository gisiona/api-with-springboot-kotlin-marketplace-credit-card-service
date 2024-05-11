package com.br.marketplacecreditcardservice.adapter.`in`.controller.request

import com.fasterxml.jackson.annotation.JsonProperty
import lombok.Builder
import lombok.Data

@Builder @Data
data class AnalysisCreditCardRequest(
    @JsonProperty("client")
    val clientCreditCardRequest: ClientCreditCard,

    @JsonProperty("monthly_income_value")
    val rendaMensal: Double)