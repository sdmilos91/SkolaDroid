package com.kodzoteam.skoladroidpma;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.kodzoteam.skoladroidpma.adapters.SchoolAdapter;
import com.kodzoteam.skoladroidpma.models.School;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView mScloohList;
    private List<School> mSchools;
    private SchoolAdapter mSchoolAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//prvi komit
        mSchools = new ArrayList<School>();
        mSchools.add(new School("Branislav Nusic", "Smederevo"));
        mSchools.add(new School("Ivo Andric", "Beograd"));
        mSchools.add(new School("Jovan Jovanovic Zmaj", "Novi Sad"));
        mSchools.add(new School("Vuk Karadzic", "Kragujevac"));
        mSchools.add(new School("Branislav Nusic", "Smederevo"));
        mSchools.add(new School("Ivo Andric", "Beograd"));
        mSchools.add(new School("Jovan Jovanovic Zmaj", "Novi Sad"));
        mSchools.add(new School("Vuk Karadzic", "Kragujevac"));
        mSchools.add(new School("Branislav Nusic", "Smederevo"));
        mSchools.add(new School("Ivo Andric", "Beograd"));
        mSchools.add(new School("Jovan Jovanovic Zmaj", "Novi Sad"));
        mSchools.add(new School("Vuk Karadzic", "Kragujevac"));

        mScloohList = (ListView)findViewById(R.id.schoolListId);
        mSchoolAdapter = new SchoolAdapter(this, R.id.schoolListId, mSchools);
        mScloohList.setAdapter(mSchoolAdapter);
        mScloohList.setSelector(R.drawable.list_view_selector);

    }
}
