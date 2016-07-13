package com.example.aluno.aula2;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Aluno on 12/07/2016.
 */
public class ListAdapter extends RecyclerView.Adapter<ListAdapter.MyHolder>{

    private List<String> mList;

    public ListAdapter(List<String> list){
        this.mList = list;
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new MyHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_list, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(MyHolder myHolder, int position) {
        String item = mList.get(position);

        myHolder.tvText.setText(item);
        myHolder.imageView.setImageResource(R.mipmap.ic_launcher);

    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView tvText;

        public MyHolder(View itemView){
            super(itemView);

            imageView = (ImageView) itemView.findViewById(R.id.imageView);
            tvText = (TextView) itemView.findViewById(R.id.tvText);
        }
    }
}
