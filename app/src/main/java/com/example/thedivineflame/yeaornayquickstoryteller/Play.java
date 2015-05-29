package com.example.thedivineflame.yeaornayquickstoryteller;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;


public class Play extends Activity {

    Button yay;
    Button nay;
    Button quit;
    TextView output;
    String choices;
    String choiceOutput;
    String currentChoice;
    ArrayList wholeStory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        yay = (Button) findViewById(R.id.buttonyea);
        nay = (Button) findViewById(R.id.buttonNay);
        quit = (Button) findViewById(R.id.buttonQuit);
        output = (TextView) findViewById(R.id.textView);
        currentChoice = "";
        choices = "";
        choiceOutput = "";
        ArrayList<String> wholeStory = new ArrayList<String>();
        setupStory();
        yay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                decision(true);
            }
        });
        nay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                decision(false);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_play, menu);
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
    public void decision(boolean response) {
        if (choiceOutput.contains("!!!END!!!")) {

        }
        else if (response == true) {
            choices = choices + "A";
        }
        else if (response == false) {
            choices = choices + "B";
        }
        setStory();
    }
    public void setStory() {

        if( choices.substring(0,1) == "A" ) {
            if ( choices.substring(1,2) == "A" ) {
                if (choices.substring(2, 3) == "A") {
                    if (choices.substring(3, 4) == "A") {
                        output.setText((String) wholeStory.get(15));
                    } else if (choices.substring(3, 4) == "B") {
                        output.setText((String) wholeStory.get(16));
                    } else {
                        output.setText((String) wholeStory.get(7));
                    }
                }
                else if (choices.substring(2, 3) == "B") {
                    if (choices.substring(3, 4) == "A") {
                        output.setText((String) wholeStory.get(17));
                    } else if (choices.substring(3, 4) == "B") {
                        output.setText((String) wholeStory.get(18));
                    } else {
                        output.setText((String) wholeStory.get(8));
                    }
                }
                else {
                    output.setText((String) wholeStory.get(3));
                }
            }
            else if (choices.substring(1,2) == "B") {
                if (choices.substring(2,3) == "A" ) {
                    if (choices.substring(3,4) == "A") {
                        output.setText((String) wholeStory.get(19));
                    }
                    else  if(choices.substring(3,4) == "B") {
                        output.setText((String) wholeStory.get(20));
                    }
                    else {
                        output.setText( (String) wholeStory.get(9));
                    }
                }
                else if (choices.substring(2,3) == "B") {
                    if (choices.substring(3,4) == "A") {
                        output.setText((String) wholeStory.get(21));
                    }
                    else  if(choices.substring(3,4) == "B") {
                        output.setText((String) wholeStory.get(22));
                    }
                    else {
                        output.setText( (String) wholeStory.get(10));
                    }
                }
                else {
                    output.setText((String) wholeStory.get(4));
                }
            }
        }
        //Second Branch
        else if(choices.substring(0,1) == "B") {
            if ( choices.substring(1,2) == "A" ) {
                if (choices.substring(2, 3) == "A") {
                    if (choices.substring(3, 4) == "A") {
                        output.setText((String) wholeStory.get(23));
                    } else if (choices.substring(3, 4) == "B") {
                        output.setText((String) wholeStory.get(24));
                    } else {
                        output.setText((String) wholeStory.get(11));
                    }
                }
                else if (choices.substring(2, 3) == "B") {
                    if (choices.substring(3, 4) == "A") {
                        output.setText((String) wholeStory.get(25));
                    } else if (choices.substring(3, 4) == "B") {
                        output.setText((String) wholeStory.get(26));
                    } else {
                        output.setText((String) wholeStory.get(12));
                    }
                }
                else {
                    output.setText((String) wholeStory.get(5));
                }
            }
            else if (choices.substring(1,2) == "B") {
                if (choices.substring(2,3) == "A" ) {
                    if (choices.substring(3,4) == "A") {
                        output.setText((String) wholeStory.get(27));
                    }
                    else  if(choices.substring(3,4) == "B") {
                        output.setText((String) wholeStory.get(28));
                    }
                    else {
                        output.setText( (String) wholeStory.get(13));
                    }
                }
                else if (choices.substring(2,3) == "B") {
                    if (choices.substring(3,4) == "A") {
                        output.setText((String) wholeStory.get(29));
                    }
                    else  if(choices.substring(3,4) == "B") {
                        output.setText((String) wholeStory.get(30));
                    }
                    else {
                        output.setText( (String) wholeStory.get(14));
                    }
                }
                else {
                    output.setText((String) wholeStory.get(6));
                }
            }
        }
        else {
            output.setText((String) wholeStory.get(0));
        }
        output.setText(choiceOutput);
    }
    public void setupStory() {
        wholeStory.add("1");
        wholeStory.add("2");
        wholeStory.add("3");
        wholeStory.add("4");
        wholeStory.add("5");
        wholeStory.add("6");
        wholeStory.add("7");
        wholeStory.add("8");
        wholeStory.add("9");
        wholeStory.add("10");
        wholeStory.add("11");
        wholeStory.add("12");
        wholeStory.add("13");
        wholeStory.add("14");
        wholeStory.add("15");
        wholeStory.add("16");
        wholeStory.add("17");
        wholeStory.add("18");
        wholeStory.add("19");
        wholeStory.add("20");
        wholeStory.add("21");
        wholeStory.add("22");
        wholeStory.add("23");
        wholeStory.add("24");
        wholeStory.add("25");
        wholeStory.add("26");
        wholeStory.add("27");
        wholeStory.add("28");
        wholeStory.add("29");

    }
}
