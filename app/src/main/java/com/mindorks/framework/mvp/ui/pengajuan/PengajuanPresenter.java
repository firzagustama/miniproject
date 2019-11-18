package com.mindorks.framework.mvp.ui.pengajuan;


import com.mindorks.framework.mvp.ui.base.BasePresenter;
import com.mindorks.framework.mvp.utils.rx.SchedulerProvider;
import com.mindorks.framework.mvp.data.DataManager;

import io.reactivex.disposables.CompositeDisposable;

import javax.inject.Inject;

public class PengajuanPresenter<V extends PengajuanMvpView> extends BasePresenter<V> implements PengajuanMvpPresenter<V> {

    private static final String TAG = "PengajuanPresenter";

    @Inject
    public PengajuanPresenter(DataManager dataManager,
                              SchedulerProvider schedulerProvider,
                              CompositeDisposable compositeDisposable) {
        super(dataManager, schedulerProvider, compositeDisposable);
    }
}