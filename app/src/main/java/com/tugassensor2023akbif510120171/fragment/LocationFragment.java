package com.tugassensor2023akbif510120171.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.tugassensor2023akbif510120171.R;
import com.tugassensor2023akbif510120171.activity.CurrentLocationActivity;

public class LocationFragment extends Fragment {

    Activity context;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        context = getActivity();
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_location, container, false);
    }

    public void onStart(){
        super.onStart();
        Button btn= (Button) context.findViewById(R.id.current_location);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, CurrentLocationActivity.class);
                startActivity(intent);
            }
        });
    }

}

// 10120171 - Abdullah Tsani Iqomuddin - IF5
