
package com.newproject;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "tenantId",
    "moduleDetails"
})
public class MdmsCriteria {

    @JsonProperty("tenantId")
    private String tenantId;
    @JsonProperty("moduleDetails")
    private List<ModuleDetails> moduleDetails = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public MdmsCriteria() {
    }

    /**
     * 
     * @param tenantId
     * @param moduleDetails
     */
    public MdmsCriteria(String tenantId, List<ModuleDetails> moduleDetails) {
        super();
        this.tenantId = tenantId;
        this.moduleDetails = moduleDetails;
    }

    @JsonProperty("tenantId")
    public String getTenantId() {
        return tenantId;
    }

    @JsonProperty("tenantId")
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public MdmsCriteria withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    @JsonProperty("moduleDetails")
    public List<ModuleDetails> getModuleDetails() {
        return moduleDetails;
    }

    @JsonProperty("moduleDetails")
    public void setModuleDetails(List<ModuleDetails> moduleDetails) {
        this.moduleDetails = moduleDetails;
    }

    public MdmsCriteria withModuleDetails(List<ModuleDetails> moduleDetails) {
        this.moduleDetails = moduleDetails;
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

    public MdmsCriteria withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    

}
