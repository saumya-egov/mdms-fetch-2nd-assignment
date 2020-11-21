
package com.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "moduleName",
    "masterDetails"
})
public class ModuleDetail {

    @JsonProperty("moduleName")
    private String moduleName;
    @JsonProperty("masterDetails")
    private List<MasterDetail> masterDetails = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ModuleDetail() {
    }

    /**
     * 
     * @param masterDetails
     * @param moduleName
     */
    public ModuleDetail(String moduleName, List<MasterDetail> masterDetails) {
        super();
        this.moduleName = moduleName;
        this.masterDetails = masterDetails;
    }

    @JsonProperty("moduleName")
    public String getModuleName() {
        return moduleName;
    }

    @JsonProperty("moduleName")
    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public ModuleDetail withModuleName(String moduleName) {
        this.moduleName = moduleName;
        return this;
    }

    @JsonProperty("masterDetails")
    public List<MasterDetail> getMasterDetails() {
        return masterDetails;
    }

    @JsonProperty("masterDetails")
    public void setMasterDetails(List<MasterDetail> masterDetails) {
        this.masterDetails = masterDetails;
    }

    public ModuleDetail withMasterDetails(List<MasterDetail> masterDetails) {
        this.masterDetails = masterDetails;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public ModuleDetail withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("moduleName", moduleName).append("masterDetails", masterDetails).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(moduleName).append(additionalProperties).append(masterDetails).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ModuleDetail) == false) {
            return false;
        }
        ModuleDetail rhs = ((ModuleDetail) other);
        return new EqualsBuilder().append(moduleName, rhs.moduleName).append(additionalProperties, rhs.additionalProperties).append(masterDetails, rhs.masterDetails).isEquals();
    }

}
