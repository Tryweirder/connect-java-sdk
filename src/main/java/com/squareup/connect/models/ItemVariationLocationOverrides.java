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
import com.squareup.connect.models.Money;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Price and inventory overrides for a [CatalogItemVariation](#type-catalogitemvariation) at a specific location.
 */
@ApiModel(description = "Price and inventory overrides for a [CatalogItemVariation](#type-catalogitemvariation) at a specific location.")

public class ItemVariationLocationOverrides {
  @JsonProperty("location_id")
  private String locationId = null;

  @JsonProperty("price_money")
  private Money priceMoney = null;

  /**
   * The pricing type (fixed or variable) for the [CatalogItemVariation](#type-catalogitemvariation) at the given location. See [CatalogPricingType](#type-catalogpricingtype) for all possible values.
   */
  public enum PricingTypeEnum {
    FIXED_PRICING("FIXED_PRICING"),
    
    VARIABLE_PRICING("VARIABLE_PRICING");

    private String value;

    PricingTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PricingTypeEnum fromValue(String text) {
      for (PricingTypeEnum b : PricingTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("pricing_type")
  private PricingTypeEnum pricingType = null;

  @JsonProperty("track_inventory")
  private Boolean trackInventory = null;

  /**
   * Indicates whether the [CatalogItemVariation](#type-catalogitemvariation) displays an alert when its inventory quantity is less than or equal to its `inventory_alert_threshold`. See [InventoryAlertType](#type-inventoryalerttype) for all possible values.
   */
  public enum InventoryAlertTypeEnum {
    NONE("NONE"),
    
    LOW_QUANTITY("LOW_QUANTITY");

    private String value;

    InventoryAlertTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static InventoryAlertTypeEnum fromValue(String text) {
      for (InventoryAlertTypeEnum b : InventoryAlertTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("inventory_alert_type")
  private InventoryAlertTypeEnum inventoryAlertType = null;

  @JsonProperty("inventory_alert_threshold")
  private Long inventoryAlertThreshold = null;

  public ItemVariationLocationOverrides locationId(String locationId) {
    this.locationId = locationId;
    return this;
  }

   /**
   * The ID of the location.
   * @return locationId
  **/
  @ApiModelProperty(value = "The ID of the location.")
  public String getLocationId() {
    return locationId;
  }

  public void setLocationId(String locationId) {
    this.locationId = locationId;
  }

  public ItemVariationLocationOverrides priceMoney(Money priceMoney) {
    this.priceMoney = priceMoney;
    return this;
  }

   /**
   * The price of the [CatalogItemVariation](#type-catalogitemvariation) at the given location, or blank for variable pricing.
   * @return priceMoney
  **/
  @ApiModelProperty(value = "The price of the [CatalogItemVariation](#type-catalogitemvariation) at the given location, or blank for variable pricing.")
  public Money getPriceMoney() {
    return priceMoney;
  }

  public void setPriceMoney(Money priceMoney) {
    this.priceMoney = priceMoney;
  }

  public ItemVariationLocationOverrides pricingType(PricingTypeEnum pricingType) {
    this.pricingType = pricingType;
    return this;
  }

   /**
   * The pricing type (fixed or variable) for the [CatalogItemVariation](#type-catalogitemvariation) at the given location. See [CatalogPricingType](#type-catalogpricingtype) for all possible values.
   * @return pricingType
  **/
  @ApiModelProperty(value = "The pricing type (fixed or variable) for the [CatalogItemVariation](#type-catalogitemvariation) at the given location. See [CatalogPricingType](#type-catalogpricingtype) for all possible values.")
  public PricingTypeEnum getPricingType() {
    return pricingType;
  }

  public void setPricingType(PricingTypeEnum pricingType) {
    this.pricingType = pricingType;
  }

  public ItemVariationLocationOverrides trackInventory(Boolean trackInventory) {
    this.trackInventory = trackInventory;
    return this;
  }

   /**
   * If `true`, inventory tracking is active for the [CatalogItemVariation](#type-catalogitemvariation) at this location.
   * @return trackInventory
  **/
  @ApiModelProperty(value = "If `true`, inventory tracking is active for the [CatalogItemVariation](#type-catalogitemvariation) at this location.")
  public Boolean getTrackInventory() {
    return trackInventory;
  }

  public void setTrackInventory(Boolean trackInventory) {
    this.trackInventory = trackInventory;
  }

  public ItemVariationLocationOverrides inventoryAlertType(InventoryAlertTypeEnum inventoryAlertType) {
    this.inventoryAlertType = inventoryAlertType;
    return this;
  }

   /**
   * Indicates whether the [CatalogItemVariation](#type-catalogitemvariation) displays an alert when its inventory quantity is less than or equal to its `inventory_alert_threshold`. See [InventoryAlertType](#type-inventoryalerttype) for all possible values.
   * @return inventoryAlertType
  **/
  @ApiModelProperty(value = "Indicates whether the [CatalogItemVariation](#type-catalogitemvariation) displays an alert when its inventory quantity is less than or equal to its `inventory_alert_threshold`. See [InventoryAlertType](#type-inventoryalerttype) for all possible values.")
  public InventoryAlertTypeEnum getInventoryAlertType() {
    return inventoryAlertType;
  }

  public void setInventoryAlertType(InventoryAlertTypeEnum inventoryAlertType) {
    this.inventoryAlertType = inventoryAlertType;
  }

  public ItemVariationLocationOverrides inventoryAlertThreshold(Long inventoryAlertThreshold) {
    this.inventoryAlertThreshold = inventoryAlertThreshold;
    return this;
  }

   /**
   * If the inventory quantity for the variation is less than or equal to this value and `inventory_alert_type` is `LOW_QUANTITY`, the variation displays an alert in the merchant dashboard.  This value is always an integer.
   * @return inventoryAlertThreshold
  **/
  @ApiModelProperty(value = "If the inventory quantity for the variation is less than or equal to this value and `inventory_alert_type` is `LOW_QUANTITY`, the variation displays an alert in the merchant dashboard.  This value is always an integer.")
  public Long getInventoryAlertThreshold() {
    return inventoryAlertThreshold;
  }

  public void setInventoryAlertThreshold(Long inventoryAlertThreshold) {
    this.inventoryAlertThreshold = inventoryAlertThreshold;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemVariationLocationOverrides itemVariationLocationOverrides = (ItemVariationLocationOverrides) o;
    return Objects.equals(this.locationId, itemVariationLocationOverrides.locationId) &&
        Objects.equals(this.priceMoney, itemVariationLocationOverrides.priceMoney) &&
        Objects.equals(this.pricingType, itemVariationLocationOverrides.pricingType) &&
        Objects.equals(this.trackInventory, itemVariationLocationOverrides.trackInventory) &&
        Objects.equals(this.inventoryAlertType, itemVariationLocationOverrides.inventoryAlertType) &&
        Objects.equals(this.inventoryAlertThreshold, itemVariationLocationOverrides.inventoryAlertThreshold);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locationId, priceMoney, pricingType, trackInventory, inventoryAlertType, inventoryAlertThreshold);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemVariationLocationOverrides {\n");
    
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    priceMoney: ").append(toIndentedString(priceMoney)).append("\n");
    sb.append("    pricingType: ").append(toIndentedString(pricingType)).append("\n");
    sb.append("    trackInventory: ").append(toIndentedString(trackInventory)).append("\n");
    sb.append("    inventoryAlertType: ").append(toIndentedString(inventoryAlertType)).append("\n");
    sb.append("    inventoryAlertThreshold: ").append(toIndentedString(inventoryAlertThreshold)).append("\n");
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

