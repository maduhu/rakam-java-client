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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * ExportQuery
 */

public class ExportQuery   {
  @SerializedName("query")
  private String query = null;

  @SerializedName("limit")
  private Integer limit = null;

  /**
   * Gets or Sets exportType
   */
  public enum ExportTypeEnum {
    @SerializedName("AVRO")
    AVRO("AVRO"),
    
    @SerializedName("CSV")
    CSV("CSV"),
    
    @SerializedName("JSON")
    JSON("JSON");

    private String value;

    ExportTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("exportType")
  private ExportTypeEnum exportType = null;

  public ExportQuery query(String query) {
    this.query = query;
    return this;
  }

   /**
   * SQL query that will be executed on data-set
   * @return query
  **/
  @ApiModelProperty(example = "SELECT 1", value = "SQL query that will be executed on data-set")
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  public ExportQuery limit(Integer limit) {
    this.limit = limit;
    return this;
  }

   /**
   * Get limit
   * @return limit
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public ExportQuery exportType(ExportTypeEnum exportType) {
    this.exportType = exportType;
    return this;
  }

   /**
   * Get exportType
   * @return exportType
  **/
  @ApiModelProperty(example = "null", value = "")
  public ExportTypeEnum getExportType() {
    return exportType;
  }

  public void setExportType(ExportTypeEnum exportType) {
    this.exportType = exportType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExportQuery exportQuery = (ExportQuery) o;
    return Objects.equals(this.query, exportQuery.query) &&
        Objects.equals(this.limit, exportQuery.limit) &&
        Objects.equals(this.exportType, exportQuery.exportType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(query, limit, exportType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExportQuery {\n");
    
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    exportType: ").append(toIndentedString(exportType)).append("\n");
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

