package com.example.user.learnanimals;

import android.app.Activity;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;

import java.util.Locale;

public class LearnAnimals extends Activity implements View.OnClickListener {
    Button but1, but2,but3,but4,but5,but6,but7,but8,but9,but10,but11,but12,but13,but14,but15,but16,but17,but18,but19,but20,but21,but22,but23,but24;






    public TextToSpeech act;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_animals);
        but1 = (Button) findViewById(R.id.but1);
        but1.setOnClickListener(this);
        but2 = (Button) findViewById(R.id.but2);
        but2.setOnClickListener(this);
        but3 = (Button) findViewById(R.id.but3);
        but3.setOnClickListener(this);
        but4 = (Button) findViewById(R.id.but4);
        but4.setOnClickListener(this);
        but5 = (Button) findViewById(R.id.but5);
        but5.setOnClickListener(this);
        but6 = (Button) findViewById(R.id.but6);
        but6.setOnClickListener(this);
        but7 = (Button) findViewById(R.id.but7);
        but7.setOnClickListener(this);
        but8 = (Button) findViewById(R.id.but8);
        but8.setOnClickListener(this);
        but9 = (Button) findViewById(R.id.but9);
        but9.setOnClickListener(this);
        but10 = (Button) findViewById(R.id.but10);
        but10.setOnClickListener(this);
        but11 = (Button) findViewById(R.id.but11);
        but11.setOnClickListener(this);
        but12 = (Button) findViewById(R.id.but12);
        but12.setOnClickListener(this);
        but13 = (Button) findViewById(R.id.but13);
        but13.setOnClickListener(this);
        but14 = (Button) findViewById(R.id.but14);
        but14.setOnClickListener(this);
        but15 = (Button) findViewById(R.id.but15);
        but15.setOnClickListener(this);
        but16 = (Button) findViewById(R.id.but16);
        but16.setOnClickListener(this);
        but17 = (Button) findViewById(R.id.but17);
        but17.setOnClickListener(this);
        but18 = (Button) findViewById(R.id.but18);
        but18.setOnClickListener(this);
        but19 = (Button) findViewById(R.id.but19);
        but19.setOnClickListener(this);
        but20 = (Button) findViewById(R.id.but20);
        but20.setOnClickListener(this);
        but21 = (Button) findViewById(R.id.but21);
        but21.setOnClickListener(this);
        but22 = (Button) findViewById(R.id.but22);
        but22.setOnClickListener(this);
        but23 = (Button) findViewById(R.id.but23);
        but23.setOnClickListener(this);
        but24 = (Button) findViewById(R.id.but24);
        but24.setOnClickListener(this);
        act = new TextToSpeech(LearnAnimals.this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    act.setLanguage(Locale.ENGLISH);
                 act.speak("learn about animals", TextToSpeech.QUEUE_FLUSH, null);
                }
            }
        });
    }





    @Override
    public void onClick(View arg0) {

        switch (arg0.getId()) {

            case R.id.but1:

                act.speak("cat", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.but2:

                act.speak("chicken", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.but3:

                act.speak("cow", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.but4:

                act.speak("dog", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.but5:

                act.speak("duck", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.but6:

                act.speak("elephant", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.but7:

                act.speak("flamingo", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.but8:

                act.speak("giraffe", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.but9:

                act.speak("goat", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.but10:

                act.speak("gorilla", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.but11:

                act.speak("donkey", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.but12:

                act.speak("monkey", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.but13:

                act.speak("horse", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.but14:

                act.speak("ostrich", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.but15:

                act.speak("panda", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.but16:

                act.speak("pig", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.but17:

                act.speak("sheep", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.but18:

                act.speak("antelope", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.but19:

                act.speak("mouse", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.but20:

                act.speak("tiger", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.but21:

                act.speak("kangaroo", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.but22:

                act.speak("dolphin", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.but23:
               ;
                act.speak("lion", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.but24:

                act.speak("rhinoceros", TextToSpeech.QUEUE_FLUSH, null);
                break;



        }
    }




}
