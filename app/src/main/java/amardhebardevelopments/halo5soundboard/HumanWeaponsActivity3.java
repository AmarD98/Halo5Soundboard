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

public class HumanWeaponsActivity3 extends AppCompatActivity {

    private GestureDetectorCompat gestureObject;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_human_weapons3);
        ImageButton halo1Pistol = (ImageButton) (findViewById(R.id.haloonepistol));
        ImageButton railgun = (ImageButton) (findViewById(R.id.railgun));
        ImageButton shotgun = (ImageButton) (findViewById(R.id.shotgun));

        halo1Pistol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(HumanWeaponsActivity3.this, R.raw.h5_ce_pistol_fp_1);
                mp.start();
            }
        });

        railgun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(HumanWeaponsActivity3.this, R.raw.h5_railgun_2);
                mp.start();
            }
        });

        shotgun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(HumanWeaponsActivity3.this, R.raw.h5_shotgun_1);
                mp.start();
            }
        });
        gestureObject = new GestureDetectorCompat(this, new MyGestureDetector3());

    }
    @Override
    public boolean onTouchEvent(MotionEvent event){
        this.gestureObject.onTouchEvent(event);
        return super.onTouchEvent(event);
    }
}


class MyGestureDetector3 extends GestureDetector.SimpleOnGestureListener{


    @Override
    public boolean onFling(MotionEvent event1, MotionEvent event2,
                           float velocityX, float velocityY){

        if(event1.getX() > event2.getX()) //Right to left swipe
        {
            Intent intent = new Intent(new HumanWeaponsActivity3(),
                    HumanWeaponsActivity4.class);
            new HumanWeaponsActivity3().getApplicationContext().startActivity(intent);

        }
        else
        if(event2.getX() > event1.getX())//Left to right swipe
        {
            Intent intent = new Intent(new HumanWeaponsActivity3(),
                    HumanWeaponsActivity2.class);
            new HumanWeaponsActivity3().getApplicationContext().startActivity(intent);

        }


        return true;
    }

}
