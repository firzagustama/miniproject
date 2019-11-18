package com.mindorks.framework.mvp.ui.metode;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.mindorks.framework.mvp.R;
import com.mindorks.framework.mvp.data.network.model.Metode;
import com.mindorks.framework.mvp.ui.pin.PinActivity;

import java.util.ArrayList;
import java.util.List;

public class MetodeAdapter extends BaseAdapter implements View.OnClickListener {

    Context context;
    List<Metode> items;

    public MetodeAdapter(Context context, List<Metode> items) {
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
        view = LayoutInflater.from(context).inflate(R.layout.row_metode, viewGroup, false);
        ImageView logo = view.findViewById(R.id.logo);
        TextView metode = view.findViewById(R.id.metode);

        Metode item = items.get(i);
        logo.setImageResource(item.getGambar());
        metode.setText(item.getNama());

        view.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View view) {
        Intent intent = PinActivity.getStartIntent(context);
        context.startActivity(intent);
    }
}
