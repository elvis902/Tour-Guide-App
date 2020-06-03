package com.example.tourguideapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Objects;


/**
 * A simple {@link Fragment} subclass.
 */
public class AssamFragment extends Fragment {

    public AssamFragment() {
        // Required empty public constructor
    }

    private final ArrayList<LocationInfo> locationInfos = new ArrayList<>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_assam, container, false);


        locationInfos.add(new LocationInfo(getString(R.string.assam_site1_locationSite),getString(R.string.assam_site1_deluxrRestaurent),
                getString(R.string.assam_site1_budgetRestaurent),getString(R.string.assam_site1_reachByLand),getString(R.string.assam_site1_reachByAir),
                getString(R.string.assam_site1_historicalPlace),getString(R.string.assam_site1_mustVisitSite)));

        locationInfos.add(new LocationInfo(getString(R.string.assam_site2_locationSite),getString(R.string.assam_site2_deluxrRestaurent),
                getString(R.string.assam_site2_budgetRestaurent),getString(R.string.assam_site2_reachByLand),getString(R.string.assam_site2_reachByAir),
                getString(R.string.assam_site2_historicalPlace),getString(R.string.assam_site2_mustVisitSite)));

        locationInfos.add(new LocationInfo(getString(R.string.assam_site3_locationSite),getString(R.string.assam_site3_deluxrRestaurent),
                getString(R.string.assam_site3_budgetRestaurent),getString(R.string.assam_site3_reachByLand),getString(R.string.assam_site3_reachByAir),
                getString(R.string.assam_site3_historicalPlace),getString(R.string.assam_site3_mustVisitSite)));




        LocationInfoAdapter adapter = new LocationInfoAdapter(Objects.requireNonNull(getContext()),locationInfos);
        ListView listView = (ListView)view.findViewById(R.id.list);
        listView.setAdapter(adapter);




        return view;
    }
}
