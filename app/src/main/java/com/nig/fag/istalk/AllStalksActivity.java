package com.nig.fag.istalk;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

/**
 * Created by Doruk on 30.06.2015.
 */
public class AllStalksActivity extends FragmentActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_allstalks);

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();

        Fragment fragment = new Fragment();
        fragmentTransaction.add(R.id.people_list, fragment);
        fragmentTransaction.commit();
    }

    protected Fragment createFragment(){

    }
}
