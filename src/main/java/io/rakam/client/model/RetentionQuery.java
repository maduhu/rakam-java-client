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
import io.rakam.client.model.RetentionAction;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.LocalDate;


/**
 * RetentionQuery
 */

public class RetentionQuery   {
  @SerializedName("first_action")
  private RetentionAction firstAction = null;

  @SerializedName("returning_action")
  private RetentionAction returningAction = null;

  @SerializedName("dimension")
  private String dimension = null;

  /**
   * Gets or Sets dateUnit
   */
  public enum DateUnitEnum {
    @SerializedName("DAY")
    DAY("DAY"),
    
    @SerializedName("WEEK")
    WEEK("WEEK"),
    
    @SerializedName("MONTH")
    MONTH("MONTH");

    private String value;

    DateUnitEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("date_unit")
  private DateUnitEnum dateUnit = null;

  @SerializedName("period")
  private Integer period = null;

  @SerializedName("startDate")
  private LocalDate startDate = null;

  @SerializedName("endDate")
  private LocalDate endDate = null;

  public RetentionQuery firstAction(RetentionAction firstAction) {
    this.firstAction = firstAction;
    return this;
  }

   /**
   * Get firstAction
   * @return firstAction
  **/
  @ApiModelProperty(example = "null", value = "")
  public RetentionAction getFirstAction() {
    return firstAction;
  }

  public void setFirstAction(RetentionAction firstAction) {
    this.firstAction = firstAction;
  }

  public RetentionQuery returningAction(RetentionAction returningAction) {
    this.returningAction = returningAction;
    return this;
  }

   /**
   * Get returningAction
   * @return returningAction
  **/
  @ApiModelProperty(example = "null", value = "")
  public RetentionAction getReturningAction() {
    return returningAction;
  }

  public void setReturningAction(RetentionAction returningAction) {
    this.returningAction = returningAction;
  }

  public RetentionQuery dimension(String dimension) {
    this.dimension = dimension;
    return this;
  }

   /**
   * Get dimension
   * @return dimension
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDimension() {
    return dimension;
  }

  public void setDimension(String dimension) {
    this.dimension = dimension;
  }

  public RetentionQuery dateUnit(DateUnitEnum dateUnit) {
    this.dateUnit = dateUnit;
    return this;
  }

   /**
   * Get dateUnit
   * @return dateUnit
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateUnitEnum getDateUnit() {
    return dateUnit;
  }

  public void setDateUnit(DateUnitEnum dateUnit) {
    this.dateUnit = dateUnit;
  }

  public RetentionQuery period(Integer period) {
    this.period = period;
    return this;
  }

   /**
   * Get period
   * @return period
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getPeriod() {
    return period;
  }

  public void setPeriod(Integer period) {
    this.period = period;
  }

  public RetentionQuery startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @ApiModelProperty(example = "null", value = "")
  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public RetentionQuery endDate(LocalDate endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  @ApiModelProperty(example = "null", value = "")
  public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetentionQuery retentionQuery = (RetentionQuery) o;
    return Objects.equals(this.firstAction, retentionQuery.firstAction) &&
        Objects.equals(this.returningAction, retentionQuery.returningAction) &&
        Objects.equals(this.dimension, retentionQuery.dimension) &&
        Objects.equals(this.dateUnit, retentionQuery.dateUnit) &&
        Objects.equals(this.period, retentionQuery.period) &&
        Objects.equals(this.startDate, retentionQuery.startDate) &&
        Objects.equals(this.endDate, retentionQuery.endDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstAction, returningAction, dimension, dateUnit, period, startDate, endDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetentionQuery {\n");
    
    sb.append("    firstAction: ").append(toIndentedString(firstAction)).append("\n");
    sb.append("    returningAction: ").append(toIndentedString(returningAction)).append("\n");
    sb.append("    dimension: ").append(toIndentedString(dimension)).append("\n");
    sb.append("    dateUnit: ").append(toIndentedString(dateUnit)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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
