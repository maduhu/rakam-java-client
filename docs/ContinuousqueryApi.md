# ContinuousqueryApi

All URIs are relative to *https://app.rakam.io/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createQuery**](ContinuousqueryApi.md#createQuery) | **POST** /continuous-query/create | Create stream
[**deleteQuery**](ContinuousqueryApi.md#deleteQuery) | **POST** /continuous-query/delete | Delete stream
[**getQuery**](ContinuousqueryApi.md#getQuery) | **POST** /continuous-query/get | Get continuous query
[**getSchemaOfQuery**](ContinuousqueryApi.md#getSchemaOfQuery) | **POST** /continuous-query/schema | Get query schema
[**listQueries**](ContinuousqueryApi.md#listQueries) | **POST** /continuous-query/list | List queries
[**testQuery**](ContinuousqueryApi.md#testQuery) | **POST** /continuous-query/test | Test continuous query


<a name="createQuery"></a>
# **createQuery**
> SuccessMessage createQuery(continuousQuery)

Create stream

Creates a new continuous query for specified SQL query. Rakam will process data in batches keep the result of query in-memory all the time. Compared to reports, continuous queries continuously aggregate the data on the fly and the result is always available either in-memory or disk.

### Example
```java
// Import classes:
//import io.rakam.ApiClient;
//import io.rakam.ApiException;
//import io.rakam.Configuration;
//import io.rakam.auth.*;
//import io.rakam.client.api.ContinuousqueryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: master_key
ApiKeyAuth master_key = (ApiKeyAuth) defaultClient.getAuthentication("master_key");
master_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//master_key.setApiKeyPrefix("Token");

ContinuousqueryApi apiInstance = new ContinuousqueryApi();
ContinuousQuery continuousQuery = new ContinuousQuery(); // ContinuousQuery | 
try {
    SuccessMessage result = apiInstance.createQuery(continuousQuery);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContinuousqueryApi#createQuery");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **continuousQuery** | [**ContinuousQuery**](ContinuousQuery.md)|  |

### Return type

[**SuccessMessage**](SuccessMessage.md)

### Authorization

[master_key](../README.md#master_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteQuery"></a>
# **deleteQuery**
> SuccessMessage deleteQuery(continuousQueryDeleteQuery)

Delete stream



### Example
```java
// Import classes:
//import io.rakam.ApiClient;
//import io.rakam.ApiException;
//import io.rakam.Configuration;
//import io.rakam.auth.*;
//import io.rakam.client.api.ContinuousqueryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: master_key
ApiKeyAuth master_key = (ApiKeyAuth) defaultClient.getAuthentication("master_key");
master_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//master_key.setApiKeyPrefix("Token");

ContinuousqueryApi apiInstance = new ContinuousqueryApi();
ContinuousQueryDeleteQuery continuousQueryDeleteQuery = new ContinuousQueryDeleteQuery(); // ContinuousQueryDeleteQuery | 
try {
    SuccessMessage result = apiInstance.deleteQuery(continuousQueryDeleteQuery);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContinuousqueryApi#deleteQuery");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **continuousQueryDeleteQuery** | [**ContinuousQueryDeleteQuery**](ContinuousQueryDeleteQuery.md)|  |

### Return type

[**SuccessMessage**](SuccessMessage.md)

### Authorization

[master_key](../README.md#master_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getQuery"></a>
# **getQuery**
> ContinuousQuery getQuery(continuousQueryGetQuery)

Get continuous query



### Example
```java
// Import classes:
//import io.rakam.ApiClient;
//import io.rakam.ApiException;
//import io.rakam.Configuration;
//import io.rakam.auth.*;
//import io.rakam.client.api.ContinuousqueryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: read_key
ApiKeyAuth read_key = (ApiKeyAuth) defaultClient.getAuthentication("read_key");
read_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//read_key.setApiKeyPrefix("Token");

ContinuousqueryApi apiInstance = new ContinuousqueryApi();
ContinuousQueryGetQuery continuousQueryGetQuery = new ContinuousQueryGetQuery(); // ContinuousQueryGetQuery | 
try {
    ContinuousQuery result = apiInstance.getQuery(continuousQueryGetQuery);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContinuousqueryApi#getQuery");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **continuousQueryGetQuery** | [**ContinuousQueryGetQuery**](ContinuousQueryGetQuery.md)|  |

### Return type

[**ContinuousQuery**](ContinuousQuery.md)

### Authorization

[read_key](../README.md#read_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSchemaOfQuery"></a>
# **getSchemaOfQuery**
> List&lt;Collection&gt; getSchemaOfQuery(continuousQueryGetSchemaOfQuery)

Get query schema



### Example
```java
// Import classes:
//import io.rakam.ApiClient;
//import io.rakam.ApiException;
//import io.rakam.Configuration;
//import io.rakam.auth.*;
//import io.rakam.client.api.ContinuousqueryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: read_key
ApiKeyAuth read_key = (ApiKeyAuth) defaultClient.getAuthentication("read_key");
read_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//read_key.setApiKeyPrefix("Token");

ContinuousqueryApi apiInstance = new ContinuousqueryApi();
ContinuousQueryGetSchemaOfQuery continuousQueryGetSchemaOfQuery = new ContinuousQueryGetSchemaOfQuery(); // ContinuousQueryGetSchemaOfQuery | 
try {
    List<Collection> result = apiInstance.getSchemaOfQuery(continuousQueryGetSchemaOfQuery);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContinuousqueryApi#getSchemaOfQuery");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **continuousQueryGetSchemaOfQuery** | [**ContinuousQueryGetSchemaOfQuery**](ContinuousQueryGetSchemaOfQuery.md)|  |

### Return type

[**List&lt;Collection&gt;**](Collection.md)

### Authorization

[read_key](../README.md#read_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listQueries"></a>
# **listQueries**
> List&lt;ContinuousQuery&gt; listQueries()

List queries



### Example
```java
// Import classes:
//import io.rakam.ApiClient;
//import io.rakam.ApiException;
//import io.rakam.Configuration;
//import io.rakam.auth.*;
//import io.rakam.client.api.ContinuousqueryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: read_key
ApiKeyAuth read_key = (ApiKeyAuth) defaultClient.getAuthentication("read_key");
read_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//read_key.setApiKeyPrefix("Token");

ContinuousqueryApi apiInstance = new ContinuousqueryApi();
try {
    List<ContinuousQuery> result = apiInstance.listQueries();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContinuousqueryApi#listQueries");
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

<a name="testQuery"></a>
# **testQuery**
> Boolean testQuery(continuousQueryTestQuery)

Test continuous query



### Example
```java
// Import classes:
//import io.rakam.ApiClient;
//import io.rakam.ApiException;
//import io.rakam.Configuration;
//import io.rakam.auth.*;
//import io.rakam.client.api.ContinuousqueryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: read_key
ApiKeyAuth read_key = (ApiKeyAuth) defaultClient.getAuthentication("read_key");
read_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//read_key.setApiKeyPrefix("Token");

ContinuousqueryApi apiInstance = new ContinuousqueryApi();
ContinuousQueryTestQuery continuousQueryTestQuery = new ContinuousQueryTestQuery(); // ContinuousQueryTestQuery | 
try {
    Boolean result = apiInstance.testQuery(continuousQueryTestQuery);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContinuousqueryApi#testQuery");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **continuousQueryTestQuery** | [**ContinuousQueryTestQuery**](ContinuousQueryTestQuery.md)|  |

### Return type

**Boolean**

### Authorization

[read_key](../README.md#read_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

