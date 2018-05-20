package com.example.user.learnanimals;

import android.app.Activity;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;


public class MainActivity extends Activity implements View.OnClickListener {
    private ImageView LearnNumbers,LearnAnimals;
    MediaPlayer mediaPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       setVolumeControlStream(AudioManager.STREAM_MUSIC);
        mediaPlayer = MediaPlayer.create(this, R.raw.animals);
        mediaPlayer.start();
        LearnNumbers = (ImageView) findViewById(R.id.learn_animals);
        LearnNumbers.setOnClickListener(btnClickListener);

        LearnAnimals = (ImageView) findViewById(R.id.learn_numbers);
        LearnAnimals.setOnClickListener(btnClickListener);

        LearnAnimals = (ImageView) findViewById(R.id.learn_shapes);
        LearnAnimals.setOnClickListener(btnClickListener);




    }
    View.OnClickListener btnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.learn_animals:
                    Intent learnAnimalsIntent;
                    learnAnimalsIntent = new Intent(getApplicationContext(),LearnAnimals.class);
                    startActivity(learnAnimalsIntent);

                    break;
                case R.id.learn_numbers:
                    Intent learnNumbersIntent;
                    learnNumbersIntent = new Intent(getApplicationContext(), LearnNumbers.class);
                    startActivity(learnNumbersIntent);
                    break;
                case R.id.learn_shapes:
                    Intent learnShapesIntent;
                    learnShapesIntent = new Intent(getApplicationContext(), Shapes.class);
                    startActivity(learnShapesIntent);
                    break;


                default:
                    break;
            }
        }
    };






    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
    public void onClick(View v) {

    }
}
