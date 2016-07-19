# EventexplorerApi

All URIs are relative to *https://app.rakam.io/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**analyzeEvents**](EventexplorerApi.md#analyzeEvents) | **POST** /event-explorer/analyze | Perform simple query on event data
[**createPrecomputedTable**](EventexplorerApi.md#createPrecomputedTable) | **POST** /event-explorer/pre_calculate | Create Pre-computed table
[**getEventStatistics**](EventexplorerApi.md#getEventStatistics) | **POST** /event-explorer/statistics | Event statistics
[**getExtraDimensions**](EventexplorerApi.md#getExtraDimensions) | **GET** /event-explorer/extra_dimensions | Event statistics


<a name="analyzeEvents"></a>
# **analyzeEvents**
> QueryResult analyzeEvents(analyzeRequest)

Perform simple query on event data



### Example
```java
// Import classes:
//import io.rakam.ApiClient;
//import io.rakam.ApiException;
//import io.rakam.Configuration;
//import io.rakam.auth.*;
//import io.rakam.client.api.EventexplorerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: read_key
ApiKeyAuth read_key = (ApiKeyAuth) defaultClient.getAuthentication("read_key");
read_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//read_key.setApiKeyPrefix("Token");

EventexplorerApi apiInstance = new EventexplorerApi();
AnalyzeRequest analyzeRequest = new AnalyzeRequest(); // AnalyzeRequest | 
try {
    QueryResult result = apiInstance.analyzeEvents(analyzeRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventexplorerApi#analyzeEvents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **analyzeRequest** | [**AnalyzeRequest**](AnalyzeRequest.md)|  |

### Return type

[**QueryResult**](QueryResult.md)

### Authorization

[read_key](../README.md#read_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createPrecomputedTable"></a>
# **createPrecomputedTable**
> PrecalculatedTable createPrecomputedTable(createPrecomputedTable)

Create Pre-computed table



### Example
```java
// Import classes:
//import io.rakam.ApiClient;
//import io.rakam.ApiException;
//import io.rakam.Configuration;
//import io.rakam.auth.*;
//import io.rakam.client.api.EventexplorerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: master_key
ApiKeyAuth master_key = (ApiKeyAuth) defaultClient.getAuthentication("master_key");
master_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//master_key.setApiKeyPrefix("Token");

EventexplorerApi apiInstance = new EventexplorerApi();
CreatePrecomputedTable createPrecomputedTable = new CreatePrecomputedTable(); // CreatePrecomputedTable | 
try {
    PrecalculatedTable result = apiInstance.createPrecomputedTable(createPrecomputedTable);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventexplorerApi#createPrecomputedTable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createPrecomputedTable** | [**CreatePrecomputedTable**](CreatePrecomputedTable.md)|  |

### Return type

[**PrecalculatedTable**](PrecalculatedTable.md)

### Authorization

[master_key](../README.md#master_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getEventStatistics"></a>
# **getEventStatistics**
> QueryResult getEventStatistics(eventExplorerGetEventStatistics)

Event statistics



### Example
```java
// Import classes:
//import io.rakam.ApiClient;
//import io.rakam.ApiException;
//import io.rakam.Configuration;
//import io.rakam.auth.*;
//import io.rakam.client.api.EventexplorerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: read_key
ApiKeyAuth read_key = (ApiKeyAuth) defaultClient.getAuthentication("read_key");
read_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//read_key.setApiKeyPrefix("Token");

EventexplorerApi apiInstance = new EventexplorerApi();
EventExplorerGetEventStatistics eventExplorerGetEventStatistics = new EventExplorerGetEventStatistics(); // EventExplorerGetEventStatistics | 
try {
    QueryResult result = apiInstance.getEventStatistics(eventExplorerGetEventStatistics);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventexplorerApi#getEventStatistics");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventExplorerGetEventStatistics** | [**EventExplorerGetEventStatistics**](EventExplorerGetEventStatistics.md)|  |

### Return type

[**QueryResult**](QueryResult.md)

### Authorization

[read_key](../README.md#read_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getExtraDimensions"></a>
# **getExtraDimensions**
> Map&lt;String, List&lt;String&gt;&gt; getExtraDimensions()

Event statistics



### Example
```java
// Import classes:
//import io.rakam.ApiClient;
//import io.rakam.ApiException;
//import io.rakam.Configuration;
//import io.rakam.auth.*;
//import io.rakam.client.api.EventexplorerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: read_key
ApiKeyAuth read_key = (ApiKeyAuth) defaultClient.getAuthentication("read_key");
read_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//read_key.setApiKeyPrefix("Token");

EventexplorerApi apiInstance = new EventexplorerApi();
try {
    Map<String, List<String>> result = apiInstance.getExtraDimensions();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventexplorerApi#getExtraDimensions");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Map&lt;String, List&lt;String&gt;&gt;**](List.md)

### Authorization

[read_key](../README.md#read_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

