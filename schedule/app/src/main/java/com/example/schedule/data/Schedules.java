package com.example.schedule.data;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Schedules {
    @SerializedName("weekDay")
    private String weekDay;
    @SerializedName("schedules")
    private List<Schedule> schedules;

    public Schedules(String weekDay, List<Schedule> schedules) {
        this.weekDay = weekDay;
        this.schedules = schedules;
    }

    public String getWeekDay() {
        return weekDay;
    }

    public List<Schedule> getSchedules() {
        return schedules;
    }

    public void setWeekDay(String weekDay) {
        this.weekDay = weekDay;
    }

    public void setSchedules(List<Schedule> schedules) {
        this.schedules = schedules;
    }
}
