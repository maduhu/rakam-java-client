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


package io.rakam.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.rakam.client.model.EmailActionConfig;
import io.rakam.client.model.EventFilter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * UserEmailActionBatch
 */

public class UserEmailActionBatch   {
  @SerializedName("filter")
  private String filter = null;

  @SerializedName("event_filters")
  private List<EventFilter> eventFilters = new ArrayList<EventFilter>();

  @SerializedName("config")
  private EmailActionConfig config = null;

  public UserEmailActionBatch filter(String filter) {
    this.filter = filter;
    return this;
  }

   /**
   * Get filter
   * @return filter
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getFilter() {
    return filter;
  }

  public void setFilter(String filter) {
    this.filter = filter;
  }

  public UserEmailActionBatch eventFilters(List<EventFilter> eventFilters) {
    this.eventFilters = eventFilters;
    return this;
  }

   /**
   * Get eventFilters
   * @return eventFilters
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<EventFilter> getEventFilters() {
    return eventFilters;
  }

  public void setEventFilters(List<EventFilter> eventFilters) {
    this.eventFilters = eventFilters;
  }

  public UserEmailActionBatch config(EmailActionConfig config) {
    this.config = config;
    return this;
  }

   /**
   * Get config
   * @return config
  **/
  @ApiModelProperty(example = "null", value = "")
  public EmailActionConfig getConfig() {
    return config;
  }

  public void setConfig(EmailActionConfig config) {
    this.config = config;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserEmailActionBatch userEmailActionBatch = (UserEmailActionBatch) o;
    return Objects.equals(this.filter, userEmailActionBatch.filter) &&
        Objects.equals(this.eventFilters, userEmailActionBatch.eventFilters) &&
        Objects.equals(this.config, userEmailActionBatch.config);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filter, eventFilters, config);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserEmailActionBatch {\n");
    
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    eventFilters: ").append(toIndentedString(eventFilters)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
