package com.br.marketplacecreditcardservice.adapter.`in`.controller

import com.br.marketplacecreditcardservice.adapter.`in`.controller.request.FormalizationCreditCardRequest
import com.br.marketplacecreditcardservice.adapter.`in`.controller.response.FormalizationCreditCardResponse
import com.br.marketplacecreditcardservice.adapter.`in`.controller.response.StatusAnalysisCredit
import io.micrometer.core.instrument.MeterRegistry
import io.micrometer.core.instrument.Metrics
import lombok.extern.slf4j.Slf4j
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDateTime
import java.util.UUID


@Slf4j
@RestController
@RequestMapping("/credits-card/v1/formalization-contract")
class FormalizationCreditCardController (meter : MeterRegistry){

    @PutMapping
    fun formalizationContractCard(
        @RequestBody formalizationCredit: FormalizationCreditCardRequest
    ): ResponseEntity<FormalizationCreditCardResponse>? {
        Metrics.counter("request_formalization", "tag_name", "A")
        println(formalizationCredit)

        var response = FormalizationCreditCardResponse (
            codeCard = formalizationCredit.codeCard,
            codeAnalysisCredit = formalizationCredit.codeAnalysisCredit,
            codeFormalizationCreditCard = UUID.randomUUID().toString(),
            formalizationAt = LocalDateTime.now(),
            statusFormalizedCreditCard = StatusAnalysisCredit.FORMALIZED
        )
        return ResponseEntity.ok(response)
    }
}