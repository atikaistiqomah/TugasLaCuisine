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


public class DessertFragment extends Fragment {

    View v;
    private RecyclerView mRecyclerView;
    private MenuAdapter recycleradapter;
    private List<Menu> lstMenu;


    public DessertFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_dessert, container, false);

        mRecyclerView = v.findViewById(R.id.rv_dessert);
        recycleradapter = new MenuAdapter(getContext(), lstMenu);
        mRecyclerView.setLayoutManager(new GridLayoutManager(getActivity(),2));
        mRecyclerView.setAdapter(recycleradapter);

        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstMenu = new ArrayList<>();

        lstMenu.add(new Menu("Martabak Manis", "Rp.10.000","olahan makanan yang terbuat dari tepung,telur dan gula kemudian dipanggang dan dilipat " , R.drawable.martabak_manis));
        lstMenu.add(new Menu("Pisang Goreng", "Rp.10.000","pisang cita rasa yang gurih dengan tekstur yang renyah" , R.drawable.pisang_goreng));
        lstMenu.add(new Menu("Pisang Keju Coklat", "Rp.9.000","pisang goreng yang terdapat parutan keju dan coklat diatasnya." , R.drawable.pisang_keju_coklat));
        lstMenu.add(new Menu("Sorbet", "Rp.9.000","sorbet adalah sebuah makanan penutup yang menjadi makanan pencuci mulut." , R.drawable.sorbet));

    }

}