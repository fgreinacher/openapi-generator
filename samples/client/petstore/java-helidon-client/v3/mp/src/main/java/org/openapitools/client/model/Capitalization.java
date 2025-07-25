/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;




public class Capitalization  {
  
  private String smallCamel;

  private String capitalCamel;

  private String smallSnake;

  private String capitalSnake;

  private String scAETHFlowPoints;

 /**
   * Name of the pet 
  **/
  private String ATT_NAME;

 /**
   * Get smallCamel
   * @return smallCamel
  **/
  public String getSmallCamel() {
    return smallCamel;
  }

  /**
    * Set smallCamel
  **/
  public void setSmallCamel(String smallCamel) {
    this.smallCamel = smallCamel;
  }

  public Capitalization smallCamel(String smallCamel) {
    this.smallCamel = smallCamel;
    return this;
  }

 /**
   * Get capitalCamel
   * @return capitalCamel
  **/
  public String getCapitalCamel() {
    return capitalCamel;
  }

  /**
    * Set capitalCamel
  **/
  public void setCapitalCamel(String capitalCamel) {
    this.capitalCamel = capitalCamel;
  }

  public Capitalization capitalCamel(String capitalCamel) {
    this.capitalCamel = capitalCamel;
    return this;
  }

 /**
   * Get smallSnake
   * @return smallSnake
  **/
  public String getSmallSnake() {
    return smallSnake;
  }

  /**
    * Set smallSnake
  **/
  public void setSmallSnake(String smallSnake) {
    this.smallSnake = smallSnake;
  }

  public Capitalization smallSnake(String smallSnake) {
    this.smallSnake = smallSnake;
    return this;
  }

 /**
   * Get capitalSnake
   * @return capitalSnake
  **/
  public String getCapitalSnake() {
    return capitalSnake;
  }

  /**
    * Set capitalSnake
  **/
  public void setCapitalSnake(String capitalSnake) {
    this.capitalSnake = capitalSnake;
  }

  public Capitalization capitalSnake(String capitalSnake) {
    this.capitalSnake = capitalSnake;
    return this;
  }

 /**
   * Get scAETHFlowPoints
   * @return scAETHFlowPoints
  **/
  public String getScAETHFlowPoints() {
    return scAETHFlowPoints;
  }

  /**
    * Set scAETHFlowPoints
  **/
  public void setScAETHFlowPoints(String scAETHFlowPoints) {
    this.scAETHFlowPoints = scAETHFlowPoints;
  }

  public Capitalization scAETHFlowPoints(String scAETHFlowPoints) {
    this.scAETHFlowPoints = scAETHFlowPoints;
    return this;
  }

 /**
   * Name of the pet 
   * @return ATT_NAME
  **/
  public String getATTNAME() {
    return ATT_NAME;
  }

  /**
    * Set ATT_NAME
  **/
  public void setATTNAME(String ATT_NAME) {
    this.ATT_NAME = ATT_NAME;
  }

  public Capitalization ATT_NAME(String ATT_NAME) {
    this.ATT_NAME = ATT_NAME;
    return this;
  }


  /**
    * Create a string representation of this pojo.
  **/
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Capitalization {\n");
    
    sb.append("    smallCamel: ").append(toIndentedString(smallCamel)).append("\n");
    sb.append("    capitalCamel: ").append(toIndentedString(capitalCamel)).append("\n");
    sb.append("    smallSnake: ").append(toIndentedString(smallSnake)).append("\n");
    sb.append("    capitalSnake: ").append(toIndentedString(capitalSnake)).append("\n");
    sb.append("    scAETHFlowPoints: ").append(toIndentedString(scAETHFlowPoints)).append("\n");
    sb.append("    ATT_NAME: ").append(toIndentedString(ATT_NAME)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

