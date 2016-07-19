# UseractionApi

All URIs are relative to *https://app.rakam.io/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**batch**](UseractionApi.md#batch) | **POST** /user/action/email/batch | Apply batch operation
[**send**](UseractionApi.md#send) | **POST** /user/action/email/single | Perform action for single user


<a name="batch"></a>
# **batch**
> Long batch(userEmailActionBatch)

Apply batch operation



### Example
```java
// Import classes:
//import io.rakam.ApiClient;
//import io.rakam.ApiException;
//import io.rakam.Configuration;
//import io.rakam.auth.*;
//import io.rakam.client.api.UseractionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: read_key
ApiKeyAuth read_key = (ApiKeyAuth) defaultClient.getAuthentication("read_key");
read_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//read_key.setApiKeyPrefix("Token");

UseractionApi apiInstance = new UseractionApi();
UserEmailActionBatch userEmailActionBatch = new UserEmailActionBatch(); // UserEmailActionBatch | 
try {
    Long result = apiInstance.batch(userEmailActionBatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UseractionApi#batch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userEmailActionBatch** | [**UserEmailActionBatch**](UserEmailActionBatch.md)|  |

### Return type

**Long**

### Authorization

[read_key](../README.md#read_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="send"></a>
# **send**
> Boolean send(userEmailActionSend)

Perform action for single user



### Example
```java
// Import classes:
//import io.rakam.ApiClient;
//import io.rakam.ApiException;
//import io.rakam.Configuration;
//import io.rakam.auth.*;
//import io.rakam.client.api.UseractionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: read_key
ApiKeyAuth read_key = (ApiKeyAuth) defaultClient.getAuthentication("read_key");
read_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//read_key.setApiKeyPrefix("Token");

UseractionApi apiInstance = new UseractionApi();
UserEmailActionSend userEmailActionSend = new UserEmailActionSend(); // UserEmailActionSend | 
try {
    Boolean result = apiInstance.send(userEmailActionSend);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UseractionApi#send");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userEmailActionSend** | [**UserEmailActionSend**](UserEmailActionSend.md)|  |

### Return type

**Boolean**

### Authorization

[read_key](../README.md#read_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

