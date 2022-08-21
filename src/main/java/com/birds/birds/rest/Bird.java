package com.birds.birds.rest;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "speciesCode",
        "comName",
        "sciName",
        "locId",
        "locName",
        "obsDt",
        "howMany",
        "lat",
        "lng",
        "obsValid",
        "obsReviewed",
        "locationPrivate",
        "subId"
})
@Generated("jsonschema2pojo")
public class Bird {

    @JsonProperty("speciesCode")
    private String speciesCode;
    @JsonProperty("comName")
    private String comName;
    @JsonProperty("sciName")
    private String sciName;
    @JsonProperty("locId")
    private String locId;
    @JsonProperty("locName")
    private String locName;
    @JsonProperty("obsDt")
    private String obsDt;
    @JsonProperty("howMany")
    private Integer howMany;
    @JsonProperty("lat")
    private Double lat;
    @JsonProperty("lng")
    private Double lng;
    @JsonProperty("obsValid")
    private Boolean obsValid;
    @JsonProperty("obsReviewed")
    private Boolean obsReviewed;
    @JsonProperty("locationPrivate")
    private Boolean locationPrivate;
    @JsonProperty("subId")
    private String subId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("speciesCode")
    public String getSpeciesCode() {
        return speciesCode;
    }

    @JsonProperty("speciesCode")
    public void setSpeciesCode(String speciesCode) {
        this.speciesCode = speciesCode;
    }

    @JsonProperty("comName")
    public String getComName() {
        return comName;
    }

    @JsonProperty("comName")
    public void setComName(String comName) {
        this.comName = comName;
    }

    @JsonProperty("sciName")
    public String getSciName() {
        return sciName;
    }

    @JsonProperty("sciName")
    public void setSciName(String sciName) {
        this.sciName = sciName;
    }

    @JsonProperty("locId")
    public String getLocId() {
        return locId;
    }

    @JsonProperty("locId")
    public void setLocId(String locId) {
        this.locId = locId;
    }

    @JsonProperty("locName")
    public String getLocName() {
        return locName;
    }

    @JsonProperty("locName")
    public void setLocName(String locName) {
        this.locName = locName;
    }

    @JsonProperty("obsDt")
    public String getObsDt() {
        return obsDt;
    }

    @JsonProperty("obsDt")
    public void setObsDt(String obsDt) {
        this.obsDt = obsDt;
    }

    @JsonProperty("howMany")
    public Integer getHowMany() {
        return howMany;
    }

    @JsonProperty("howMany")
    public void setHowMany(Integer howMany) {
        this.howMany = howMany;
    }

    @JsonProperty("lat")
    public Double getLat() {
        return lat;
    }

    @JsonProperty("lat")
    public void setLat(Double lat) {
        this.lat = lat;
    }

    @JsonProperty("lng")
    public Double getLng() {
        return lng;
    }

    @JsonProperty("lng")
    public void setLng(Double lng) {
        this.lng = lng;
    }

    @JsonProperty("obsValid")
    public Boolean getObsValid() {
        return obsValid;
    }

    @JsonProperty("obsValid")
    public void setObsValid(Boolean obsValid) {
        this.obsValid = obsValid;
    }

    @JsonProperty("obsReviewed")
    public Boolean getObsReviewed() {
        return obsReviewed;
    }

    @JsonProperty("obsReviewed")
    public void setObsReviewed(Boolean obsReviewed) {
        this.obsReviewed = obsReviewed;
    }

    @JsonProperty("locationPrivate")
    public Boolean getLocationPrivate() {
        return locationPrivate;
    }

    @JsonProperty("locationPrivate")
    public void setLocationPrivate(Boolean locationPrivate) {
        this.locationPrivate = locationPrivate;
    }

    @JsonProperty("subId")
    public String getSubId() {
        return subId;
    }

    @JsonProperty("subId")
    public void setSubId(String subId) {
        this.subId = subId;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}