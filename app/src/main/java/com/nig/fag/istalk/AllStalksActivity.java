package com.nig.fag.istalk;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Doruk on 30.06.2015.
 */
public class AllStalksActivity extends ListActivity {

    private List<String> listValues;
    private Button mAddButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_allstalks);

        listValues = new ArrayList<String>();
        listValues.add("Android");
        listValues.add("iOS");
        listValues.add("Symbian");
        listValues.add("Blackberry");
        listValues.add("Windows Phone");

        //TODO: Better design with hold-down and multi-select to delete feature.
        ArrayAdapter<String> myAdapter = new ArrayAdapter <String>(this,
                R.layout.person_row, R.id.listText, listValues);
        setListAdapter(myAdapter);

        mAddButton = (Button)findViewById(R.id.add_username);
        mAddButton.setOnClickListener(new View.OnClickListener(){
           public void onClick(View v){
               //TODO: Set text to "Checking..." and disable button. Bad response --> dialog.
           }
        });
    }

    protected void onListItemClick(ListView list, View view, int position, long id) {
        super.onListItemClick(list, view, position, id);

        String selectedItem = (String) getListView().getItemAtPosition(position);
        //String selectedItem = (String) getListAdapter().getItem(position);

        Toast toast = Toast.makeText(getApplicationContext(),
                "You clicked " + selectedItem + " at position " + position,
                Toast.LENGTH_SHORT);
    }


}
