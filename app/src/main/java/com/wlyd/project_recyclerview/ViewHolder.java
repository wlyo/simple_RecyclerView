package com.wlyd.project_recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by wlyd on 16/03/2018.
 */

public class ViewHolder extends RecyclerView.ViewHolder {
    public TextView name;
    public TextView description;
    public TextView price;

    public ViewHolder(View itemView) {
        super(itemView);
        name = itemView.findViewById(R.id.name);
        description = itemView.findViewById(R.id.description);
        price = itemView.findViewById(R.id.price);
    }
}
