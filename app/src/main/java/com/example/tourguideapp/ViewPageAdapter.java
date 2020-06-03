package com.example.tourguideapp;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewPageAdapter extends FragmentStateAdapter {


    public ViewPageAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }


    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new AssamFragment();
            case 1:
                return new MeghalayaFragment();
            case 2:
                return new NagalandFragment();
            default:
                return new GalleryFragment();

        }
    }

    @Override
    public int getItemCount() {
        return 4;
    }


}
