package com.example.android.unit5mid.controller;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.unit5mid.R;
import com.example.android.unit5mid.model.Name;
import com.example.android.unit5mid.model.Results;
import com.example.android.unit5mid.views.ResultsViewHolder;

import java.util.List;


public class ResultsAdapter extends RecyclerView.Adapter<ResultsViewHolder> {

    List<Name> myNames;


    public ResultsAdapter(List<Name> myNames) {
        this.myNames= myNames;
    }

    @Override
    public ResultsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view, parent, false);
        return new ResultsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ResultsViewHolder holder, int position) {

        Name name = myNames.get(position);
        holder.onBind(name);

    }

    @Override
    public int getItemCount() {
        return myNames.size();
    }
}
