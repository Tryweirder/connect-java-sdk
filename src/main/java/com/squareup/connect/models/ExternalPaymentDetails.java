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
import com.squareup.connect.models.Money;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Additional details about EXTERNAL type payments.
 */
@ApiModel(description = "Additional details about EXTERNAL type payments.")

public class ExternalPaymentDetails {
  @JsonProperty("type")
  private String type = null;

  @JsonProperty("source")
  private String source = null;

  @JsonProperty("source_id")
  private String sourceId = null;

  @JsonProperty("source_fee_money")
  private Money sourceFeeMoney = null;

  public ExternalPaymentDetails type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of External payment which can be one of: CHECK - Paid by a physical check BANK_TRANSFER - Paid by ACH or other bank transfer OTHER_GIFT_CARD - Paid by a non-square gift card CRYPTO - Paid via a crypto currency SQUARE_CASH - Paid via Square Cash app SOCIAL - Venmo, WeChatPay, AliPay, etc. EXTERNAL - A 3rd party application gathered this payment outside of Square EMONEY - A Japanese e-money brand Square doesn’t support CREDIT/DEBIT - A credit/debit card Square doesn’t support OTHER - A type not listed here
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The type of External payment which can be one of: CHECK - Paid by a physical check BANK_TRANSFER - Paid by ACH or other bank transfer OTHER_GIFT_CARD - Paid by a non-square gift card CRYPTO - Paid via a crypto currency SQUARE_CASH - Paid via Square Cash app SOCIAL - Venmo, WeChatPay, AliPay, etc. EXTERNAL - A 3rd party application gathered this payment outside of Square EMONEY - A Japanese e-money brand Square doesn’t support CREDIT/DEBIT - A credit/debit card Square doesn’t support OTHER - A type not listed here")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ExternalPaymentDetails source(String source) {
    this.source = source;
    return this;
  }

   /**
   * A description of the source of the external payment, e.g. “Uber Eats”, “Stripe”, “Shopify”.  Limit 255 characters
   * @return source
  **/
  @ApiModelProperty(required = true, value = "A description of the source of the external payment, e.g. “Uber Eats”, “Stripe”, “Shopify”.  Limit 255 characters")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public ExternalPaymentDetails sourceId(String sourceId) {
    this.sourceId = sourceId;
    return this;
  }

   /**
   * An ID to associate this payment to its originating source  Limit 255 characters.
   * @return sourceId
  **/
  @ApiModelProperty(value = "An ID to associate this payment to its originating source  Limit 255 characters.")
  public String getSourceId() {
    return sourceId;
  }

  public void setSourceId(String sourceId) {
    this.sourceId = sourceId;
  }

  public ExternalPaymentDetails sourceFeeMoney(Money sourceFeeMoney) {
    this.sourceFeeMoney = sourceFeeMoney;
    return this;
  }

   /**
   * The total of fees paid to the source. (amount_money - source_fee_money) = net money to the merchant
   * @return sourceFeeMoney
  **/
  @ApiModelProperty(value = "The total of fees paid to the source. (amount_money - source_fee_money) = net money to the merchant")
  public Money getSourceFeeMoney() {
    return sourceFeeMoney;
  }

  public void setSourceFeeMoney(Money sourceFeeMoney) {
    this.sourceFeeMoney = sourceFeeMoney;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalPaymentDetails externalPaymentDetails = (ExternalPaymentDetails) o;
    return Objects.equals(this.type, externalPaymentDetails.type) &&
        Objects.equals(this.source, externalPaymentDetails.source) &&
        Objects.equals(this.sourceId, externalPaymentDetails.sourceId) &&
        Objects.equals(this.sourceFeeMoney, externalPaymentDetails.sourceFeeMoney);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, source, sourceId, sourceFeeMoney);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalPaymentDetails {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    sourceFeeMoney: ").append(toIndentedString(sourceFeeMoney)).append("\n");
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
