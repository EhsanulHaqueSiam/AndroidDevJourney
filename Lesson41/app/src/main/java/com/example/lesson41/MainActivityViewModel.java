package com.example.lesson41;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel {

    private int counter  = 0;

    private MutableLiveData<Integer> countLiveData = new MutableLiveData<>();

    // When the app first launched
    public MutableLiveData<Integer> getInitialCounter(){
        countLiveData.setValue(counter);
        return countLiveData;
    }

    // When user clicks the button
    public void getCounter() {
        counter++;
        countLiveData.setValue(counter);
    }

//    // When the app first launched
//    public int getInitialCounter(){
//        return counter;
//    }



//    // When user clicks the button
//    public int getCounter() {
//        counter++;
//        return counter;
//    }
}
