package com.mindorks.framework.mvp.ui.pembayaran;

import android.os.Bundle;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.OnClick;

import com.mindorks.framework.mvp.ui.angsuran.AngsuranActivity;
import com.mindorks.framework.mvp.ui.base.BaseActivity;

import android.content.Intent;
import android.content.Context;

import com.mindorks.framework.mvp.R;

public class PembayaranActivity extends BaseActivity implements PembayaranMvpView {

    @Inject
    PembayaranPresenter<PembayaranMvpView> mPresenter;

    public static Intent getStartIntent(Context context) {
        Intent intent = new Intent(context, PembayaranActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pembayaran);

        getActivityComponent().inject(this);
        setUnBinder(ButterKnife.bind(this));
        mPresenter.onAttach(PembayaranActivity.this);
    }

    @Override
    protected void onDestroy() {
        mPresenter.onDetach();
        super.onDestroy();
    }

    @Override
    protected void setUp() {

    }

    @OnClick(R.id.angsuran_card)
    protected void openAngsuranActivity() {
        Intent intent = AngsuranActivity.getStartIntent(PembayaranActivity.this);
        startActivity(intent);
    }
}