# api-with-springboot-kotlin-marketplace-credit-card-service

# Arquitetura do projeto
<h1 align="center">
    <img alt="EColeta - Seu marketplace de credit cards." src="" />
</h1>

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
    "code_analysis_credit": "9a28b8e2-1f5f-44f3-87ec-7f7034436408",
    "client": {
        "document": "12345678901",
        "document_type": "CPF",
        "full_name": "gisiona costa",
        "email": "gisiona@gisiona.com.br",
        "whatsapp": "11979510575"
    },
    "monthly_income_value": 10000.0,
    "cards": [
        {
            "code_card": "1d3acf81-bd04-40c2-a258-2217e713b413",
            "flag_card": "VISA"
        },
        {
            "code_card": "c9dbb757-ec67-4092-b383-8eb595356321",
            "flag_card": "MASTERCARD"
        }
    ],
    "status_analysis_credit": "EM_ANALISE"
}
```**