package com.mindorks.framework.mvp.ui.home;


import com.mindorks.framework.mvp.ui.base.BasePresenter;
import com.mindorks.framework.mvp.utils.rx.SchedulerProvider;
import com.mindorks.framework.mvp.data.DataManager;

import io.reactivex.disposables.CompositeDisposable;

import javax.inject.Inject;

public class HomePresenter<V extends HomeMvpView> extends BasePresenter<V> implements HomeMvpPresenter<V> {

    private static final String TAG = "HomePresenter";

    @Inject
    public HomePresenter(DataManager dataManager,
                         SchedulerProvider schedulerProvider,
                         CompositeDisposable compositeDisposable) {
        super(dataManager, schedulerProvider, compositeDisposable);
    }
}