package com.example.android.unit5mid.fragments;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.android.unit5mid.R;
import com.example.android.unit5mid.model.Results;
import com.example.android.unit5mid.network.GetResults;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {
    View rootView;
    RecyclerView recyclerView;
    GetResults resultService;
    private final String TAG = "";


    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_main, container, false);
        recyclerView = rootView.findViewById(R.id.recyclerView);


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://randomuser.me/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        resultService = retrofit.create(GetResults.class);

        Call<Results> results = resultService.getResults();
        results.enqueue(new Callback<Results>() {
            @Override
            public void onResponse(Call<Results> call, Response<Results> response) {
                Log.d(TAG, "onResponse" + response.body());
            }

            @Override
            public void onFailure(Call<Results> call, Throwable t) {

                Log.d(TAG, "onFailure" + t.toString());

            }
        });


        View itemView = rootView.findViewById(R.id.itemView);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DetailFragment detailFragment = new DetailFragment();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container, detailFragment);
                fragmentTransaction.commit();
            }
        });

        return rootView;
    }

}
