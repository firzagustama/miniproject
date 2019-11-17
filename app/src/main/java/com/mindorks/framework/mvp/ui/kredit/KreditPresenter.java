package com.mindorks.framework.mvp.ui.kredit;


import com.mindorks.framework.mvp.ui.base.BasePresenter;
import com.mindorks.framework.mvp.utils.rx.SchedulerProvider;
import com.mindorks.framework.mvp.data.DataManager;

import io.reactivex.disposables.CompositeDisposable;

import javax.inject.Inject;

public class KreditPresenter<V extends KreditMvpView> extends BasePresenter<V> implements KreditMvpPresenter<V> {

    private static final String TAG = "KreditPresenter";

    @Inject
    public KreditPresenter(DataManager dataManager,
                           SchedulerProvider schedulerProvider,
                           CompositeDisposable compositeDisposable) {
        super(dataManager, schedulerProvider, compositeDisposable);
    }
}