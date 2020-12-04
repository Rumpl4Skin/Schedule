package com.example.schedule.ui.home;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.schedule.NetworkService;
import com.example.schedule.data.Answer;
import com.example.schedule.data.Schedule;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");

        NetworkService.getInstance()
                .getJSONApi()
                .getAnswerWithIDGroup(944691)
                .enqueue(new Callback<Answer>() {
                    @Override
                    public void onResponse(@NonNull Call<Answer> call, @NonNull Response<Answer> response) {
                        Answer post = response.body();
                        List<Schedule> list=post.getTodaySchedules();

                        mText.setValue(post.getStudentGroup().getName()
                                + "\n"+list.get(0).getSubject()
                                + "\n"+list.size());
                                /*textView.append(post.getUserId() + "\n");
                                textView.append(post.getTitle() + "\n");
                                textView.append(post.getBody() + "\n");*/
                    }

                    @Override
                    public void onFailure(@NonNull Call<Answer> call, @NonNull Throwable t) {

                        mText.setValue("Error occurred while getting request!"+ t.getMessage());
                        t.printStackTrace();
                    }
                });
    }

    public LiveData<String> getText() {
        return mText;
    }
}