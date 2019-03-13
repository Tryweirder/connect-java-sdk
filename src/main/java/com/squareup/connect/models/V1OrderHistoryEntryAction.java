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
public enum V1OrderHistoryEntryAction {
  
  ORDER_PLACED("ORDER_PLACED"),
  
  DECLINED("DECLINED"),
  
  PAYMENT_RECEIVED("PAYMENT_RECEIVED"),
  
  CANCELED("CANCELED"),
  
  COMPLETED("COMPLETED"),
  
  REFUNDED("REFUNDED"),
  
  EXPIRED("EXPIRED");

  private String value;

  V1OrderHistoryEntryAction(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static V1OrderHistoryEntryAction fromValue(String text) {
    for (V1OrderHistoryEntryAction b : V1OrderHistoryEntryAction.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

