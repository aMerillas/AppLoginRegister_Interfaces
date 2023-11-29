package com.example.login;

import androidx.appcompat.app.AppCompatActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Toast;

import java.util.List;
import java.util.Random;

public class SwipeArboles extends AppCompatActivity {

    private SwipeRefreshLayout swipe;
    private WebView miWeb;
    List<Item> items = DataHolder.getItems();
    String mensaje, url;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.swipe2);

        swipe = findViewById(R.id.refresco);
        swipe.setOnRefreshListener(mOnRefreshListener);


        miWeb = findViewById(R.id.web);
        registerForContextMenu(miWeb);
        WebSettings webSettings = miWeb.getSettings();
        webSettings.setLoadWithOverviewMode(true);
        webSettings.setUseWideViewPort(true);
        miWeb.loadUrl(url);
    }

    public void getArbol(){

        Random random = new Random();
        int randomIndex = random.nextInt(items.size());
        Item randomTree = items.get(randomIndex);
        mensaje =randomTree.getName();
        url =randomTree.getImg();

    }
    protected SwipeRefreshLayout.OnRefreshListener
            mOnRefreshListener = new SwipeRefreshLayout.OnRefreshListener() {
        @Override
        public void onRefresh() {
            getArbol();
            Toast toast = Toast.makeText(SwipeArboles.this, mensaje, Toast.LENGTH_LONG);
            toast.show();
            miWeb.reload();
            miWeb.loadUrl(url);
            swipe.setRefreshing(false);
        }
    };
}