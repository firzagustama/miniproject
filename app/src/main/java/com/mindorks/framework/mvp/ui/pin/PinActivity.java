package com.mindorks.framework.mvp.ui.pin;

import android.os.Bundle;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.OnClick;

import com.mindorks.framework.mvp.ui.base.BaseActivity;

import android.content.Intent;
import android.content.Context;

import com.mindorks.framework.mvp.R;
import com.mindorks.framework.mvp.ui.sukses.SuksesActivity;

public class PinActivity extends BaseActivity implements PinMvpView {

    @Inject
    PinPresenter<PinMvpView> mPresenter;

    Boolean isKredit;

    public static Intent getStartIntent(Context context) {
        Intent intent = new Intent(context, PinActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pin);

        getActivityComponent().inject(this);
        setUnBinder(ButterKnife.bind(this));
        mPresenter.onAttach(PinActivity.this);

        setUp();
    }

    @Override
    protected void onDestroy() {
        mPresenter.onDetach();
        super.onDestroy();
    }

    @Override
    protected void setUp() {
        isKredit = getIntent().getBooleanExtra("kredit", false);
    }

    @OnClick(R.id.btnBayar)
    protected void openSuksesActivity() {
        Intent intent = SuksesActivity.getStartIntent(this);
        intent.putExtra("kredit", isKredit);
        startActivity(intent);
        finish();
    }
}