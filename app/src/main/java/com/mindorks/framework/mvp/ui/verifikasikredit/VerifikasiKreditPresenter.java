package com.mindorks.framework.mvp.ui.verifikasikredit;


import com.mindorks.framework.mvp.ui.base.BasePresenter;
import com.mindorks.framework.mvp.utils.rx.SchedulerProvider;
import com.mindorks.framework.mvp.data.DataManager;

import io.reactivex.disposables.CompositeDisposable;

import javax.inject.Inject;

public class VerifikasiKreditPresenter<V extends VerifikasiKreditMvpView> extends BasePresenter<V> implements VerifikasiKreditMvpPresenter<V> {

    private static final String TAG = "VerifikasiKreditPresenter";

    @Inject
    public VerifikasiKreditPresenter(DataManager dataManager,
                                     SchedulerProvider schedulerProvider,
                                     CompositeDisposable compositeDisposable) {
        super(dataManager, schedulerProvider, compositeDisposable);
    }
}