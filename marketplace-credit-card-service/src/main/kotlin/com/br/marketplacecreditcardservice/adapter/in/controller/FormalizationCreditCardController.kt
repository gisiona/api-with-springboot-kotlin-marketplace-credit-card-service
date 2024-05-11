package com.br.marketplacecreditcardservice.adapter.`in`.controller

import com.br.marketplacecreditcardservice.adapter.`in`.controller.request.AnalysisCreditCardRequest
import io.micrometer.core.instrument.MeterRegistry
import io.micrometer.core.instrument.Metrics
import lombok.extern.slf4j.Slf4j
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@Slf4j
@RestController
@RequestMapping("/credits-card/v1/formalization")
class FormalizationCreditCardController (meter : MeterRegistry){

    @PostMapping
    fun analysisCredit(
        @RequestBody analysisCredit: AnalysisCreditCardRequest
    ): ResponseEntity<*>? {
        Metrics.counter("name_request_aproved", "tag_name", "A")
        return ResponseEntity.ok("200 OK")
    }

    @GetMapping("/health")
    fun health(): ResponseEntity<*>? {
        return ResponseEntity.ok("200 OK")
    }
}