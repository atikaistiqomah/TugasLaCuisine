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


public class FoodFragment extends Fragment {

    View v;
    private RecyclerView mRecyclerView;
    private MenuAdapter recycleradapter;
    private List<Menu> lstMenu;


    public FoodFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_food, container, false);

        mRecyclerView = v.findViewById(R.id.rv_food);
        recycleradapter = new MenuAdapter(getContext(), lstMenu);
        mRecyclerView.setLayoutManager(new GridLayoutManager(getActivity(),2));
        mRecyclerView.setAdapter(recycleradapter);

        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstMenu = new ArrayList<>();

        lstMenu.add(new Menu("Ayam Bakar", "Rp.22.000", "ayam bakar adalah sebuah olahan dimana dalam proses pematangannya dengan cara dipanggang. " +
                "Cita rasa yang terkandung di dalamnya rasa manis dan gurih yang merata pada seluruh bagian dagingnya." +
                "Teksturnya yang begitu lembut membuat daging sangat mudah untuk dinikmati." , R.drawable.ayam_bakar));
        lstMenu.add(new Menu("Ayam Goreng", "Rp.18.000","ayam goreng adalah salah satu bahan olahan dengan proses digoreng." +
                "ayam goreng ini memiliki rasa yang gurih dan tekstur daging yang lembut." +
                "salah satu makanan yang sangat digemari oleh seluruh masyarakat ini dapat dipadukan dengan berbagai masakan selain rasanya pengolahannya pun sangat sederhana." , R.drawable.ayam_goreng));
        lstMenu.add(new Menu("Bakmi Ayam", "Rp.12.000","bakmie ayam adalah sebuah olahan masakan dengan bahan dasar mie dan ayam, namun didalamnya terdapat banyak variasi," +
                "seperti tambahan sayur-sayuran dan oalahan seafood. " , R.drawable.bakmi_ayam));
        lstMenu.add(new Menu("Beef Rendang", "Rp.25.000","beef rendang adalah sebuah olahan daging sapi yang dimasak dengan mengunakan santan kelapa dan bumbu rempah-rempah asli pilhan terbaik." +
                "cita rasa khas indonesia yang begitu asli dari rempah-rempah menghasilkan rasa manis dan gurih." , R.drawable.beef_rendang));
        lstMenu.add(new Menu("Gado-gado", "Rp.12.000","gado-gado adalah salah satu makanan khas indonesia yang berasal dari Jakarta, cita rasa kacangnya yang khas membuat melekat pada lidah." +
                "gado-gado ini terdiri dari sayur-sayuran dan dimakan dengan menggunakan nasi ataupun lontong." , R.drawable.gado_gado));
        lstMenu.add(new Menu("Ikan Bakar", "Rp.15.000","ikan bakar ini mengandung cita rasa asam-manis dan gurih. tekstur yang renyah dan dapat menggunakan berbagai jenis ikan." , R.drawable.ikan_bakar));
        lstMenu.add(new Menu("Nasi Goreng", "Rp.13.000","nasi goreng menjadi salah satu masakan yang sangat digemari oleh masyarakat, karena rasanya yang gurih dan harga yang relatif murah." +
                "varaisi isi dalam nasi goreng ini pun sangat banyak, dari campuran bakso, sosis, ayam dan seafood lainnya." , R.drawable.nasi_goreng));
        lstMenu.add(new Menu("Nasi Kuning", "Rp.13.000","nasi kuning rasa yang halnya sama seperti nasi uduk, rasa gurih yang tercipta dari santan kelapa, warna kuning yang sangat unik dari halusan kunyit menambah estetik pada nasinya.", R.drawable.nasi_kuning));
    }

}