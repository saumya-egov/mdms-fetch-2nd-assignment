package com.newproject;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "RequestInfo",
    "MdmsCriteria"
})
public class ReqData {

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
    public ReqData() {
    }

    /**
     * 
     * @param requestInfo
     * @param mdmsCriteria
     */
    public ReqData(RequestInfo requestInfo, MdmsCriteria mdmsCriteria) {
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

    public ReqData withRequestInfo(RequestInfo requestInfo) {
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

    public ReqData withMdmsCriteria(MdmsCriteria mdmsCriteria) {
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

    public ReqData withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }



}
