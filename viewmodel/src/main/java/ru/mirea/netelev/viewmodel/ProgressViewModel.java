package ru.mirea.netelev.viewmodel;

import android.os.Handler;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ProgressViewModel extends ViewModel {
    private static final MutableLiveData<Boolean> isShowProgress = new MutableLiveData<>();
    // Показать прогресс в течении 10 сек.
    void showProgress() {
        isShowProgress.postValue(true);
        new Handler().postDelayed(() -> isShowProgress.postValue(false), 10000);
    }
    // Возвращает состояние прогресс?
    MutableLiveData<Boolean> getProgressState() {
        return isShowProgress;
    }
}