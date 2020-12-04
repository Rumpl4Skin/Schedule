package com.example.schedule.data;

import androidx.annotation.NonNull;

import com.google.gson.annotations.SerializedName;

public class studentGroup {

    @NonNull
    @SerializedName("name")
    private String name;
    @SerializedName("facultyId")
    private int facultyId;
    @SerializedName("facultyName")
    private String facultyName;
    @SerializedName("specialityDepartmentEducationFormId")
    private int specialityDepartmentEducationFormId;
    @SerializedName("specialityName")
    private String specialityName;
    @SerializedName("course")
    private int course;
    @SerializedName("id")
    private int id;
    @SerializedName("calendarId")
    private String calendarId;

    public studentGroup(String name) {
        this.name = name;
    }

    public studentGroup(String name,
                        int facultyId,
                        String facultyName,
                        int specialityDepartmentEducationFormId,
                        String specialityName,
                        int course,
                        int id,
                        String calendarId) {
        this.name = name;
        this.facultyId = facultyId;
        this.facultyName = facultyName;
        this.specialityDepartmentEducationFormId = specialityDepartmentEducationFormId;
        this.specialityName = specialityName;
        this.course = course;
        this.id = id;
        this.calendarId = calendarId;
    }

    public String getName() {
        return name;
    }

    public int getFacultyId() {
        return facultyId;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public int getSpecialityDepartmentEducationFormId() {
        return specialityDepartmentEducationFormId;
    }

    public String getSpecialityName() {
        return specialityName;
    }

    public int getCourse() {
        return course;
    }

    public int getId() {
        return id;
    }

    public String getCalendarId() {
        return calendarId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        studentGroup that = (studentGroup) o;

        if (name != that.name) return false;
        if (facultyId != that.facultyId) return false;
        if (specialityDepartmentEducationFormId != that.specialityDepartmentEducationFormId)
            return false;
        if (course != that.course) return false;
        if (id != that.id) return false;
        if (calendarId != that.calendarId) return false;
        if (facultyName != null ? !facultyName.equals(that.facultyName) : that.facultyName != null)
            return false;
        return specialityName != null ? specialityName.equals(that.specialityName) : that.specialityName == null;
    }


}
