package com.example.android.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Rishi on 25/02/2018.
 */

public class NumberViewHolder extends RecyclerView.ViewHolder {

    TextView listItemNumberView;

    public NumberViewHolder(View itemView) {
        super(itemView);

        listItemNumberView = (TextView) itemView.findViewById(R.id.tv_item_number);
    }

    public void bind(int listIndex) {
        listItemNumberView.setText(String.valueOf(listIndex));
    }

}
