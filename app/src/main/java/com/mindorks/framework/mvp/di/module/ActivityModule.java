/*
 * Copyright (C) 2017 MINDORKS NEXTGEN PRIVATE LIMITED
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://mindorks.com/license/apache-v2
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License
 */

package com.mindorks.framework.mvp.di.module;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;

import com.mindorks.framework.mvp.data.network.model.BlogResponse;
import com.mindorks.framework.mvp.data.network.model.OpenSourceResponse;
import com.mindorks.framework.mvp.di.ActivityContext;
import com.mindorks.framework.mvp.di.PerActivity;
import com.mindorks.framework.mvp.ui.about.AboutMvpPresenter;
import com.mindorks.framework.mvp.ui.about.AboutMvpView;
import com.mindorks.framework.mvp.ui.about.AboutPresenter;
import com.mindorks.framework.mvp.ui.angsuran.AngsuranMvpPresenter;
import com.mindorks.framework.mvp.ui.angsuran.AngsuranMvpView;
import com.mindorks.framework.mvp.ui.angsuran.AngsuranPresenter;
import com.mindorks.framework.mvp.ui.belanja.BelanjaMvpPresenter;
import com.mindorks.framework.mvp.ui.belanja.BelanjaMvpView;
import com.mindorks.framework.mvp.ui.belanja.BelanjaPresenter;
import com.mindorks.framework.mvp.ui.feed.FeedMvpPresenter;
import com.mindorks.framework.mvp.ui.feed.FeedMvpView;
import com.mindorks.framework.mvp.ui.feed.FeedPagerAdapter;
import com.mindorks.framework.mvp.ui.feed.FeedPresenter;
import com.mindorks.framework.mvp.ui.feed.blogs.BlogAdapter;
import com.mindorks.framework.mvp.ui.feed.blogs.BlogMvpPresenter;
import com.mindorks.framework.mvp.ui.feed.blogs.BlogMvpView;
import com.mindorks.framework.mvp.ui.feed.blogs.BlogPresenter;
import com.mindorks.framework.mvp.ui.feed.opensource.OpenSourceAdapter;
import com.mindorks.framework.mvp.ui.feed.opensource.OpenSourceMvpPresenter;
import com.mindorks.framework.mvp.ui.feed.opensource.OpenSourceMvpView;
import com.mindorks.framework.mvp.ui.feed.opensource.OpenSourcePresenter;
import com.mindorks.framework.mvp.ui.home.HomeMvpPresenter;
import com.mindorks.framework.mvp.ui.home.HomeMvpView;
import com.mindorks.framework.mvp.ui.home.HomePresenter;
import com.mindorks.framework.mvp.ui.kredit.KreditMvpPresenter;
import com.mindorks.framework.mvp.ui.kredit.KreditMvpView;
import com.mindorks.framework.mvp.ui.kredit.KreditPresenter;
import com.mindorks.framework.mvp.ui.login.LoginMvpPresenter;
import com.mindorks.framework.mvp.ui.login.LoginMvpView;
import com.mindorks.framework.mvp.ui.login.LoginPresenter;
import com.mindorks.framework.mvp.ui.main.MainMvpPresenter;
import com.mindorks.framework.mvp.ui.main.MainMvpView;
import com.mindorks.framework.mvp.ui.main.MainPresenter;
import com.mindorks.framework.mvp.ui.main.rating.RatingDialogMvpPresenter;
import com.mindorks.framework.mvp.ui.main.rating.RatingDialogMvpView;
import com.mindorks.framework.mvp.ui.main.rating.RatingDialogPresenter;
import com.mindorks.framework.mvp.ui.metode.MetodeMvpPresenter;
import com.mindorks.framework.mvp.ui.metode.MetodeMvpView;
import com.mindorks.framework.mvp.ui.metode.MetodePresenter;
import com.mindorks.framework.mvp.ui.pembayaran.PembayaranMvpPresenter;
import com.mindorks.framework.mvp.ui.pembayaran.PembayaranMvpView;
import com.mindorks.framework.mvp.ui.pembayaran.PembayaranPresenter;
import com.mindorks.framework.mvp.ui.pengajuan.PengajuanMvpPresenter;
import com.mindorks.framework.mvp.ui.pengajuan.PengajuanMvpView;
import com.mindorks.framework.mvp.ui.pengajuan.PengajuanPresenter;
import com.mindorks.framework.mvp.ui.pin.PinMvpPresenter;
import com.mindorks.framework.mvp.ui.pin.PinMvpView;
import com.mindorks.framework.mvp.ui.pin.PinPresenter;
import com.mindorks.framework.mvp.ui.rincian.RincianMvpPresenter;
import com.mindorks.framework.mvp.ui.rincian.RincianMvpView;
import com.mindorks.framework.mvp.ui.rincian.RincianPresenter;
import com.mindorks.framework.mvp.ui.splash.SplashMvpPresenter;
import com.mindorks.framework.mvp.ui.splash.SplashMvpView;
import com.mindorks.framework.mvp.ui.splash.SplashPresenter;
import com.mindorks.framework.mvp.ui.sukses.SuksesMvpPresenter;
import com.mindorks.framework.mvp.ui.sukses.SuksesMvpView;
import com.mindorks.framework.mvp.ui.sukses.SuksesPresenter;
import com.mindorks.framework.mvp.ui.tagihan.TagihanMvpPresenter;
import com.mindorks.framework.mvp.ui.tagihan.TagihanMvpView;
import com.mindorks.framework.mvp.ui.tagihan.TagihanPresenter;
import com.mindorks.framework.mvp.ui.verifikasikredit.VerifikasiKreditMvpPresenter;
import com.mindorks.framework.mvp.ui.verifikasikredit.VerifikasiKreditMvpView;
import com.mindorks.framework.mvp.ui.verifikasikredit.VerifikasiKreditPresenter;
import com.mindorks.framework.mvp.utils.rx.AppSchedulerProvider;
import com.mindorks.framework.mvp.utils.rx.SchedulerProvider;

