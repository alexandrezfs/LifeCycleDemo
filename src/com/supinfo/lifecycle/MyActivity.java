package com.supinfo.lifecycle;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Log.d("LifeCycle", "Triggered onCreate");
    }

    @Override
    protected void onDestroy() {
        Log.d("LifeCycle", "Triggered onDestroy");
        super.onDestroy();
    }

    @Override
    protected void onResume() {
        Log.d("LifeCycle", "Triggered onResume");
        super.onResume();
    }

    @Override
    protected void onStop() {
        Log.d("LifeCycle", "Triggered onStop");
        super.onStop();
    }

    @Override
    protected void onStart() {
        Log.d("LifeCycle", "Triggered onStart");
        super.onStart();
    }

    @Override
    protected void onPause() {
        Log.d("LifeCycle", "Triggered onPause");
        super.onPause();
    }
}
