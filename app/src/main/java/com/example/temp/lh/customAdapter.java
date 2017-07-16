package com.example.temp.lh;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by temp on 7/15/2017.
 */

public class customAdapter extends ArrayAdapter<c_dataType> {


    @Override
    public View getView(int position, View convertView,ViewGroup parent) {

        View listItemView= convertView;
        if(listItemView == null)
        {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_layout, parent, false);
        }

        c_dataType temp = getItem(position);

        TextView hText = (TextView) listItemView.findViewById(R.id.hindi_text_view);
        hText.setText(temp.getHindiWord());


        TextView eText = (TextView) listItemView.findViewById(R.id.english_text_view);
        eText.setText(temp.getEnglishWord());

      return listItemView;
    }

    public customAdapter(Activity context, ArrayList<c_dataType> words)
    {
        super(context, 0, words);
    }
}
