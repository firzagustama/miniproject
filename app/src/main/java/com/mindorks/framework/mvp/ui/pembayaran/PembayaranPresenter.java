package com.mindorks.framework.mvp.ui.pembayaran;


import com.mindorks.framework.mvp.ui.base.BasePresenter;
import com.mindorks.framework.mvp.utils.rx.SchedulerProvider;
import com.mindorks.framework.mvp.data.DataManager;

import io.reactivex.disposables.CompositeDisposable;

import javax.inject.Inject;

public class PembayaranPresenter<V extends PembayaranMvpView> extends BasePresenter<V> implements PembayaranMvpPresenter<V> {

    private static final String TAG = "PembayaranPresenter";

    @Inject
    public PembayaranPresenter(DataManager dataManager,
                               SchedulerProvider schedulerProvider,
                               CompositeDisposable compositeDisposable) {
        super(dataManager, schedulerProvider, compositeDisposable);
    }
}