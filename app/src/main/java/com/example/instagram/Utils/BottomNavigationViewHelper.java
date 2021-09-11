package com.example.instagram.Utils;

import android.util.Log;

import com.example.instagram.HomeActivity;
import com.example.instagram.LikesActivity;
import com.example.instagram.ProfileActivity;
import com.example.instagram.R;
import com.example.instagram.SearchActivity;
import com.example.instagram.ShareActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import android.content.Context;
import android.content.Intent;
import android.view.MenuItem;

import androidx.annotation.NonNull;


/**
 * Created by User on 5/28/2017.
 */
/**
 * Created by User on 5/28/2017.
 */

public class BottomNavigationViewHelper {

    private static final String TAG = "BottomNavigationViewHel";

    public static void setupBottomNavigationView(BottomNavigationView view){
        Log.d(TAG, "setupBottomNavigationView: Setting up BottomNavigationView");
        view.setAnimationCacheEnabled(false);
    }
    public static void enableNavigation(final Context context, BottomNavigationView view){
        view.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){

                    case R.id.ic_house:
                        Intent intent1 = new Intent(context, HomeActivity.class);//ACTIVITY_NUM = 0
                        context.startActivity(intent1);
                        break;

                    case R.id.ic_search:
                        Intent intent2  = new Intent(context, SearchActivity.class);//ACTIVITY_NUM = 1
                        context.startActivity(intent2);
                        break;

                    case R.id.ic_circle:
                        Intent intent3 = new Intent(context, ShareActivity.class);//ACTIVITY_NUM = 2
                        context.startActivity(intent3);
                        break;

                    case R.id.ic_alert:
                        Intent intent4 = new Intent(context, LikesActivity.class);//ACTIVITY_NUM = 3
                        context.startActivity(intent4);
                        break;

                    case R.id.ic_android:
                        Intent intent5 = new Intent(context, ProfileActivity.class);//ACTIVITY_NUM = 4
                        context.startActivity(intent5);
                        break;
                }
                return false;
            }
        });
    }
}
