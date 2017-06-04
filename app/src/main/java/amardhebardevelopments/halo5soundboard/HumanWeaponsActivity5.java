package amardhebardevelopments.halo5soundboard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;

public class HumanWeaponsActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_human_weapons5);
        ImageButton spartanLaser = (ImageButton) (findViewById(R.id.spartanlaser));
        ImageButton chaingunTurret = (ImageButton) (findViewById(R.id.chaingunturret));
        ImageButton rocketpodLauncher = (ImageButton) (findViewById(R.id.rocketpodlauncher));

        spartanLaser.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return false;
            }

        });

        chaingunTurret.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return false;
            }

        });

        rocketpodLauncher.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return false;
            }

        });
    }
}
