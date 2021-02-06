package com.parth.ebay.shipping.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * EligibilityCheckResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-01-28T23:13:52.075-08:00[America/Los_Angeles]")
public class EligibilityCheckResponse   {
  @JsonProperty("eligible")
  private Boolean eligible;

  @JsonProperty("message")
  private String message;

  public EligibilityCheckResponse eligible(Boolean eligible) {
    this.eligible = eligible;
    return this;
  }

  /**
   * Get eligible
   * @return eligible
  */
  @ApiModelProperty(value = "")


  public Boolean getEligible() {
    return eligible;
  }

  public void setEligible(Boolean eligible) {
    this.eligible = eligible;
  }

  public EligibilityCheckResponse message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
  */
  @ApiModelProperty(value = "")


  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EligibilityCheckResponse eligibilityCheckResponse = (EligibilityCheckResponse) o;
    return Objects.equals(this.eligible, eligibilityCheckResponse.eligible) &&
        Objects.equals(this.message, eligibilityCheckResponse.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eligible, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EligibilityCheckResponse {\n");
    
    sb.append("    eligible: ").append(toIndentedString(eligible)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

