package com.example.android.miwok;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class FamilyFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        LayoutInflater layoutInflater = LayoutInflater.from(getContext());
        View convertView = layoutInflater.inflate(R.layout.activity_common, container, false);

        ArrayList<WordClass> familyObj = new ArrayList<WordClass>();

        familyObj.add(new WordClass("Father","әpә", R.drawable.family_father, R.raw.family_father));
        familyObj.add(new WordClass("Mother","әṭa", R.drawable.family_mother, R.raw.family_mother));
        familyObj.add(new WordClass("Son","angsi", R.drawable.family_son, R.raw.family_son));
        familyObj.add(new WordClass("Daughter","tune", R.drawable.family_daughter, R.raw.family_daughter));
        familyObj.add(new WordClass("Older Brother","taachi", R.drawable.family_older_brother, R.raw.family_older_brother));
        familyObj.add(new WordClass("Younger Brother","chalitti", R.drawable.family_younger_brother, R.raw.family_younger_brother));
        familyObj.add(new WordClass("Older Sister","teṭe", R.drawable.family_older_sister, R.raw.family_older_sister));
        familyObj.add(new WordClass("Younger Sister","kolliti", R.drawable.family_younger_sister, R.raw.family_younger_sister));
        familyObj.add(new WordClass("Grandfather","paapa", R.drawable.family_grandfather, R.raw.family_grandfather));
        familyObj.add(new WordClass("Grandmother","ama", R.drawable.family_grandmother, R.raw.family_grandmother));

        WordAdapter adaptor = new WordAdapter(getActivity(), familyObj, R.color.category_family);
        ListView listView = (ListView) convertView.findViewById(R.id.common);
        listView.setAdapter(adaptor);

        return convertView;
    }
}
