package theeradon.cp3406.prac6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;
import android.media.MediaPlayer;
import android.view.View;
import android.widget.ImageView;

import java.io.IOException;

public class ImageScreen extends AppCompatActivity {
    ImageView image;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_screen);
        image = findViewById(R.id.imageView);
        Intent intent = getIntent();
        final String pressedButtonText = intent.getStringExtra("buttonName");
        displayImage(pressedButtonText);

        if (pressedButtonText.toLowerCase().equals("bird")) {
            mediaPlayer = MediaPlayer.create(this, R.raw.animal_birds_singing);
        } else if (pressedButtonText.toLowerCase().equals("cat")) {
            mediaPlayer = MediaPlayer.create(this, R.raw.animal_cat_meow);
        } else if (pressedButtonText.toLowerCase().equals("dog")) {
            mediaPlayer = MediaPlayer.create(this, R.raw.animal_dog_breathing);
        } else if (pressedButtonText.toLowerCase().equals("happydog")) {
            mediaPlayer = MediaPlayer.create(this, R.raw.animal_happy_dog_barks);
        } else if (pressedButtonText.toLowerCase().equals("boy")) {
            mediaPlayer = MediaPlayer.create(this, R.raw.human_boy_saying_hiya);
        } else if (pressedButtonText.toLowerCase().equals("baby_talk")) {
            mediaPlayer = MediaPlayer.create(this, R.raw.human_children_talking);
        } else if (pressedButtonText.toLowerCase().equals("woodpecker")) {
            mediaPlayer = MediaPlayer.create(this, R.raw.nature_forest_with_woodpeckers);
        } else if (pressedButtonText.toLowerCase().equals("keyboard")) {
            mediaPlayer = MediaPlayer.create(this, R.raw.technology_fast_keyboard_typing);
        } else if (pressedButtonText.toLowerCase().equals("clock")) {
            mediaPlayer = MediaPlayer.create(this, R.raw.technology_fast_clock_ticking);
        } else if (pressedButtonText.toLowerCase().equals("wallclock")) {
            mediaPlayer = MediaPlayer.create(this, R.raw.technology_wall_clock);
        } else if (pressedButtonText.toLowerCase().equals("man")) {
            mediaPlayer = MediaPlayer.create(this, R.raw.human_man_yawning);
        } else if (pressedButtonText.toLowerCase().equals("rain")) {
            mediaPlayer = MediaPlayer.create(this, R.raw.nature_forest_rain);
        }


        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });
    }

    private void displayImage(String buttonName) {
        switch (buttonName.toLowerCase()) {
            case "bird":
                image.setImageResource(R.drawable.bird);
                break;
            case "cat":
                image.setImageResource(R.drawable.cat);
                break;
            case "dog":
                image.setImageResource(R.drawable.dog);
                break;
            case "happydog":
                image.setImageResource(R.drawable.happydog);
                break;
            case "boy":
                image.setImageResource(R.drawable.boy);
                break;
            case "baby_talk":
                image.setImageResource(R.drawable.baby_talk);
                break;
            case "woodpecker":
                image.setImageResource(R.drawable.woodpecker);
                break;
            case "keyboard":
                image.setImageResource(R.drawable.keyboard);
                break;
            case "clock":
                image.setImageResource(R.drawable.clock);
                break;
            case "wallclock":
                image.setImageResource(R.drawable.wallclock);
                break;
            case "man":
                image.setImageResource(R.drawable.man);
                break;
            case "rain":
                image.setImageResource(R.drawable.rain);
                break;

        }
    }


}