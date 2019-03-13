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
import com.squareup.connect.models.DateRange;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * A &#x60;Shift&#x60; search query filter parameter that sets a range of days that  a &#x60;Shift&#x60; must start or end in before passing the filter condition.
 */
@ApiModel(description = "A `Shift` search query filter parameter that sets a range of days that  a `Shift` must start or end in before passing the filter condition.")

public class ShiftWorkday {
  @JsonProperty("date_range")
  private DateRange dateRange = null;

  /**
   * The strategy on which the dates are applied.
   */
  public enum MatchShiftsByEnum {
    START_AT("START_AT"),
    
    END_AT("END_AT"),
    
    INTERSECTION("INTERSECTION");

    private String value;

    MatchShiftsByEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static MatchShiftsByEnum fromValue(String text) {
      for (MatchShiftsByEnum b : MatchShiftsByEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("match_shifts_by")
  private MatchShiftsByEnum matchShiftsBy = null;

  @JsonProperty("default_timezone")
  private String defaultTimezone = null;

  public ShiftWorkday dateRange(DateRange dateRange) {
    this.dateRange = dateRange;
    return this;
  }

   /**
   * Dates for fetching the shifts
   * @return dateRange
  **/
  @ApiModelProperty(value = "Dates for fetching the shifts")
  public DateRange getDateRange() {
    return dateRange;
  }

  public void setDateRange(DateRange dateRange) {
    this.dateRange = dateRange;
  }

  public ShiftWorkday matchShiftsBy(MatchShiftsByEnum matchShiftsBy) {
    this.matchShiftsBy = matchShiftsBy;
    return this;
  }

   /**
   * The strategy on which the dates are applied.
   * @return matchShiftsBy
  **/
  @ApiModelProperty(value = "The strategy on which the dates are applied.")
  public MatchShiftsByEnum getMatchShiftsBy() {
    return matchShiftsBy;
  }

  public void setMatchShiftsBy(MatchShiftsByEnum matchShiftsBy) {
    this.matchShiftsBy = matchShiftsBy;
  }

  public ShiftWorkday defaultTimezone(String defaultTimezone) {
    this.defaultTimezone = defaultTimezone;
    return this;
  }

   /**
   * Location-specific timezones convert workdays to datetime filters. Every location included in the query must have a timezone, or this field must be provided as a fallback. Format: the IANA timezone database identifier for the relevant timezone.
   * @return defaultTimezone
  **/
  @ApiModelProperty(value = "Location-specific timezones convert workdays to datetime filters. Every location included in the query must have a timezone, or this field must be provided as a fallback. Format: the IANA timezone database identifier for the relevant timezone.")
  public String getDefaultTimezone() {
    return defaultTimezone;
  }

  public void setDefaultTimezone(String defaultTimezone) {
    this.defaultTimezone = defaultTimezone;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShiftWorkday shiftWorkday = (ShiftWorkday) o;
    return Objects.equals(this.dateRange, shiftWorkday.dateRange) &&
        Objects.equals(this.matchShiftsBy, shiftWorkday.matchShiftsBy) &&
        Objects.equals(this.defaultTimezone, shiftWorkday.defaultTimezone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateRange, matchShiftsBy, defaultTimezone);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShiftWorkday {\n");
    
    sb.append("    dateRange: ").append(toIndentedString(dateRange)).append("\n");
    sb.append("    matchShiftsBy: ").append(toIndentedString(matchShiftsBy)).append("\n");
    sb.append("    defaultTimezone: ").append(toIndentedString(defaultTimezone)).append("\n");
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

