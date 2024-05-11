# api-with-springboot-kotlin-marketplace-credit-card-service

# Arquitetura do projeto
<h1 align="center">
    <img alt="EColeta - Seu marketplace de credit cards." src="https://github.com/gisiona/api-with-springboot-kotlin-marketplace-credit-card-service/blob/main/desenho_arquitetura/desenho_de_arquitetura.png" />
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
      "flag_card": "VISA"
    },
    {
      "code_card": "440c3b89-8dc8-4d67-97b1-e56a27b202e6",
      "flag_card": "MASTERCARD"
    }
  ],
  "status_analysis_credit": "EM_ANALYSIS",
  "response_date": "2024-05-11T16:10:52.3698193"
}
```