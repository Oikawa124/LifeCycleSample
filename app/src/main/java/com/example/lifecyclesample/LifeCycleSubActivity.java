package com.example.lifecyclesample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class LifeCycleSubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i("LifeCycleSample", "Main, Sub onCreate called");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle_sub);
    }

    @Override
    protected void onStart() {
        Log.i("LifeCycleSample", "Main, Sub onStart called");
        super.onStart();
    }

    @Override
    protected void onRestart() {
        Log.i("LifeCycleSample", "Main, Sub onRestert called");
        super.onRestart();
    }

    @Override
    protected void onResume() {
        Log.i("LifeCycleSample", "Main, Sub onResume called");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.i("LifeCycleSample", "Main, Sub onPause called");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.i("LifeCycleSample", "Main, Sub onStop called");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.i("LifeCycleSample", "Main, Sub onDestroy called");
        super.onDestroy();
    }

    public void onButtonClick(View view) {
        // アクティビティの終了
        finish();
    }
}
