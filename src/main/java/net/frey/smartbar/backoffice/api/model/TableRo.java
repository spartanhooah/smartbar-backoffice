package net.frey.smartbar.backoffice.api.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

@JsonTypeName("tableRo")
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen",
        date = "2025-08-21T13:45:59.456751902-04:00[America/New_York]",
        comments = "Generator version: 7.14.0")
public class TableRo {
    private String name;
    private Integer seatCount;
    private Boolean active;

    public TableRo() {}

    @JsonCreator
    public TableRo(
            @JsonProperty(required = true, value = "name") String name,
            @JsonProperty(required = true, value = "seatCount") Integer seatCount,
            @JsonProperty(required = true, value = "active") Boolean active) {
        this.name = name;
        this.seatCount = seatCount;
        this.active = active;
    }

    /**
     **/
    public TableRo name(String name) {
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
    public TableRo seatCount(Integer seatCount) {
        this.seatCount = seatCount;
        return this;
    }

    @JsonProperty(required = true, value = "seatCount")
    @NotNull
    public Integer getSeatCount() {
        return seatCount;
    }

    @JsonProperty(required = true, value = "seatCount")
    public void setSeatCount(Integer seatCount) {
        this.seatCount = seatCount;
    }

    /**
     **/
    public TableRo active(Boolean active) {
        this.active = active;
        return this;
    }

    @JsonProperty(required = true, value = "active")
    @NotNull
    public Boolean getActive() {
        return active;
    }

    @JsonProperty(required = true, value = "active")
    public void setActive(Boolean active) {
        this.active = active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TableRo tableRo = (TableRo) o;
        return Objects.equals(this.name, tableRo.name)
                && Objects.equals(this.seatCount, tableRo.seatCount)
                && Objects.equals(this.active, tableRo.active);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, seatCount, active);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TableRo {\n");

        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    seatCount: ").append(toIndentedString(seatCount)).append("\n");
        sb.append("    active: ").append(toIndentedString(active)).append("\n");
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
