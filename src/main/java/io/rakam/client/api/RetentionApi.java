/**
 * Rakam API Documentation
 * An analytics platform API that lets you create your own analytics services.
 *
 * OpenAPI spec version: 0.5
 * Contact: contact@rakam.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.rakam.client.api;

import io.rakam.ApiCallback;
import io.rakam.ApiClient;
import io.rakam.ApiException;
import io.rakam.ApiResponse;
import io.rakam.Configuration;
import io.rakam.Pair;
import io.rakam.ProgressRequestBody;
import io.rakam.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;

import io.rakam.client.model.QueryResult;
import io.rakam.client.model.ErrorMessage;
import io.rakam.client.model.RetentionQuery;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RetentionApi {
    private ApiClient apiClient;

    public RetentionApi() {
        this(Configuration.getDefaultApiClient());
    }

    public RetentionApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for analyzeRetention */
    private com.squareup.okhttp.Call analyzeRetentionCall(RetentionQuery retentionQuery, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = retentionQuery;
        
        // verify the required parameter 'retentionQuery' is set
        if (retentionQuery == null) {
            throw new ApiException("Missing the required parameter 'retentionQuery' when calling analyzeRetention(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/retention/analyze".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "read_key" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Execute query
     * 
     * @param retentionQuery  (required)
     * @return QueryResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public QueryResult analyzeRetention(RetentionQuery retentionQuery) throws ApiException {
        ApiResponse<QueryResult> resp = analyzeRetentionWithHttpInfo(retentionQuery);
        return resp.getData();
    }

    /**
     * Execute query
     * 
     * @param retentionQuery  (required)
     * @return ApiResponse&lt;QueryResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<QueryResult> analyzeRetentionWithHttpInfo(RetentionQuery retentionQuery) throws ApiException {
        com.squareup.okhttp.Call call = analyzeRetentionCall(retentionQuery, null, null);
        Type localVarReturnType = new TypeToken<QueryResult>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Execute query (asynchronously)
     * 
     * @param retentionQuery  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call analyzeRetentionAsync(RetentionQuery retentionQuery, final ApiCallback<QueryResult> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = analyzeRetentionCall(retentionQuery, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<QueryResult>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
