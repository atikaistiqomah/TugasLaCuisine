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

<<<<<<< HEAD
        getSupportActionBar().setElevation(0);

        tabLayout = findViewById(R.id.tabmain);
        viewPager = findViewById(R.id.viewpager);
=======
        tabLayout = (TabLayout) findViewById(R.id.tabmain);
        viewPager = (ViewPager) findViewById(R.id.viewpager);
>>>>>>> 2b3505e4c0baf0a67cd344e6fa5eefdd4ef19d0e
        adapter = new PagerAdapter(getSupportFragmentManager());

        adapter.AddFragment(new FoodFragment(), "food");
        adapter.AddFragment(new BeverageFragment(), "beverage");
        adapter.AddFragment(new DessertFragment(), "dessert");
        adapter.AddFragment(new TambahFragment(), "tambah");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
