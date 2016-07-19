# rakam-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.rakam</groupId>
    <artifactId>rakam-client</artifactId>
    <version>0.5</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.rakam:rakam-client:0.5"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/rakam-client-0.5.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.rakam.*;
import io.rakam.auth.*;
import io.rakam.model.*;
import io.rakam.client.api.AdminApi;

import java.io.File;
import java.util.*;

public class AdminApiExample {

    public static void main(String[] args) {
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
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://app.rakam.io/*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AdminApi* | [**addCustomFieldsToSchema**](docs/AdminApi.md#addCustomFieldsToSchema) | **POST** /project/schema/add/custom | Add fields to collections by transforming other schemas
*AdminApi* | [**addFieldsToSchema**](docs/AdminApi.md#addFieldsToSchema) | **POST** /project/schema/add | Add fields to collections
*AdminApi* | [**checkApiKeys**](docs/AdminApi.md#checkApiKeys) | **POST** /project/check-api-keys | Create API Keys
*AdminApi* | [**checkLockKey**](docs/AdminApi.md#checkLockKey) | **POST** /admin/lock_key | Check lock key
*AdminApi* | [**collections**](docs/AdminApi.md#collections) | **POST** /project/collection | Get collection names
*AdminApi* | [**createApiKeys**](docs/AdminApi.md#createApiKeys) | **POST** /project/create-api-keys | Create API Keys
*AdminApi* | [**createProject**](docs/AdminApi.md#createProject) | **POST** /project/create | Create project
*AdminApi* | [**deleteProject**](docs/AdminApi.md#deleteProject) | **DELETE** /project/delete | Delete project
*AdminApi* | [**getConfigurations**](docs/AdminApi.md#getConfigurations) | **GET** /admin/configurations | List installed modules
*AdminApi* | [**getProjects**](docs/AdminApi.md#getProjects) | **GET** /project/list | List created projects
*AdminApi* | [**getStats**](docs/AdminApi.md#getStats) | **POST** /project/stats | Get project stats
*AdminApi* | [**getTypes**](docs/AdminApi.md#getTypes) | **GET** /admin/types | Get types
*AdminApi* | [**revokeApiKeys**](docs/AdminApi.md#revokeApiKeys) | **DELETE** /project/revoke-api-keys | Revoke API Keys
*AdminApi* | [**schema**](docs/AdminApi.md#schema) | **POST** /project/schema | Get collection schema
*CollectApi* | [**batchEvents**](docs/CollectApi.md#batchEvents) | **POST** /event/batch | Collect multiple events
*CollectApi* | [**bulkEvents**](docs/CollectApi.md#bulkEvents) | **POST** /event/bulk | Collect Bulk events
*CollectApi* | [**bulkEventsRemote**](docs/CollectApi.md#bulkEventsRemote) | **POST** /event/bulk/remote | Collect bulk events from remote
*CollectApi* | [**collectEvent**](docs/CollectApi.md#collectEvent) | **POST** /event/collect | Collect event
*CollectApi* | [**commitBulkEvents**](docs/CollectApi.md#commitBulkEvents) | **POST** /event/bulk/commit | Commit Bulk events
*ContinuousqueryApi* | [**createQuery**](docs/ContinuousqueryApi.md#createQuery) | **POST** /continuous-query/create | Create stream
*ContinuousqueryApi* | [**deleteQuery**](docs/ContinuousqueryApi.md#deleteQuery) | **POST** /continuous-query/delete | Delete stream
*ContinuousqueryApi* | [**getQuery**](docs/ContinuousqueryApi.md#getQuery) | **POST** /continuous-query/get | Get continuous query
*ContinuousqueryApi* | [**getSchemaOfQuery**](docs/ContinuousqueryApi.md#getSchemaOfQuery) | **POST** /continuous-query/schema | Get query schema
*ContinuousqueryApi* | [**listQueries**](docs/ContinuousqueryApi.md#listQueries) | **POST** /continuous-query/list | List queries
*ContinuousqueryApi* | [**testQuery**](docs/ContinuousqueryApi.md#testQuery) | **POST** /continuous-query/test | Test continuous query
*EventexplorerApi* | [**analyzeEvents**](docs/EventexplorerApi.md#analyzeEvents) | **POST** /event-explorer/analyze | Perform simple query on event data
*EventexplorerApi* | [**createPrecomputedTable**](docs/EventexplorerApi.md#createPrecomputedTable) | **POST** /event-explorer/pre_calculate | Create Pre-computed table
*EventexplorerApi* | [**getEventStatistics**](docs/EventexplorerApi.md#getEventStatistics) | **POST** /event-explorer/statistics | Event statistics
*EventexplorerApi* | [**getExtraDimensions**](docs/EventexplorerApi.md#getExtraDimensions) | **GET** /event-explorer/extra_dimensions | Event statistics
*FunnelApi* | [**analyzeFunnel**](docs/FunnelApi.md#analyzeFunnel) | **POST** /funnel/analyze | Execute query
*MaterializedviewApi* | [**createView**](docs/MaterializedviewApi.md#createView) | **POST** /materialized-view/create | Create view
*MaterializedviewApi* | [**deleteView**](docs/MaterializedviewApi.md#deleteView) | **POST** /materialized-view/delete | Delete materialized view
*MaterializedviewApi* | [**getSchemaOfView**](docs/MaterializedviewApi.md#getSchemaOfView) | **POST** /materialized-view/schema | Get schemas
*MaterializedviewApi* | [**getView**](docs/MaterializedviewApi.md#getView) | **POST** /materialized-view/get | Get view
*MaterializedviewApi* | [**listViews**](docs/MaterializedviewApi.md#listViews) | **POST** /materialized-view/list | List views
*QueryApi* | [**execute**](docs/QueryApi.md#execute) | **POST** /query/execute | Execute query on event data-set
*QueryApi* | [**explain**](docs/QueryApi.md#explain) | **POST** /query/explain | Explain query
*QueryApi* | [**metadata**](docs/QueryApi.md#metadata) | **POST** /query/metadata | Test query
*RealtimeApi* | [**createTable**](docs/RealtimeApi.md#createTable) | **POST** /realtime/create | Create report
*RealtimeApi* | [**deleteTable**](docs/RealtimeApi.md#deleteTable) | **POST** /realtime/delete | Delete report
*RealtimeApi* | [**listTables**](docs/RealtimeApi.md#listTables) | **POST** /realtime/list | List queries
*RealtimeApi* | [**queryTable**](docs/RealtimeApi.md#queryTable) | **POST** /realtime/get | Get report
*RecipeApi* | [**exportRecipe**](docs/RecipeApi.md#exportRecipe) | **GET** /recipe/export | Export recipe
*RecipeApi* | [**installRecipe**](docs/RecipeApi.md#installRecipe) | **POST** /recipe/install | Install recipe
*RetentionApi* | [**analyzeRetention**](docs/RetentionApi.md#analyzeRetention) | **POST** /retention/analyze | Execute query
*UserApi* | [**createSegment**](docs/UserApi.md#createSegment) | **POST** /user/create_segment | Get events of the user
*UserApi* | [**createUser**](docs/UserApi.md#createUser) | **POST** /user/create | Create new user
*UserApi* | [**createUsers**](docs/UserApi.md#createUsers) | **POST** /user/batch/create | Create multiple new users
*UserApi* | [**getEvents**](docs/UserApi.md#getEvents) | **POST** /user/get_events | Get events of the user
*UserApi* | [**getMetadata**](docs/UserApi.md#getMetadata) | **GET** /user/metadata | Get user storage metadata
*UserApi* | [**getUser**](docs/UserApi.md#getUser) | **POST** /user/get | Get user
*UserApi* | [**incrementProperty**](docs/UserApi.md#incrementProperty) | **POST** /user/increment_property | Set user property
*UserApi* | [**searchUsers**](docs/UserApi.md#searchUsers) | **POST** /user/search | Search users
*UserApi* | [**setProperties**](docs/UserApi.md#setProperties) | **POST** /user/set_properties | Set user properties
*UserApi* | [**setPropertiesOnce**](docs/UserApi.md#setPropertiesOnce) | **POST** /user/set_properties_once | Set user properties once
*UserApi* | [**unsetProperty**](docs/UserApi.md#unsetProperty) | **POST** /user/unset_properties | Unset user property
*UseractionApi* | [**batch**](docs/UseractionApi.md#batch) | **POST** /user/action/email/batch | Apply batch operation
*UseractionApi* | [**send**](docs/UseractionApi.md#send) | **POST** /user/action/email/single | Perform action for single user


## Documentation for Models

 - [AnalyzeRequest](docs/AnalyzeRequest.md)
 - [BulkEventRemote](docs/BulkEventRemote.md)
 - [CheckLockKey](docs/CheckLockKey.md)
 - [Collection](docs/Collection.md)
 - [CollectionDefinition](docs/CollectionDefinition.md)
 - [CollectionEvent](docs/CollectionEvent.md)
 - [CommitBulkEvents](docs/CommitBulkEvents.md)
 - [CommitRequest](docs/CommitRequest.md)
 - [Condition](docs/Condition.md)
 - [ConfigItem](docs/ConfigItem.md)
 - [ContinuousQuery](docs/ContinuousQuery.md)
 - [ContinuousQueryDeleteQuery](docs/ContinuousQueryDeleteQuery.md)
 - [ContinuousQueryGetQuery](docs/ContinuousQueryGetQuery.md)
 - [ContinuousQueryGetSchemaOfQuery](docs/ContinuousQueryGetSchemaOfQuery.md)
 - [ContinuousQueryTestQuery](docs/ContinuousQueryTestQuery.md)
 - [CreatePrecomputedTable](docs/CreatePrecomputedTable.md)
 - [CreateProject](docs/CreateProject.md)
 - [EmailActionConfig](docs/EmailActionConfig.md)
 - [ErrorMessage](docs/ErrorMessage.md)
 - [Event](docs/Event.md)
 - [EventContext](docs/EventContext.md)
 - [EventExplorerGetEventStatistics](docs/EventExplorerGetEventStatistics.md)
 - [EventFilter](docs/EventFilter.md)
 - [EventFilterAggregation](docs/EventFilterAggregation.md)
 - [EventList](docs/EventList.md)
 - [Execute](docs/Execute.md)
 - [Explain](docs/Explain.md)
 - [ExportQuery](docs/ExportQuery.md)
 - [FunnelQuery](docs/FunnelQuery.md)
 - [FunnelStep](docs/FunnelStep.md)
 - [FunnelWindow](docs/FunnelWindow.md)
 - [GroupBy](docs/GroupBy.md)
 - [Library](docs/Library.md)
 - [MappingPlugin](docs/MappingPlugin.md)
 - [MaterializedView](docs/MaterializedView.md)
 - [MaterializedViewDeleteView](docs/MaterializedViewDeleteView.md)
 - [MaterializedViewGetSchemaOfView](docs/MaterializedViewGetSchemaOfView.md)
 - [MaterializedViewGetView](docs/MaterializedViewGetView.md)
 - [MaterializedViewSchema](docs/MaterializedViewSchema.md)
 - [Measure](docs/Measure.md)
 - [MetadataResponse](docs/MetadataResponse.md)
 - [ModuleDescriptor](docs/ModuleDescriptor.md)
 - [OLAPTable](docs/OLAPTable.md)
 - [Ordering](docs/Ordering.md)
 - [PrecalculatedTable](docs/PrecalculatedTable.md)
 - [ProjectAddCustomFieldsToSchema](docs/ProjectAddCustomFieldsToSchema.md)
 - [ProjectAddFieldsToSchema](docs/ProjectAddFieldsToSchema.md)
 - [ProjectApiKeys](docs/ProjectApiKeys.md)
 - [ProjectCheckApiKeys](docs/ProjectCheckApiKeys.md)
 - [ProjectGetStats](docs/ProjectGetStats.md)
 - [ProjectSchema](docs/ProjectSchema.md)
 - [QueryError](docs/QueryError.md)
 - [QueryMetadata](docs/QueryMetadata.md)
 - [QueryResult](docs/QueryResult.md)
 - [RealTimeQueryResult](docs/RealTimeQueryResult.md)
 - [RealTimeReport](docs/RealTimeReport.md)
 - [RealtimeDeleteTable](docs/RealtimeDeleteTable.md)
 - [RealtimeQueryTable](docs/RealtimeQueryTable.md)
 - [Recipe](docs/Recipe.md)
 - [Reference](docs/Reference.md)
 - [ResponseQuery](docs/ResponseQuery.md)
 - [RetentionAction](docs/RetentionAction.md)
 - [RetentionQuery](docs/RetentionQuery.md)
 - [SchemaField](docs/SchemaField.md)
 - [SchemaFieldInfo](docs/SchemaFieldInfo.md)
 - [Sorting](docs/Sorting.md)
 - [Stats](docs/Stats.md)
 - [SuccessMessage](docs/SuccessMessage.md)
 - [Timeframe](docs/Timeframe.md)
 - [User](docs/User.md)
 - [UserContext](docs/UserContext.md)
 - [UserCreateSegment](docs/UserCreateSegment.md)
 - [UserCreateUsers](docs/UserCreateUsers.md)
 - [UserEmailActionBatch](docs/UserEmailActionBatch.md)
 - [UserEmailActionSend](docs/UserEmailActionSend.md)
 - [UserGetEvents](docs/UserGetEvents.md)
 - [UserGetUser](docs/UserGetUser.md)
 - [UserIncrementProperty](docs/UserIncrementProperty.md)
 - [UserSearchUsers](docs/UserSearchUsers.md)
 - [UserUnsetProperty](docs/UserUnsetProperty.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### read_key

- **Type**: API key
- **API key parameter name**: read_key
- **Location**: HTTP header

### master_key

- **Type**: API key
- **API key parameter name**: master_key
- **Location**: HTTP header

### write_key

- **Type**: API key
- **API key parameter name**: write_key
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issue.

## Author

contact@rakam.io

