package com.prabhakar.articlescrollingwithrecyclerview;

import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ClickedListener {
    RecyclerView recyclerView;
    private ArrayList<ArticleModel> articleLists;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.article_RecyclerView);
        buildList();
        setRecyclerView();
    }

    private void buildList() {
        articleLists = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            articleLists.add(new ArticleModel(R.drawable.pic1, "Oliur", R.drawable.icon,
                    "FEATURED", "Blue Ocean", "Wave Crash",
                    "See the Beautiful oceans of the Pacific coast where the water is so clean " +
                            "you can see the sand."));
            articleLists.add(new ArticleModel(R.drawable.pic2, "Oliur", R.drawable.icon,
                    "FEATURED", "Long Exposure", "River Bridge",
                    "clong exposure photography is when you leave the shutter open longer " +
                            "than usual to pick up more light."));
        }
    }

    private void setRecyclerView() {
        ArticleAdapter articleAdapter = new ArticleAdapter(articleLists, this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(articleAdapter);
    }

    @Override
    public void onItemClicked(ArticleModel articleModel) {
        new AlertDialog.Builder(this).setTitle("Article Details :")
                .setMessage("Author Name : "+articleModel.getAuthor()).show();
    }
}