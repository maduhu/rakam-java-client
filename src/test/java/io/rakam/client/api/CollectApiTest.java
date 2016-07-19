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

import io.rakam.ApiException;
import io.rakam.client.model.EventList;
import io.rakam.client.model.SuccessMessage;
import io.rakam.client.model.BulkEventRemote;
import io.rakam.client.model.Event;
import io.rakam.client.model.CommitBulkEvents;
import io.rakam.client.model.ErrorMessage;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CollectApi
 */
public class CollectApiTest {

    private final CollectApi api = new CollectApi();

    
    /**
     * Collect multiple events
     *
     * Returns 1 if the events are collected.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void batchEventsTest() throws ApiException {
        EventList eventList = null;
        // Integer response = api.batchEvents(eventList);

        // TODO: test validations
    }
    
    /**
     * Collect Bulk events
     *
     * Bulk API requires master_key as api key and designed to handle large value of data. The endpoint also accepts application/avro and text/csv formats. You need need to set &#39;collection&#39; and &#39;master_key&#39; query parameters if the content-type is not application/json.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void bulkEventsTest() throws ApiException {
        EventList eventList = null;
        // SuccessMessage response = api.bulkEvents(eventList);

        // TODO: test validations
    }
    
    /**
     * Collect bulk events from remote
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void bulkEventsRemoteTest() throws ApiException {
        BulkEventRemote bulkEventRemote = null;
        // Integer response = api.bulkEventsRemote(bulkEventRemote);

        // TODO: test validations
    }
    
    /**
     * Collect event
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void collectEventTest() throws ApiException {
        Event event = null;
        // Integer response = api.collectEvent(event);

        // TODO: test validations
    }
    
    /**
     * Commit Bulk events
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void commitBulkEventsTest() throws ApiException {
        CommitBulkEvents commitBulkEvents = null;
        // SuccessMessage response = api.commitBulkEvents(commitBulkEvents);

        // TODO: test validations
    }
    
}