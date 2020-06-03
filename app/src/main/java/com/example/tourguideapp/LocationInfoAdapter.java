package com.example.tourguideapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class LocationInfoAdapter extends ArrayAdapter<LocationInfo> {
    public LocationInfoAdapter(@NonNull Context context,  @NonNull ArrayList<LocationInfo> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null)
        {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
            LocationInfo locationInfo = getItem(position);

            TextView locationSite = listItemView.findViewById(R.id.location_site);
            TextView deluxRestaurent = listItemView.findViewById(R.id.delux_restaurent);
            TextView budgetRestaurent = listItemView.findViewById(R.id.budget_restaurent);
            TextView reachByLandGuide = listItemView.findViewById(R.id.reach_by_land_guide);
            TextView reachByAirGuide = listItemView.findViewById(R.id.reach_by_air_guide);
            TextView historicalPlace = listItemView.findViewById(R.id.historical_place);
            TextView mustVisitSite = listItemView.findViewById(R.id.must_visit_site);


            assert locationInfo != null;
            locationSite.setText(locationInfo.getmLocationSite());
            deluxRestaurent.setText(locationInfo.getmDeluxRestaurent());
            budgetRestaurent.setText(locationInfo.getmBudgetRestaurent());
            reachByLandGuide.setText(locationInfo.getmReachByLandGuide());
            reachByAirGuide.setText(locationInfo.getmReachByAirGuide());
            historicalPlace.setText(locationInfo.getmHistoricalSites());
            mustVisitSite.setText(locationInfo.getmMustVisitSites());

        }

        return listItemView;
    }


}
