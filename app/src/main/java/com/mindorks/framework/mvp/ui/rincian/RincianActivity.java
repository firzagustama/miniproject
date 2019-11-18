package com.mindorks.framework.mvp.ui.rincian;

import android.os.Bundle;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.OnClick;

import com.mindorks.framework.mvp.ui.base.BaseActivity;

import android.content.Intent;
import android.content.Context;

import com.mindorks.framework.mvp.R;
import com.mindorks.framework.mvp.ui.pin.PinActivity;

public class RincianActivity extends BaseActivity implements RincianMvpView {

    @Inject
    RincianPresenter<RincianMvpView> mPresenter;

    public static Intent getStartIntent(Context context) {
        Intent intent = new Intent(context, RincianActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rincian);

        getActivityComponent().inject(this);
        setUnBinder(ButterKnife.bind(this));
        mPresenter.onAttach(RincianActivity.this);
    }

    @Override
    protected void onDestroy() {
        mPresenter.onDetach();
        super.onDestroy();
    }

    @Override
    protected void setUp() {

    }

    @OnClick(R.id.btnSelesai)
    protected void openPinActivity() {
        Intent intent = PinActivity.getStartIntent(this);
        intent.putExtra("kredit", true);
        startActivity(intent);
    }
}