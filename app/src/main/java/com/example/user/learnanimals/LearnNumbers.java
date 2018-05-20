package com.example.user.learnanimals;

import android.app.Activity;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import java.util.Locale;


public class LearnNumbers extends Activity implements View.OnClickListener {
    ImageButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9;
    TextToSpeech act;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_numbers);



        b0 = (ImageButton) findViewById(R.id.button1);
        b0.setOnClickListener(this);
        b1 = (ImageButton) findViewById(R.id.button2);
        b1.setOnClickListener(this);
        b2 = (ImageButton) findViewById(R.id.button3);
        b2.setOnClickListener(this);
        b3 = (ImageButton) findViewById(R.id.button4);
        b3.setOnClickListener(this);
        b4 = (ImageButton) findViewById(R.id.button5);
        b4.setOnClickListener(this);
        b5 = (ImageButton) findViewById(R.id.button6);
        b5.setOnClickListener(this);
        b6 = (ImageButton) findViewById(R.id.button7);
        b6.setOnClickListener(this);
        b7 = (ImageButton) findViewById(R.id.button8);
        b7.setOnClickListener(this);
        b8 = (ImageButton) findViewById(R.id.button9);
        b8.setOnClickListener(this);
        b9 = (ImageButton) findViewById(R.id.button10);
        b9.setOnClickListener(this);
        act = new TextToSpeech(LearnNumbers.this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    act.setLanguage(Locale.ENGLISH);
                    act.speak("learn how to count numbers", TextToSpeech.QUEUE_FLUSH, null);

                }
            }
        });
    }

     @Override
    public void onClick(View arg0) {
        // TODO Auto-generated method stub

        switch(arg0.getId()){

            case R.id.button1:

                act.speak("one", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.button2:

                act.speak("two", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.button3:

                act.speak("three", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.button4:

                act.speak("four", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.button5:

                act.speak("five", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.button6:

                act.speak("six", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.button7:

                act.speak("seven", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.button8:

                act.speak("eight", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.button9:

                act.speak("nine", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.button10:

                act.speak("ten", TextToSpeech.QUEUE_FLUSH, null);
                break;

        }
    }





    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_learn_numbers, menu);
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
}
