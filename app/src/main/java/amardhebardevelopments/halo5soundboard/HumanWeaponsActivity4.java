package amardhebardevelopments.halo5soundboard;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class HumanWeaponsActivity4 extends AppCompatActivity {

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
                MediaPlayer mp = MediaPlayer.create(HumanWeaponsActivity4.this, R.raw.H5_Saw_3);
                mp.start();
            }
        });

        rocketLauncher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(HumanWeaponsActivity4.this, R.raw.H5_R_Launcher_2);
                mp.start();
            }
        });

        sniperRifle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(HumanWeaponsActivity4.this, R.raw.H5_Sniper_1);
                mp.start();
            }
        });
    }
}
