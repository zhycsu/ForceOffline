package com.example.zhy.forceoffline;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by zhy on 2015/7/14.
 */
public class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityCollector.addActivity(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityCollector.removeActivity(this);
    }
}
