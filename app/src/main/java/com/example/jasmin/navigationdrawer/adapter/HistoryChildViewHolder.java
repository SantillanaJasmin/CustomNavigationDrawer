package com.example.jasmin.navigationdrawer.adapter;

import android.support.annotation.NonNull;
import android.view.View;
import android.widget.TextView;

import com.bignerdranch.expandablerecyclerview.ChildViewHolder;
import com.example.jasmin.navigationdrawer.R;
import com.example.jasmin.navigationdrawer.model.HistoryChild;

/**
 * Class for creating handlers of HistoryChild elements
 */
public class HistoryChildViewHolder extends ChildViewHolder {

    public TextView tvComment;

    public HistoryChildViewHolder(View itemView) {
        super(itemView);

        tvComment = (TextView) itemView.findViewById(R.id.tvComment);
    }

    public void bind(@NonNull HistoryChild historyChild) {
        tvComment.setText(historyChild.getComment());
    }
}
