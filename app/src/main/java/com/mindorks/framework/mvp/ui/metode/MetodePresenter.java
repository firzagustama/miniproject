package com.mindorks.framework.mvp.ui.metode;


import com.mindorks.framework.mvp.ui.base.BasePresenter;
import com.mindorks.framework.mvp.utils.rx.SchedulerProvider;
import com.mindorks.framework.mvp.data.DataManager;

import io.reactivex.disposables.CompositeDisposable;

import javax.inject.Inject;

public class MetodePresenter<V extends MetodeMvpView> extends BasePresenter<V> implements MetodeMvpPresenter<V> {

    private static final String TAG = "MetodePresenter";

    @Inject
    public MetodePresenter(DataManager dataManager,
                           SchedulerProvider schedulerProvider,
                           CompositeDisposable compositeDisposable) {
        super(dataManager, schedulerProvider, compositeDisposable);
    }
}