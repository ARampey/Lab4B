package com.example.lab4b;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;


public class temperatureConverterFragment extends Fragment implements View.OnClickListener  {


    public temperatureConverterFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View newView = inflater.inflate(R.layout.fragment_temperature_converter, container, false);
        Button b = (Button) newView.findViewById(R.id.convertButton);
        b.setOnClickListener(this);
        return newView;
    }


    public void onClick (View v) {
        String f = ((EditText) getView().findViewById(R.id.fahrenheitText)).getText().toString();
        String c = ((EditText) getView().findViewById(R.id.celsiusText)).getText().toString();


        double fahrenheit;
        double celsius;

        //
        if (f.isEmpty()) {

            if (!c.isEmpty()) {

                celsius = Double.valueOf(c);
                fahrenheit = ((celsius * 9/5) + 32);
                ((EditText) getView().findViewById(R.id.fahrenheitText)).setText(Double.toString(fahrenheit));

            }
        }

        else {
            fahrenheit = Double.valueOf(f);
            celsius = ((fahrenheit - 32) * 5/9);
            ((EditText) getView().findViewById(R.id.celsiusText)).setText(Double.toString(celsius));
        }

    }

}


