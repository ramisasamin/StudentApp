package com.example.studentapp;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.anychart.AnyChart;
import com.anychart.AnyChartView;
import com.anychart.chart.common.dataentry.DataEntry;
import com.anychart.chart.common.dataentry.ValueDataEntry;
import com.anychart.charts.Pie;

import java.util.ArrayList;
import java.util.List;

public class Result extends AppCompatActivity
{

    AnyChartView anyChartView;
    String[] terms = {"First Term", "Second Term", "Third Term"};
    int[] marks = {90, 80, 95};

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);

        anyChartView = findViewById(R.id.any_chart_view);
        setupPieChart();
    }

    public void setupPieChart()
    {
        Pie pie = AnyChart.pie();
        List<DataEntry> dataEntries = new ArrayList<>();

        for(int i=0; i < terms.length; i++)
        {
            dataEntries.add(new ValueDataEntry(terms[i], marks[i]));
        }

        pie.data(dataEntries);
//        pie.title("terms");
        anyChartView.setChart(pie);
    }
}
