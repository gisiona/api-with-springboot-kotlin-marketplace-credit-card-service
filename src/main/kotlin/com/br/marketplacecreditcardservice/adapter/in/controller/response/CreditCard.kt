package com.br.marketplacecreditcardservice.adapter.`in`.controller.response

import com.fasterxml.jackson.annotation.JsonProperty
import lombok.Builder
import lombok.Data

@Builder @Data
data class CreditCard (
    @JsonProperty("code_card")
    val code: String,
    @JsonProperty("flag_card")
    val flagCard: FlagCard
)