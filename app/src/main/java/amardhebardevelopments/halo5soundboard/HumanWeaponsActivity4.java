package amardhebardevelopments.halo5soundboard;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;

public class HumanWeaponsActivity4 extends AppCompatActivity {

    private GestureDetectorCompat gestureObject;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_human_weapons4);
        ImageButton saw = (ImageButton) (findViewById(R.id.saw));
        ImageButton rocketLauncher = (ImageButton) (findViewById(R.id.rocketlauncher));
        ImageButton sniperRifle = (ImageButton) (findViewById(R.id.sniperrifle));

        saw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(HumanWeaponsActivity4.this, R.raw.h5_saw_3);
                mp.start();
            }
        });

        rocketLauncher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(HumanWeaponsActivity4.this, R.raw.h5_r_launcher_2);
                mp.start();
            }
        });

        sniperRifle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(HumanWeaponsActivity4.this, R.raw.h5_sniper_1);
                mp.start();
            }
        });

        gestureObject = new GestureDetectorCompat(this, new MyGestureDetector4());

    }
    @Override
    public boolean onTouchEvent(MotionEvent event){
        this.gestureObject.onTouchEvent(event);
        return super.onTouchEvent(event);
    }
}


class MyGestureDetector4 extends GestureDetector.SimpleOnGestureListener{


    @Override
    public boolean onFling(MotionEvent event1, MotionEvent event2,
                           float velocityX, float velocityY){

        if(event1.getX() > event2.getX()) //Right to left swipe
        {
            Intent intent = new Intent(new HumanWeaponsActivity4(),
                    HumanWeaponsActivity5.class);
            new HumanWeaponsActivity4().getApplicationContext().startActivity(intent);

        }
        else
        if(event2.getX() > event1.getX())//Left to right swipe
        {
            Intent intent = new Intent(new HumanWeaponsActivity4(),
                    HumanWeaponsActivity3.class);
            new HumanWeaponsActivity4().getApplicationContext().startActivity(intent);

        }

        return true;
    }

}
