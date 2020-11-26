package com.example.schedule.data;

import com.google.gson.annotations.SerializedName;

public class Employee {
    @SerializedName("firstName")
    private String firstName;
    @SerializedName("lastName")
    private String lastName;
    @SerializedName("middleName")
    private String middleName;
    @SerializedName("rank")
    private String rank;
    @SerializedName("photoLink")
    private String photoLink;
    @SerializedName("calendarId")
    private String calendarId;
    @SerializedName("academicDepartment")
    private String academicDepartment;
    @SerializedName("id")
    private int id;
    @SerializedName("fio")
    private String fio;
    @SerializedName("studentGroupModelList")
    private String studentGroupModelList;
    @SerializedName("zaoch")
    private String zaoch;
    @SerializedName("gradebookLessonlist")
    private String gradebookLessonlist;

    public Employee(String firstName,
                    String lastName,
                    String middleName,
                    String rank,
                    String photoLink,
                    String calendarId,
                    String academicDepartment,
                    int id,
                    String fio,
                    String studentGroupModelList,
                    String zaoch,
                    String gradebookLessonlist) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.rank = rank;
        this.photoLink = photoLink;
        this.calendarId = calendarId;
        this.academicDepartment = academicDepartment;
        this.id = id;
        this.fio = fio;
        this.studentGroupModelList = studentGroupModelList;
        this.zaoch = zaoch;
        this.gradebookLessonlist = gradebookLessonlist;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getRank() {
        return rank;
    }

    public String getPhotoLink() {
        return photoLink;
    }

    public String getCalendarId() {
        return calendarId;
    }

    public String getAcademicDepartment() {
        return academicDepartment;
    }

    public int getId() {
        return id;
    }

    public String getFio() {
        return fio;
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

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public void setPhotoLink(String photoLink) {
        this.photoLink = photoLink;
    }

    public void setCalendarId(String calendarId) {
        this.calendarId = calendarId;
    }

    public void setAcademicDepartment(String academicDepartment) {
        this.academicDepartment = academicDepartment;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFio(String fio) {
        this.fio = fio;
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
