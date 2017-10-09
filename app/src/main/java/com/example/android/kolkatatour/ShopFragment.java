package com.example.android.kolkatatour;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class ShopFragment extends Fragment {

    ArrayList<Attraction> attractions = new ArrayList<>();
    public ShopFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        attractions.clear();
        View rootView = inflater.inflate(R.layout.kolkata_list, container, false);

        attractions.add( new Attraction("Mani Square", "164/1 Maniktala Main Road, Beside Apollo Gleaneagles Hospital, EM Bypass",  R.drawable.mani_square));
        attractions.add( new Attraction("City Center I", "C3, DC Block, Sector 1, Salt Lake City", R.drawable.city_center_one));
        attractions.add( new Attraction("City Center II", "Action Area II, Newtown",  R.drawable.city_center_two));
        attractions.add( new Attraction("South City Mall", "375, Prince Anwar Shah Rd South City Complex,",  R.drawable.south_city_mall));
        attractions.add( new Attraction("Treasure Island", "Madge Lane,Lindsay St,Hartford Lane",  R.drawable.treasure_island));
        attractions.add( new Attraction("Baguihati", "Kazi Nazrul Islam Ave, Jyangra",  R.drawable.baguiati));


        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions, R.color.ShopCategory);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }


}
