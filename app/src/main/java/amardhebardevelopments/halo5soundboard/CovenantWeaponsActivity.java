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

public class CovenantWeaponsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_covenant_weapons);

        AdView adView = (AdView) findViewById(R.id.adViewCovenantWep1);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);

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

        Button covPage1Right = (Button) findViewById(R.id.covPage1Right);
        covPage1Right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goRight = new Intent(view.getContext(), CovenantWeaponsActivity2.class);
                startActivity(goRight);
            }
        });

        Button covPage1Left = (Button) findViewById(R.id.covPage1Left);
        covPage1Left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goLeft = new Intent(view.getContext(), WeaponsActivity.class);
                startActivity(goLeft);
            }
        });
    }
}
