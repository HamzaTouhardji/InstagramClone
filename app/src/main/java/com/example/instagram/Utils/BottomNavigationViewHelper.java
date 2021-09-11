package com.example.instagram.Utils;

import android.util.Log;

import com.google.android.material.bottomnavigation.BottomNavigationView;

/**
 * Created by User on 5/28/2017.
 */

public class BottomNavigationViewHelper {

    private static final String TAG = "BottomNavigationViewHel";

    public static void setupBottomNavigationView(BottomNavigationView view){
        Log.d(TAG, "setupBottomNavigationView: Setting up BottomNavigationView");
        view.setAnimationCacheEnabled(false);
    }
}
