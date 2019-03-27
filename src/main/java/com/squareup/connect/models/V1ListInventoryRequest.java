/*
 * Square Connect API
 * Client library for accessing the Square Connect APIs
 *
 * OpenAPI spec version: 2.0
 * Contact: developers@squareup.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.squareup.connect.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 
 */
@ApiModel(description = "")

public class V1ListInventoryRequest {
  @JsonProperty("limit")
  private Integer limit = null;

  @JsonProperty("batch_token")
  private String batchToken = null;

  public V1ListInventoryRequest limit(Integer limit) {
    this.limit = limit;
    return this;
  }

   /**
   * The maximum number of inventory entries to return in a single response. This value cannot exceed 1000.
   * @return limit
  **/
  @ApiModelProperty(value = "The maximum number of inventory entries to return in a single response. This value cannot exceed 1000.")
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public V1ListInventoryRequest batchToken(String batchToken) {
    this.batchToken = batchToken;
    return this;
  }

   /**
   * A pagination cursor to retrieve the next set of results for your original query to the endpoint.
   * @return batchToken
  **/
  @ApiModelProperty(value = "A pagination cursor to retrieve the next set of results for your original query to the endpoint.")
  public String getBatchToken() {
    return batchToken;
  }

  public void setBatchToken(String batchToken) {
    this.batchToken = batchToken;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ListInventoryRequest v1ListInventoryRequest = (V1ListInventoryRequest) o;
    return Objects.equals(this.limit, v1ListInventoryRequest.limit) &&
        Objects.equals(this.batchToken, v1ListInventoryRequest.batchToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limit, batchToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ListInventoryRequest {\n");
    
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    batchToken: ").append(toIndentedString(batchToken)).append("\n");
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
