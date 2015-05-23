package com.example.thedivineflame.yeaornayquickstoryteller;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;



public class NewGame extends Activity {
    Button play;
    Button quit;
    ListView gamesList;
    ArrayList fakeData;
    ArrayAdapter adapt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_game);
        play = (Button) findViewById(R.id.button4);
        quit = (Button) findViewById(R.id.button5);
        gamesList = (ListView) findViewById(R.id.listView);
        ArrayList<String> fakeData = new ArrayList<String>();
        fakeData.add("How are you");
        fakeData.add("Pretty Good");
        fakeData.add("Ok I guess");
        fakeData.add("Nevermind");

        //setFakeData();
        adapt = new ArrayAdapter<> (NewGame.this,R.layout.newlist, R.id.textItem, fakeData );
        gamesList.setAdapter(adapt);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        quit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_new_game, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void setFakeData() {

    }
}
