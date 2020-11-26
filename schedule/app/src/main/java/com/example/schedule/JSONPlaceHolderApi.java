package com.example.schedule;

import com.example.schedule.data.Answer;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface JSONPlaceHolderApi {
    @GET("/studentGroup/schedule")
    public Call<Answer> getAnswerWithIDGroup(@Query("studentGroup")  int studentGroup);
}
