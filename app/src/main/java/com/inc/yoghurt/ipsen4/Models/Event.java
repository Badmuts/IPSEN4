package com.inc.yoghurt.ipsen4.Models;

import com.google.gson.annotations.SerializedName;

import org.joda.time.DateTime;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by daan on 05/04/16.
 */
public class Event {
    private long id;
    private String notes;
    private String type_name;
    private boolean highlighted;
    private List<String> lectures = new ArrayList<>();
    @SerializedName("short_name") private String shortName;
    @SerializedName("long_name") private String longName;
    @SerializedName("start_date") private Date startDate;
    @SerializedName("end_date") private Date endDate;

    public Event() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getLongName() {
        return longName;
    }

    public void setLongName(String longName) {
        this.longName = longName;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getType_name() {
        return type_name;
    }

    public void setType_name(String type_name) {
        this.type_name = type_name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public boolean isHighlighted() {
        return highlighted;
    }

    public void setHighlighted(boolean highlighted) {
        this.highlighted = highlighted;
    }

    public List<String> getLectures() {
        return lectures;
    }

    public void setLectures(List<String> lectures) {
        this.lectures = lectures;
    }

    @Override
    public String toString() {
        return "Event {" + "\n" +
                "id=" + id + "\n" +
                ", notes='" + notes + '\'' + "\n" +
                ", type_name='" + type_name + '\'' + "\n" +
                ", highlighted=" + highlighted + "\n" +
                ", lectures=" + lectures + "\n" +
                ", shortName='" + shortName + '\'' + "\n" +
                ", longName='" + longName + '\'' + "\n" +
                ", startDate=" + startDate + "\n" +
                ", endDate=" + endDate + "\n" +
                '}';
    }
}
