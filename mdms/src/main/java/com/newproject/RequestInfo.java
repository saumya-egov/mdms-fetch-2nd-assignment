
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
    "apiId",
    "ver",
    "ts",
    "action",
    "did",
    "key",
    "msgId",
    "authToken"
})
public class RequestInfo {

    @JsonProperty("apiId")
    private String apiId;
    @JsonProperty("ver")
    private Object ver;
    @JsonProperty("ts")
    private Object ts;
    @JsonProperty("action")
    private Object action;
    @JsonProperty("did")
    private Object did;
    @JsonProperty("key")
    private Object key;
    @JsonProperty("msgId")
    private String msgId;
    @JsonProperty("authToken")
    private String authToken;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public RequestInfo() {
    }

    /**
     * 
     * @param ver
     * @param authToken
     * @param action
     * @param msgId
     * @param apiId
     * @param did
     * @param key
     * @param ts
     */
    public RequestInfo(String apiId, Object ver, Object ts, Object action, Object did, Object key, String msgId, String authToken) {
        super();
        this.apiId = apiId;
        this.ver = ver;
        this.ts = ts;
        this.action = action;
        this.did = did;
        this.key = key;
        this.msgId = msgId;
        this.authToken = authToken;
    }

    @JsonProperty("apiId")
    public String getApiId() {
        return apiId;
    }

    @JsonProperty("apiId")
    public void setApiId(String apiId) {
        this.apiId = apiId;
    }

    public RequestInfo withApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }

    @JsonProperty("ver")
    public Object getVer() {
        return ver;
    }

    @JsonProperty("ver")
    public void setVer(Object ver) {
        this.ver = ver;
    }

    public RequestInfo withVer(Object ver) {
        this.ver = ver;
        return this;
    }

    @JsonProperty("ts")
    public Object getTs() {
        return ts;
    }

    @JsonProperty("ts")
    public void setTs(Object ts) {
        this.ts = ts;
    }

    public RequestInfo withTs(Object ts) {
        this.ts = ts;
        return this;
    }

    @JsonProperty("action")
    public Object getAction() {
        return action;
    }

    @JsonProperty("action")
    public void setAction(Object action) {
        this.action = action;
    }

    public RequestInfo withAction(Object action) {
        this.action = action;
        return this;
    }

    @JsonProperty("did")
    public Object getDid() {
        return did;
    }

    @JsonProperty("did")
    public void setDid(Object did) {
        this.did = did;
    }

    public RequestInfo withDid(Object did) {
        this.did = did;
        return this;
    }

    @JsonProperty("key")
    public Object getKey() {
        return key;
    }

    @JsonProperty("key")
    public void setKey(Object key) {
        this.key = key;
    }

    public RequestInfo withKey(Object key) {
        this.key = key;
        return this;
    }

    @JsonProperty("msgId")
    public String getMsgId() {
        return msgId;
    }

    @JsonProperty("msgId")
    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }

    public RequestInfo withMsgId(String msgId) {
        this.msgId = msgId;
        return this;
    }

    @JsonProperty("authToken")
    public String getAuthToken() {
        return authToken;
    }

    @JsonProperty("authToken")
    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }

    public RequestInfo withAuthToken(String authToken) {
        this.authToken = authToken;
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

    public RequestInfo withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    


}
