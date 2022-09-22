package com.example.dolores.ui.notifications;

import android.view.View;
import android.widget.TextView;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.example.dolores.bosque.data.Data;

public class NotificationsViewModel extends ViewModel {

    private final MutableLiveData<String> mText;
    private TextView t;
    private SwipeRefreshLayout l;
    private int counter = 0;
    private final String grade = "66%";

    private void updateNotifs(int refreshInt) {
        if (Data.getNewNotifs()) {
            t.setVisibility(View.INVISIBLE);
        }
    }

    public NotificationsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("You have no new notifications!");
    }

    public LiveData<String> getText() {
        return mText;
    }
}