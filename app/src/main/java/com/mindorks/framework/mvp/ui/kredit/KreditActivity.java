package com.mindorks.framework.mvp.ui.kredit;

import android.os.Bundle;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.OnClick;

import com.mindorks.framework.mvp.ui.base.BaseActivity;

import android.content.Intent;
import android.content.Context;

import com.mindorks.framework.mvp.R;
import com.mindorks.framework.mvp.ui.pengajuan.PengajuanActivity;
import com.mindorks.framework.mvp.ui.rincian.RincianActivity;

public class KreditActivity extends BaseActivity implements KreditMvpView {

    @Inject
    KreditPresenter<KreditMvpView> mPresenter;

    public static Intent getStartIntent(Context context) {
        Intent intent = new Intent(context, KreditActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kredit);

        getActivityComponent().inject(this);
        setUnBinder(ButterKnife.bind(this));
        mPresenter.onAttach(KreditActivity.this);
    }

    @Override
    protected void onDestroy() {
        mPresenter.onDetach();
        super.onDestroy();
    }

    @Override
    protected void setUp() {

    }

    @OnClick(R.id.btnAjukan)
    protected void openPengajuanActivity() {
        Intent intent = PengajuanActivity.getStartIntent(this);
        startActivity(intent);
    }
}