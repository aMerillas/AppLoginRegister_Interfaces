package com.example.login;

import androidx.appcompat.app.AppCompatActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Toast;

import java.util.List;
import java.util.Random;

public class SwipeArboles extends AppCompatActivity {

    private SwipeRefreshLayout swipe;
    private WebView miWeb;
    private boolean bloquearRefresh = false;
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
        miWeb.loadUrl("https://static.vecteezy.com/system/resources/previews/016/721/112/non_2x/swipe-down-line-color-background-icon-vector.jpg");
    }

    public void getArbol() {
        Random random = new Random();
        int randomIndex = random.nextInt(items.size());
        Item randomTree = items.get(randomIndex);
        mensaje = randomTree.getName();
        url = randomTree.getImg();
    }

    protected SwipeRefreshLayout.OnRefreshListener mOnRefreshListener = new SwipeRefreshLayout.OnRefreshListener() {
        @Override
        public void onRefresh() {
            if (!bloquearRefresh) {
                bloquearRefresh = true;

                getArbol();
                Toast toast = Toast.makeText(SwipeArboles.this, mensaje, Toast.LENGTH_SHORT);
                toast.show();

                miWeb.reload();
                miWeb.loadUrl(url);

                new CountDownTimer(Toast.LENGTH_SHORT + 2000, 100) {
                    public void onTick(long millisUntilFinished) {

                    }

                    public void onFinish() {
                        swipe.setRefreshing(false);
                        bloquearRefresh = false;
                    }
                }.start();
            }
        }
    };
}
