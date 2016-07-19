# QueryApi

All URIs are relative to *https://app.rakam.io/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**execute**](QueryApi.md#execute) | **POST** /query/execute | Execute query on event data-set
[**explain**](QueryApi.md#explain) | **POST** /query/explain | Explain query
[**metadata**](QueryApi.md#metadata) | **POST** /query/metadata | Test query


<a name="execute"></a>
# **execute**
> QueryResult execute(execute)

Execute query on event data-set



### Example
```java
// Import classes:
//import io.rakam.ApiClient;
//import io.rakam.ApiException;
//import io.rakam.Configuration;
//import io.rakam.auth.*;
//import io.rakam.client.api.QueryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: read_key
ApiKeyAuth read_key = (ApiKeyAuth) defaultClient.getAuthentication("read_key");
read_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//read_key.setApiKeyPrefix("Token");

QueryApi apiInstance = new QueryApi();
Execute execute = new Execute(); // Execute | 
try {
    QueryResult result = apiInstance.execute(execute);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QueryApi#execute");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **execute** | [**Execute**](Execute.md)|  |

### Return type

[**QueryResult**](QueryResult.md)

### Authorization

[read_key](../README.md#read_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="explain"></a>
# **explain**
> ResponseQuery explain(explain)

Explain query



### Example
```java
// Import classes:
//import io.rakam.ApiClient;
//import io.rakam.ApiException;
//import io.rakam.Configuration;
//import io.rakam.auth.*;
//import io.rakam.client.api.QueryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: read_key
ApiKeyAuth read_key = (ApiKeyAuth) defaultClient.getAuthentication("read_key");
read_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//read_key.setApiKeyPrefix("Token");

QueryApi apiInstance = new QueryApi();
Explain explain = new Explain(); // Explain | 
try {
    ResponseQuery result = apiInstance.explain(explain);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QueryApi#explain");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **explain** | [**Explain**](Explain.md)|  |

### Return type

[**ResponseQuery**](ResponseQuery.md)

### Authorization

[read_key](../README.md#read_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="metadata"></a>
# **metadata**
> List&lt;SchemaField&gt; metadata(queryMetadata)

Test query



### Example
```java
// Import classes:
//import io.rakam.ApiClient;
//import io.rakam.ApiException;
//import io.rakam.Configuration;
//import io.rakam.auth.*;
//import io.rakam.client.api.QueryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: read_key
ApiKeyAuth read_key = (ApiKeyAuth) defaultClient.getAuthentication("read_key");
read_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//read_key.setApiKeyPrefix("Token");

QueryApi apiInstance = new QueryApi();
QueryMetadata queryMetadata = new QueryMetadata(); // QueryMetadata | 
try {
    List<SchemaField> result = apiInstance.metadata(queryMetadata);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QueryApi#metadata");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **queryMetadata** | [**QueryMetadata**](QueryMetadata.md)|  |

### Return type

[**List&lt;SchemaField&gt;**](SchemaField.md)

### Authorization

[read_key](../README.md#read_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

