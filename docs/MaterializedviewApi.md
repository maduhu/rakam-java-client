# MaterializedviewApi

All URIs are relative to *https://app.rakam.io/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createView**](MaterializedviewApi.md#createView) | **POST** /materialized-view/create | Create view
[**deleteView**](MaterializedviewApi.md#deleteView) | **POST** /materialized-view/delete | Delete materialized view
[**getSchemaOfView**](MaterializedviewApi.md#getSchemaOfView) | **POST** /materialized-view/schema | Get schemas
[**getView**](MaterializedviewApi.md#getView) | **POST** /materialized-view/get | Get view
[**listViews**](MaterializedviewApi.md#listViews) | **POST** /materialized-view/list | List views


<a name="createView"></a>
# **createView**
> SuccessMessage createView(materializedView)

Create view



### Example
```java
// Import classes:
//import io.rakam.ApiClient;
//import io.rakam.ApiException;
//import io.rakam.Configuration;
//import io.rakam.auth.*;
//import io.rakam.client.api.MaterializedviewApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: master_key
ApiKeyAuth master_key = (ApiKeyAuth) defaultClient.getAuthentication("master_key");
master_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//master_key.setApiKeyPrefix("Token");

MaterializedviewApi apiInstance = new MaterializedviewApi();
MaterializedView materializedView = new MaterializedView(); // MaterializedView | 
try {
    SuccessMessage result = apiInstance.createView(materializedView);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MaterializedviewApi#createView");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **materializedView** | [**MaterializedView**](MaterializedView.md)|  |

### Return type

[**SuccessMessage**](SuccessMessage.md)

### Authorization

[master_key](../README.md#master_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteView"></a>
# **deleteView**
> SuccessMessage deleteView(materializedViewDeleteView)

Delete materialized view



### Example
```java
// Import classes:
//import io.rakam.ApiClient;
//import io.rakam.ApiException;
//import io.rakam.Configuration;
//import io.rakam.auth.*;
//import io.rakam.client.api.MaterializedviewApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: master_key
ApiKeyAuth master_key = (ApiKeyAuth) defaultClient.getAuthentication("master_key");
master_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//master_key.setApiKeyPrefix("Token");

MaterializedviewApi apiInstance = new MaterializedviewApi();
MaterializedViewDeleteView materializedViewDeleteView = new MaterializedViewDeleteView(); // MaterializedViewDeleteView | 
try {
    SuccessMessage result = apiInstance.deleteView(materializedViewDeleteView);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MaterializedviewApi#deleteView");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **materializedViewDeleteView** | [**MaterializedViewDeleteView**](MaterializedViewDeleteView.md)|  |

### Return type

[**SuccessMessage**](SuccessMessage.md)

### Authorization

[master_key](../README.md#master_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSchemaOfView"></a>
# **getSchemaOfView**
> List&lt;MaterializedViewSchema&gt; getSchemaOfView(materializedViewGetSchemaOfView)

Get schemas



### Example
```java
// Import classes:
//import io.rakam.ApiClient;
//import io.rakam.ApiException;
//import io.rakam.Configuration;
//import io.rakam.auth.*;
//import io.rakam.client.api.MaterializedviewApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: read_key
ApiKeyAuth read_key = (ApiKeyAuth) defaultClient.getAuthentication("read_key");
read_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//read_key.setApiKeyPrefix("Token");

MaterializedviewApi apiInstance = new MaterializedviewApi();
MaterializedViewGetSchemaOfView materializedViewGetSchemaOfView = new MaterializedViewGetSchemaOfView(); // MaterializedViewGetSchemaOfView | 
try {
    List<MaterializedViewSchema> result = apiInstance.getSchemaOfView(materializedViewGetSchemaOfView);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MaterializedviewApi#getSchemaOfView");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **materializedViewGetSchemaOfView** | [**MaterializedViewGetSchemaOfView**](MaterializedViewGetSchemaOfView.md)|  |

### Return type

[**List&lt;MaterializedViewSchema&gt;**](MaterializedViewSchema.md)

### Authorization

[read_key](../README.md#read_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getView"></a>
# **getView**
> MaterializedView getView(materializedViewGetView)

Get view



### Example
```java
// Import classes:
//import io.rakam.ApiClient;
//import io.rakam.ApiException;
//import io.rakam.Configuration;
//import io.rakam.auth.*;
//import io.rakam.client.api.MaterializedviewApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: read_key
ApiKeyAuth read_key = (ApiKeyAuth) defaultClient.getAuthentication("read_key");
read_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//read_key.setApiKeyPrefix("Token");

MaterializedviewApi apiInstance = new MaterializedviewApi();
MaterializedViewGetView materializedViewGetView = new MaterializedViewGetView(); // MaterializedViewGetView | 
try {
    MaterializedView result = apiInstance.getView(materializedViewGetView);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MaterializedviewApi#getView");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **materializedViewGetView** | [**MaterializedViewGetView**](MaterializedViewGetView.md)|  |

### Return type

[**MaterializedView**](MaterializedView.md)

### Authorization

[read_key](../README.md#read_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listViews"></a>
# **listViews**
> List&lt;MaterializedView&gt; listViews()

List views



### Example
```java
// Import classes:
//import io.rakam.ApiClient;
//import io.rakam.ApiException;
//import io.rakam.Configuration;
//import io.rakam.auth.*;
//import io.rakam.client.api.MaterializedviewApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: read_key
ApiKeyAuth read_key = (ApiKeyAuth) defaultClient.getAuthentication("read_key");
read_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//read_key.setApiKeyPrefix("Token");

MaterializedviewApi apiInstance = new MaterializedviewApi();
try {
    List<MaterializedView> result = apiInstance.listViews();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MaterializedviewApi#listViews");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;MaterializedView&gt;**](MaterializedView.md)

### Authorization

[read_key](../README.md#read_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

