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
 * Represents an amount of money. &#x60;Money&#x60; fields can be signed or unsigned. Fields that do not explicitly define whether they are signed or unsigned are considered unsigned and can only hold positive amounts. For signed fields, the sign of the value indicates the purpose of the money transfer. See [Working with Monetary Amounts](/build-basics/working-with-monetary-amounts) for more information.
 */
@ApiModel(description = "Represents an amount of money. `Money` fields can be signed or unsigned. Fields that do not explicitly define whether they are signed or unsigned are considered unsigned and can only hold positive amounts. For signed fields, the sign of the value indicates the purpose of the money transfer. See [Working with Monetary Amounts](/build-basics/working-with-monetary-amounts) for more information.")

public class Money {
  @JsonProperty("amount")
  private Long amount = null;

  @JsonProperty("currency")
  private String currency = null;

  public Money amount(Long amount) {
    this.amount = amount;
    return this;
  }

   /**
   * The amount of money, in the smallest denomination of the currency indicated by `currency`. For example, when `currency` is `USD`, `amount` is in cents. Monetary amounts can be positive or negative. See the specific field description to determine the meaning of the sign in a particular case.
   * @return amount
  **/
  @ApiModelProperty(value = "The amount of money, in the smallest denomination of the currency indicated by `currency`. For example, when `currency` is `USD`, `amount` is in cents. Monetary amounts can be positive or negative. See the specific field description to determine the meaning of the sign in a particular case.")
  public Long getAmount() {
    return amount;
  }

  public void setAmount(Long amount) {
    this.amount = amount;
  }

  public Money currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * The type of currency, in __ISO 4217 format__. For example, the currency code for US dollars is `USD`.  See `Currency` for possible values. See [Currency](#type-currency) for possible values
   * @return currency
  **/
  @ApiModelProperty(value = "The type of currency, in __ISO 4217 format__. For example, the currency code for US dollars is `USD`.  See `Currency` for possible values. See [Currency](#type-currency) for possible values")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Money money = (Money) o;
    return Objects.equals(this.amount, money.amount) &&
        Objects.equals(this.currency, money.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, currency);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Money {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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

