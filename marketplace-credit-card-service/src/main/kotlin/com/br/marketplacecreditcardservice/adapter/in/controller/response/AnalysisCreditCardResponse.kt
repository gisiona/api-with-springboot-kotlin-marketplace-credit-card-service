package com.br.marketplacecreditcardservice.adapter.`in`.controller.response

import com.br.marketplacecreditcardservice.adapter.`in`.controller.request.ClientCreditCard
import com.fasterxml.jackson.annotation.JsonProperty
import lombok.Builder
import lombok.Data
import java.time.LocalDateTime

@Builder @Data
data class AnalysisCreditCardResponse(
    @JsonProperty("code_analysis_credit")
    val codigo: String,

    @JsonProperty("client")
    val clientCreditCardResponse: ClientCreditCard,

    @JsonProperty("monthly_income_value")
    val rendaMensal: Double,

    @JsonProperty("cards")
    var creditCard: MutableList<CreditCard> = ArrayList(),

    @JsonProperty("response_date")
    val dataProcessamento: LocalDateTime = LocalDateTime.now()
)