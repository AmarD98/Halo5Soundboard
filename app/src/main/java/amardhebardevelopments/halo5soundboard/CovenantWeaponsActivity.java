package amardhebardevelopments.halo5soundboard;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class CovenantWeaponsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_covenant_weapons);
        ImageButton carbine = (ImageButton) findViewById(R.id.carbine);
        ImageButton beamRifle = (ImageButton) findViewById(R.id.beamrifle);
        ImageButton energySword = (ImageButton) findViewById(R.id.energysword);

        carbine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(CovenantWeaponsActivity.this, R.raw.h5_carbine_3);
                mp.start();
            }
        });

        beamRifle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(CovenantWeaponsActivity.this, R.raw.h5_beam_1);
                mp.start();
            }
        });

        energySword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(CovenantWeaponsActivity.this, R.raw.h5_e_sword_swing_object_impact_3);
                mp.start();
            }
        });
    }
}
