package amardhebardevelopments.halo5soundboard;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class HumanWeaponsActivity3 extends AppCompatActivity {


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




    }


}




