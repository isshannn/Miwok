package com.example.android.miwok;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

import java.util.List;

public class WordAdapter extends ArrayAdapter<WordClass>{
    private Context context1;
    private int getColor;

    MediaPlayer mediaPlayer;


    public WordAdapter(Context context, List<WordClass> WordClass, int color) {   // Constructor
        super(context, 0, WordClass);
        getColor = color;
        getColor =  ContextCompat.getColor(getContext(), getColor);//Returns a color associated with a particular resource ID
        context1 = context;
    }

    /*
        The following getView function is Overriden and is modified to display multiple textviews
        Logic used that it's returning a complete object as a view type
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final WordClass current = getItem(position);
        LayoutInflater layoutInflater = LayoutInflater.from(getContext());
        convertView = layoutInflater.inflate(R.layout.list_item, parent, false);

        // Setting TextViews to display Text
        ((TextView) convertView.findViewById(R.id.miwok_text_view)).setText(current.getMiwokTranslation());
        ((TextView) convertView.findViewById(R.id.default_text_view)).setText(current.getDefaultTranslation());

        // Setting TextViews to display Background Color
        convertView.findViewById(R.id.miwok_text_view).setBackgroundColor(getColor);
        convertView.findViewById(R.id.default_text_view).setBackgroundColor(getColor);


        // Playing AudioFiles on clicking text views
        (convertView.findViewById(R.id.miwok_text_view)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer= MediaPlayer.create(context1, current.getMusicid());
                mediaPlayer.seekTo(0);
                mediaPlayer.start();
            }
        });

        (convertView.findViewById(R.id.default_text_view)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer= MediaPlayer.create(context1, current.getMusicid());
                mediaPlayer.seekTo(0);
                mediaPlayer.start();
            }
        });


        if (current.ChkImg()){  // Put the Image in list_view.xml
            convertView.findViewById(R.id.Img).setBackgroundResource(current.getDefaultImage());
        }
        else{  // Removes ImageView in case no Image resource is found
            convertView.findViewById(R.id.Img).setVisibility(View.GONE);
        }
        return convertView;
    }
}

