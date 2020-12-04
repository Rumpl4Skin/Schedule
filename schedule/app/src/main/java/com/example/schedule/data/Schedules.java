package com.example.schedule.data;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Schedules
{
    private String weekDay;

    private List<Schedule> schedule;

    public Schedules(String weekDay, List<Schedule> schedule) {
        this.weekDay = weekDay;
        this.schedule = schedule;
    }

    public Schedules(List<Schedule> schedule) {
        this.schedule = schedule;
    }

    public void setWeekDay(String weekDay){
        this.weekDay = weekDay;
    }
    public String getWeekDay(){
        return this.weekDay;
    }
    public void setSchedule(List<Schedule> schedule){
        this.schedule = schedule;
    }
    public List<Schedule> getSchedule(){
        return this.schedule;
    }
}
