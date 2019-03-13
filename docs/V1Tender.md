
# V1Tender

### Description

A tender represents a discrete monetary exchange. Square represents this exchange as a money object with a specific currency and amount, where the amount is given in the smallest denomination of the given currency.  Square POS can accept more than one form of tender for a single payment (such as by splitting a bill between a credit card and a gift card). The `tender` field of the Payment object lists all forms of tender used for the payment.  Split tender payments behave slightly differently from single tender payments:  The receipt_url for a split tender corresponds only to the first tender listed in the tender field. To get the receipt URLs for the remaining tenders, use the receipt_url fields of the corresponding Tender objects.  *A note on gift cards**: when a customer purchases a Square gift card from a merchant, the merchant receives the full amount of the gift card in the associated payment.  When that gift card is used as a tender, the balance of the gift card is reduced and the merchant receives no funds. A `Tender` object with a type of `SQUARE_GIFT_CARD` indicates a gift card was used for some or all of the associated payment.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The tender&#39;s unique ID. |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | The type of tender. See [V1TenderType](#type-v1tendertype) for possible values |  [optional]
**name** | **String** | A human-readable description of the tender. |  [optional]
**employeeId** | **String** | The ID of the employee that processed the tender. |  [optional]
**receiptUrl** | **String** | The URL of the receipt for the tender. |  [optional]
**cardBrand** | [**CardBrandEnum**](#CardBrandEnum) | The brand of credit card provided. See [CardBrand](#type-cardbrand) for possible values |  [optional]
**panSuffix** | **String** | The last four digits of the provided credit card&#39;s account number. |  [optional]
**entryMethod** | [**EntryMethodEnum**](#EntryMethodEnum) | The tender&#39;s unique ID. See [V1TenderEntryMethod](#type-v1tenderentrymethod) for possible values |  [optional]
**paymentNote** | **String** | Notes entered by the merchant about the tender at the time of payment, if any. Typically only present for tender with the type: OTHER. |  [optional]
**totalMoney** | [**V1Money**](V1Money.md) | The total amount of money provided in this form of tender. |  [optional]
**tenderedMoney** | [**V1Money**](V1Money.md) | The amount of total_money applied to the payment. |  [optional]
**tenderedAt** | **String** | The time when the tender was created, in ISO 8601 format. |  [optional]
**settledAt** | **String** | The time when the tender was settled, in ISO 8601 format. |  [optional]
**changeBackMoney** | [**V1Money**](V1Money.md) | The amount of total_money returned to the buyer as change. |  [optional]
**refundedMoney** | [**V1Money**](V1Money.md) | The total of all refunds applied to this tender. This amount is always negative or zero. |  [optional]
**isExchange** | **Boolean** | Indicates whether or not the tender is associated with an exchange. If is_exchange is true, the tender represents the value of goods returned in an exchange not the actual money paid. The exchange value reduces the tender amounts needed to pay for items purchased in the exchange. |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
CREDIT_CARD | &quot;CREDIT_CARD&quot;
CASH | &quot;CASH&quot;
THIRD_PARTY_CARD | &quot;THIRD_PARTY_CARD&quot;
NO_SALE | &quot;NO_SALE&quot;
SQUARE_WALLET | &quot;SQUARE_WALLET&quot;
SQUARE_GIFT_CARD | &quot;SQUARE_GIFT_CARD&quot;
UNKNOWN | &quot;UNKNOWN&quot;
OTHER | &quot;OTHER&quot;


<a name="CardBrandEnum"></a>
## Enum: CardBrandEnum
Name | Value
---- | -----
OTHER_BRAND | &quot;OTHER_BRAND&quot;
VISA | &quot;VISA&quot;
MASTERCARD | &quot;MASTERCARD&quot;
AMERICAN_EXPRESS | &quot;AMERICAN_EXPRESS&quot;
DISCOVER | &quot;DISCOVER&quot;
DISCOVER_DINERS | &quot;DISCOVER_DINERS&quot;
JCB | &quot;JCB&quot;
CHINA_UNIONPAY | &quot;CHINA_UNIONPAY&quot;
SQUARE_GIFT_CARD | &quot;SQUARE_GIFT_CARD&quot;


<a name="EntryMethodEnum"></a>
## Enum: EntryMethodEnum
Name | Value
---- | -----
MANUAL | &quot;MANUAL&quot;
SCANNED | &quot;SCANNED&quot;
SQUARE_CASH | &quot;SQUARE_CASH&quot;
SQUARE_WALLET | &quot;SQUARE_WALLET&quot;
SWIPED | &quot;SWIPED&quot;
WEB_FORM | &quot;WEB_FORM&quot;
OTHER | &quot;OTHER&quot;



