package amardhebardevelopments.halo5soundboard;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class HumanWeaponsActivity5 extends AppCompatActivity {


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

        Button page5Left = (Button) findViewById(R.id.page5left);
        page5Left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goLeft = new Intent(view.getContext(), HumanWeaponsActivity4.class);
                startActivity(goLeft);
            }
        });


    }

}


