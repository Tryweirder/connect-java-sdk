# OrdersApi

All URIs are relative to *https://connect.squareup.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**batchRetrieveOrders**](OrdersApi.md#batchRetrieveOrders) | **POST** /v2/locations/{location_id}/orders/batch-retrieve | BatchRetrieveOrders
[**createOrder**](OrdersApi.md#createOrder) | **POST** /v2/locations/{location_id}/orders | CreateOrder
[**searchOrders**](OrdersApi.md#searchOrders) | **POST** /v2/orders/search | SearchOrders


<a name="batchRetrieveOrders"></a>
# **batchRetrieveOrders**
> BatchRetrieveOrdersResponse batchRetrieveOrders(locationId, body)

BatchRetrieveOrders

Retrieves a set of [Order](#type-order)s by their IDs.  If a given Order ID does not exist, the ID is ignored instead of generating an error.

### Example
```java
// Import classes:
//import com.squareup.connect.ApiClient;
//import com.squareup.connect.ApiException;
//import com.squareup.connect.Configuration;
//import com.squareup.connect.auth.*;
//import com.squareup.connect.api.OrdersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

OrdersApi apiInstance = new OrdersApi();
String locationId = "locationId_example"; // String | The ID of the orders' associated location.
BatchRetrieveOrdersRequest body = new BatchRetrieveOrdersRequest(); // BatchRetrieveOrdersRequest | An object containing the fields to POST for the request.  See the corresponding object definition for field details.
try {
    BatchRetrieveOrdersResponse result = apiInstance.batchRetrieveOrders(locationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrdersApi#batchRetrieveOrders");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationId** | **String**| The ID of the orders&#39; associated location. |
 **body** | [**BatchRetrieveOrdersRequest**](BatchRetrieveOrdersRequest.md)| An object containing the fields to POST for the request.  See the corresponding object definition for field details. |

### Return type

[**BatchRetrieveOrdersResponse**](BatchRetrieveOrdersResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createOrder"></a>
# **createOrder**
> CreateOrderResponse createOrder(locationId, body)

CreateOrder

Creates an [Order](#type-order) that can then be referenced as &#x60;order_id&#x60; in a request to the [Charge](#endpoint-charge) endpoint. Orders specify products for purchase, along with discounts, taxes, and other settings to apply to the purchase.  To associate a created order with a request to the Charge endpoint, provide the order&#39;s &#x60;id&#x60; in the &#x60;order_id&#x60; field of your request.  You cannot modify an order after you create it. If you need to modify an order, instead create a new order with modified details.  To learn more about the Orders API, see the [Orders API Overview](/products/orders/overview).

### Example
```java
// Import classes:
//import com.squareup.connect.ApiClient;
//import com.squareup.connect.ApiException;
//import com.squareup.connect.Configuration;
//import com.squareup.connect.auth.*;
//import com.squareup.connect.api.OrdersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

OrdersApi apiInstance = new OrdersApi();
String locationId = "locationId_example"; // String | The ID of the business location to associate the order with.
CreateOrderRequest body = new CreateOrderRequest(); // CreateOrderRequest | An object containing the fields to POST for the request.  See the corresponding object definition for field details.
try {
    CreateOrderResponse result = apiInstance.createOrder(locationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrdersApi#createOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationId** | **String**| The ID of the business location to associate the order with. |
 **body** | [**CreateOrderRequest**](CreateOrderRequest.md)| An object containing the fields to POST for the request.  See the corresponding object definition for field details. |

### Return type

[**CreateOrderResponse**](CreateOrderResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="searchOrders"></a>
# **searchOrders**
> SearchOrdersResponse searchOrders(body)

SearchOrders

Search all Orders for a merchant and return either [Orders](#type-order) or [OrderEntries](#type-orderentry).  Note that details for orders processed with Square Point of Sale while in offline mode may not be transmitted to Square for up to 72 hours. Offline orders have a &#x60;created_at&#x60; value that reflects the time the order was originally processed, not the time it was subsequently transmitted to Square. Consequently, the SearchOrder endpoint might list an offline Order chronologically between online Orders that were seen in a previous request.  When fetching additional pages using a &#x60;cursor&#x60;, the &#x60;query&#x60; must be equal to the &#x60;query&#x60; used to fetch the first page of results.

### Example
```java
// Import classes:
//import com.squareup.connect.ApiClient;
//import com.squareup.connect.ApiException;
//import com.squareup.connect.Configuration;
//import com.squareup.connect.auth.*;
//import com.squareup.connect.api.OrdersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

OrdersApi apiInstance = new OrdersApi();
SearchOrdersRequest body = new SearchOrdersRequest(); // SearchOrdersRequest | An object containing the fields to POST for the request.  See the corresponding object definition for field details.
try {
    SearchOrdersResponse result = apiInstance.searchOrders(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrdersApi#searchOrders");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SearchOrdersRequest**](SearchOrdersRequest.md)| An object containing the fields to POST for the request.  See the corresponding object definition for field details. |

### Return type

[**SearchOrdersResponse**](SearchOrdersResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

