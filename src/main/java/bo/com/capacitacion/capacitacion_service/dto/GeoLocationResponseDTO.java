package bo.com.capacitacion.capacitacion_service.dto;


import java.io.Serializable;

public class GeoLocationResponseDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String ip;
    private String continent_code;
    private String continent_name;
    private String country_code2;
    private String country_code3;
    private String country_name;
    private String country_name_official;
    private String country_capital;
    private String state_prov;
    private String state_code;
    private String district;
    private String city;
    private String zipcode;
    private String latitude;
    private String longitude;
    private Boolean is_eu;
    private String country_flag;
    private String geoname_id;
    private String country_emoji;
    private String calling_code;
    private String country_tld;
    private String languages;
    private String isp;
    private String connection_type;
    private String organization;

    // Referencias a otros DTOs
    private CurrencyDTO currency;
    private TimeZoneDTO time_zone;

    public GeoLocationResponseDTO() {
    }

    // Getters & Setters
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getContinent_code() {
        return continent_code;
    }

    public void setContinent_code(String continent_code) {
        this.continent_code = continent_code;
    }

    public String getContinent_name() {
        return continent_name;
    }

    public void setContinent_name(String continent_name) {
        this.continent_name = continent_name;
    }

    public String getCountry_code2() {
        return country_code2;
    }

    public void setCountry_code2(String country_code2) {
        this.country_code2 = country_code2;
    }

    public String getCountry_code3() {
        return country_code3;
    }

    public void setCountry_code3(String country_code3) {
        this.country_code3 = country_code3;
    }

    public String getCountry_name() {
        return country_name;
    }

    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }

    public String getCountry_name_official() {
        return country_name_official;
    }

    public void setCountry_name_official(String country_name_official) {
        this.country_name_official = country_name_official;
    }

    public String getCountry_capital() {
        return country_capital;
    }

    public void setCountry_capital(String country_capital) {
        this.country_capital = country_capital;
    }

    public String getState_prov() {
        return state_prov;
    }

    public void setState_prov(String state_prov) {
        this.state_prov = state_prov;
    }

    public String getState_code() {
        return state_code;
    }

    public void setState_code(String state_code) {
        this.state_code = state_code;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public Boolean getIs_eu() {
        return is_eu;
    }

    public void setIs_eu(Boolean is_eu) {
        this.is_eu = is_eu;
    }

    public String getCountry_flag() {
        return country_flag;
    }

    public void setCountry_flag(String country_flag) {
        this.country_flag = country_flag;
    }

    public String getGeoname_id() {
        return geoname_id;
    }

    public void setGeoname_id(String geoname_id) {
        this.geoname_id = geoname_id;
    }

    public String getCountry_emoji() {
        return country_emoji;
    }

    public void setCountry_emoji(String country_emoji) {
        this.country_emoji = country_emoji;
    }

    public String getCalling_code() {
        return calling_code;
    }

    public void setCalling_code(String calling_code) {
        this.calling_code = calling_code;
    }

    public String getCountry_tld() {
        return country_tld;
    }

    public void setCountry_tld(String country_tld) {
        this.country_tld = country_tld;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public String getIsp() {
        return isp;
    }

    public void setIsp(String isp) {
        this.isp = isp;
    }

    public String getConnection_type() {
        return connection_type;
    }

    public void setConnection_type(String connection_type) {
        this.connection_type = connection_type;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public CurrencyDTO getCurrency() {
        return currency;
    }

    public void setCurrency(CurrencyDTO currency) {
        this.currency = currency;
    }

    public TimeZoneDTO getTime_zone() {
        return time_zone;
    }

    public void setTime_zone(TimeZoneDTO time_zone) {
        this.time_zone = time_zone;
    }

    @Override
    public String toString() {
        return "GeoLocationResponseDTO{" +
                "ip='" + ip + '\'' +
                ", continent_code='" + continent_code + '\'' +
                ", continent_name='" + continent_name + '\'' +
                ", country_code2='" + country_code2 + '\'' +
                ", country_code3='" + country_code3 + '\'' +
                ", country_name='" + country_name + '\'' +
                ", country_name_official='" + country_name_official + '\'' +
                ", country_capital='" + country_capital + '\'' +
                ", state_prov='" + state_prov + '\'' +
                ", state_code='" + state_code + '\'' +
                ", district='" + district + '\'' +
                ", city='" + city + '\'' +
                ", zipcode='" + zipcode + '\'' +
                ", latitude='" + latitude + '\'' +
                ", longitude='" + longitude + '\'' +
                ", is_eu=" + is_eu +
                ", country_flag='" + country_flag + '\'' +
                ", geoname_id='" + geoname_id + '\'' +
                ", country_emoji='" + country_emoji + '\'' +
                ", calling_code='" + calling_code + '\'' +
                ", country_tld='" + country_tld + '\'' +
                ", languages='" + languages + '\'' +
                ", isp='" + isp + '\'' +
                ", connection_type='" + connection_type + '\'' +
                ", organization='" + organization + '\'' +
                ", currency=" + currency +
                ", time_zone=" + time_zone +
                '}';
    }
}
