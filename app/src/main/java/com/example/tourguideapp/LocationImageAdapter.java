package com.example.tourguideapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class LocationImageAdapter extends ArrayAdapter<LocationInfo> {
    public LocationImageAdapter(@NonNull Context context, @NonNull ArrayList<LocationInfo> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView= convertView;
        if(listItemView == null)
        {
            listItemView  = LayoutInflater.from(getContext()).inflate(R.layout.image_item,parent,false);
            LocationInfo locationInfo = getItem(position);

            ImageView image = (ImageView)listItemView.findViewById(R.id.list_image);
            TextView text = (TextView)listItemView.findViewById(R.id.text);

            assert locationInfo != null;
            text.setText(locationInfo.getmLocationSite());
            image.setImageResource(locationInfo.getmImageResourceId());



        }



        return listItemView;
    }


}
