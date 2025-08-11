package net.frey.smartbar.backoffice.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Objects;

@JsonTypeName("table")
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen",
        date = "2025-08-04T11:41:28.021626384-04:00[America/New_York]",
        comments = "Generator version: 7.14.0")
public class Table {
    private String name = null;
    private String seatCount = null;
    private Boolean active;

    public Table() {}

    /**
     **/
    public Table name(String name) {
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
    public Table seatCount(String seatCount) {
        this.seatCount = seatCount;
        return this;
    }

    @JsonProperty("seatCount")
    public String getSeatCount() {
        return seatCount;
    }

    @JsonProperty("seatCount")
    public void setSeatCount(String seatCount) {
        this.seatCount = seatCount;
    }

    /**
     **/
    public Table active(Boolean active) {
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
        Table table = (Table) o;
        return Objects.equals(this.name, table.name)
                && Objects.equals(this.seatCount, table.seatCount)
                && Objects.equals(this.active, table.active);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, seatCount, active);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Table {\n");

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