import java.util.ArrayList;

import dagger.Module;
import dagger.Provides;
import io.reactivex.disposables.CompositeDisposable;

/**
 * Created by janisharali on 27/01/17.
 */

@Module
public class ActivityModule {

    private AppCompatActivity mActivity;

    public ActivityModule(AppCompatActivity activity) {
        this.mActivity = activity;
    }

    @Provides
    @ActivityContext
    Context provideContext() {
        return mActivity;
    }

    @Provides
    AppCompatActivity provideActivity() {
        return mActivity;
    }

    @Provides
    CompositeDisposable provideCompositeDisposable() {
        return new CompositeDisposable();
    }

    @Provides
    SchedulerProvider provideSchedulerProvider() {
        return new AppSchedulerProvider();
    }

    @Provides
    @PerActivity
    SplashMvpPresenter<SplashMvpView> provideSplashPresenter(
            SplashPresenter<SplashMvpView> presenter) {
        return presenter;
    }

    @Provides
    @PerActivity
    HomeMvpPresenter<HomeMvpView> provideHomePresenter(
            HomePresenter<HomeMvpView> presenter) {
        return presenter;
    }

    @Provides
    @PerActivity
    BelanjaMvpPresenter<BelanjaMvpView> provideBelanjaPresenter(
            BelanjaPresenter<BelanjaMvpView> presenter) {
        return presenter;
    }

    @Provides
    @PerActivity
    PembayaranMvpPresenter<PembayaranMvpView> providePembayaranPresenter(
            PembayaranPresenter<PembayaranMvpView> presenter) {
        return presenter;
    }

    @Provides
    @PerActivity
    AngsuranMvpPresenter<AngsuranMvpView> provideAngsuranPresenter(
            AngsuranPresenter<AngsuranMvpView> presenter) {
        return presenter;
    }

    @Provides
    @PerActivity
    TagihanMvpPresenter<TagihanMvpView> provideTagihanPresenter(
            TagihanPresenter<TagihanMvpView> presenter) {
        return presenter;
    }

    @Provides
    @PerActivity
    PinMvpPresenter<PinMvpView> providePinPresenter(
            PinPresenter<PinMvpView> presenter) {
        return presenter;
    }

    @Provides
    @PerActivity
    SuksesMvpPresenter<SuksesMvpView> provideSuksesPresenter(
            SuksesPresenter<SuksesMvpView> presenter) {
        return presenter;
    }

    @Provides
    @PerActivity
    MetodeMvpPresenter<MetodeMvpView> provideMetodePresenter(
            MetodePresenter<MetodeMvpView> presenter) {
        return presenter;
    }

    @Provides
    @PerActivity
    KreditMvpPresenter<KreditMvpView> provideKreditPresenter(
            KreditPresenter<KreditMvpView> presenter) {
        return presenter;
    }

    @Provides
    @PerActivity
    RincianMvpPresenter<RincianMvpView> provideRincianPresenter(
            RincianPresenter<RincianMvpView> presenter) {
        return presenter;
    }

    @Provides
    @PerActivity
    PengajuanMvpPresenter<PengajuanMvpView> providePengajuanPresenter(
            PengajuanPresenter<PengajuanMvpView> presenter) {
        return presenter;
    }

    @Provides
    AboutMvpPresenter<AboutMvpView> provideAboutPresenter(
            AboutPresenter<AboutMvpView> presenter) {
        return presenter;
    }

    @Provides
    @PerActivity
    LoginMvpPresenter<LoginMvpView> provideLoginPresenter(
            LoginPresenter<LoginMvpView> presenter) {
        return presenter;
    }

    @Provides
    @PerActivity
    MainMvpPresenter<MainMvpView> provideMainPresenter(
            MainPresenter<MainMvpView> presenter) {
        return presenter;
    }

    @Provides
    RatingDialogMvpPresenter<RatingDialogMvpView> provideRateUsPresenter(
            RatingDialogPresenter<RatingDialogMvpView> presenter) {
        return presenter;
    }

    @Provides
    FeedMvpPresenter<FeedMvpView> provideFeedPresenter(
            FeedPresenter<FeedMvpView> presenter) {
        return presenter;
    }

    @Provides
    OpenSourceMvpPresenter<OpenSourceMvpView> provideOpenSourcePresenter(
            OpenSourcePresenter<OpenSourceMvpView> presenter) {
        return presenter;
    }

    @Provides
    BlogMvpPresenter<BlogMvpView> provideBlogMvpPresenter(
            BlogPresenter<BlogMvpView> presenter) {
        return presenter;
    }

    @Provides
    FeedPagerAdapter provideFeedPagerAdapter(AppCompatActivity activity) {
        return new FeedPagerAdapter(activity.getSupportFragmentManager());
    }

    @Provides
    OpenSourceAdapter provideOpenSourceAdapter() {
        return new OpenSourceAdapter(new ArrayList<OpenSourceResponse.Repo>());
    }

    @Provides
    BlogAdapter provideBlogAdapter() {
        return new BlogAdapter(new ArrayList<BlogResponse.Blog>());
    }

    @Provides
    LinearLayoutManager provideLinearLayoutManager(AppCompatActivity activity) {
        return new LinearLayoutManager(activity);
    }

    @Provides
    @PerActivity
    VerifikasiKreditMvpPresenter<VerifikasiKreditMvpView> provideVerifikasiKreditPresenter(
            VerifikasiKreditPresenter<VerifikasiKreditMvpView> presenter) {
        return presenter;
    }
}
