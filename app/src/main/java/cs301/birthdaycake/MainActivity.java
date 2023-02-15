package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.util.Log;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);


        CakeView my_id = findViewById(R.id.cakeview); // Checkpoint 7
        CakeController cakeController = new CakeController(my_id); // Checkpoint 8


        Button blowOutButton = (Button) findViewById(R.id.BlowOut); // Reference
        blowOutButton.setOnClickListener(cakeController); // 2b

        CompoundButton switchButton = (CompoundButton) findViewById(R.id.Candles); // Creating new reference
        switchButton.setOnCheckedChangeListener(cakeController); // 2b again for checkpoint 3

        SeekBar mySeekBar = (SeekBar) findViewById(R.id.seekBar3); // Creating new reference
        mySeekBar.setOnSeekBarChangeListener(cakeController); // 2b again for checkpoint 3

    }

    public void goodbye(View button)
    {
        Log.i("button", "goodbye\n");
    }

}

