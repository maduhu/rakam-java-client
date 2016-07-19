# UserApi

All URIs are relative to *https://app.rakam.io/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSegment**](UserApi.md#createSegment) | **POST** /user/create_segment | Get events of the user
[**createUser**](UserApi.md#createUser) | **POST** /user/create | Create new user
[**createUsers**](UserApi.md#createUsers) | **POST** /user/batch/create | Create multiple new users
[**getEvents**](UserApi.md#getEvents) | **POST** /user/get_events | Get events of the user
[**getMetadata**](UserApi.md#getMetadata) | **GET** /user/metadata | Get user storage metadata
[**getUser**](UserApi.md#getUser) | **POST** /user/get | Get user
[**incrementProperty**](UserApi.md#incrementProperty) | **POST** /user/increment_property | Set user property
[**searchUsers**](UserApi.md#searchUsers) | **POST** /user/search | Search users
[**setProperties**](UserApi.md#setProperties) | **POST** /user/set_properties | Set user properties
[**setPropertiesOnce**](UserApi.md#setPropertiesOnce) | **POST** /user/set_properties_once | Set user properties once
[**unsetProperty**](UserApi.md#unsetProperty) | **POST** /user/unset_properties | Unset user property


<a name="createSegment"></a>
# **createSegment**
> SuccessMessage createSegment(userCreateSegment)

Get events of the user



### Example
```java
// Import classes:
//import io.rakam.ApiClient;
//import io.rakam.ApiException;
//import io.rakam.Configuration;
//import io.rakam.auth.*;
//import io.rakam.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: read_key
ApiKeyAuth read_key = (ApiKeyAuth) defaultClient.getAuthentication("read_key");
read_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//read_key.setApiKeyPrefix("Token");

UserApi apiInstance = new UserApi();
UserCreateSegment userCreateSegment = new UserCreateSegment(); // UserCreateSegment | 
try {
    SuccessMessage result = apiInstance.createSegment(userCreateSegment);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#createSegment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userCreateSegment** | [**UserCreateSegment**](UserCreateSegment.md)|  |

### Return type

[**SuccessMessage**](SuccessMessage.md)

### Authorization

[read_key](../README.md#read_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createUser"></a>
# **createUser**
> Integer createUser(user)

Create new user



### Example
```java
// Import classes:
//import io.rakam.ApiException;
//import io.rakam.client.api.UserApi;


UserApi apiInstance = new UserApi();
User user = new User(); // User | 
try {
    Integer result = apiInstance.createUser(user);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#createUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user** | [**User**](User.md)|  |

### Return type

**Integer**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createUsers"></a>
# **createUsers**
> List&lt;Object&gt; createUsers(userCreateUsers)

Create multiple new users

Returns user ids. User id may be string or numeric.

### Example
```java
// Import classes:
//import io.rakam.ApiClient;
//import io.rakam.ApiException;
//import io.rakam.Configuration;
//import io.rakam.auth.*;
//import io.rakam.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: write_key
ApiKeyAuth write_key = (ApiKeyAuth) defaultClient.getAuthentication("write_key");
write_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//write_key.setApiKeyPrefix("Token");

UserApi apiInstance = new UserApi();
UserCreateUsers userCreateUsers = new UserCreateUsers(); // UserCreateUsers | 
try {
    List<Object> result = apiInstance.createUsers(userCreateUsers);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#createUsers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userCreateUsers** | [**UserCreateUsers**](UserCreateUsers.md)|  |

### Return type

**List&lt;Object&gt;**

### Authorization

[write_key](../README.md#write_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getEvents"></a>
# **getEvents**
> List&lt;CollectionEvent&gt; getEvents(userGetEvents)

Get events of the user



### Example
```java
// Import classes:
//import io.rakam.ApiClient;
//import io.rakam.ApiException;
//import io.rakam.Configuration;
//import io.rakam.auth.*;
//import io.rakam.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: read_key
ApiKeyAuth read_key = (ApiKeyAuth) defaultClient.getAuthentication("read_key");
read_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//read_key.setApiKeyPrefix("Token");

UserApi apiInstance = new UserApi();
UserGetEvents userGetEvents = new UserGetEvents(); // UserGetEvents | 
try {
    List<CollectionEvent> result = apiInstance.getEvents(userGetEvents);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#getEvents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userGetEvents** | [**UserGetEvents**](UserGetEvents.md)|  |

### Return type

[**List&lt;CollectionEvent&gt;**](CollectionEvent.md)

### Authorization

[read_key](../README.md#read_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMetadata"></a>
# **getMetadata**
> MetadataResponse getMetadata()

Get user storage metadata



### Example
```java
// Import classes:
//import io.rakam.ApiClient;
//import io.rakam.ApiException;
//import io.rakam.Configuration;
//import io.rakam.auth.*;
//import io.rakam.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: read_key
ApiKeyAuth read_key = (ApiKeyAuth) defaultClient.getAuthentication("read_key");
read_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//read_key.setApiKeyPrefix("Token");

UserApi apiInstance = new UserApi();
try {
    MetadataResponse result = apiInstance.getMetadata();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#getMetadata");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**MetadataResponse**](MetadataResponse.md)

### Authorization

[read_key](../README.md#read_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUser"></a>
# **getUser**
> User getUser(userGetUser)

Get user



### Example
```java
// Import classes:
//import io.rakam.ApiClient;
//import io.rakam.ApiException;
//import io.rakam.Configuration;
//import io.rakam.auth.*;
//import io.rakam.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: read_key
ApiKeyAuth read_key = (ApiKeyAuth) defaultClient.getAuthentication("read_key");
read_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//read_key.setApiKeyPrefix("Token");

UserApi apiInstance = new UserApi();
UserGetUser userGetUser = new UserGetUser(); // UserGetUser | 
try {
    User result = apiInstance.getUser(userGetUser);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#getUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userGetUser** | [**UserGetUser**](UserGetUser.md)|  |

### Return type

[**User**](User.md)

### Authorization

[read_key](../README.md#read_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="incrementProperty"></a>
# **incrementProperty**
> SuccessMessage incrementProperty(userIncrementProperty)

Set user property



### Example
```java
// Import classes:
//import io.rakam.ApiClient;
//import io.rakam.ApiException;
//import io.rakam.Configuration;
//import io.rakam.auth.*;
//import io.rakam.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: master_key
ApiKeyAuth master_key = (ApiKeyAuth) defaultClient.getAuthentication("master_key");
master_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//master_key.setApiKeyPrefix("Token");

UserApi apiInstance = new UserApi();
UserIncrementProperty userIncrementProperty = new UserIncrementProperty(); // UserIncrementProperty | 
try {
    SuccessMessage result = apiInstance.incrementProperty(userIncrementProperty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#incrementProperty");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userIncrementProperty** | [**UserIncrementProperty**](UserIncrementProperty.md)|  |

### Return type

[**SuccessMessage**](SuccessMessage.md)

### Authorization

[master_key](../README.md#master_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="searchUsers"></a>
# **searchUsers**
> QueryResult searchUsers(userSearchUsers)

Search users



### Example
```java
// Import classes:
//import io.rakam.ApiClient;
//import io.rakam.ApiException;
//import io.rakam.Configuration;
//import io.rakam.auth.*;
//import io.rakam.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: read_key
ApiKeyAuth read_key = (ApiKeyAuth) defaultClient.getAuthentication("read_key");
read_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//read_key.setApiKeyPrefix("Token");

UserApi apiInstance = new UserApi();
UserSearchUsers userSearchUsers = new UserSearchUsers(); // UserSearchUsers | 
try {
    QueryResult result = apiInstance.searchUsers(userSearchUsers);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#searchUsers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userSearchUsers** | [**UserSearchUsers**](UserSearchUsers.md)|  |

### Return type

[**QueryResult**](QueryResult.md)

### Authorization

[read_key](../README.md#read_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="setProperties"></a>
# **setProperties**
> Integer setProperties(user)

Set user properties



### Example
```java
// Import classes:
//import io.rakam.ApiException;
//import io.rakam.client.api.UserApi;


UserApi apiInstance = new UserApi();
User user = new User(); // User | 
try {
    Integer result = apiInstance.setProperties(user);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#setProperties");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user** | [**User**](User.md)|  |

### Return type

**Integer**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="setPropertiesOnce"></a>
# **setPropertiesOnce**
> Integer setPropertiesOnce(user)

Set user properties once



### Example
```java
// Import classes:
//import io.rakam.ApiException;
//import io.rakam.client.api.UserApi;


UserApi apiInstance = new UserApi();
User user = new User(); // User | 
try {
    Integer result = apiInstance.setPropertiesOnce(user);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#setPropertiesOnce");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user** | [**User**](User.md)|  |

### Return type

**Integer**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="unsetProperty"></a>
# **unsetProperty**
> SuccessMessage unsetProperty(userUnsetProperty)

Unset user property



### Example
```java
// Import classes:
//import io.rakam.ApiException;
//import io.rakam.client.api.UserApi;


UserApi apiInstance = new UserApi();
UserUnsetProperty userUnsetProperty = new UserUnsetProperty(); // UserUnsetProperty | 
try {
    SuccessMessage result = apiInstance.unsetProperty(userUnsetProperty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#unsetProperty");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userUnsetProperty** | [**UserUnsetProperty**](UserUnsetProperty.md)|  |

### Return type

[**SuccessMessage**](SuccessMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

