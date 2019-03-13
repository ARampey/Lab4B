package com.example.lab4b;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;


public class tipCalculatorFragment extends Fragment implements View.OnClickListener {

    public tipCalculatorFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View newView = inflater.inflate(R.layout.fragment_tip_calculator, container, false);
        Button b = (Button) newView.findViewById(R.id.calculateButton);
        b.setOnClickListener(this);
        return newView;
    }


    public void onClick (View v){
        TextView b = getView().findViewById(R.id.totalBillView);
        TextView p = getView().findViewById(R.id.tipPercentageView);
        TextView n = getView().findViewById(R.id.numberOfPeopleView);



        double totalAmount = Double.parseDouble(b.getText().toString());
        double tipPercentage = Double.parseDouble(p.getText().toString());
        int people = Integer.parseInt(n.getText().toString());

        double totalPerPerson = (totalAmount + (totalAmount * tipPercentage / 100) / people);

        ((TextView)getView().findViewById(R.id.totalPerPersonView)).setText("Amount per person: $" + String.format("%.2f", totalPerPerson));
    }
}

