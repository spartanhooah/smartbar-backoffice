package net.frey.smartbar.backoffice.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Objects;

@JsonTypeName("tableRo")
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen",
        date = "2025-08-11T13:47:41.328995228-04:00[America/New_York]",
        comments = "Generator version: 7.14.0")
public class TableRo {
    private String name;
    private Integer seatCount;
    private Boolean active;

    public TableRo() {}

    /**
     **/
    public TableRo name(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     **/
    public TableRo seatCount(Integer seatCount) {
        this.seatCount = seatCount;
        return this;
    }

    @JsonProperty("seatCount")
    public Integer getSeatCount() {
        return seatCount;
    }

    @JsonProperty("seatCount")
    public void setSeatCount(Integer seatCount) {
        this.seatCount = seatCount;
    }

    /**
     **/
    public TableRo active(Boolean active) {
        this.active = active;
        return this;
    }

    @JsonProperty("active")
    public Boolean getActive() {
        return active;
    }

    @JsonProperty("active")
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
