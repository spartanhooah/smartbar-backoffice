package net.frey.smartbar.backoffice.api.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

@JsonTypeName("categoryRo")
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen",
        date = "2025-08-21T13:45:59.456751902-04:00[America/New_York]",
        comments = "Generator version: 7.14.0")
public class CategoryRo {
    private String name;
    private String description;

    public CategoryRo() {}

    @JsonCreator
    public CategoryRo(
            @JsonProperty(required = true, value = "name") String name,
            @JsonProperty(required = true, value = "description") String description) {
        this.name = name;
        this.description = description;
    }

    /**
     **/
    public CategoryRo name(String name) {
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
    public CategoryRo description(String description) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CategoryRo categoryRo = (CategoryRo) o;
        return Objects.equals(this.name, categoryRo.name) && Objects.equals(this.description, categoryRo.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CategoryRo {\n");

        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
