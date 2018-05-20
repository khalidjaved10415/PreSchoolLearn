package com.example.user.learnanimals;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import java.util.Locale;


public class Shapes extends Activity implements View.OnClickListener {
    MediaPlayer mediaPlayer;
    ImageButton b0, b1, b2, b3, b4, b5, b6, b7;
    public TextToSpeech act;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shapes);



        b0 = (ImageButton) findViewById(R.id.one);
        b0.setOnClickListener(this);
        b1 = (ImageButton) findViewById(R.id.two);
        b1.setOnClickListener(this);
        b2 = (ImageButton) findViewById(R.id.three);
        b2.setOnClickListener(this);
        b3 = (ImageButton) findViewById(R.id.four);
        b3.setOnClickListener(this);
        b4 = (ImageButton) findViewById(R.id.five);
        b4.setOnClickListener(this);
        b5 = (ImageButton) findViewById(R.id.six);
        b5.setOnClickListener(this);
        b6 = (ImageButton) findViewById(R.id.seven);
        b6.setOnClickListener(this);
        b7 = (ImageButton) findViewById(R.id.eight);
        b7.setOnClickListener(this);

        act = new TextToSpeech(Shapes.this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    act.setLanguage(Locale.ENGLISH);
                    act.speak("learn shapes", TextToSpeech.QUEUE_FLUSH, null);
                }
            }
        });
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_shapes, menu);
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

    @Override

    public void onClick(View arg0)
     {
        switch(arg0.getId()){

            case R.id.one:
                // lay.setBackgroundDrawable(getResources().getDrawable(R.drawable.cat));
              //  mediaPlayer.release();
               // mediaPlayer = MediaPlayer.create(Shapes.this, R.raw.star);
               // String name = "Your name is, " + HomeCharts.nameData.getString(LearningChartsPreferences.CHILD_NAME_STRING, "");
               // String item = R.string.star;
                act.speak("star", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.two:
                // lay.setBackgroundDrawable(getResources().getDrawable(R.drawable.camel));
               // mediaPlayer.release();
               // mediaPlayer = MediaPlayer.create(Shapes.this, R.raw.oval);
               // mediaPlayer.start();
                act.speak("Ellipse", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.three:
                //lay.setBackgroundDrawable(getResources().getDrawable(R.drawable.dog));
               // mediaPlayer.release();
               // mediaPlayer = MediaPlayer.create(Shapes.this, R.raw.heart);
               // mediaPlayer.start();
                act.speak("heart", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.four:
                //lay.setBackgroundDrawable(getResources().getDrawable(R.drawable.duck));
               // mediaPlayer.release();
               // mediaPlayer = MediaPlayer.create(Shapes.this, R.raw.rectangle);
                //mediaPlayer.start();
                act.speak("rectangle", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.five:
                //lay.setBackgroundDrawable(getResources().getDrawable(R.drawable.lion));
               // mediaPlayer.release();
               // mediaPlayer = MediaPlayer.create(Shapes.this, R.raw.trapezium);
               // mediaPlayer.start();
                act.speak("diamond", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.six:
                // lay.setBackgroundDrawable(getResources().getDrawable(R.drawable.chicken));
               // mediaPlayer.release();
               // mediaPlayer = MediaPlayer.create(Shapes.this, R.raw.triangle );
               // mediaPlayer.start();
                act.speak("triangle", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.seven:
                //lay.setBackgroundDrawable(getResources().getDrawable(R.drawable.cow));
                //mediaPlayer.release();
               // mediaPlayer = MediaPlayer.create(Shapes.this, R.raw.square);
               // mediaPlayer.start();
                act.speak("square", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.eight:
                // lay.setBackgroundDrawable(getResources().getDrawable(R.drawable.dog));
                //mediaPlayer.release();
                //mediaPlayer = MediaPlayer.create(Shapes.this, R.raw.para);
               // mediaPlayer.start();
                act.speak("hexagon", TextToSpeech.QUEUE_FLUSH, null);
                break;


        }
    }



}

