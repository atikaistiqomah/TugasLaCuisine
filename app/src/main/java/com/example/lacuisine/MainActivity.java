package com.example.lacuisine;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;


public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private PagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = (TabLayout) findViewById(R.id.tabmain);
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        adapter = new PagerAdapter(getSupportFragmentManager());

        adapter.AddFragment(new FoodFragment(), "food");
        adapter.AddFragment(new BeverageFragment(), "beverage");
        adapter.AddFragment(new DessertFragment(), "dessert");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
