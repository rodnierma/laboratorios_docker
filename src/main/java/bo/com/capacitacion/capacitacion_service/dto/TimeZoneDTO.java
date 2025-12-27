package bo.com.capacitacion.capacitacion_service.dto;

import java.io.Serializable;

public class TimeZoneDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private Integer offset;
    private Integer offset_with_dst;
    private String current_time;
    private Double current_time_unix;
    private String current_tz_abbreviation;
    private String current_tz_full_name;
    private String standard_tz_abbreviation;
    private String standard_tz_full_name;
    private Boolean is_dst;
    private Integer dst_savings;
    private Boolean dst_exists;
    private String dst_tz_abbreviation;
    private String dst_tz_full_name;
    private String dst_start;
    private String dst_end;

    public TimeZoneDTO() {
    }

    // Getters & Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset_with_dst() {
        return offset_with_dst;
    }

    public void setOffset_with_dst(Integer offset_with_dst) {
        this.offset_with_dst = offset_with_dst;
    }

    public String getCurrent_time() {
        return current_time;
    }

    public void setCurrent_time(String current_time) {
        this.current_time = current_time;
    }

    public Double getCurrent_time_unix() {
        return current_time_unix;
    }

    public void setCurrent_time_unix(Double current_time_unix) {
        this.current_time_unix = current_time_unix;
    }

    public String getCurrent_tz_abbreviation() {
        return current_tz_abbreviation;
    }

    public void setCurrent_tz_abbreviation(String current_tz_abbreviation) {
        this.current_tz_abbreviation = current_tz_abbreviation;
    }

    public String getCurrent_tz_full_name() {
        return current_tz_full_name;
    }

    public void setCurrent_tz_full_name(String current_tz_full_name) {
        this.current_tz_full_name = current_tz_full_name;
    }

    public String getStandard_tz_abbreviation() {
        return standard_tz_abbreviation;
    }

    public void setStandard_tz_abbreviation(String standard_tz_abbreviation) {
        this.standard_tz_abbreviation = standard_tz_abbreviation;
    }

    public String getStandard_tz_full_name() {
        return standard_tz_full_name;
    }

    public void setStandard_tz_full_name(String standard_tz_full_name) {
        this.standard_tz_full_name = standard_tz_full_name;
    }

    public Boolean getIs_dst() {
        return is_dst;
    }

    public void setIs_dst(Boolean is_dst) {
        this.is_dst = is_dst;
    }

    public Integer getDst_savings() {
        return dst_savings;
    }

    public void setDst_savings(Integer dst_savings) {
        this.dst_savings = dst_savings;
    }

    public Boolean getDst_exists() {
        return dst_exists;
    }

    public void setDst_exists(Boolean dst_exists) {
        this.dst_exists = dst_exists;
    }

    public String getDst_tz_abbreviation() {
        return dst_tz_abbreviation;
    }

    public void setDst_tz_abbreviation(String dst_tz_abbreviation) {
        this.dst_tz_abbreviation = dst_tz_abbreviation;
    }

    public String getDst_tz_full_name() {
        return dst_tz_full_name;
    }

    public void setDst_tz_full_name(String dst_tz_full_name) {
        this.dst_tz_full_name = dst_tz_full_name;
    }

    public String getDst_start() {
        return dst_start;
    }

    public void setDst_start(String dst_start) {
        this.dst_start = dst_start;
    }

    public String getDst_end() {
        return dst_end;
    }

    public void setDst_end(String dst_end) {
        this.dst_end = dst_end;
    }

    @Override
    public String toString() {
        return "TimeZoneDTO{" +
                "name='" + name + '\'' +
                ", offset=" + offset +
                ", offset_with_dst=" + offset_with_dst +
                ", current_time='" + current_time + '\'' +
                ", current_time_unix=" + current_time_unix +
                ", current_tz_abbreviation='" + current_tz_abbreviation + '\'' +
                ", current_tz_full_name='" + current_tz_full_name + '\'' +
                ", standard_tz_abbreviation='" + standard_tz_abbreviation + '\'' +
                ", standard_tz_full_name='" + standard_tz_full_name + '\'' +
                ", is_dst=" + is_dst +
                ", dst_savings=" + dst_savings +
                ", dst_exists=" + dst_exists +
                ", dst_tz_abbreviation='" + dst_tz_abbreviation + '\'' +
                ", dst_tz_full_name='" + dst_tz_full_name + '\'' +
                ", dst_start='" + dst_start + '\'' +
                ", dst_end='" + dst_end + '\'' +
                '}';
    }
}
