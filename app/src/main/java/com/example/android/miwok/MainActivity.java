package com.example.android.miwok;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Find the view pager that will allow the user to swipe between fragments
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        // Create an adapter that knows which fragment should be shown on each page
        SimpleFragmentPagerAdapter adapter = new SimpleFragmentPagerAdapter(getSupportFragmentManager());

        // Set the adapter onto the view pager
        viewPager.setAdapter(adapter);

        // Give the TabLayout the ViewPager
        TabLayout tabLayout = (TabLayout) findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setText(R.string.category_numbers);// Gives title to tabs at respective position
        tabLayout.getTabAt(1).setText(R.string.category_family);
        tabLayout.getTabAt(2).setText(R.string.category_colors);
        tabLayout.getTabAt(3).setText(R.string.category_phrases);
    }



    /*
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Link object with TextViews from ActivityMain.xml
        TextView obj1 = (TextView) findViewById(R.id.number);
        TextView obj2 = (TextView) findViewById(R.id.family);
        TextView obj3 = (TextView) findViewById(R.id.colors);
        TextView obj4 = (TextView) findViewById(R.id.phrases);


        // Directs to NumberActivity.java
        obj1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent number = new Intent(MainActivity.this , NumberActivity.class);
                startActivity(number);
            }
        });

        // Directs to FamilyActivity.java
        obj2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent family = new Intent(MainActivity.this , FamilyActivity.class);
                startActivity(family);
            }
        });

        // Redirects to ColorActivity.java
        obj3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent color = new Intent(MainActivity.this , ColorActivity.class);
                startActivity(color);
            }
        });

        // Redirects to PhraseActivity.java
        obj4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent phrases = new Intent(MainActivity.this , PhraseActivity.class);
                startActivity(phrases);
            }
        });

    }*/

}