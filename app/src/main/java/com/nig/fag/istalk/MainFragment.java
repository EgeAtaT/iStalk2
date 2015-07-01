package com.nig.fag.istalk;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Doruk on 01.07.2015.
 */
public class MainFragment extends ListFragment {
    public Intent intent;
    private List<String> listValues;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //TODO: Use Twitter API.
        listValues = new ArrayList<String>();
        listValues.add("Android");
        listValues.add("iOS");
        listValues.add("Symbian");
        listValues.add("Blackberry");
        listValues.add("Windows Phone");
        listValues.add("asdf");

        //TODO: Custom design for encapsulating tweets.
        ArrayAdapter<String> myAdapter = new ArrayAdapter <String>(getActivity(),
                R.layout.person_row, R.id.listText, listValues);
        setListAdapter(myAdapter);


        setHasOptionsMenu(true);
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        // Inflate the menu; this adds items to the action bar if it is present.
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.main_activity_actions, menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        // TODO: ADD ACTUAL BUTTON FUNCTIONS
        switch (item.getItemId()) {
            case R.id.action_people:
                //openSearch();
                intent = new Intent(getActivity(), AllStalksActivity.class);
                startActivity(intent);
                return true;
            case R.id.action_settings:
                //openSettings();
                return true;
            case R.id.action_lists:
                intent = new Intent(getActivity(), ListsActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
