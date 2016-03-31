package com.kodzoteam.skoladroidpma.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.kodzoteam.skoladroidpma.R;
import com.kodzoteam.skoladroidpma.models.School;

import java.util.List;
import java.util.zip.Inflater;


public class SchoolAdapter extends ArrayAdapter<School> {
    private Context mContext;
    private int mResource;
    private List<School> mSchools;

    public SchoolAdapter(Context context, int resource, List<School> schools) {
        super(context, resource);
        mContext = context;
        mResource = resource;

        mSchools = schools;
    }

    @Override
    public int getCount() {
        return mSchools.size();
    }

    @Override
    public School getItem(int position) {
        return mSchools.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = convertView;
        if(view == null){
            view = LayoutInflater.from(mContext).inflate(R.layout.school_list, parent, false);
        }

        ((TextView)view.findViewById(R.id.schoolListName)).setText(mSchools.get(position).getName());
        ((TextView)view.findViewById(R.id.schoolListCity)).setText(mSchools.get(position).getCity());


        return  view;

    }
}
