package com.br.marketplacecreditcardservice.adapter.`in`.controller.response

import com.fasterxml.jackson.annotation.JsonProperty
import lombok.Builder
import lombok.Data
import java.time.LocalDateTime

@Builder @Data
data class FormalizationCreditCardResponse(
    @JsonProperty("code_analysis_credit")
    val codeAnalysisCredit: String,

    @JsonProperty("code_formalization_credit_card")
    val codeFormalizationCreditCard: String,

    @JsonProperty("code_card")
    val codeCard: String,

    @JsonProperty("formalization_date")
    val formalizationAt: LocalDateTime = LocalDateTime.now(),

    @JsonProperty("status_formalized_credit_card")
    val statusFormalizedCreditCard: StatusAnalysisCredit
)