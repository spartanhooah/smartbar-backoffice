package net.frey.smartbar.backoffice.api.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Objects;

@JsonTypeName("itemRo")
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen",
        date = "2025-08-21T13:45:59.456751902-04:00[America/New_York]",
        comments = "Generator version: 7.14.0")
public class ItemRo {
    private String name;
    private BigDecimal price;
    private String description;
    private String picture;

    public ItemRo() {}

    @JsonCreator
    public ItemRo(
            @JsonProperty(required = true, value = "name") String name,
            @JsonProperty(required = true, value = "price") BigDecimal price,
            @JsonProperty(required = true, value = "description") String description,
            @JsonProperty(required = true, value = "picture") String picture) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.picture = picture;
    }

    /**
     **/
    public ItemRo name(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty(required = true, value = "name")
    @NotNull
    public String getName() {
        return name;
    }

    @JsonProperty(required = true, value = "name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     **/
    public ItemRo price(BigDecimal price) {
        this.price = price;
        return this;
    }

    @JsonProperty(required = true, value = "price")
    @NotNull
    @Valid
    public BigDecimal getPrice() {
        return price;
    }

    @JsonProperty(required = true, value = "price")
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     **/
    public ItemRo description(String description) {
        this.description = description;
        return this;
    }

    @JsonProperty(required = true, value = "description")
    @NotNull
    public String getDescription() {
        return description;
    }

    @JsonProperty(required = true, value = "description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     **/
    public ItemRo picture(String picture) {
        this.picture = picture;
        return this;
    }

    @JsonProperty(required = true, value = "picture")
    @NotNull
    public String getPicture() {
        return picture;
    }

    @JsonProperty(required = true, value = "picture")
    public void setPicture(String picture) {
        this.picture = picture;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ItemRo itemRo = (ItemRo) o;
        return Objects.equals(this.name, itemRo.name)
                && Objects.equals(this.price, itemRo.price)
                && Objects.equals(this.description, itemRo.description)
                && Objects.equals(this.picture, itemRo.picture);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, description, picture);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ItemRo {\n");

        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    price: ").append(toIndentedString(price)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    picture: ").append(toIndentedString(picture)).append("\n");
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
