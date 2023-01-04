package theeradon.cp3406.prac6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonClicked(View view) {
        Intent intent = new Intent(this, ImageScreen.class);
        int buttonId = view.getId();
        Button button = findViewById(buttonId);
        String buttonText = (String) button.getText();
        intent.putExtra("buttonName", buttonText);

        startActivity(intent);
    }
}