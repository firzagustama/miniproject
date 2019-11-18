package com.mindorks.framework.mvp.ui.angsuran;


import com.mindorks.framework.mvp.ui.base.BasePresenter;
import com.mindorks.framework.mvp.utils.rx.SchedulerProvider;
import com.mindorks.framework.mvp.data.DataManager;

import io.reactivex.disposables.CompositeDisposable;

import javax.inject.Inject;

public class AngsuranPresenter<V extends AngsuranMvpView> extends BasePresenter<V> implements AngsuranMvpPresenter<V> {

    private static final String TAG = "AngsuranPresenter";

    @Inject
    public AngsuranPresenter(DataManager dataManager,
                             SchedulerProvider schedulerProvider,
                             CompositeDisposable compositeDisposable) {
        super(dataManager, schedulerProvider, compositeDisposable);
    }
}