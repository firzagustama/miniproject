package com.mindorks.framework.mvp.ui.belanja;


import com.mindorks.framework.mvp.ui.base.BasePresenter;
import com.mindorks.framework.mvp.utils.rx.SchedulerProvider;
import com.mindorks.framework.mvp.data.DataManager;

import io.reactivex.disposables.CompositeDisposable;

import javax.inject.Inject;

public class BelanjaPresenter<V extends BelanjaMvpView> extends BasePresenter<V> implements BelanjaMvpPresenter<V> {

    private static final String TAG = "BelanjaPresenter";

    @Inject
    public BelanjaPresenter(DataManager dataManager,
                            SchedulerProvider schedulerProvider,
                            CompositeDisposable compositeDisposable) {
        super(dataManager, schedulerProvider, compositeDisposable);
    }
}