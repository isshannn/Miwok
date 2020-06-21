package com.example.android.miwok;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class NumberFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        LayoutInflater layoutInflater = LayoutInflater.from(getContext());
        View convertView = layoutInflater.inflate(R.layout.activity_common, container, false);

        // Creates an Array list of object WordClasses of data type WordClass (which is a userDefined class)
        ArrayList<WordClass> numberClasses = new ArrayList<WordClass>();

        /*
            numberClasses.add is used to input predefined data into the ArrayList numberClasses.
            The arguments to be given is defined in constructor of WordClass
         */
        //                                                       Image            MusicFile
        numberClasses.add(new WordClass("one",   "lutti", R.drawable.number_one, R.raw.number_one));
        numberClasses.add(new WordClass("two",   "otiiko", R.drawable.number_two, R.raw.number_two));
        numberClasses.add(new WordClass("three", "tolookosu", R.drawable.number_three, R.raw.number_three));
        numberClasses.add(new WordClass("four",  "oyyisa", R.drawable.number_four, R.raw.number_four));
        numberClasses.add(new WordClass("five",  "massokka", R.drawable.number_five, R.raw.number_five));
        numberClasses.add(new WordClass("six",   "temmokka", R.drawable.number_six, R.raw.number_six));
        numberClasses.add(new WordClass("seven", "kenekaku", R.drawable.number_seven, R.raw.number_seven));
        numberClasses.add(new WordClass("eight", "kawinta", R.drawable.number_eight, R.raw.number_eight));
        numberClasses.add(new WordClass("nine",  "wo’e", R.drawable.number_nine, R.raw.number_nine));
        numberClasses.add(new WordClass("ten",   "na’aacha", R.drawable.number_ten, R.raw.number_ten));

        // Create an WordAdapter, whose data source is a list of NumberFragment.
        // The adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(getActivity(), numberClasses, R.color.category_numbers);

        // Find the ListView object in the view hierarchy of the Activity.
        // There should be a ListView with the view ID called common which is declared in the
        // activity_common.xml layout file.
        ListView listView = (ListView) convertView.findViewById(R.id.common); // numbers refers to activity_numbers.xml

        // Make the ListView use the NumberAdapter we created above, so that the
        // ListView will display list items for each numberClass in the list.
        listView.setAdapter(adapter);
        return convertView; // returns a View
    }

}
