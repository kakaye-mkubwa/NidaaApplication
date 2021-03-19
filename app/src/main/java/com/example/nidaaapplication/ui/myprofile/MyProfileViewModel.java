package com.example.nidaaapplication.ui.myprofile;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyProfileViewModel  extends ViewModel {
    private MutableLiveData<String> mText;

    public MyProfileViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is dashboard fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
