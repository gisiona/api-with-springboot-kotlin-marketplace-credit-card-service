package com.br.marketplacecreditcardservice.adapter.`in`.controller

import com.br.marketplacecreditcardservice.adapter.`in`.controller.request.AnalysisCreditCardRequest
import com.br.marketplacecreditcardservice.adapter.`in`.controller.request.ClientCreditCard
import com.br.marketplacecreditcardservice.adapter.`in`.controller.response.*
import io.micrometer.core.instrument.MeterRegistry
import io.micrometer.core.instrument.Metrics
import lombok.extern.slf4j.Slf4j
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController
import java.util.Arrays
import java.util.UUID

@Slf4j
@RestController
@RequestMapping("/credits-card/v1/analysis")
class AnalysisCreditCardController (meter : MeterRegistry){



    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping()
    fun analysisCredit(
        @RequestBody analysisCredit: AnalysisCreditCardRequest
    ): ResponseEntity<*>? {
        Metrics.counter("request_count", "document_type", analysisCredit.clientCreditCardRequest.documentType.toString())

       val response = AnalysisCreditCardResponse(
           codigo = UUID.randomUUID().toString(),
           clientCreditCardResponse = ClientCreditCard (
               documentType = analysisCredit.clientCreditCardRequest.documentType,
               document = analysisCredit.clientCreditCardRequest.document,
               nomeCompleto = analysisCredit.clientCreditCardRequest.nomeCompleto,
               email = analysisCredit.clientCreditCardRequest.email,
               telefoneCelular = analysisCredit.clientCreditCardRequest.telefoneCelular
           ),
           rendaMensal = analysisCredit.rendaMensal,
           creditCard = Arrays.asList(
               CreditCard(
                   code = UUID.randomUUID().toString(),
                   flagCard = FlagCard.VISA,
                   statusAnalysisCredit = StatusAnalysisCredit.EM_ANALYSIS,
                   valueAproved = 5000.00
               ),
               CreditCard(
                   code = UUID.randomUUID().toString(),
                   flagCard = FlagCard.MASTERCARD,
                   statusAnalysisCredit = StatusAnalysisCredit.APPROVED,
                   valueAproved = 3000.00
               )
           )
       )

        return ResponseEntity<AnalysisCreditCardResponse>(response, HttpStatus.CREATED)
    }


    @GetMapping("/health")
    fun health(): ResponseEntity<*>? {
        return ResponseEntity.ok("200 OK")
    }
}