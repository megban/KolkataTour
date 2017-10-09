package com.example.android.kolkatatour;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by meghnabanerjee on 5/13/17.
 */

public class AttractionAdapter extends ArrayAdapter<Attraction>
{
    int colorResourceId;
    public AttractionAdapter(Activity context, ArrayList<Attraction> attractions, int colorResourceId) {
        super(context, 0, attractions);
        this.colorResourceId = colorResourceId;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Attraction currentAttraction = getItem(position);

       listItemView.setBackgroundResource(colorResourceId);

        TextView name = (TextView) listItemView.findViewById(R.id.name);
        name.setText(currentAttraction.getName());

        TextView address = (TextView) listItemView.findViewById(R.id.address);
        address.setText(currentAttraction.getAddress());


        ImageView image = (ImageView) listItemView.findViewById(R.id.special_image);
        image.setImageResource(currentAttraction.getImageResourceId());

        return listItemView;
    }


}
