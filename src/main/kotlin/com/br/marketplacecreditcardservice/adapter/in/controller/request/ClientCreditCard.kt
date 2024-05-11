package com.br.marketplacecreditcardservice.adapter.`in`.controller.request

import com.fasterxml.jackson.annotation.JsonProperty
import lombok.Builder
import lombok.Data

@Builder @Data
data class ClientCreditCard(
    @JsonProperty("document")
    val document: String,

    @JsonProperty("document_type")
    val documentType: DocumentType,

    @JsonProperty("full_name")
    val nomeCompleto: String,

    @JsonProperty("email")
    val email: String,

    @JsonProperty("whatsapp")
    val telefoneCelular: String
)