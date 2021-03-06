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
import io.rakam.client.model.ContinuousQuery;
import io.rakam.client.model.SuccessMessage;
import io.rakam.client.model.ErrorMessage;
import io.rakam.client.model.ContinuousQueryDeleteQuery;
import io.rakam.client.model.ContinuousQueryGetQuery;
import io.rakam.client.model.Collection;
import io.rakam.client.model.ContinuousQueryGetSchemaOfQuery;
import io.rakam.client.model.ContinuousQueryTestQuery;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ContinuousqueryApi
 */
public class ContinuousqueryApiTest {

    private final ContinuousqueryApi api = new ContinuousqueryApi();

    
    /**
     * Create stream
     *
     * Creates a new continuous query for specified SQL query. Rakam will process data in batches keep the result of query in-memory all the time. Compared to reports, continuous queries continuously aggregate the data on the fly and the result is always available either in-memory or disk.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createQueryTest() throws ApiException {
        ContinuousQuery continuousQuery = null;
        // SuccessMessage response = api.createQuery(continuousQuery);

        // TODO: test validations
    }
    
    /**
     * Delete stream
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteQueryTest() throws ApiException {
        ContinuousQueryDeleteQuery continuousQueryDeleteQuery = null;
        // SuccessMessage response = api.deleteQuery(continuousQueryDeleteQuery);

        // TODO: test validations
    }
    
    /**
     * Get continuous query
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getQueryTest() throws ApiException {
        ContinuousQueryGetQuery continuousQueryGetQuery = null;
        // ContinuousQuery response = api.getQuery(continuousQueryGetQuery);

        // TODO: test validations
    }
    
    /**
     * Get query schema
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSchemaOfQueryTest() throws ApiException {
        ContinuousQueryGetSchemaOfQuery continuousQueryGetSchemaOfQuery = null;
        // List<Collection> response = api.getSchemaOfQuery(continuousQueryGetSchemaOfQuery);

        // TODO: test validations
    }
    
    /**
     * List queries
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listQueriesTest() throws ApiException {
        // List<ContinuousQuery> response = api.listQueries();

        // TODO: test validations
    }
    
    /**
     * Test continuous query
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void testQueryTest() throws ApiException {
        ContinuousQueryTestQuery continuousQueryTestQuery = null;
        // Boolean response = api.testQuery(continuousQueryTestQuery);

        // TODO: test validations
    }
    
}
