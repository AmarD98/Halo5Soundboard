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

public class HumanWeaponsActivity5 extends AppCompatActivity {

    private GestureDetectorCompat gestureObject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_human_weapons5);
        ImageButton spartanLaser = (ImageButton) (findViewById(R.id.spartanlaser));
        ImageButton chaingunTurret = (ImageButton) (findViewById(R.id.chaingunturret));
        ImageButton rocketpodLauncher = (ImageButton) (findViewById(R.id.rocketpodlauncher));

        spartanLaser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(HumanWeaponsActivity5.this, R.raw.h5_laser_1);
                mp.start();
            }
        });

        chaingunTurret.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(HumanWeaponsActivity5.this, R.raw.h5_turret_human_7);
                mp.start();
            }
        });

        rocketpodLauncher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(HumanWeaponsActivity5.this, R.raw.h5_saw_3);
                mp.start();
            }
        });
        gestureObject = new GestureDetectorCompat(this, new MyGestureDetector5());

    }
    @Override
    public boolean onTouchEvent(MotionEvent event){
        this.gestureObject.onTouchEvent(event);
        return super.onTouchEvent(event);
    }
}


class MyGestureDetector5 extends GestureDetector.SimpleOnGestureListener{


    @Override
    public boolean onFling(MotionEvent event1, MotionEvent event2,
                           float velocityX, float velocityY){

        if(event1.getX() > event2.getX()) //Right to left swipe
        {

        }
        else
        if(event2.getX() > event1.getX())//Left to right swipe
        {
            Intent intent = new Intent(new HumanWeaponsActivity5(),
                    HumanWeaponsActivity4.class);
            new HumanWeaponsActivity5().getApplicationContext().startActivity(intent);

        }


        return true;
    }

}
