# RecipeApi

All URIs are relative to *https://app.rakam.io/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**exportRecipe**](RecipeApi.md#exportRecipe) | **GET** /recipe/export | Export recipe
[**installRecipe**](RecipeApi.md#installRecipe) | **POST** /recipe/install | Install recipe


<a name="exportRecipe"></a>
# **exportRecipe**
> Recipe exportRecipe(accept)

Export recipe



### Example
```java
// Import classes:
//import io.rakam.ApiClient;
//import io.rakam.ApiException;
//import io.rakam.Configuration;
//import io.rakam.auth.*;
//import io.rakam.client.api.RecipeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: master_key
ApiKeyAuth master_key = (ApiKeyAuth) defaultClient.getAuthentication("master_key");
master_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//master_key.setApiKeyPrefix("Token");

RecipeApi apiInstance = new RecipeApi();
String accept = "accept_example"; // String | 
try {
    Recipe result = apiInstance.exportRecipe(accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecipeApi#exportRecipe");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **String**|  | [enum: JSON, YAML]

### Return type

[**Recipe**](Recipe.md)

### Authorization

[master_key](../README.md#master_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="installRecipe"></a>
# **installRecipe**
> SuccessMessage installRecipe()

Install recipe



### Example
```java
// Import classes:
//import io.rakam.ApiClient;
//import io.rakam.ApiException;
//import io.rakam.Configuration;
//import io.rakam.auth.*;
//import io.rakam.client.api.RecipeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: master_key
ApiKeyAuth master_key = (ApiKeyAuth) defaultClient.getAuthentication("master_key");
master_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//master_key.setApiKeyPrefix("Token");

RecipeApi apiInstance = new RecipeApi();
try {
    SuccessMessage result = apiInstance.installRecipe();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecipeApi#installRecipe");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SuccessMessage**](SuccessMessage.md)

### Authorization

[master_key](../README.md#master_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

