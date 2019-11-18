package com.mindorks.framework.mvp.ui.verifikasikredit;

import android.os.Bundle;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.OnClick;

import com.mindorks.framework.mvp.ui.base.BaseActivity;

import android.content.Intent;
import android.content.Context;

import com.mindorks.framework.mvp.R;
import com.mindorks.framework.mvp.ui.home.HomeActivity;

public class VerifikasiKreditActivity extends BaseActivity implements VerifikasiKreditMvpView {

    @Inject
    VerifikasiKreditPresenter<VerifikasiKreditMvpView> mPresenter;

    public static Intent getStartIntent(Context context) {
        Intent intent = new Intent(context, VerifikasiKreditActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verifikasi_kredit);

        getActivityComponent().inject(this);
        setUnBinder(ButterKnife.bind(this));
        mPresenter.onAttach(VerifikasiKreditActivity.this);
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
    protected void pengajuanKreditSelesai() {
        Intent intent = HomeActivity.getStartIntent(this);
        startActivity(intent);
    }

}