package com.example.schedule.data;

import androidx.annotation.NonNull;

import com.google.gson.annotations.SerializedName;

public class Schedule {
    @SerializedName("weekNumber")
    private int weekNumber;
    @SerializedName("studentGroup")
    private int studentGroup;
    @SerializedName("studentGroupInformation")
    private String studentGroupInformation;
    @SerializedName("numSubgroup")
    private int numSubgroup;
    @SerializedName("auditory")
    private String auditory;
    @SerializedName("lessonTime")
    private String lessonTime;
    @SerializedName("startLessonTime")
    private String startLessonTime;
    @SerializedName("endLessonTime")
    private String endLessonTime;
    @SerializedName("gradebookLesson")
    private int gradebookLesson;
    @SerializedName("subject")
    private String subject;
    @SerializedName("note")
    private String note;
    @SerializedName("lessonType")
    private String lessonType;
    @SerializedName("employee")
    private Employee employee;
    @SerializedName("studentGroupModelList")
    private String studentGroupModelList;
    @SerializedName("zaoch")
    private String zaoch;
    @SerializedName("gradebookLessonlist")
    private String gradebookLessonlist;

    public Schedule(int weekNumber,
                    int studentGroup,
                    String studentGroupInformation,
                    int numSubgroup,
                    String auditory,
                    String lessonTime,
                    String startLessonTime,
                    String endLessonTime,
                    int gradebookLesson,
                    String subject,
                    String note,
                    String lessonType,
                    Employee employee,
                    String studentGroupModelList,
                    String zaoch,
                    String gradebookLessonlist) {
        this.weekNumber = weekNumber;
        this.studentGroup = studentGroup;
        this.studentGroupInformation = studentGroupInformation;
        this.numSubgroup = numSubgroup;
        this.auditory = auditory;
        this.lessonTime = lessonTime;
        this.startLessonTime = startLessonTime;
        this.endLessonTime = endLessonTime;
        this.gradebookLesson = gradebookLesson;
        this.subject = subject;
        this.note = note;
        this.lessonType = lessonType;
        this.employee = employee;
        this.studentGroupModelList = studentGroupModelList;
        this.zaoch = zaoch;
        this.gradebookLessonlist = gradebookLessonlist;
    }

    public int getWeekNumber() {
        return weekNumber;
    }

    public int getStudentGroup() {
        return studentGroup;
    }

    public String getStudentGroupInformation() {
        return studentGroupInformation;
    }

    public int getNumSubgroup() {
        return numSubgroup;
    }

    public String getAuditory() {
        return auditory;
    }

    public String getLessonTime() {
        return lessonTime;
    }

    public String getStartLessonTime() {
        return startLessonTime;
    }

    public String getEndLessonTime() {
        return endLessonTime;
    }

    public int getGradebookLesson() {
        return gradebookLesson;
    }

    public String getSubject() {
        return subject;
    }

    public String getNote() {
        return note;
    }

    public String getLessonType() {
        return lessonType;
    }

    public Employee getEmployee() {
        return employee;
    }

    public String getStudentGroupModelList() {
        return studentGroupModelList;
    }

    public String getZaoch() {
        return zaoch;
    }

    public String getGradebookLessonlist() {
        return gradebookLessonlist;
    }

    public void setWeekNumber(int weekNumber) {
        this.weekNumber = weekNumber;
    }

    public void setStudentGroup(int studentGroup) {
        this.studentGroup = studentGroup;
    }

    public void setStudentGroupInformation(String studentGroupInformation) {
        this.studentGroupInformation = studentGroupInformation;
    }

    public void setNumSubgroup(int numSubgroup) {
        this.numSubgroup = numSubgroup;
    }

    public void setAuditory(String auditory) {
        this.auditory = auditory;
    }

    public void setLessonTime(String lessonTime) {
        this.lessonTime = lessonTime;
    }

    public void setStartLessonTime(String startLessonTime) {
        this.startLessonTime = startLessonTime;
    }

    public void setEndLessonTime(String endLessonTime) {
        this.endLessonTime = endLessonTime;
    }

    public void setGradebookLesson(int gradebookLesson) {
        this.gradebookLesson = gradebookLesson;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void setLessonType(String lessonType) {
        this.lessonType = lessonType;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setStudentGroupModelList(String studentGroupModelList) {
        this.studentGroupModelList = studentGroupModelList;
    }

    public void setZaoch(String zaoch) {
        this.zaoch = zaoch;
    }

    public void setGradebookLessonlist(String gradebookLessonlist) {
        this.gradebookLessonlist = gradebookLessonlist;
    }
}
