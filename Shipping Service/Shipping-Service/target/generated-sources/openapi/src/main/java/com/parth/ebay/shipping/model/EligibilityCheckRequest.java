package com.parth.ebay.shipping.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * EligibilityCheckRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-01-28T23:13:52.075-08:00[America/Los_Angeles]")
public class EligibilityCheckRequest   {
  @JsonProperty("item")
  private String item;

  @JsonProperty("seller")
  private String seller;

  @JsonProperty("category")
  private String category;

  @JsonProperty("price")
  private BigDecimal price;

  public EligibilityCheckRequest item(String item) {
    this.item = item;
    return this;
  }

  /**
   * Get item
   * @return item
  */
  @ApiModelProperty(value = "")


  public String getItem() {
    return item;
  }

  public void setItem(String item) {
    this.item = item;
  }

  public EligibilityCheckRequest seller(String seller) {
    this.seller = seller;
    return this;
  }

  /**
   * Get seller
   * @return seller
  */
  @ApiModelProperty(value = "")


  public String getSeller() {
    return seller;
  }

  public void setSeller(String seller) {
    this.seller = seller;
  }

  public EligibilityCheckRequest category(String category) {
    this.category = category;
    return this;
  }

  /**
   * Get category
   * @return category
  */
  @ApiModelProperty(value = "")


  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public EligibilityCheckRequest price(BigDecimal price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EligibilityCheckRequest eligibilityCheckRequest = (EligibilityCheckRequest) o;
    return Objects.equals(this.item, eligibilityCheckRequest.item) &&
        Objects.equals(this.seller, eligibilityCheckRequest.seller) &&
        Objects.equals(this.category, eligibilityCheckRequest.category) &&
        Objects.equals(this.price, eligibilityCheckRequest.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(item, seller, category, price);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EligibilityCheckRequest {\n");
    
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
    sb.append("    seller: ").append(toIndentedString(seller)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
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

