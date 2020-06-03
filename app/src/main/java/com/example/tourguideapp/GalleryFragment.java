package com.example.tourguideapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Objects;


/**
 * A simple {@link Fragment} subclass.
 */
public class GalleryFragment extends Fragment {

    public GalleryFragment() {
        // Required empty public constructor
    }

    private final ArrayList<LocationInfo> locationInfos = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_gallery, container, false);

        locationInfos.add(new LocationInfo(getString(R.string.assam),R.drawable.image_assam));
        locationInfos.add(new LocationInfo(getString(R.string.meghalaya),R.drawable.image_maghalaya));
        locationInfos.add(new LocationInfo(getString(R.string.nagaland),R.drawable.image_nagaland));


        LocationInfoAdapter adapter = new LocationInfoAdapter(Objects.requireNonNull(getContext()),locationInfos);
        ListView listView = (ListView)view.findViewById(R.id.list);
        listView.setAdapter(adapter);



        return view;
    }
}
