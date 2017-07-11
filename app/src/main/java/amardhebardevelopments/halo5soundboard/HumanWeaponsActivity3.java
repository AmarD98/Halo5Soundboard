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

        Button page3Right = (Button) findViewById(R.id.page3right);
        Button page3Left = (Button) findViewById(R.id.page3left);

        page3Right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goRight = new Intent(view.getContext(), HumanWeaponsActivity4.class);
                startActivity(goRight);
            }
        });

        page3Left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goLeft = new Intent(view.getContext(), HumanWeaponsActivity2.class);
                startActivity(goLeft);
            }
        });
        AdView adView = (AdView) findViewById(R.id.adView3);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);

    }


}




