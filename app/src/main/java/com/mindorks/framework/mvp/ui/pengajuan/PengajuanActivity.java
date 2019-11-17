package com.mindorks.framework.mvp.ui.pengajuan;

import android.os.Bundle;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.OnClick;

import com.mindorks.framework.mvp.ui.base.BaseActivity;

import android.content.Intent;
import android.content.Context;

import com.mindorks.framework.mvp.R;
import com.mindorks.framework.mvp.ui.pin.PinActivity;
import com.mindorks.framework.mvp.ui.rincian.RincianActivity;

public class PengajuanActivity extends BaseActivity implements PengajuanMvpView {

    @Inject
    PengajuanPresenter<PengajuanMvpView> mPresenter;

    public static Intent getStartIntent(Context context) {
        Intent intent = new Intent(context, PengajuanActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pengajuan);

        getActivityComponent().inject(this);
        setUnBinder(ButterKnife.bind(this));
        mPresenter.onAttach(PengajuanActivity.this);
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
    protected void openRincianActivity() {
        Intent intent = RincianActivity.getStartIntent(this);
        startActivity(intent);
    }
}