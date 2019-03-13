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
import io.swagger.annotations.ApiModel;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * 
 */
public enum V1OrderState {
  
  PENDING("PENDING"),
  
  OPEN("OPEN"),
  
  COMPLETED("COMPLETED"),
  
  CANCELED("CANCELED"),
  
  REFUNDED("REFUNDED"),
  
  REJECTED("REJECTED");

  private String value;

  V1OrderState(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static V1OrderState fromValue(String text) {
    for (V1OrderState b : V1OrderState.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

