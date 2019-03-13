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
import com.squareup.connect.models.CatalogObject;
import com.squareup.connect.models.Error;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
@ApiModel(description = "")

public class SearchCatalogObjectsResponse {
  @JsonProperty("errors")
  private List<Error> errors = new ArrayList<Error>();

  @JsonProperty("cursor")
  private String cursor = null;

  @JsonProperty("objects")
  private List<CatalogObject> objects = new ArrayList<CatalogObject>();

  @JsonProperty("related_objects")
  private List<CatalogObject> relatedObjects = new ArrayList<CatalogObject>();

  public SearchCatalogObjectsResponse errors(List<Error> errors) {
    this.errors = errors;
    return this;
  }

  public SearchCatalogObjectsResponse addErrorsItem(Error errorsItem) {
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * The set of [Error](#type-error)s encountered.
   * @return errors
  **/
  @ApiModelProperty(value = "The set of [Error](#type-error)s encountered.")
  public List<Error> getErrors() {
    return errors;
  }

  public void setErrors(List<Error> errors) {
    this.errors = errors;
  }

  public SearchCatalogObjectsResponse cursor(String cursor) {
    this.cursor = cursor;
    return this;
  }

   /**
   * The pagination cursor to be used in a subsequent request. If unset, this is the final response. See [Pagination](/basics/api101/pagination) for more information.
   * @return cursor
  **/
  @ApiModelProperty(value = "The pagination cursor to be used in a subsequent request. If unset, this is the final response. See [Pagination](/basics/api101/pagination) for more information.")
  public String getCursor() {
    return cursor;
  }

  public void setCursor(String cursor) {
    this.cursor = cursor;
  }

  public SearchCatalogObjectsResponse objects(List<CatalogObject> objects) {
    this.objects = objects;
    return this;
  }

  public SearchCatalogObjectsResponse addObjectsItem(CatalogObject objectsItem) {
    this.objects.add(objectsItem);
    return this;
  }

   /**
   * The [CatalogObject](#type-catalogobject)s returned.
   * @return objects
  **/
  @ApiModelProperty(value = "The [CatalogObject](#type-catalogobject)s returned.")
  public List<CatalogObject> getObjects() {
    return objects;
  }

  public void setObjects(List<CatalogObject> objects) {
    this.objects = objects;
  }

  public SearchCatalogObjectsResponse relatedObjects(List<CatalogObject> relatedObjects) {
    this.relatedObjects = relatedObjects;
    return this;
  }

  public SearchCatalogObjectsResponse addRelatedObjectsItem(CatalogObject relatedObjectsItem) {
    this.relatedObjects.add(relatedObjectsItem);
    return this;
  }

   /**
   * A list of [CatalogObject](#type-catalogobject)s referenced by the objects in the `objects` field.
   * @return relatedObjects
  **/
  @ApiModelProperty(value = "A list of [CatalogObject](#type-catalogobject)s referenced by the objects in the `objects` field.")
  public List<CatalogObject> getRelatedObjects() {
    return relatedObjects;
  }

  public void setRelatedObjects(List<CatalogObject> relatedObjects) {
    this.relatedObjects = relatedObjects;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchCatalogObjectsResponse searchCatalogObjectsResponse = (SearchCatalogObjectsResponse) o;
    return Objects.equals(this.errors, searchCatalogObjectsResponse.errors) &&
        Objects.equals(this.cursor, searchCatalogObjectsResponse.cursor) &&
        Objects.equals(this.objects, searchCatalogObjectsResponse.objects) &&
        Objects.equals(this.relatedObjects, searchCatalogObjectsResponse.relatedObjects);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, cursor, objects, relatedObjects);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchCatalogObjectsResponse {\n");
    
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
    sb.append("    objects: ").append(toIndentedString(objects)).append("\n");
    sb.append("    relatedObjects: ").append(toIndentedString(relatedObjects)).append("\n");
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

