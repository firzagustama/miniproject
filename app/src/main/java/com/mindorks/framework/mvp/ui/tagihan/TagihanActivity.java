package com.mindorks.framework.mvp.ui.tagihan;

import android.nfc.Tag;
import android.os.Bundle;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import com.mindorks.framework.mvp.data.network.model.Tagihan;
import com.mindorks.framework.mvp.ui.base.BaseActivity;

import android.content.Intent;
import android.content.Context;
import android.widget.ListView;

import com.mindorks.framework.mvp.R;
import com.mindorks.framework.mvp.ui.metode.MetodeActivity;
import com.mindorks.framework.mvp.ui.pin.PinActivity;

import java.util.ArrayList;
import java.util.List;

public class TagihanActivity extends BaseActivity implements TagihanMvpView {

    @Inject
    TagihanPresenter<TagihanMvpView> mPresenter;

    @BindView(R.id.list_item)
    ListView listView;

    public static Intent getStartIntent(Context context) {
        Intent intent = new Intent(context, TagihanActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tagihan);

        getActivityComponent().inject(this);
        setUnBinder(ButterKnife.bind(this));
        mPresenter.onAttach(TagihanActivity.this);

        setUp();
    }

    @Override
    protected void onDestroy() {
        mPresenter.onDetach();
        super.onDestroy();
    }

    @Override
    protected void setUp() {
        List<Tagihan> items = new ArrayList<>();
        items.add(new Tagihan(1, "01/01/2020", 750000, true, false));
        items.add(new Tagihan(2, "01/02/2020", 750000, true, false));
        items.add(new Tagihan(3, "01/03/2020", 750000, false, true));
        items.add(new Tagihan(4, "01/04/2020", 750000, false, false));
        items.add(new Tagihan(5, "01/05/2020", 750000, false, false));
        items.add(new Tagihan(6, "01/06/2020", 750000, false, false));
        items.add(new Tagihan(7, "01/07/2020", 750000, false, false));
        items.add(new Tagihan(8, "01/08/2020", 750000, false, false));
        items.add(new Tagihan(9, "01/09/2020", 750000, false, false));
        items.add(new Tagihan(10, "01/10/2020", 750000, false, false));
        items.add(new Tagihan(11, "01/11/2020", 750000, false, false));
        items.add(new Tagihan(12, "01/12/2020", 750000, false, false));

        listView.setAdapter(new TagihanAdapter(this, items));
    }

    @OnClick(R.id.btnBayar)
    protected void openMetodeActivity() {
        Intent intent = MetodeActivity.getStartIntent(this);
        startActivity(intent);
    }
}