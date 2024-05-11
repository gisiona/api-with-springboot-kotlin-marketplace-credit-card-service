package com.br.marketplacecreditcardservice.adapter.`in`.controller

import com.br.marketplacecreditcardservice.adapter.`in`.controller.request.AnalysisCreditCardRequest
import com.br.marketplacecreditcardservice.adapter.`in`.controller.response.AnalysisCreditCardResponse
import com.br.marketplacecreditcardservice.adapter.`in`.controller.response.ClientCreditCard
import com.br.marketplacecreditcardservice.adapter.`in`.controller.response.CreditCard
import com.br.marketplacecreditcardservice.adapter.`in`.controller.response.FlagCard
import io.micrometer.core.instrument.MeterRegistry
import io.micrometer.core.instrument.Metrics
import lombok.extern.slf4j.Slf4j
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.Arrays
import java.util.UUID

@Slf4j
@RestController
@RequestMapping("/credits-card-analysis/v1")
class AnalysisCreditCardController (meter : MeterRegistry){

    @PostMapping
    fun analysisCredit(
        @RequestBody analysisCredit: AnalysisCreditCardRequest
    ): ResponseEntity<*>? {
        Metrics.counter("name_request_aproved", "tag_name", "A")

       val response = AnalysisCreditCardResponse(
           codigo = UUID.randomUUID().toString(),
           clientCreditCardResponse = ClientCreditCard(
               nomeCompleto = analysisCredit.clientCreditCardRequest.nomeCompleto,
               email = analysisCredit.clientCreditCardRequest.email,
               telefoneCelular = analysisCredit.clientCreditCardRequest.telefoneCelular
           ),
           rendaMensal = analysisCredit.rendaMensal,
           creditCard = Arrays.asList(
               CreditCard(
                   code = UUID.randomUUID().toString(),
                   flagCard = FlagCard.VISA
               ),
               CreditCard(
                   code = UUID.randomUUID().toString(),
                   flagCard = FlagCard.MASTERCARD
               )
           )
       )

        return ResponseEntity.ok().body(response)
    }


    @GetMapping("/health")
    fun health(): ResponseEntity<*>? {
        return ResponseEntity.ok("200 OK")
    }
}