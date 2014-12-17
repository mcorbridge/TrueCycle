package com.mcorbridge.truecycle.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.mcorbridge.truecycle.R;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<String> {
    private final Context context;
    private final ArrayList values;

    public CustomAdapter(Context context, ArrayList values) {
        super(context, R.layout.activity_watt_output, values);
        this.context = context;
        this.values = values;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.item_row, parent, false);
        TextView textView = (TextView) rowView.findViewById(R.id.wattLine);
        textView.setText(values.get(position).toString());

        return rowView;
    }
}

