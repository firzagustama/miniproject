package com.mindorks.framework.mvp.ui.sukses;

import android.os.Bundle;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import com.mindorks.framework.mvp.ui.angsuran.AngsuranActivity;
import com.mindorks.framework.mvp.ui.base.BaseActivity;

import android.content.Intent;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.mindorks.framework.mvp.R;
import com.mindorks.framework.mvp.ui.home.HomeActivity;
import com.mindorks.framework.mvp.ui.verifikasikredit.VerifikasiKreditActivity;

public class SuksesActivity extends BaseActivity implements SuksesMvpView {

    @Inject
    SuksesPresenter<SuksesMvpView> mPresenter;

    @BindView(R.id.status)
    TextView statusView;

    @BindView(R.id.harga)
    TextView hargaView;

    @BindView(R.id.angsuran)
    LinearLayout angsuranContainer;

    @BindView(R.id.kredit)
    LinearLayout kreditContainer;

    @BindView(R.id.title)
    TextView titleView;

    @BindView(R.id.image)
    ImageView imageView;

    Boolean isKredit;

    public static Intent getStartIntent(Context context) {
        Intent intent = new Intent(context, SuksesActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sukses);

        getActivityComponent().inject(this);
        setUnBinder(ButterKnife.bind(this));
        mPresenter.onAttach(SuksesActivity.this);

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

        if (isKredit) {
            statusView.setText("Menunggu Proses Verifikasi, Harap Tunggu 1x24 Jam Kerja");
            hargaView.setText("Rp. 13.000.000");
            kreditContainer.setVisibility(View.VISIBLE);
            angsuranContainer.setVisibility(View.GONE);
            titleView.setText("Kredit");
            imageView.setImageResource(R.drawable.loading);
        } else {
            statusView.setText("Pembayaran Angsuran Berhasil");
            hargaView.setText("Rp. 750.000");
            kreditContainer.setVisibility(View.GONE);
            angsuranContainer.setVisibility(View.VISIBLE);
            titleView.setText("Angsuran");
            imageView.setImageResource(R.drawable.sukses);
        }
    }

    @OnClick(R.id.btnSelesai)
    protected void openNextActivity() {
        Intent intent = isKredit ? VerifikasiKreditActivity.getStartIntent(this) : HomeActivity.getStartIntent(this);
        startActivity(intent);
        finish();
    }
}