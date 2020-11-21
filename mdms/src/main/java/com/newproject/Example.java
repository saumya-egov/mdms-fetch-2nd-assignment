
package com.example;

import java.util.HashMap;
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
    "RequestInfo",
    "MdmsCriteria"
})
public class Example {

    @JsonProperty("RequestInfo")
    private RequestInfo requestInfo;
    @JsonProperty("MdmsCriteria")
    private MdmsCriteria mdmsCriteria;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Example() {
    }

    /**
     * 
     * @param requestInfo
     * @param mdmsCriteria
     */
    public Example(RequestInfo requestInfo, MdmsCriteria mdmsCriteria) {
        super();
        this.requestInfo = requestInfo;
        this.mdmsCriteria = mdmsCriteria;
    }

    @JsonProperty("RequestInfo")
    public RequestInfo getRequestInfo() {
        return requestInfo;
    }

    @JsonProperty("RequestInfo")
    public void setRequestInfo(RequestInfo requestInfo) {
        this.requestInfo = requestInfo;
    }

    public Example withRequestInfo(RequestInfo requestInfo) {
        this.requestInfo = requestInfo;
        return this;
    }

    @JsonProperty("MdmsCriteria")
    public MdmsCriteria getMdmsCriteria() {
        return mdmsCriteria;
    }

    @JsonProperty("MdmsCriteria")
    public void setMdmsCriteria(MdmsCriteria mdmsCriteria) {
        this.mdmsCriteria = mdmsCriteria;
    }

    public Example withMdmsCriteria(MdmsCriteria mdmsCriteria) {
        this.mdmsCriteria = mdmsCriteria;
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

    public Example withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("requestInfo", requestInfo).append("mdmsCriteria", mdmsCriteria).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(requestInfo).append(additionalProperties).append(mdmsCriteria).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Example) == false) {
            return false;
        }
        Example rhs = ((Example) other);
        return new EqualsBuilder().append(requestInfo, rhs.requestInfo).append(additionalProperties, rhs.additionalProperties).append(mdmsCriteria, rhs.mdmsCriteria).isEquals();
    }

}
