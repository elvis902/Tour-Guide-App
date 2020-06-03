package com.example.tourguideapp;

public class LocationInfo {
    private String mLocationSite;
    private String mDeluxRestaurent;
    private String mBudgetRestaurent;
    private String mReachByLandGuide;
    private String mReachByAirGuide;
    private String mHistoricalSites;
    private String mMustVisitSites;

    private int mImageResourceId = -1;



    public LocationInfo(String locationSite, String deluxRestaurent, String budgetRestaurent, String reachByLandGuide,
                        String reachByAirGuide, String historicalSites, String mustVisitSites)
   {
       this.mLocationSite = locationSite;
       this.mDeluxRestaurent = deluxRestaurent;
       this.mBudgetRestaurent = budgetRestaurent;
       this.mReachByLandGuide = reachByLandGuide;
       this.mReachByAirGuide = reachByAirGuide;
       this.mHistoricalSites = historicalSites;
       this.mMustVisitSites = mustVisitSites;
   }

   public LocationInfo(String locationSite, int imageResourceId){
        this.mLocationSite = locationSite;
        this.mImageResourceId = imageResourceId;
   }


    public String getmReachByAirGuide() {
        return mReachByAirGuide;
    }

    public String getmHistoricalSites() {
        return mHistoricalSites;
    }

    public String getmMustVisitSites() {
        return mMustVisitSites;
    }

    public String getmReachByLandGuide() {
        return mReachByLandGuide;
    }

    public String getmDeluxRestaurent() {
        return mDeluxRestaurent;
    }

    public String getmBudgetRestaurent() {
        return mBudgetRestaurent;
    }

    public String getmLocationSite() {
        return mLocationSite;
    }

    public int getmImageResourceId(){ return mImageResourceId; }






}
