package com.example.tourguideapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager2 viewPager2 = (ViewPager2)findViewById(R.id.viewPager);
        viewPager2.setAdapter(new ViewPageAdapter(this));


        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        TabLayoutMediator tabLayoutMediator =  new TabLayoutMediator(tabLayout, viewPager2,
                new TabLayoutMediator.TabConfigurationStrategy() {
                    @Override
                    public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                        switch (position){
                            case 0:
                                tab.setText("Assam");
                                break;
                            case 1:
                                tab.setText("Meghalaya");
                                break;
                            case 2:
                                tab.setText("Nagaland");
                                break;
                            case 3:
                                tab.setText("Gallery");
                                break;
                        }

                    }
                });
                tabLayoutMediator.attach();




    }
}
