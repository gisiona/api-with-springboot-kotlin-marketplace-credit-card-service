# api-with-springboot-kotlin-marketplace-credit-card-service

# Arquitetura do projeto
<h1 align="center">
    <img alt="Desenho da arquitetura do sistema marketplace credit card." src="https://github.com/gisiona/api-with-springboot-kotlin-marketplace-credit-card-service/blob/main/marketplace-credit-card-service/desenho_arquitetura/desenho_de_arquitetura.png" />
</h1>

# Endpoints disponíveis nessa apirest:

### POST: - Create Analysis Credit Card
Endpoint: http://localhost:8080/credits-card/v1/analysis
* StatusCode Response: 201


Payload de Entrada API:
```json
{
  "client": {
    "document":"12345678901",
    "document_type":"CPF",
    "full_name": "gisiona costa",
    "email": "gisiona@gisiona.com.br",
    "whatsapp":"11979519457",
    "password": "123456"
  },
  "monthly_income_value": 10000
}
```

Payload de Saída API:
```json
{
  "code_analysis_credit": "a906931d-ca67-45ec-81c3-7415ba97c920",
  "client": {
    "document": "12345678901",
    "document_type": "CPF",
    "full_name": "gisiona costa",
    "email": "gisiona@gisiona.com.br",
    "whatsapp": "11979519457"
  },
  "monthly_income_value": 10000.0,
  "cards": [
    {
      "code_card": "47226824-b80d-4998-92cc-e1db6f11a3b5",
      "flag_card": "VISA",
      "value_approved": 5000.00,
      "status_analysis_credit": "APPROVED"
    },
    {
      "code_card": "440c3b89-8dc8-4d67-97b1-e56a27b202e6",
      "flag_card": "MASTERCARD",
      "value_approved": 5000.00,
      "status_analysis_credit": "EM_ANALYSIS"
    }
  ],
  "response_date": "2024-05-11T16:10:52.3698193"
}
```

### POST: - Formalization Contract Analysis Credit Card
Endpoint: http://localhost:8080/credits-card/v1/formalization-contract
* StatusCode Response: 200


Payload de Entrada API:
```json
{
  "document":"12345678901",
  "address_correspondence": {
    "zip_code":"12345678901",
    "patio_type":"RUA",
    "patio":"12345678901",
    "neighborhood":"12345678901",
    "city":"12345678901",
    "uf":"12345678901",
    "number":"12345678901",
    "complement":"12345678901"
  },
  "code_analysis_credit": "69b1a990-6660-43ed-b8be-8161b35a9bfd",
  "card_card":"e774668a-fdd6-43c9-bc7c-c6f9a4ed9c63"
}
```

Payload de Saída API:
```json
{
  "code_analysis_credit": "69b1a990-6660-43ed-b8be-8161b35a9bfd",
  "code_formalization_credit_card": "99732681-37e7-4a0f-b931-2e9e6add8419",
  "code_card": "e774668a-fdd6-43c9-bc7c-c6f9a4ed9c63",
  "formalization_date": "2024-06-09T13:37:26.7854125",
  "status_formalized_credit_card": "FORMALIZED"
}
```