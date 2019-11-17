package com.mindorks.framework.mvp.ui.sukses;


import com.mindorks.framework.mvp.ui.base.BasePresenter;
import com.mindorks.framework.mvp.utils.rx.SchedulerProvider;
import com.mindorks.framework.mvp.data.DataManager;

import io.reactivex.disposables.CompositeDisposable;

import javax.inject.Inject;

public class SuksesPresenter<V extends SuksesMvpView> extends BasePresenter<V> implements SuksesMvpPresenter<V> {

    private static final String TAG = "SuksesPresenter";

    @Inject
    public SuksesPresenter(DataManager dataManager,
                           SchedulerProvider schedulerProvider,
                           CompositeDisposable compositeDisposable) {
        super(dataManager, schedulerProvider, compositeDisposable);
    }
}