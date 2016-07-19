# CollectApi

All URIs are relative to *https://app.rakam.io/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**batchEvents**](CollectApi.md#batchEvents) | **POST** /event/batch | Collect multiple events
[**bulkEvents**](CollectApi.md#bulkEvents) | **POST** /event/bulk | Collect Bulk events
[**bulkEventsRemote**](CollectApi.md#bulkEventsRemote) | **POST** /event/bulk/remote | Collect bulk events from remote
[**collectEvent**](CollectApi.md#collectEvent) | **POST** /event/collect | Collect event
[**commitBulkEvents**](CollectApi.md#commitBulkEvents) | **POST** /event/bulk/commit | Commit Bulk events


<a name="batchEvents"></a>
# **batchEvents**
> Integer batchEvents(eventList)

Collect multiple events

Returns 1 if the events are collected.

### Example
```java
// Import classes:
//import io.rakam.ApiException;
//import io.rakam.client.api.CollectApi;


CollectApi apiInstance = new CollectApi();
EventList eventList = new EventList(); // EventList | 
try {
    Integer result = apiInstance.batchEvents(eventList);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectApi#batchEvents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventList** | [**EventList**](EventList.md)|  |

### Return type

**Integer**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="bulkEvents"></a>
# **bulkEvents**
> SuccessMessage bulkEvents(eventList)

Collect Bulk events

Bulk API requires master_key as api key and designed to handle large value of data. The endpoint also accepts application/avro and text/csv formats. You need need to set &#39;collection&#39; and &#39;master_key&#39; query parameters if the content-type is not application/json.

### Example
```java
// Import classes:
//import io.rakam.ApiException;
//import io.rakam.client.api.CollectApi;


CollectApi apiInstance = new CollectApi();
EventList eventList = new EventList(); // EventList | 
try {
    SuccessMessage result = apiInstance.bulkEvents(eventList);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectApi#bulkEvents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventList** | [**EventList**](EventList.md)|  |

### Return type

[**SuccessMessage**](SuccessMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="bulkEventsRemote"></a>
# **bulkEventsRemote**
> Integer bulkEventsRemote(bulkEventRemote)

Collect bulk events from remote



### Example
```java
// Import classes:
//import io.rakam.ApiException;
//import io.rakam.client.api.CollectApi;


CollectApi apiInstance = new CollectApi();
BulkEventRemote bulkEventRemote = new BulkEventRemote(); // BulkEventRemote | 
try {
    Integer result = apiInstance.bulkEventsRemote(bulkEventRemote);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectApi#bulkEventsRemote");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bulkEventRemote** | [**BulkEventRemote**](BulkEventRemote.md)|  |

### Return type

**Integer**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="collectEvent"></a>
# **collectEvent**
> Integer collectEvent(event)

Collect event



### Example
```java
// Import classes:
//import io.rakam.ApiException;
//import io.rakam.client.api.CollectApi;


CollectApi apiInstance = new CollectApi();
Event event = new Event(); // Event | 
try {
    Integer result = apiInstance.collectEvent(event);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectApi#collectEvent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **event** | [**Event**](Event.md)|  |

### Return type

**Integer**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="commitBulkEvents"></a>
# **commitBulkEvents**
> SuccessMessage commitBulkEvents(commitBulkEvents)

Commit Bulk events



### Example
```java
// Import classes:
//import io.rakam.ApiClient;
//import io.rakam.ApiException;
//import io.rakam.Configuration;
//import io.rakam.auth.*;
//import io.rakam.client.api.CollectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: master_key
ApiKeyAuth master_key = (ApiKeyAuth) defaultClient.getAuthentication("master_key");
master_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//master_key.setApiKeyPrefix("Token");

CollectApi apiInstance = new CollectApi();
CommitBulkEvents commitBulkEvents = new CommitBulkEvents(); // CommitBulkEvents | 
try {
    SuccessMessage result = apiInstance.commitBulkEvents(commitBulkEvents);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectApi#commitBulkEvents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **commitBulkEvents** | [**CommitBulkEvents**](CommitBulkEvents.md)|  |

### Return type

[**SuccessMessage**](SuccessMessage.md)

### Authorization

[master_key](../README.md#master_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

