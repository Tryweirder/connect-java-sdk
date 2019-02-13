
# OrderFulfillment

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) | The type of the fulfillment. |  [optional]
**state** | [**StateEnum**](#StateEnum) | The state of the fulfillment. |  [optional]
**pickupDetails** | [**OrderFulfillmentPickupDetails**](OrderFulfillmentPickupDetails.md) | Contains pickup-specific details. Required when fulfillment type is &#x60;PICKUP&#x60;. |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
PICKUP | &quot;PICKUP&quot;


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
PROPOSED | &quot;PROPOSED&quot;
RESERVED | &quot;RESERVED&quot;
PREPARED | &quot;PREPARED&quot;
COMPLETED | &quot;COMPLETED&quot;
CANCELED | &quot;CANCELED&quot;
FAILED | &quot;FAILED&quot;


