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
import io.rakam.client.model.EventFilter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * UserCreateSegment
 */

public class UserCreateSegment   {
  @SerializedName("name")
  private String name = null;

  @SerializedName("table_name")
  private String tableName = null;

  @SerializedName("filter_expression")
  private String filterExpression = null;

  @SerializedName("event_filters")
  private List<EventFilter> eventFilters = new ArrayList<EventFilter>();

  @SerializedName("cache_eviction")
  private String cacheEviction = null;

  public UserCreateSegment name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UserCreateSegment tableName(String tableName) {
    this.tableName = tableName;
    return this;
  }

   /**
   * Get tableName
   * @return tableName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTableName() {
    return tableName;
  }

  public void setTableName(String tableName) {
    this.tableName = tableName;
  }

  public UserCreateSegment filterExpression(String filterExpression) {
    this.filterExpression = filterExpression;
    return this;
  }

   /**
   * Get filterExpression
   * @return filterExpression
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getFilterExpression() {
    return filterExpression;
  }

  public void setFilterExpression(String filterExpression) {
    this.filterExpression = filterExpression;
  }

  public UserCreateSegment eventFilters(List<EventFilter> eventFilters) {
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

  public UserCreateSegment cacheEviction(String cacheEviction) {
    this.cacheEviction = cacheEviction;
    return this;
  }

   /**
   * Get cacheEviction
   * @return cacheEviction
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCacheEviction() {
    return cacheEviction;
  }

  public void setCacheEviction(String cacheEviction) {
    this.cacheEviction = cacheEviction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserCreateSegment userCreateSegment = (UserCreateSegment) o;
    return Objects.equals(this.name, userCreateSegment.name) &&
        Objects.equals(this.tableName, userCreateSegment.tableName) &&
        Objects.equals(this.filterExpression, userCreateSegment.filterExpression) &&
        Objects.equals(this.eventFilters, userCreateSegment.eventFilters) &&
        Objects.equals(this.cacheEviction, userCreateSegment.cacheEviction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, tableName, filterExpression, eventFilters, cacheEviction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserCreateSegment {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
    sb.append("    filterExpression: ").append(toIndentedString(filterExpression)).append("\n");
    sb.append("    eventFilters: ").append(toIndentedString(eventFilters)).append("\n");
    sb.append("    cacheEviction: ").append(toIndentedString(cacheEviction)).append("\n");
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

