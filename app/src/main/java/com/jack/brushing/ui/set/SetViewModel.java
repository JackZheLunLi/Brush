package com.jack.brushing.ui.set;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SetViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public SetViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is set fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}