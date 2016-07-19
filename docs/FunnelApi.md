# FunnelApi

All URIs are relative to *https://app.rakam.io/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**analyzeFunnel**](FunnelApi.md#analyzeFunnel) | **POST** /funnel/analyze | Execute query


<a name="analyzeFunnel"></a>
# **analyzeFunnel**
> QueryResult analyzeFunnel(funnelQuery)

Execute query



### Example
```java
// Import classes:
//import io.rakam.ApiClient;
//import io.rakam.ApiException;
//import io.rakam.Configuration;
//import io.rakam.auth.*;
//import io.rakam.client.api.FunnelApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: read_key
ApiKeyAuth read_key = (ApiKeyAuth) defaultClient.getAuthentication("read_key");
read_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//read_key.setApiKeyPrefix("Token");

FunnelApi apiInstance = new FunnelApi();
FunnelQuery funnelQuery = new FunnelQuery(); // FunnelQuery | 
try {
    QueryResult result = apiInstance.analyzeFunnel(funnelQuery);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FunnelApi#analyzeFunnel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **funnelQuery** | [**FunnelQuery**](FunnelQuery.md)|  |

### Return type

[**QueryResult**](QueryResult.md)

### Authorization

[read_key](../README.md#read_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

