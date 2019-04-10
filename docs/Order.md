
# Order

### Description

Contains all information related to a single order to process with Square, including line items that specify the products to purchase

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The order&#39;s unique ID.  This value is only present for Order objects created by the Orders API through the [CreateOrder](#endpoint-orders-createorder) endpoint. |  [optional]
**locationId** | **String** | The ID of the merchant location this order is associated with. | 
**referenceId** | **String** | A client specified identifier to associate an entity in another system with this order. |  [optional]
**source** | [**OrderSource**](OrderSource.md) | The origination details of the order. |  [optional]
**lineItems** | [**List&lt;OrderLineItem&gt;**](OrderLineItem.md) | The line items included in the order. |  [optional]
**taxes** | [**List&lt;OrderLineItemTax&gt;**](OrderLineItemTax.md) | A list of taxes applied to this order. On read or retrieve, this list includes both order-level and item-level taxes. When creating an Order, set your order-level taxes in this list. |  [optional]
**discounts** | [**List&lt;OrderLineItemDiscount&gt;**](OrderLineItemDiscount.md) | A list of discounts applied to this order. On read or retrieve, this list includes both order-level and item-level discounts. When creating an Order, set your order-level discounts in this list. |  [optional]
**fulfillments** | [**List&lt;OrderFulfillment&gt;**](OrderFulfillment.md) | Details on order fulfillment.  Orders can only be created with at most one fulfillment. However, orders returned by the API may contain multiple fulfillments. |  [optional]
**totalMoney** | [**Money**](Money.md) | The total amount of money to collect for the order. |  [optional]
**totalTaxMoney** | [**Money**](Money.md) | The total tax amount of money to collect for the order. |  [optional]
**totalDiscountMoney** | [**Money**](Money.md) | The total discount amount of money to collect for the order. |  [optional]



