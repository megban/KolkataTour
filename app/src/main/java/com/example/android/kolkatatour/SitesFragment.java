package com.example.android.kolkatatour;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class SitesFragment extends Fragment {

    ArrayList<Attraction> attractions = new ArrayList<>();
    public SitesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        attractions.clear();
        View rootView = inflater.inflate(R.layout.kolkata_list, container, false);
        attractions.add( new Attraction("Victoria Memorial", "Maidan, Victoria Memorial Hall, 1, Queens Way",  R.drawable.victoria_memorial));
        attractions.add( new Attraction("Howrah Bridge", " Howrah, West Bengal 700001", R.drawable.howrah_bridge));
        attractions.add( new Attraction("Dakshineswar Kali Temple", "May Dibas Pally, Dakshineswar",  R.drawable.dakshineshwar_kali_temple));
        attractions.add( new Attraction("Eden Gardens", "Maidan, BBD Bagh", R.drawable.eden_garden));
        attractions.add( new Attraction("Science City", "Science City, J.B.S Haldane Avenue",  R.drawable.science_city));
        attractions.add( new Attraction("Nicco Park", "Jheel Meel, Sector IV, Salt Lake City",  R.drawable.nicco_park));
        attractions.add( new Attraction("Eco Park", "Major Arterial Road(South-East), Action Area II, New Town",  R.drawable.eco_park));
        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions, R.color.SitesCategory);


        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }


}
