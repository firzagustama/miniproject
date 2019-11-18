package com.mindorks.framework.mvp.ui.tagihan;

import android.content.Context;
import android.graphics.Color;
import android.nfc.Tag;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.mindorks.framework.mvp.R;
import com.mindorks.framework.mvp.data.network.model.Tagihan;

import java.util.List;

public class TagihanAdapter extends BaseAdapter {

    Context context;
    List<Tagihan> items;

    TagihanAdapter(Context context, List<Tagihan> items) {
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
        view = LayoutInflater.from(context).inflate(R.layout.row_tagihan, viewGroup, false);
        TextView bulan = view.findViewById(R.id.bulan);
        TextView tanggal = view.findViewById(R.id.tanggal);
        TextView amount = view.findViewById(R.id.amount);
        ImageView checked = view.findViewById(R.id.check);

        Tagihan item = items.get(i);
        bulan.setText("Bulan " + item.getBulan());
        tanggal.setText(item.getTanggal());
        amount.setText("Rp. " + item.getAmount());
        if (item.getPaid()) checked.setVisibility(View.VISIBLE);
        if (item.getPayNow()) {
            view.setBackgroundResource(R.color.colorPrimary);
            bulan.setTextColor(Color.WHITE);
            tanggal.setTextColor(Color.WHITE);
            amount.setTextColor(Color.WHITE);
            view.setSelected(true);
        }

        return view;
    }
}
