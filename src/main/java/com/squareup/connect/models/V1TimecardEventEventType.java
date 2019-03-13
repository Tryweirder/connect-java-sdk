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
 * Actions that resulted in a change to a timecard. All timecard events created with the Connect API have an event type that begins with `API`.
 */
public enum V1TimecardEventEventType {
  
  API_CREATE("API_CREATE"),
  
  API_EDIT("API_EDIT"),
  
  API_DELETE("API_DELETE"),
  
  REGISTER_CLOCKIN("REGISTER_CLOCKIN"),
  
  REGISTER_CLOCKOUT("REGISTER_CLOCKOUT"),
  
  DASHBOARD_SUPERVISOR_CLOSE("DASHBOARD_SUPERVISOR_CLOSE"),
  
  DASHBOARD_EDIT("DASHBOARD_EDIT"),
  
  DASHBOARD_DELETE("DASHBOARD_DELETE");

  private String value;

  V1TimecardEventEventType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static V1TimecardEventEventType fromValue(String text) {
    for (V1TimecardEventEventType b : V1TimecardEventEventType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

