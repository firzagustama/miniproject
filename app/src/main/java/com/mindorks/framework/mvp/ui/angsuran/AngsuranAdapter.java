package com.mindorks.framework.mvp.ui.angsuran;

import android.content.Context;
import android.content.Intent;
import android.support.v7.recyclerview.extensions.ListAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.mindorks.framework.mvp.R;
import com.mindorks.framework.mvp.data.network.model.Angsuran;
import com.mindorks.framework.mvp.ui.tagihan.TagihanActivity;

import java.util.ArrayList;
import java.util.List;

public class AngsuranAdapter extends BaseAdapter implements View.OnClickListener {

    Context context;
    List<Angsuran> items = new ArrayList<>();

    public AngsuranAdapter(Context context, List<Angsuran> items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int i) {
        return items.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = LayoutInflater.from(context).inflate(R.layout.row_angsuran, viewGroup, false);
        ImageView imageView = view.findViewById(R.id.image);
        TextView id = view.findViewById(R.id.id);
        TextView name = view.findViewById(R.id.item);

        Angsuran item = items.get(i);
        imageView.setImageResource(item.getUrlPhoto());
        id.setText(item.getId());
        name.setText(item.getItem());

        view.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View view) {
        Intent intent = TagihanActivity.getStartIntent(context);
        context.startActivity(intent);
    }
}
