package com.example.cs441project4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private TableLayout table;
    private ArrayList<TableRow> tableRowList;
    public ArrayList<String> setNames, setDates;
    private int currentState;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tableRowList = new ArrayList();
        table = (TableLayout) findViewById(R.id.table_layout);
        currentState = 0;
        this.setNames = new ArrayList<String>();
        this.setDates = new ArrayList<String>();
        this.setNames.add("Kaldheim");
        this.setDates.add("2021");
        this.setNames.add("Zendikar Rising");
        this.setDates.add("2020");
        this.setNames.add("Core Set 2021");
        this.setDates.add("2020");
        this.setNames.add("Ikoria: Lair of Behemoths");
        this.setDates.add("2020");
        this.setNames.add("Theros Beyond Death");
        this.setDates.add("2020");
        this.setNames.add("Throne of Eldraine");
        this.setDates.add("2019");
        this.setNames.add("Core Set 2020");
        this.setDates.add("2019");
        this.setNames.add("War of the Spark");
        this.setDates.add("2019");
        this.setNames.add("Ravnica Allegiance");
        this.setDates.add("2019");
        this.setNames.add("Guilds of Ravnica");
        this.setDates.add("2018");
        this.setNames.add("Core Set 2019");
        this.setDates.add("2018");
        this.setNames.add("Dominaria");
        this.setDates.add("2018");
        this.setNames.add("Rivals of Ixalan");
        this.setDates.add("2018");
        this.setNames.add("Ixalan");
        this.setDates.add("2017");
        this.setNames.add("Hour of Devastation");
        this.setDates.add("2017");
        this.setNames.add("Amonkhet");
        this.setDates.add("2017");
        this.setNames.add("Aether Revolt");
        this.setDates.add("2017");
        this.setNames.add("Kaladesh");
        this.setDates.add("2016");
        this.setNames.add("Eldritch Moon");
        this.setDates.add("2016");
        this.setNames.add("Shadows over Innistrad");
        this.setDates.add("2016");
        this.setNames.add("Oath of the Gatewatch");
        this.setDates.add("2016");
        this.setNames.add("Battle for Zendikar");
        this.setDates.add("2015");
        this.setNames.add("Magic Origins");
        this.setDates.add("2015");
        this.setNames.add("Dragons of Tarkir");
        this.setDates.add("2015");
        this.setNames.add("Fate Reforged");
        this.setDates.add("2015");
        this.setNames.add("Khans of Tarkir");
        this.setDates.add("2014");
        this.setNames.add("Magic 2015");
        this.setDates.add("2014");
        this.setNames.add("Journey into Nyx");
        this.setDates.add("2014");
        this.setNames.add("Born of the Gods");
        this.setDates.add("2014");
        this.setNames.add("Theros");
        this.setDates.add("2013");
        this.setNames.add("Magic 2014");
        this.setDates.add("2013");
        this.setNames.add("Dragon's Maze");
        this.setDates.add("2013");
        this.setNames.add("Gatecrash");
        this.setDates.add("2013");
        this.setNames.add("Return to Ravnica");
        this.setDates.add("2012");
        this.setNames.add("Magic 2013");
        this.setDates.add("2012");
        this.setNames.add("Avacyn Restored");
        this.setDates.add("2012");
        this.setNames.add("Dark Ascension");
        this.setDates.add("2012");
        this.setNames.add("Innistrad");
        this.setDates.add("2011");
        this.setNames.add("Magic 2012");
        this.setDates.add("2011");
        this.setNames.add("New Phyrexia");
        this.setDates.add("2011");
        this.setNames.add("Mirrodin Besieged");
        this.setDates.add("2011");
        this.setNames.add("Scars of Mirrodin");
        this.setDates.add("2010");
        this.setNames.add("Magic 2011");
        this.setDates.add("2010");
        this.setNames.add("Rise of the Eldrazi");
        this.setDates.add("2010");
        this.setNames.add("Worldwake");
        this.setDates.add("2010");
        this.setNames.add("Zendikar");
        this.setDates.add("2009");
        this.setNames.add("Magic 2010");
        this.setDates.add("2009");
        this.setNames.add("Alara Reborn");
        this.setDates.add("2009");
        this.setNames.add("Conflux");
        this.setDates.add("2009");
        this.setNames.add("Shards of Alara");
        this.setDates.add("2008");
        this.setNames.add("Eventide Shadowmoor");
        this.setDates.add("2008");
        this.setNames.add("Morningtide");
        this.setDates.add("2008");
        this.setNames.add("Lorwyn");
        this.setDates.add("2007");
        this.setNames.add("Tenth Edition");
        this.setDates.add("2007");
        this.setNames.add("Future Sight");
        this.setDates.add("2007");
        this.setNames.add("Planar Chaos");
        this.setDates.add("2007");
        this.setNames.add("Time Spiral");
        this.setDates.add("2006");
        this.setNames.add("Coldsnap");
        this.setDates.add("2006");
        this.setNames.add("Dissension");
        this.setDates.add("2006");
        this.setNames.add("Guildpact");
        this.setDates.add("2006");
        this.setNames.add("Ravnica: City of Guilds");
        this.setDates.add("2005");
        this.setNames.add("Ninth Edition");
        this.setDates.add("2005");
        this.setNames.add("Saviors of Kamigawa");
        this.setDates.add("2005");
        this.setNames.add("Eighth Edition");
        this.setDates.add("2005");
        this.setNames.add("Betrayers of Kamigawa");
        this.setDates.add("2005");
        this.setNames.add("Champions of Kamigawa");
        this.setDates.add("2004");
        this.setNames.add("Fifth Dawn");
        this.setDates.add("2004");
        this.setNames.add("Darksteel");
        this.setDates.add("2004");
        this.setNames.add("Mirrodin");
        this.setDates.add("2003");
        this.setNames.add("Modern Horizons");
        this.setDates.add("2019");

    }

    public void showStandardSets(View view)
    {
        TableRow tableRow;
        TextView setName, setDate;
        if (this.currentState == 0)
        {
            this.currentState++;
        }
        else
        {
            clearTableRowList();
        }
        for (int i = 0; i < 6; i++)
        {
            tableRow = new TableRow(this);
            setName = new TextView(this);
            setName.setText(this.setNames.get(i));
            setDate = new TextView(this);
            setDate.setText(this.setDates.get(i));
            tableRow.addView(setName, 0);
            tableRow.addView(setDate, 1);
            this.table.addView(tableRow);
            this.tableRowList.add(tableRow);
        }

    }
    public void showPioneerSets (View view)
    {
            TableRow tableRow;
            TextView setName, setDate;
            if (this.currentState == 0)
            {
                this.currentState++;
            }
            else
            {
                clearTableRowList();
            }

            for (int i = 0; i < 34; i++)
            {
                tableRow = new TableRow(this);
                setName = new TextView(this);
                setName.setText(this.setNames.get(i));
                setDate = new TextView(this);
                setDate.setText(this.setDates.get(i));
                tableRow.addView(setName, 0);
                tableRow.addView(setDate, 1);
                this.table.addView(tableRow);
                this.tableRowList.add(tableRow);
            }
        }
    public void showModernSets(View view)
    {
        TableRow tableRow;
        TextView setName, setDate;
        if (this.currentState == 0)
        {
            this.currentState++;
        }
        else
        {
            clearTableRowList();
        }
        for (int i = 0; i < this.setNames.size()-1; i++)
        {
            tableRow = new TableRow(this);
            setName = new TextView(this);
            setName.setText(this.setNames.get(i));
            setDate = new TextView(this);
            setDate.setText(this.setDates.get(i));
            tableRow.addView(setName, 0);
            tableRow.addView(setDate, 1);
            this.table.addView(tableRow);
            this.tableRowList.add(tableRow);
        }

    }
    public void clearTableRowList()
    {
        TableRow toRemove;
        while(this.tableRowList.isEmpty() == false)
        {
            toRemove = this.tableRowList.remove(this.tableRowList.size() - 1);
            table.removeView(toRemove);
        }
    }

}