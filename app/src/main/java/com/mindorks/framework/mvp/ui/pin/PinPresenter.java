package com.mindorks.framework.mvp.ui.pin;


import com.mindorks.framework.mvp.ui.base.BasePresenter;
import com.mindorks.framework.mvp.utils.rx.SchedulerProvider;
import com.mindorks.framework.mvp.data.DataManager;

import io.reactivex.disposables.CompositeDisposable;

import javax.inject.Inject;

public class PinPresenter<V extends PinMvpView> extends BasePresenter<V> implements PinMvpPresenter<V> {

    private static final String TAG = "PinPresenter";

    @Inject
    public PinPresenter(DataManager dataManager,
                        SchedulerProvider schedulerProvider,
                        CompositeDisposable compositeDisposable) {
        super(dataManager, schedulerProvider, compositeDisposable);
    }
}