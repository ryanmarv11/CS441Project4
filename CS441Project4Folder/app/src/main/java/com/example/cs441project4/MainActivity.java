package com.example.cs441project4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TableLayout;
import android.widget.TableRow;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private TableLayout table;
    private ArrayList<TableRow> tableRowList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tableRowList = new ArrayList();
        table = (TableLayout) findViewById(R.id.table_layout);
    }

    public void showStandardSets(View view) {
        clearTableRowList();
        TableRow tableRow;
    }

    public void clearTableRowList()
    {
        TableRow toRemove;
        while(this.tableRowList.isEmpty() == false)
        {
            toRemove = this.tableRowList.remove(this.tableRowList.size() - 1);
            table.removeView(toRemove);
        }
        /*
        if standard --> standard, pioneer --> pioneer, modern --> modern do nothing
        standard --> pioneer add sets
        standard --> modern add more sets
        pioneer --> standard remove sets
        pioneer --> modern add sets
        modern --> standard remove more sets
        modern --> pioneer remove sets
        to do this, have input code for current state of arraylist, then have input code for next state
         */

    }


}