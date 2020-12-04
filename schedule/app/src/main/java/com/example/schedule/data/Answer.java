package com.example.schedule.data;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Answer {
    private String employee;

    private studentGroup studentGroup;

    private List<Schedules> schedules;

    private List<Schedule> examSchedules;

    private String todayDate;

    private List<Schedule> todaySchedules;

    private String tomorrowDate;

    private List<Schedule> tomorrowSchedules;

    private int currentWeekNumber;

    private String dateStart;

    private String dateEnd;

    private String sessionStart;

    private String sessionEnd;

    public void setEmployee(String employee){
        this.employee = employee;
    }
    public String getEmployee(){
        return this.employee;
    }
    public void setStudentGroup(studentGroup studentGroup){
        this.studentGroup = studentGroup;
    }
    public studentGroup getStudentGroup(){
        return this.studentGroup;
    }
    public void setSchedules(List<Schedules> schedules){
        this.schedules = schedules;
    }
    public List<Schedules> getSchedules(){
        return this.schedules;
    }
    public void setExamSchedules(List<Schedule> examSchedules){
        this.examSchedules = examSchedules;
    }
    public List<Schedule> getExamSchedules(){
        return this.examSchedules;
    }
    public void setTodayDate(String todayDate){
        this.todayDate = todayDate;
    }
    public String getTodayDate(){
        return this.todayDate;
    }
    public void setTodaySchedules(List<Schedule> todaySchedules){
        this.todaySchedules = todaySchedules;
    }
    public List<Schedule> getTodaySchedules(){
        return this.todaySchedules;
    }
    public void setTomorrowDate(String tomorrowDate){
        this.tomorrowDate = tomorrowDate;
    }
    public String getTomorrowDate(){
        return this.tomorrowDate;
    }
    public void setTomorrowSchedules(List<Schedule> tomorrowSchedules){
        this.tomorrowSchedules = tomorrowSchedules;
    }
    public List<Schedule> getTomorrowSchedules(){
        return this.tomorrowSchedules;
    }
    public void setCurrentWeekNumber(int currentWeekNumber){
        this.currentWeekNumber = currentWeekNumber;
    }
    public int getCurrentWeekNumber(){
        return this.currentWeekNumber;
    }
    public void setDateStart(String dateStart){
        this.dateStart = dateStart;
    }
    public String getDateStart(){
        return this.dateStart;
    }
    public void setDateEnd(String dateEnd){
        this.dateEnd = dateEnd;
    }
    public String getDateEnd(){
        return this.dateEnd;
    }
    public void setSessionStart(String sessionStart){
        this.sessionStart = sessionStart;
    }
    public String getSessionStart(){
        return this.sessionStart;
    }
    public void setSessionEnd(String sessionEnd){
        this.sessionEnd = sessionEnd;
    }
    public String getSessionEnd(){
        return this.sessionEnd;
    }
}