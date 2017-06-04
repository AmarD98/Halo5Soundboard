package amardhebardevelopments.halo5soundboard;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class HumanWeaponsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_human_weapon);
        ImageButton assaultRifle = (ImageButton) findViewById(R.id.assaultrifle);
        ImageButton battleRifle = (ImageButton) (findViewById(R.id.battlerifle));
        ImageButton dmr = (ImageButton) (findViewById(R.id.dmr));

        assaultRifle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(HumanWeaponsActivity.this, R.raw.H5_AR_3);
                mp.start();
            }
        });

        battleRifle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(HumanWeaponsActivity.this, R.raw.H5_BR_1);
                mp.start();
            }
        });

        dmr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(HumanWeaponsActivity.this, R.raw.H5_DMR_2);
                mp.start();
            }
        });


    }
}
