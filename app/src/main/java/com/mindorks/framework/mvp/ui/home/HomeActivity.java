package com.mindorks.framework.mvp.ui.home;

import android.os.Bundle;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

import com.anychart.AnyChart;
import com.anychart.AnyChartView;
import com.anychart.chart.common.dataentry.DataEntry;
import com.anychart.chart.common.dataentry.ValueDataEntry;
import com.anychart.charts.Cartesian;
import com.mindorks.framework.mvp.ui.base.BaseActivity;

import android.content.Intent;
import android.content.Context;

import com.mindorks.framework.mvp.R;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends BaseActivity implements HomeMvpView {

    @Inject
    HomePresenter<HomeMvpView> mPresenter;

//    @BindView(R.id.any_chart)
//    AnyChartView anyChartView;

    public static Intent getStartIntent(Context context) {
        Intent intent = new Intent(context, HomeActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        getActivityComponent().inject(this);
        setUnBinder(ButterKnife.bind(this));
        mPresenter.onAttach(HomeActivity.this);

        setUp();
    }

    @Override
    protected void onDestroy() {
        mPresenter.onDetach();
        super.onDestroy();
    }

    @Override
    protected void setUp() {
//        Cartesian cartesian = AnyChart.line();
//        cartesian.background(false);
//
//        List<DataEntry> data = new ArrayList<>();
//        data.add(new ValueDataEntry("Januari", 7020));
//        data.add(new ValueDataEntry("Februari", 7030));
//        data.add(new ValueDataEntry("Maret", 7160));
//        data.add(new ValueDataEntry("April", 7200));
//
//        cartesian.data(data);
//
//        anyChartView.setChart(cartesian);
    }
}