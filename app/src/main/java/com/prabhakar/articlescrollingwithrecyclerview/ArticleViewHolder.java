package com.prabhakar.articlescrollingwithrecyclerview;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ArticleViewHolder extends RecyclerView.ViewHolder {
    private ImageView image;
    private ImageView icon;
    private TextView tag;
    private TextView line1;
    private TextView line2;
    private TextView line3;
    private RelativeLayout article;
    private ClickedListener clickedListener;

    public ArticleViewHolder(@NonNull View itemView, ClickedListener clickedListener) {
        super(itemView);
        this.clickedListener=clickedListener;
        initView(itemView);
    }

    private void initView(View itemView) {
        image = itemView.findViewById(R.id.pic);
        icon = itemView.findViewById(R.id.icon);
        tag = itemView.findViewById(R.id.tag_text);
        line1 = itemView.findViewById(R.id.line1);
        line2 = itemView.findViewById(R.id.line2);
        line3 = itemView.findViewById(R.id.line3);
        article= itemView.findViewById(R.id.article);
    }

    public void setData(ArticleModel articleModel) {
        image.setImageResource(articleModel.getImage());
        icon.setImageResource(articleModel.getIcon());
        tag.setText(articleModel.getTagText());
        line1.setText(articleModel.getLine1());
        line2.setText(articleModel.getLine2());
        line3.setText(articleModel.getLine3());
        article.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickedListener.onItemClicked(articleModel);
            }
        });

    }

}
