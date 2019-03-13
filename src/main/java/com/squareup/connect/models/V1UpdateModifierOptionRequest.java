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
import com.squareup.connect.models.V1ModifierOption;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 
 */
@ApiModel(description = "")

public class V1UpdateModifierOptionRequest {
  @JsonProperty("body")
  private V1ModifierOption body = null;

  public V1UpdateModifierOptionRequest body(V1ModifierOption body) {
    this.body = body;
    return this;
  }

   /**
   * An object containing the fields to POST for the request.  See the corresponding object definition for field details.
   * @return body
  **/
  @ApiModelProperty(required = true, value = "An object containing the fields to POST for the request.  See the corresponding object definition for field details.")
  public V1ModifierOption getBody() {
    return body;
  }

  public void setBody(V1ModifierOption body) {
    this.body = body;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1UpdateModifierOptionRequest v1UpdateModifierOptionRequest = (V1UpdateModifierOptionRequest) o;
    return Objects.equals(this.body, v1UpdateModifierOptionRequest.body);
  }

  @Override
  public int hashCode() {
    return Objects.hash(body);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1UpdateModifierOptionRequest {\n");
    
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
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

