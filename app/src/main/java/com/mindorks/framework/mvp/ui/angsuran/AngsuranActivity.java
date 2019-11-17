package com.mindorks.framework.mvp.ui.angsuran;

import android.database.DataSetObserver;
import android.os.Bundle;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

import com.mindorks.framework.mvp.data.network.model.Angsuran;
import com.mindorks.framework.mvp.ui.base.BaseActivity;

import android.content.Intent;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.mindorks.framework.mvp.R;

import java.util.ArrayList;
import java.util.List;

public class AngsuranActivity extends BaseActivity implements AngsuranMvpView {

    @Inject
    AngsuranPresenter<AngsuranMvpView> mPresenter;

    @BindView(R.id.list_item)
    ListView listView;

    public static Intent getStartIntent(Context context) {
        Intent intent = new Intent(context, AngsuranActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_angsuran);

        getActivityComponent().inject(this);
        setUnBinder(ButterKnife.bind(this));
        mPresenter.onAttach(AngsuranActivity.this);

        setUp();
    }

    @Override
    protected void onDestroy() {
        mPresenter.onDetach();
        super.onDestroy();
    }

    @Override
    protected void setUp() {
        List<Angsuran> items = new ArrayList<>();
        items.add(new Angsuran(R.drawable.iphone7, "TRX123450001", "Iphone 8"));
        items.add(new Angsuran(R.drawable.iphone_png, "TRX123450002", "Iphone 10"));

        listView.setAdapter(new AngsuranAdapter(this, items));
    }
}