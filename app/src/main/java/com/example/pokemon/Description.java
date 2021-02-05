package com.example.pokemon;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Description extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fraginfo, container, false);
        TextView textView1 = (TextView) view.findViewById(R.id.taille);
        TextView textView2 = (TextView) view.findViewById(R.id.poids);
        TextView textView3 = (TextView) view.findViewById(R.id.types);
        TextView textView4 = (TextView) view.findViewById(R.id.name);
        TextView textView5 = (TextView) view.findViewById(R.id.description);
        Bundle bundle = this.getArguments();

        if (bundle != null) {
            String he = bundle.getString("height");
            String we = bundle.getString("weight");
            String type = bundle.getString("types");
            String names = bundle.getString("name");
            String desc = bundle.getString("description");
            textView1.append(he);
            textView2.append(we);
            textView3.append(type);
            textView4.setText(names);
            textView5.setText(desc);
        }
        return view;
    }

}
