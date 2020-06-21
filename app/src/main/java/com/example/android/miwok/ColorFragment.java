package com.example.android.miwok;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class ColorFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container, Bundle savedInstanceState) {
        LayoutInflater layoutInflater = LayoutInflater.from(getContext());
        View convertView = layoutInflater.inflate(R.layout.activity_common, container, false);

        ArrayList<WordClass> colorObj = new ArrayList<WordClass>();

        colorObj.add(new WordClass("red","weṭeṭṭi", R.drawable.color_red, R.raw.color_red));
        colorObj.add(new WordClass("green",  "chokokki", R.drawable.color_green, R.raw.color_green));
        colorObj.add(new WordClass("brown","ṭakaakki", R.drawable.color_brown, R.raw.color_brown));
        colorObj.add(new WordClass("gray","ṭopoppi", R.drawable.color_gray, R.raw.color_gray));
        colorObj.add(new WordClass("white","kelelli", R.drawable.color_white, R.raw.color_white));
        colorObj.add(new WordClass("black","kululli", R.drawable.color_black, R.raw.color_black));
        colorObj.add(new WordClass("mustard yellow","chiwiiṭә", R.drawable.color_mustard_yellow, R.raw.color_mustard_yellow));
        colorObj.add(new WordClass("dusty yellow","ṭopiisә", R.drawable.color_dusty_yellow, R.raw.color_dusty_yellow));

        WordAdapter adapter = new WordAdapter(getActivity(),colorObj, R.color.category_colors);
        ListView listView = (ListView) convertView.findViewById(R.id.common);
        listView.setAdapter(adapter);

        return convertView;
    }
}
