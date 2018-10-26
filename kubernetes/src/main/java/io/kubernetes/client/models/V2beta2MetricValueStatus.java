/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.12.2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.kubernetes.client.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * MetricValueStatus holds the current value for a metric
 */
@ApiModel(description = "MetricValueStatus holds the current value for a metric")

public class V2beta2MetricValueStatus {
  @SerializedName("averageUtilization")
  private Integer averageUtilization = null;

  @SerializedName("averageValue")
  private String averageValue = null;

  @SerializedName("value")
  private String value = null;

  public V2beta2MetricValueStatus averageUtilization(Integer averageUtilization) {
    this.averageUtilization = averageUtilization;
    return this;
  }

   /**
   * currentAverageUtilization is the current value of the average of the resource metric across all relevant pods, represented as a percentage of the requested value of the resource for the pods.
   * @return averageUtilization
  **/
  @ApiModelProperty(value = "currentAverageUtilization is the current value of the average of the resource metric across all relevant pods, represented as a percentage of the requested value of the resource for the pods.")
  public Integer getAverageUtilization() {
    return averageUtilization;
  }

  public void setAverageUtilization(Integer averageUtilization) {
    this.averageUtilization = averageUtilization;
  }

  public V2beta2MetricValueStatus averageValue(String averageValue) {
    this.averageValue = averageValue;
    return this;
  }

   /**
   * averageValue is the current value of the average of the metric across all relevant pods (as a quantity)
   * @return averageValue
  **/
  @ApiModelProperty(value = "averageValue is the current value of the average of the metric across all relevant pods (as a quantity)")
  public String getAverageValue() {
    return averageValue;
  }

  public void setAverageValue(String averageValue) {
    this.averageValue = averageValue;
  }

  public V2beta2MetricValueStatus value(String value) {
    this.value = value;
    return this;
  }

   /**
   * value is the current value of the metric (as a quantity).
   * @return value
  **/
  @ApiModelProperty(value = "value is the current value of the metric (as a quantity).")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2beta2MetricValueStatus v2beta2MetricValueStatus = (V2beta2MetricValueStatus) o;
    return Objects.equals(this.averageUtilization, v2beta2MetricValueStatus.averageUtilization) &&
        Objects.equals(this.averageValue, v2beta2MetricValueStatus.averageValue) &&
        Objects.equals(this.value, v2beta2MetricValueStatus.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(averageUtilization, averageValue, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2beta2MetricValueStatus {\n");
    
    sb.append("    averageUtilization: ").append(toIndentedString(averageUtilization)).append("\n");
    sb.append("    averageValue: ").append(toIndentedString(averageValue)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

