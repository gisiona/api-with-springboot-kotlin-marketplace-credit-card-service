package com.br.marketplacecreditcardservice.adapter.`in`.controller.request

import com.fasterxml.jackson.annotation.JsonProperty
import lombok.Builder
import lombok.Data

@Builder @Data
data class ClientCreditCard(
    @JsonProperty("full_name")
    val nomeCompleto: String,

    @JsonProperty("email")
    val email: String,

    @JsonProperty("whatsapp")
    val telefoneCelular: String
)