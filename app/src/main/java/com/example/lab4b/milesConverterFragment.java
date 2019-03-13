package com.example.lab4b;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.*;



public class milesConverterFragment extends Fragment implements View.OnClickListener {


    public milesConverterFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View newView = inflater.inflate(R.layout.fragment_miles_converter, container, false);


        Button b = (Button) newView.findViewById(R.id.convertMilesButton);
        b.setOnClickListener(this);
        return newView;
    }

    // Fragment does not have built-in findViewById() method -- use view.findViewById()

    public void onClick (View v) {

        String m = ((EditText) getView().findViewById(R.id.milesText)).getText().toString();
        String k = ((EditText) getView().findViewById(R.id.kmText)).getText().toString();

        double mi;
        double km;


        //default is miles to km

        if (m.isEmpty()) {

            if (!k.isEmpty()) {

                km = Double.parseDouble(k);
                mi = (0.621371 * km);

                ((EditText) getView().findViewById(R.id.milesText)).setText(Double.toString(mi));


            }
        }

        else {

            mi = Double.parseDouble(m);
            km = (1.609344 * mi);

            ((EditText) getView().findViewById(R.id.kmText)).setText(Double.toString(km));

        }


    }
}




