package com.example.android.kolkatatour;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class FoodFragment extends Fragment {


    ArrayList<Attraction> attractions = new ArrayList<>();
    public FoodFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.kolkata_list, container, false);

        super.onCreate(savedInstanceState);
        attractions.clear();

        attractions.add( new Attraction("Space Circle", "VIP Road, Raghunathpur", R.drawable.space_circle_club));
        attractions.add( new Attraction("Haldiram", "Second Floor, 24, Ballygunge Park, Ballygunge, Kolkata",  R.drawable.haldiram));
        attractions.add( new Attraction("Maheke Punjab", "68, VIP Rd", R.drawable.maheke_punjab));
        attractions.add( new Attraction("Barbeque Nation", "#24, 1st Floor, Center Building Park, Park St",  R.drawable.bbq_nation));
        attractions.add( new Attraction("Kookie Jar", "Ground Floor, City Centre 1, Sector 1, Salt Lake",  R.drawable.kookie_jar));
        attractions.add( new Attraction("Gangurams", "123/2, Acharya Prafulla Chandra Road ",  R.drawable.ganguram_sweets));
        attractions.add( new Attraction("Azad Hind", "CF- 162, Salt Lake Sec - 1, Behind Bikash Bhavan",  R.drawable.azad_hind));

        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions, R.color.FoodCategory);

        ListView listView = (ListView) rootView.findViewById(R.id.list);





        listView.setAdapter(adapter);

        return rootView;
    }

    @Override
    public void onStop() {
        super.onStop();

    }

    /**
     * Clean up the media player by releasing its resources.
     */


}
