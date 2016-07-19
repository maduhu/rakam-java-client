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
import io.rakam.client.model.FunnelStep;
import io.rakam.client.model.FunnelWindow;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;


/**
 * FunnelQuery
 */

public class FunnelQuery   {
  @SerializedName("steps")
  private List<FunnelStep> steps = new ArrayList<FunnelStep>();

  @SerializedName("dimension")
  private String dimension = null;

  @SerializedName("startDate")
  private LocalDate startDate = null;

  @SerializedName("window")
  private FunnelWindow window = null;

  @SerializedName("endDate")
  private LocalDate endDate = null;

  public FunnelQuery steps(List<FunnelStep> steps) {
    this.steps = steps;
    return this;
  }

   /**
   * Get steps
   * @return steps
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<FunnelStep> getSteps() {
    return steps;
  }

  public void setSteps(List<FunnelStep> steps) {
    this.steps = steps;
  }

  public FunnelQuery dimension(String dimension) {
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

  public FunnelQuery startDate(LocalDate startDate) {
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

  public FunnelQuery window(FunnelWindow window) {
    this.window = window;
    return this;
  }

   /**
   * Get window
   * @return window
  **/
  @ApiModelProperty(example = "null", value = "")
  public FunnelWindow getWindow() {
    return window;
  }

  public void setWindow(FunnelWindow window) {
    this.window = window;
  }

  public FunnelQuery endDate(LocalDate endDate) {
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
    FunnelQuery funnelQuery = (FunnelQuery) o;
    return Objects.equals(this.steps, funnelQuery.steps) &&
        Objects.equals(this.dimension, funnelQuery.dimension) &&
        Objects.equals(this.startDate, funnelQuery.startDate) &&
        Objects.equals(this.window, funnelQuery.window) &&
        Objects.equals(this.endDate, funnelQuery.endDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(steps, dimension, startDate, window, endDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FunnelQuery {\n");
    
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
    sb.append("    dimension: ").append(toIndentedString(dimension)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    window: ").append(toIndentedString(window)).append("\n");
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
