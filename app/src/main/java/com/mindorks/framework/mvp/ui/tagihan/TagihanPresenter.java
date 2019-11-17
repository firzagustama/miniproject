package com.mindorks.framework.mvp.ui.tagihan;


import com.mindorks.framework.mvp.ui.base.BasePresenter;
import com.mindorks.framework.mvp.utils.rx.SchedulerProvider;
import com.mindorks.framework.mvp.data.DataManager;

import io.reactivex.disposables.CompositeDisposable;

import javax.inject.Inject;

public class TagihanPresenter<V extends TagihanMvpView> extends BasePresenter<V> implements TagihanMvpPresenter<V> {

    private static final String TAG = "TagihanPresenter";

    @Inject
    public TagihanPresenter(DataManager dataManager,
                            SchedulerProvider schedulerProvider,
                            CompositeDisposable compositeDisposable) {
        super(dataManager, schedulerProvider, compositeDisposable);
    }
}