package com.example.version5;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;

import static android.content.ContentValues.TAG;

public class ActivityCycleTest extends Activity {
    //for test
    @Override
    protected void onStart(){
        super.onStart();
        Log.e(TAG,"AOnStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG,"AonRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG,"AonResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG,"AonPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG,"AonStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG,"AonDestroy");
    }

    //save saveInstance in activity, fetch position. only work when application is not destoried.
    @Override
    protected void  onSaveInstanceState(Bundle outState) {
        super.onRestoreInstanceState(outState);
        int value = 0;
        Log.e(TAG,"AonSaveInstanceState");
        outState.putInt("message",value);
    }

    //save saveInstance in activity, fetch position
    @Override
    protected void  onRestoreInstanceState(Bundle outState) {
        super.onRestoreInstanceState(outState);
        Log.e(TAG,"AonRestoreInstanceState");
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            Intent intent = new Intent(Intent.ACTION_MAIN);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            intent.addCategory(Intent.CATEGORY_HOME);
            startActivity(intent);
        }
        return false;
    }
}
