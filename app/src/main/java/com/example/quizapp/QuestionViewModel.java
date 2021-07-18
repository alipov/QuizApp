package com.example.quizapp;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import java.util.List;

public class QuestionViewModel  extends AndroidViewModel {

    private QuestionRepository mRepository;

    private LiveData<List<Questions>> mAllQuestions;

    //without category
//    public QuestionViewModel(Application application){
//        super(application);
//        mRepository = new QuestionRepository(application);
//        mAllQuestions = mRepository.getmAllQuestions();
//
//    }
//
//        LiveData<List<Questions>> getmAllQuestions() {
//        return mAllQuestions;
//    }
//   }

    public QuestionViewModel(Application application){

        super(application);//callback
        mRepository = new QuestionRepository(application);
        //mAllQuestions = mRepository.getQuestion()
    }

    LiveData<List<Questions>> getAllQuestionByCategory(String category) {

        mAllQuestions = mRepository.getQuestions(category);
        return mAllQuestions;
    }
}


