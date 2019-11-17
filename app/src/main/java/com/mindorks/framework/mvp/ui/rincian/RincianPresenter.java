package com.mindorks.framework.mvp.ui.rincian;


import com.mindorks.framework.mvp.ui.base.BasePresenter;
import com.mindorks.framework.mvp.utils.rx.SchedulerProvider;
import com.mindorks.framework.mvp.data.DataManager;

import io.reactivex.disposables.CompositeDisposable;

import javax.inject.Inject;

public class RincianPresenter<V extends RincianMvpView> extends BasePresenter<V> implements RincianMvpPresenter<V> {

    private static final String TAG = "RincianPresenter";

    @Inject
    public RincianPresenter(DataManager dataManager,
                            SchedulerProvider schedulerProvider,
                            CompositeDisposable compositeDisposable) {
        super(dataManager, schedulerProvider, compositeDisposable);
    }
}