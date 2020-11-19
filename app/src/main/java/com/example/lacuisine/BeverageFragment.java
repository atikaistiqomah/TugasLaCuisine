package com.example.lacuisine;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class BeverageFragment extends Fragment {

    View v;
    private RecyclerView mRecyclerView;
    private MenuAdapter recycleradapter;
    private List<Menu> lstMenu;


    public BeverageFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_beverage, container, false);

        mRecyclerView = v.findViewById(R.id.rv_beverage);
        recycleradapter = new MenuAdapter(getContext(), lstMenu);
        mRecyclerView.setLayoutManager(new GridLayoutManager(getActivity(),2));
        mRecyclerView.setAdapter(recycleradapter);

        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstMenu = new ArrayList<>();

        lstMenu.add(new Menu("Es Teler", "Rp.7.000","mes teler adalah koktail buah asli indonesia. alpukat, kelapa muda, cincau dan nangka" , R.drawable.es_teler));
        lstMenu.add(new Menu("Jus Alpukat", "Rp.6.000","jus yang menyehatkan dengan berbagai vitamin sehingga dapat menyehatkan tubuh." , R.drawable.jus_alpukat));
        lstMenu.add(new Menu("Jus Apel", "Rp.8.000","jus yang menyehatkan dengan berbagai vitamin sehingga dapat menyehatkan tubuh sebai minuman daya tahan tubuh" , R.drawable.jus_apel));
        lstMenu.add(new Menu("Jus Kiwi With Lime", "Rp.8.000","jus kiwi minuman segar dengan campuran lemon" , R.drawable.jus_kiwi));
        lstMenu.add(new Menu("Jus Lemon", "Rp.7.000","minuman sebagai daya imun tubuh dengan campuran susu." , R.drawable.jus_lemon));
        lstMenu.add(new Menu("Jus Timun", "Rp.6.000","jus timun digunakan dalam minuman koktail seperti Bloody Mary." , R.drawable.jus_timun));
    }

}