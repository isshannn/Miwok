package com.example.android.miwok;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class PhraseFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        LayoutInflater layoutInflater= LayoutInflater.from(getContext());
        View convertview = layoutInflater.inflate(R.layout.activity_common, container, false);

        ArrayList<WordClass> PhraseObj = new ArrayList<WordClass>();

        PhraseObj.add(new WordClass("Where are you going?","minto wuksus", R.raw.phrase_where_are_you_going));
        PhraseObj.add(new WordClass("What is your name?","tinnә oyaase'nә", R.raw.phrase_what_is_your_name));
        PhraseObj.add(new WordClass("My name is...","oyaaset...", R.raw.phrase_my_name_is));
        PhraseObj.add(new WordClass("How are you feeling?","michәksәs?", R.raw.phrase_how_are_you_feeling));
        PhraseObj.add(new WordClass("I’m feeling good.","kuchi achit", R.raw.phrase_im_feeling_good));
        PhraseObj.add(new WordClass("Are you coming?","әәnәs'aa?", R.raw.phrase_are_you_coming));
        PhraseObj.add(new WordClass("Yes, I’m coming","hәә’ әәnәm", R.raw.phrase_yes_im_coming));
        PhraseObj.add(new WordClass("I’m coming.","әәnәm", R.raw.phrase_im_coming));
        PhraseObj.add(new WordClass("Let’s go.","yoowutis", R.raw.phrase_lets_go));
        PhraseObj.add(new WordClass("Come here","әnni'nem", R.raw.phrase_come_here));

        WordAdapter adaptor = new WordAdapter(getActivity(),PhraseObj, R.color.category_phrases);
        ListView listView = (ListView) convertview.findViewById(R.id.common);
        listView.setAdapter(adaptor);

        return convertview;
    }
}
