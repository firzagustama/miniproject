package com.mindorks.framework.mvp.ui.metode;

import android.os.Bundle;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

import com.mindorks.framework.mvp.data.network.model.Metode;
import com.mindorks.framework.mvp.ui.base.BaseActivity;

import android.content.Intent;
import android.content.Context;
import android.widget.ListView;

import com.mindorks.framework.mvp.R;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class MetodeActivity extends BaseActivity implements MetodeMvpView {

    @Inject
    MetodePresenter<MetodeMvpView> mPresenter;

    @BindView(R.id.list_item)
    ListView listView;

    public static Intent getStartIntent(Context context) {
        Intent intent = new Intent(context, MetodeActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metode);

        getActivityComponent().inject(this);
        setUnBinder(ButterKnife.bind(this));
        mPresenter.onAttach(MetodeActivity.this);

        setUp();
    }

    @Override
    protected void onDestroy() {
        mPresenter.onDetach();
        super.onDestroy();
    }

    @Override
    protected void setUp() {
        List<Metode> items = new ArrayList<>();
        items.add(new Metode(R.drawable.bca, "BCA"));
        items.add(new Metode(R.drawable.bni, "BNI"));
        items.add(new Metode(R.drawable.mandiri, "Mandiri"));
        items.add(new Metode(R.drawable.ovo, "OVO"));
        items.add(new Metode(R.drawable.linkaja, "Linkaja"));

        listView.setAdapter(new MetodeAdapter(this, items));
    }
}