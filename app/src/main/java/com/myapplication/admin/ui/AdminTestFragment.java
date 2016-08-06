package com.myapplication.admin.ui;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.myapplication.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class AdminTestFragment extends Fragment {


    public AdminTestFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        database.getReference("Market2").child("test").setValue("test");
        DatabaseReference mark = database.getReference("Market");

        DatabaseReference market = mark.child("11-july-2016");

        DatabaseReference turmaric = market.child("Tumaric");

        DatabaseReference nizam =turmaric.child("Nizamabad");
        nizam.child("price").setValue("97.10");
        nizam.child("Bags").setValue("1000");

        DatabaseReference bodhan =turmaric.child("Bodhan");
        bodhan.child("price").setValue("97.10");
        bodhan.child("Bags").setValue("1040");

        DatabaseReference armoor =turmaric.child("Armoor");
        armoor.child("price").setValue("94.10");
        armoor.child("Bags").setValue("1040");


        DatabaseReference cashew = market.child("Cashew");

        DatabaseReference nizamabadcashew =cashew.child("Nizamabad");
        nizamabadcashew.child("price").setValue("97.10");
        nizamabadcashew.child("Bags").setValue("1000");

        DatabaseReference bodhancashew =cashew.child("Bodhan");
        bodhancashew.child("price").setValue("97.10");
        bodhancashew.child("Bags").setValue("1040");

        DatabaseReference armoorcashew =cashew.child("Armoor");
        armoorcashew.child("price").setValue("94.10");
        armoorcashew.child("Bags").setValue("1040");

        DatabaseReference market12 = mark.child("12-july-2016");

        DatabaseReference turmaric12 = market12.child("Tumaric");

        DatabaseReference nizam12 =turmaric12.child("Nizamabad");
        nizam12.child("price").setValue("97.10");
        nizam12.child("Bags").setValue("1000");

        DatabaseReference bodhan12 =turmaric12.child("Bodhan");
        bodhan12.child("price").setValue("97.10");
        bodhan12.child("Bags").setValue("1040");

        DatabaseReference armoor12 =turmaric12.child("Armoor");
        armoor12.child("price").setValue("94.10");
        armoor12.child("Bags").setValue("1040");


        DatabaseReference cashew12 = market12.child("Cashew");

        DatabaseReference nizamabadcashew12 =cashew12.child("Nizamabad");
        nizamabadcashew12.child("price").setValue("97.10");
        nizamabadcashew12.child("Bags").setValue("1000");

        DatabaseReference bodhancashew12 =cashew12.child("Bodhan");
        bodhancashew12.child("price").setValue("97.10");
        bodhancashew12.child("Bags").setValue("1040");

        DatabaseReference armoorcashew12 =cashew12.child("Armoor");
        armoorcashew12.child("price").setValue("94.10");
        armoorcashew12.child("Bags").setValue("1040");








    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_admin_fragmner, container, false);
    }

}