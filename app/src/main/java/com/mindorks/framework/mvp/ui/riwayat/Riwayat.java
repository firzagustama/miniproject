package com.mindorks.framework.mvp.ui.riwayat;

import android.os.Bundle;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.mindorks.framework.mvp.R;
import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

public class Riwayat extends AppCompatActivity {
    CarouselView carouselView;
    int[] sampleImages = {R.drawable.promo1, R.drawable.promo2};
    FragmentPagerAdapter adapterViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.riwayat);

        carouselView = findViewById(R.id.carouselView);
        carouselView.setPageCount(sampleImages.length);
        carouselView.setImageListener(imageListener);

        ViewPager vpPager = (ViewPager) findViewById(R.id.view_pager);
        adapterViewPager = new TabRiwayatAdapter(getSupportFragmentManager());
        vpPager.setAdapter(adapterViewPager);
    }

        ImageListener imageListener = new ImageListener() {
            @Override
            public void setImageForPosition(int position, ImageView imageView) {
                imageView.setImageResource(sampleImages[position]);
            }
        };

}
