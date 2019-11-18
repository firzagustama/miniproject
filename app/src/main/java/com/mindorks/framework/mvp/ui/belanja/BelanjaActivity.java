package com.mindorks.framework.mvp.ui.belanja;

import android.os.Bundle;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import com.mindorks.framework.mvp.ui.base.BaseActivity;

import android.content.Intent;
import android.content.Context;
import android.support.v4.view.ViewPager;
import android.widget.ImageView;

import com.mindorks.framework.mvp.R;
import com.mindorks.framework.mvp.ui.kredit.KreditActivity;
import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

import java.util.ArrayList;
import java.util.List;

public class BelanjaActivity extends BaseActivity implements BelanjaMvpView, ImageListener {

    @Inject
    BelanjaPresenter<BelanjaMvpView> mPresenter;

    @BindView(R.id.carouselView)
    CarouselView carouselView;

    @BindView(R.id.view_pager)
    ViewPager vpPager;

    List<Integer> sampleImages;

    public static Intent getStartIntent(Context context) {
        Intent intent = new Intent(context, BelanjaActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belanja);

        getActivityComponent().inject(this);
        setUnBinder(ButterKnife.bind(this));
        mPresenter.onAttach(BelanjaActivity.this);

        setUp();
    }

    @Override
    protected void onDestroy() {
        mPresenter.onDetach();
        super.onDestroy();
    }

    @Override
    protected void setUp() {
        sampleImages = new ArrayList<>();
        sampleImages.add(R.drawable.promo1);
        sampleImages.add(R.drawable.promo2);

        carouselView.setPageCount(sampleImages.size());
        carouselView.setImageListener(this);

        vpPager.setAdapter(new BelanjaAdapter(getSupportFragmentManager()));
    }

    @Override
    public void setImageForPosition(int position, ImageView imageView) {
        imageView.setImageResource(sampleImages.get(position));
    }

    @OnClick(R.id.btnBayar)
    public void openKreditActivity() {
        Intent intent = KreditActivity.getStartIntent(this);
        startActivity(intent);
    }
}