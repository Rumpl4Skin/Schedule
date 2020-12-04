package com.example.schedule.data;

import androidx.annotation.NonNull;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Schedule
{
    private List<Integer> weekNumber;

    private List<String> studentGroup;

    private List<String> studentGroupInformation;

    private int numSubgroup;

    private List<String> auditory;

    private String lessonTime;

    private String startLessonTime;

    private String endLessonTime;

    private String gradebookLesson;

    private String subject;

    private String note;

    private String lessonType;

    private List<Employee> employee;

    private String studentGroupModelList;

    private boolean zaoch;

    private String gradebookLessonlist;

    public void setWeekNumber(List<Integer> weekNumber){
        this.weekNumber = weekNumber;
    }
    public List<Integer> getWeekNumber(){
        return this.weekNumber;
    }
    public void setStudentGroup(List<String> studentGroup){
        this.studentGroup = studentGroup;
    }
    public List<String> getStudentGroup(){
        return this.studentGroup;
    }
    public void setStudentGroupInformation(List<String> studentGroupInformation){
        this.studentGroupInformation = studentGroupInformation;
    }
    public List<String> getStudentGroupInformation(){
        return this.studentGroupInformation;
    }
    public void setNumSubgroup(int numSubgroup){
        this.numSubgroup = numSubgroup;
    }
    public int getNumSubgroup(){
        return this.numSubgroup;
    }
    public void setAuditory(List<String> auditory){
        this.auditory = auditory;
    }
    public List<String> getAuditory(){
        return this.auditory;
    }
    public void setLessonTime(String lessonTime){
        this.lessonTime = lessonTime;
    }
    public String getLessonTime(){
        return this.lessonTime;
    }
    public void setStartLessonTime(String startLessonTime){
        this.startLessonTime = startLessonTime;
    }
    public String getStartLessonTime(){
        return this.startLessonTime;
    }
    public void setEndLessonTime(String endLessonTime){
        this.endLessonTime = endLessonTime;
    }
    public String getEndLessonTime(){
        return this.endLessonTime;
    }
    public void setGradebookLesson(String gradebookLesson){
        this.gradebookLesson = gradebookLesson;
    }
    public String getGradebookLesson(){
        return this.gradebookLesson;
    }
    public void setSubject(String subject){
        this.subject = subject;
    }
    public String getSubject(){
        return this.subject;
    }
    public void setNote(String note){
        this.note = note;
    }
    public String getNote(){
        return this.note;
    }
    public void setLessonType(String lessonType){
        this.lessonType = lessonType;
    }
    public String getLessonType(){
        return this.lessonType;
    }
    public void setEmployee(List<Employee> employee){
        this.employee = employee;
    }
    public List<Employee> getEmployee(){
        return this.employee;
    }
    public void setStudentGroupModelList(String studentGroupModelList){
        this.studentGroupModelList = studentGroupModelList;
    }
    public String getStudentGroupModelList(){
        return this.studentGroupModelList;
    }
    public void setZaoch(boolean zaoch){
        this.zaoch = zaoch;
    }
    public boolean getZaoch(){
        return this.zaoch;
    }
    public void setGradebookLessonlist(String gradebookLessonlist){
        this.gradebookLessonlist = gradebookLessonlist;
    }
    public String getGradebookLessonlist(){
        return this.gradebookLessonlist;
    }
}