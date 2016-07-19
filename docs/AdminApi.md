# AdminApi

All URIs are relative to *https://app.rakam.io/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addCustomFieldsToSchema**](AdminApi.md#addCustomFieldsToSchema) | **POST** /project/schema/add/custom | Add fields to collections by transforming other schemas
[**addFieldsToSchema**](AdminApi.md#addFieldsToSchema) | **POST** /project/schema/add | Add fields to collections
[**checkApiKeys**](AdminApi.md#checkApiKeys) | **POST** /project/check-api-keys | Create API Keys
[**checkLockKey**](AdminApi.md#checkLockKey) | **POST** /admin/lock_key | Check lock key
[**collections**](AdminApi.md#collections) | **POST** /project/collection | Get collection names
[**createApiKeys**](AdminApi.md#createApiKeys) | **POST** /project/create-api-keys | Create API Keys
[**createProject**](AdminApi.md#createProject) | **POST** /project/create | Create project
[**deleteProject**](AdminApi.md#deleteProject) | **DELETE** /project/delete | Delete project
[**getConfigurations**](AdminApi.md#getConfigurations) | **GET** /admin/configurations | List installed modules
[**getProjects**](AdminApi.md#getProjects) | **GET** /project/list | List created projects
[**getStats**](AdminApi.md#getStats) | **POST** /project/stats | Get project stats
[**getTypes**](AdminApi.md#getTypes) | **GET** /admin/types | Get types
[**revokeApiKeys**](AdminApi.md#revokeApiKeys) | **DELETE** /project/revoke-api-keys | Revoke API Keys
[**schema**](AdminApi.md#schema) | **POST** /project/schema | Get collection schema


<a name="addCustomFieldsToSchema"></a>
# **addCustomFieldsToSchema**
> List&lt;SchemaField&gt; addCustomFieldsToSchema(projectAddCustomFieldsToSchema)

Add fields to collections by transforming other schemas



### Example
```java
// Import classes:
//import io.rakam.ApiClient;
//import io.rakam.ApiException;
//import io.rakam.Configuration;
//import io.rakam.auth.*;
//import io.rakam.client.api.AdminApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: master_key
ApiKeyAuth master_key = (ApiKeyAuth) defaultClient.getAuthentication("master_key");
master_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//master_key.setApiKeyPrefix("Token");

AdminApi apiInstance = new AdminApi();
ProjectAddCustomFieldsToSchema projectAddCustomFieldsToSchema = new ProjectAddCustomFieldsToSchema(); // ProjectAddCustomFieldsToSchema | 
try {
    List<SchemaField> result = apiInstance.addCustomFieldsToSchema(projectAddCustomFieldsToSchema);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#addCustomFieldsToSchema");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectAddCustomFieldsToSchema** | [**ProjectAddCustomFieldsToSchema**](ProjectAddCustomFieldsToSchema.md)|  |

### Return type

[**List&lt;SchemaField&gt;**](SchemaField.md)

### Authorization

[master_key](../README.md#master_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addFieldsToSchema"></a>
# **addFieldsToSchema**
> List&lt;SchemaField&gt; addFieldsToSchema(projectAddFieldsToSchema)

Add fields to collections



### Example
```java
// Import classes:
//import io.rakam.ApiClient;
//import io.rakam.ApiException;
//import io.rakam.Configuration;
//import io.rakam.auth.*;
//import io.rakam.client.api.AdminApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: master_key
ApiKeyAuth master_key = (ApiKeyAuth) defaultClient.getAuthentication("master_key");
master_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//master_key.setApiKeyPrefix("Token");

AdminApi apiInstance = new AdminApi();
ProjectAddFieldsToSchema projectAddFieldsToSchema = new ProjectAddFieldsToSchema(); // ProjectAddFieldsToSchema | 
try {
    List<SchemaField> result = apiInstance.addFieldsToSchema(projectAddFieldsToSchema);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#addFieldsToSchema");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectAddFieldsToSchema** | [**ProjectAddFieldsToSchema**](ProjectAddFieldsToSchema.md)|  |

### Return type

[**List&lt;SchemaField&gt;**](SchemaField.md)

### Authorization

[master_key](../README.md#master_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="checkApiKeys"></a>
# **checkApiKeys**
> List&lt;Boolean&gt; checkApiKeys(projectCheckApiKeys)

Create API Keys



### Example
```java
// Import classes:
//import io.rakam.ApiException;
//import io.rakam.client.api.AdminApi;


AdminApi apiInstance = new AdminApi();
ProjectCheckApiKeys projectCheckApiKeys = new ProjectCheckApiKeys(); // ProjectCheckApiKeys | 
try {
    List<Boolean> result = apiInstance.checkApiKeys(projectCheckApiKeys);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#checkApiKeys");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectCheckApiKeys** | [**ProjectCheckApiKeys**](ProjectCheckApiKeys.md)|  |

### Return type

**List&lt;Boolean&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="checkLockKey"></a>
# **checkLockKey**
> Boolean checkLockKey(checkLockKey)

Check lock key



### Example
```java
// Import classes:
//import io.rakam.ApiClient;
//import io.rakam.ApiException;
//import io.rakam.Configuration;
//import io.rakam.auth.*;
//import io.rakam.client.api.AdminApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: master_key
ApiKeyAuth master_key = (ApiKeyAuth) defaultClient.getAuthentication("master_key");
master_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//master_key.setApiKeyPrefix("Token");

AdminApi apiInstance = new AdminApi();
CheckLockKey checkLockKey = new CheckLockKey(); // CheckLockKey | 
try {
    Boolean result = apiInstance.checkLockKey(checkLockKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#checkLockKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **checkLockKey** | [**CheckLockKey**](CheckLockKey.md)|  |

### Return type

**Boolean**

### Authorization

[master_key](../README.md#master_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="collections"></a>
# **collections**
> List&lt;String&gt; collections()

Get collection names



### Example
```java
// Import classes:
//import io.rakam.ApiClient;
//import io.rakam.ApiException;
//import io.rakam.Configuration;
//import io.rakam.auth.*;
//import io.rakam.client.api.AdminApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: read_key
ApiKeyAuth read_key = (ApiKeyAuth) defaultClient.getAuthentication("read_key");
read_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//read_key.setApiKeyPrefix("Token");

AdminApi apiInstance = new AdminApi();
try {
    List<String> result = apiInstance.collections();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#collections");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**List&lt;String&gt;**

### Authorization

[read_key](../README.md#read_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createApiKeys"></a>
# **createApiKeys**
> ProjectApiKeys createApiKeys()

Create API Keys



### Example
```java
// Import classes:
//import io.rakam.ApiClient;
//import io.rakam.ApiException;
//import io.rakam.Configuration;
//import io.rakam.auth.*;
//import io.rakam.client.api.AdminApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: master_key
ApiKeyAuth master_key = (ApiKeyAuth) defaultClient.getAuthentication("master_key");
master_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//master_key.setApiKeyPrefix("Token");

AdminApi apiInstance = new AdminApi();
try {
    ProjectApiKeys result = apiInstance.createApiKeys();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#createApiKeys");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ProjectApiKeys**](ProjectApiKeys.md)

### Authorization

[master_key](../README.md#master_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createProject"></a>
# **createProject**
> ProjectApiKeys createProject(createProject)

Create project



### Example
```java
// Import classes:
//import io.rakam.ApiException;
//import io.rakam.client.api.AdminApi;


AdminApi apiInstance = new AdminApi();
CreateProject createProject = new CreateProject(); // CreateProject | 
try {
    ProjectApiKeys result = apiInstance.createProject(createProject);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#createProject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createProject** | [**CreateProject**](CreateProject.md)|  |

### Return type

[**ProjectApiKeys**](ProjectApiKeys.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteProject"></a>
# **deleteProject**
> SuccessMessage deleteProject()

Delete project



### Example
```java
// Import classes:
//import io.rakam.ApiClient;
//import io.rakam.ApiException;
//import io.rakam.Configuration;
//import io.rakam.auth.*;
//import io.rakam.client.api.AdminApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: master_key
ApiKeyAuth master_key = (ApiKeyAuth) defaultClient.getAuthentication("master_key");
master_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//master_key.setApiKeyPrefix("Token");

AdminApi apiInstance = new AdminApi();
try {
    SuccessMessage result = apiInstance.deleteProject();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#deleteProject");
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

<a name="getConfigurations"></a>
# **getConfigurations**
> List&lt;ModuleDescriptor&gt; getConfigurations()

List installed modules



### Example
```java
// Import classes:
//import io.rakam.ApiClient;
//import io.rakam.ApiException;
//import io.rakam.Configuration;
//import io.rakam.auth.*;
//import io.rakam.client.api.AdminApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: master_key
ApiKeyAuth master_key = (ApiKeyAuth) defaultClient.getAuthentication("master_key");
master_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//master_key.setApiKeyPrefix("Token");

AdminApi apiInstance = new AdminApi();
try {
    List<ModuleDescriptor> result = apiInstance.getConfigurations();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#getConfigurations");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;ModuleDescriptor&gt;**](ModuleDescriptor.md)

### Authorization

[master_key](../README.md#master_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProjects"></a>
# **getProjects**
> List&lt;String&gt; getProjects()

List created projects



### Example
```java
// Import classes:
//import io.rakam.ApiClient;
//import io.rakam.ApiException;
//import io.rakam.Configuration;
//import io.rakam.auth.*;
//import io.rakam.client.api.AdminApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: read_key
ApiKeyAuth read_key = (ApiKeyAuth) defaultClient.getAuthentication("read_key");
read_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//read_key.setApiKeyPrefix("Token");

AdminApi apiInstance = new AdminApi();
try {
    List<String> result = apiInstance.getProjects();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#getProjects");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**List&lt;String&gt;**

### Authorization

[read_key](../README.md#read_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getStats"></a>
# **getStats**
> Map&lt;String, Stats&gt; getStats(projectGetStats)

Get project stats



### Example
```java
// Import classes:
//import io.rakam.ApiException;
//import io.rakam.client.api.AdminApi;


AdminApi apiInstance = new AdminApi();
ProjectGetStats projectGetStats = new ProjectGetStats(); // ProjectGetStats | 
try {
    Map<String, Stats> result = apiInstance.getStats(projectGetStats);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#getStats");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectGetStats** | [**ProjectGetStats**](ProjectGetStats.md)|  |

### Return type

[**Map&lt;String, Stats&gt;**](Stats.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTypes"></a>
# **getTypes**
> Map&lt;String, String&gt; getTypes()

Get types



### Example
```java
// Import classes:
//import io.rakam.ApiClient;
//import io.rakam.ApiException;
//import io.rakam.Configuration;
//import io.rakam.auth.*;
//import io.rakam.client.api.AdminApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: master_key
ApiKeyAuth master_key = (ApiKeyAuth) defaultClient.getAuthentication("master_key");
master_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//master_key.setApiKeyPrefix("Token");

AdminApi apiInstance = new AdminApi();
try {
    Map<String, String> result = apiInstance.getTypes();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#getTypes");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Map&lt;String, String&gt;**](Map.md)

### Authorization

[master_key](../README.md#master_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="revokeApiKeys"></a>
# **revokeApiKeys**
> SuccessMessage revokeApiKeys(masterKey)

Revoke API Keys



### Example
```java
// Import classes:
//import io.rakam.ApiClient;
//import io.rakam.ApiException;
//import io.rakam.Configuration;
//import io.rakam.auth.*;
//import io.rakam.client.api.AdminApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: master_key
ApiKeyAuth master_key = (ApiKeyAuth) defaultClient.getAuthentication("master_key");
master_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//master_key.setApiKeyPrefix("Token");

AdminApi apiInstance = new AdminApi();
String masterKey = "masterKey_example"; // String | 
try {
    SuccessMessage result = apiInstance.revokeApiKeys(masterKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#revokeApiKeys");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **masterKey** | **String**|  |

### Return type

[**SuccessMessage**](SuccessMessage.md)

### Authorization

[master_key](../README.md#master_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="schema"></a>
# **schema**
> List&lt;Collection&gt; schema(projectSchema)

Get collection schema



### Example
```java
// Import classes:
//import io.rakam.ApiClient;
//import io.rakam.ApiException;
//import io.rakam.Configuration;
//import io.rakam.auth.*;
//import io.rakam.client.api.AdminApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: read_key
ApiKeyAuth read_key = (ApiKeyAuth) defaultClient.getAuthentication("read_key");
read_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//read_key.setApiKeyPrefix("Token");

AdminApi apiInstance = new AdminApi();
ProjectSchema projectSchema = new ProjectSchema(); // ProjectSchema | 
try {
    List<Collection> result = apiInstance.schema(projectSchema);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#schema");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectSchema** | [**ProjectSchema**](ProjectSchema.md)|  |

### Return type

[**List&lt;Collection&gt;**](Collection.md)

### Authorization

[read_key](../README.md#read_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

