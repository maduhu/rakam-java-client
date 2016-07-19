# RealtimeApi

All URIs are relative to *https://app.rakam.io/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTable**](RealtimeApi.md#createTable) | **POST** /realtime/create | Create report
[**deleteTable**](RealtimeApi.md#deleteTable) | **POST** /realtime/delete | Delete report
[**listTables**](RealtimeApi.md#listTables) | **POST** /realtime/list | List queries
[**queryTable**](RealtimeApi.md#queryTable) | **POST** /realtime/get | Get report


<a name="createTable"></a>
# **createTable**
> SuccessMessage createTable(realTimeReport)

Create report



### Example
```java
// Import classes:
//import io.rakam.ApiClient;
//import io.rakam.ApiException;
//import io.rakam.Configuration;
//import io.rakam.auth.*;
//import io.rakam.client.api.RealtimeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: master_key
ApiKeyAuth master_key = (ApiKeyAuth) defaultClient.getAuthentication("master_key");
master_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//master_key.setApiKeyPrefix("Token");

RealtimeApi apiInstance = new RealtimeApi();
RealTimeReport realTimeReport = new RealTimeReport(); // RealTimeReport | 
try {
    SuccessMessage result = apiInstance.createTable(realTimeReport);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RealtimeApi#createTable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **realTimeReport** | [**RealTimeReport**](RealTimeReport.md)|  |

### Return type

[**SuccessMessage**](SuccessMessage.md)

### Authorization

[master_key](../README.md#master_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteTable"></a>
# **deleteTable**
> SuccessMessage deleteTable(realtimeDeleteTable)

Delete report



### Example
```java
// Import classes:
//import io.rakam.ApiClient;
//import io.rakam.ApiException;
//import io.rakam.Configuration;
//import io.rakam.auth.*;
//import io.rakam.client.api.RealtimeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: master_key
ApiKeyAuth master_key = (ApiKeyAuth) defaultClient.getAuthentication("master_key");
master_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//master_key.setApiKeyPrefix("Token");

RealtimeApi apiInstance = new RealtimeApi();
RealtimeDeleteTable realtimeDeleteTable = new RealtimeDeleteTable(); // RealtimeDeleteTable | 
try {
    SuccessMessage result = apiInstance.deleteTable(realtimeDeleteTable);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RealtimeApi#deleteTable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **realtimeDeleteTable** | [**RealtimeDeleteTable**](RealtimeDeleteTable.md)|  |

### Return type

[**SuccessMessage**](SuccessMessage.md)

### Authorization

[master_key](../README.md#master_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listTables"></a>
# **listTables**
> List&lt;ContinuousQuery&gt; listTables()

List queries



### Example
```java
// Import classes:
//import io.rakam.ApiClient;
//import io.rakam.ApiException;
//import io.rakam.Configuration;
//import io.rakam.auth.*;
//import io.rakam.client.api.RealtimeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: read_key
ApiKeyAuth read_key = (ApiKeyAuth) defaultClient.getAuthentication("read_key");
read_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//read_key.setApiKeyPrefix("Token");

RealtimeApi apiInstance = new RealtimeApi();
try {
    List<ContinuousQuery> result = apiInstance.listTables();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RealtimeApi#listTables");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;ContinuousQuery&gt;**](ContinuousQuery.md)

### Authorization

[read_key](../README.md#read_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="queryTable"></a>
# **queryTable**
> RealTimeQueryResult queryTable(realtimeQueryTable)

Get report



### Example
```java
// Import classes:
//import io.rakam.ApiClient;
//import io.rakam.ApiException;
//import io.rakam.Configuration;
//import io.rakam.auth.*;
//import io.rakam.client.api.RealtimeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: read_key
ApiKeyAuth read_key = (ApiKeyAuth) defaultClient.getAuthentication("read_key");
read_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//read_key.setApiKeyPrefix("Token");

RealtimeApi apiInstance = new RealtimeApi();
RealtimeQueryTable realtimeQueryTable = new RealtimeQueryTable(); // RealtimeQueryTable | 
try {
    RealTimeQueryResult result = apiInstance.queryTable(realtimeQueryTable);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RealtimeApi#queryTable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **realtimeQueryTable** | [**RealtimeQueryTable**](RealtimeQueryTable.md)|  |

### Return type

[**RealTimeQueryResult**](RealTimeQueryResult.md)

### Authorization

[read_key](../README.md#read_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

