package com.prabhakar.articlescrollingwithrecyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ArticleAdapter extends RecyclerView.Adapter<ArticleViewHolder> {
    private ArrayList<ArticleModel> articleLists;
    private ClickedListener clickedListener;

    public ArticleAdapter(ArrayList<ArticleModel> articleLists, ClickedListener clickedListener) {
        this.articleLists = articleLists;
        this.clickedListener = clickedListener;
    }

    @NonNull
    @Override
    public ArticleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout, parent, false);
        return new ArticleViewHolder(view,clickedListener);

    }

    @Override
    public void onBindViewHolder(@NonNull ArticleViewHolder holder, int position) {
        ArticleModel articleModel = articleLists.get(position);
        holder.setData(articleModel);
    }

    @Override
    public int getItemCount() {
        return articleLists.size();
    }
}
