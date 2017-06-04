package amardhebardevelopments.halo5soundboard;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class HumanWeaponsActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_human_weapons2);
        ImageButton halo2BattleRifle = (ImageButton)(findViewById(R.id.halo2battlerifle));
        ImageButton magnum = (ImageButton) (findViewById(R.id.magnum));
        ImageButton smg = (ImageButton) (findViewById(R.id.smg));

        halo2BattleRifle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(HumanWeaponsActivity2.this, R.raw.H5_Halo2_BR_Fire_FP_1);
                mp.start();
            }
        });

        magnum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(HumanWeaponsActivity2.this, R.raw.H5_Magnum_1);
                mp.start();
            }
        });

        smg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(HumanWeaponsActivity2.this, R.raw.H5_SMG_5);
                mp.start();
            }
        });
    }
}
