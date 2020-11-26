package com.example.schedule.data;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Answer {
    @SerializedName("employee")
    private Employee employee;
    @SerializedName("studentGroup")
    private studentGroup studentGroup;
    @SerializedName("schedules")
    private List<Schedules> schedules;
    @SerializedName("examSchedules")
    private List<Schedules> examSchedules;
    @SerializedName("todayDate")
    private String todayDate;
    @SerializedName("todaySchedules")
    private List<Schedules> todaySchedules;
    @SerializedName("tomorrowDate")
    private String tomorrowDate;
    @SerializedName("tomorrowSchedules")
    private List<Schedules> tomorrowSchedules;
    @SerializedName("currentWeekNumber")
    private int currentWeekNumber;

    public Answer(Employee employee,
                  com.example.schedule.data.studentGroup studentGroup,
                  List<Schedules> schedules,
                  List<Schedules> examSchedules,
                  String todayDate,
                  List<Schedules> todaySchedules,
                  String tomorrowDate,
                  List<Schedules> tomorrowSchedules,
                  int currentWeekNumber) {
        this.employee = employee;
        this.studentGroup = studentGroup;
        this.schedules = schedules;
        this.examSchedules = examSchedules;
        this.todayDate = todayDate;
        this.todaySchedules = todaySchedules;
        this.tomorrowDate = tomorrowDate;
        this.tomorrowSchedules = tomorrowSchedules;
        this.currentWeekNumber = currentWeekNumber;
    }

    public Employee getEmployee() {
        return employee;
    }

    public com.example.schedule.data.studentGroup getStudentGroup() {
        return studentGroup;
    }

    public List<Schedules> getSchedules() {
        return schedules;
    }

    public List<Schedules> getExamSchedules() {
        return examSchedules;
    }

    public String getTodayDate() {
        return todayDate;
    }

    public List<Schedules> getTodaySchedules() {
        return todaySchedules;
    }

    public String getTomorrowDate() {
        return tomorrowDate;
    }

    public List<Schedules> getTomorrowSchedules() {
        return tomorrowSchedules;
    }

    public int getCurrentWeekNumber() {
        return currentWeekNumber;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setStudentGroup(com.example.schedule.data.studentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }

    public void setSchedules(List<Schedules> schedules) {
        this.schedules = schedules;
    }

    public void setExamSchedules(List<Schedules> examSchedules) {
        this.examSchedules = examSchedules;
    }

    public void setTodayDate(String todayDate) {
        this.todayDate = todayDate;
    }

    public void setTodaySchedules(List<Schedules> todaySchedules) {
        this.todaySchedules = todaySchedules;
    }

    public void setTomorrowDate(String tomorrowDate) {
        this.tomorrowDate = tomorrowDate;
    }

    public void setTomorrowSchedules(List<Schedules> tomorrowSchedules) {
        this.tomorrowSchedules = tomorrowSchedules;
    }

    public void setCurrentWeekNumber(int currentWeekNumber) {
        this.currentWeekNumber = currentWeekNumber;
    }
}
