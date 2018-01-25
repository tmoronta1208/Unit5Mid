package com.example.android.unit5mid.views;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import android.widget.TextView;

import com.example.android.unit5mid.R;
import com.example.android.unit5mid.model.Name;
import com.example.android.unit5mid.model.Results;

/**
 * Created by TatianaM on 1/24/18.
 */


public class ResultsViewHolder extends ViewHolder {

    TextView textView;
    public ResultsViewHolder(View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.main_name);



    }

    public void onBind(Results results){

        textView.setText(results.getEmail());

    }
}
