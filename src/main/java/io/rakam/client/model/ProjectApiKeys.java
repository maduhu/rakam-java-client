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
 * ProjectApiKeys
 */

public class ProjectApiKeys   {
  @SerializedName("master_key")
  private String masterKey = null;

  @SerializedName("read_key")
  private String readKey = null;

  @SerializedName("write_key")
  private String writeKey = null;

  public ProjectApiKeys masterKey(String masterKey) {
    this.masterKey = masterKey;
    return this;
  }

   /**
   * Get masterKey
   * @return masterKey
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMasterKey() {
    return masterKey;
  }

  public void setMasterKey(String masterKey) {
    this.masterKey = masterKey;
  }

  public ProjectApiKeys readKey(String readKey) {
    this.readKey = readKey;
    return this;
  }

   /**
   * Get readKey
   * @return readKey
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getReadKey() {
    return readKey;
  }

  public void setReadKey(String readKey) {
    this.readKey = readKey;
  }

  public ProjectApiKeys writeKey(String writeKey) {
    this.writeKey = writeKey;
    return this;
  }

   /**
   * Get writeKey
   * @return writeKey
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getWriteKey() {
    return writeKey;
  }

  public void setWriteKey(String writeKey) {
    this.writeKey = writeKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectApiKeys projectApiKeys = (ProjectApiKeys) o;
    return Objects.equals(this.masterKey, projectApiKeys.masterKey) &&
        Objects.equals(this.readKey, projectApiKeys.readKey) &&
        Objects.equals(this.writeKey, projectApiKeys.writeKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(masterKey, readKey, writeKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectApiKeys {\n");
    
    sb.append("    masterKey: ").append(toIndentedString(masterKey)).append("\n");
    sb.append("    readKey: ").append(toIndentedString(readKey)).append("\n");
    sb.append("    writeKey: ").append(toIndentedString(writeKey)).append("\n");
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

