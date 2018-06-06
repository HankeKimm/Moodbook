package com.socialtracking.ubiss;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeActivityFragment2 extends Fragment {


    public HomeActivityFragment2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootview = inflater.inflate(R.layout.fragment_home_activity_fragment2, container, false);
        BarChart barChart = rootview.findViewById(R.id.purposeChart);

        List<BarEntry> passive = new ArrayList<>();
        passive.add(new BarEntry(0f, 10));

        List<BarEntry> active = new ArrayList<>();
        active.add(new BarEntry(1f, 6));

        BarDataSet dataset = new BarDataSet(passive, "Passive usage");
        BarDataSet dataset2 = new BarDataSet(active, "Active usage");

        dataset.setColors(ColorTemplate.COLORFUL_COLORS);
//        dataset2.setColors(ColorTemplate.JOYFUL_COLORS);


        BarData data = new BarData(dataset, dataset2);
        barChart.setData(data);

        return  rootview;
    }

}
