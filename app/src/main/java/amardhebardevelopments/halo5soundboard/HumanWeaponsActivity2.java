package amardhebardevelopments.halo5soundboard;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class HumanWeaponsActivity2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_human_weapons2);
        AdView adView = (AdView) findViewById(R.id.adViewHumanWep2);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);


        ImageButton halo2BattleRifle = (ImageButton)(findViewById(R.id.halo2battlerifle));
        ImageButton magnum = (ImageButton) (findViewById(R.id.magnum));
        ImageButton smg = (ImageButton) (findViewById(R.id.smg));

        halo2BattleRifle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(HumanWeaponsActivity2.this, R.raw.h5_halo2_br_fire_fp_1);
                mp.start();
            }
        });

        magnum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(HumanWeaponsActivity2.this, R.raw.h5_magnum_1);
                mp.start();
            }
        });

        smg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(HumanWeaponsActivity2.this, R.raw.h5_smg_5);
                mp.start();
            }
        });

        Button page2Right = (Button) findViewById(R.id.page2right);
        page2Right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goRight = new Intent(view.getContext(), HumanWeaponsActivity3.class);
                startActivity(goRight);
            }
        });
        Button page2Left = (Button) findViewById(R.id.page2left);
        page2Left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goLeft = new Intent(view.getContext(), HumanWeaponsActivity.class);
                startActivity(goLeft);
            }
        });


    }

}


