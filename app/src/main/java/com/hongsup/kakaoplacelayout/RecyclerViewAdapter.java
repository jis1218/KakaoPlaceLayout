package com.hongsup.kakaoplacelayout;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.security.acl.LastOwnerException;

/**
 * Created by 정인섭 on 2017-12-01.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyHolder>{
    public static final int HEADER = 99;
    public static final int NORMAL = 77;

    @Override
    public int getItemCount() {
        return 40;
    }

    @Override
    public int getItemViewType(int position) {
        if(position==0){
            return HEADER;
        }

        return NORMAL;
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if(viewType==NORMAL){
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item_list, null);
            return new MyHolder(view);
        }else{
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_header, null);
            return new MyHolder(view);
        }
    }

    @Override
    public void onBindViewHolder(MyHolder holder, int position) {
        if(position>=1) {
            String pos = position + "";
            holder.textView.setText(pos);
        }
    }





    class MyHolder extends RecyclerView.ViewHolder{
        TextView textView;

        public MyHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textView);
        }
    }
}
