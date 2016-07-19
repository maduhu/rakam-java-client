# RetentionApi

All URIs are relative to *https://app.rakam.io/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**analyzeRetention**](RetentionApi.md#analyzeRetention) | **POST** /retention/analyze | Execute query


<a name="analyzeRetention"></a>
# **analyzeRetention**
> QueryResult analyzeRetention(retentionQuery)

Execute query



### Example
```java
// Import classes:
//import io.rakam.ApiClient;
//import io.rakam.ApiException;
//import io.rakam.Configuration;
//import io.rakam.auth.*;
//import io.rakam.client.api.RetentionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: read_key
ApiKeyAuth read_key = (ApiKeyAuth) defaultClient.getAuthentication("read_key");
read_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//read_key.setApiKeyPrefix("Token");

RetentionApi apiInstance = new RetentionApi();
RetentionQuery retentionQuery = new RetentionQuery(); // RetentionQuery | 
try {
    QueryResult result = apiInstance.analyzeRetention(retentionQuery);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RetentionApi#analyzeRetention");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **retentionQuery** | [**RetentionQuery**](RetentionQuery.md)|  |

### Return type

[**QueryResult**](QueryResult.md)

### Authorization

[read_key](../README.md#read_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

