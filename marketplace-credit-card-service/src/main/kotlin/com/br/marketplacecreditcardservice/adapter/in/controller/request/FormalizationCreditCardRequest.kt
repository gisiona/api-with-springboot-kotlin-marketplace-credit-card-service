package com.br.marketplacecreditcardservice.adapter.`in`.controller.request

import com.fasterxml.jackson.annotation.JsonProperty
import lombok.Builder
import lombok.Data

@Builder @Data
data class FormalizationCreditCardRequest(
    @JsonProperty("document")
    val document: String,

    @JsonProperty("address_correspondence")
    val address: Address,

    @JsonProperty("code_analysis_credit")
    val codeAnalysisCredit: String,

    @JsonProperty("card_card")
    var codeCard: String,
)