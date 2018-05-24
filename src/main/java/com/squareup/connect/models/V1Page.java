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
import com.squareup.connect.models.V1PageCell;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * V1Page
 */

public class V1Page {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("page_index")
  private Integer pageIndex = null;

  @JsonProperty("cells")
  private List<V1PageCell> cells = new ArrayList<V1PageCell>();

  public V1Page id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The page's unique identifier.
   * @return id
  **/
  @ApiModelProperty(value = "The page's unique identifier.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public V1Page name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The page's name, if any.
   * @return name
  **/
  @ApiModelProperty(value = "The page's name, if any.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public V1Page pageIndex(Integer pageIndex) {
    this.pageIndex = pageIndex;
    return this;
  }

   /**
   * The page's position in the merchant's list of pages. Always an integer between 0 and 6, inclusive.
   * minimum: 0
   * maximum: 6
   * @return pageIndex
  **/
  @ApiModelProperty(value = "The page's position in the merchant's list of pages. Always an integer between 0 and 6, inclusive.")
  public Integer getPageIndex() {
    return pageIndex;
  }

  public void setPageIndex(Integer pageIndex) {
    this.pageIndex = pageIndex;
  }

  public V1Page cells(List<V1PageCell> cells) {
    this.cells = cells;
    return this;
  }

  public V1Page addCellsItem(V1PageCell cellsItem) {
    this.cells.add(cellsItem);
    return this;
  }

   /**
   * The cells included on the page.
   * @return cells
  **/
  @ApiModelProperty(value = "The cells included on the page.")
  public List<V1PageCell> getCells() {
    return cells;
  }

  public void setCells(List<V1PageCell> cells) {
    this.cells = cells;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1Page v1Page = (V1Page) o;
    return Objects.equals(this.id, v1Page.id) &&
        Objects.equals(this.name, v1Page.name) &&
        Objects.equals(this.pageIndex, v1Page.pageIndex) &&
        Objects.equals(this.cells, v1Page.cells);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, pageIndex, cells);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1Page {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pageIndex: ").append(toIndentedString(pageIndex)).append("\n");
    sb.append("    cells: ").append(toIndentedString(cells)).append("\n");
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

