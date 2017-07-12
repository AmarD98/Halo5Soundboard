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


public class PrometheanWeaponsActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_promethean_weapons2);

        AdView adView = (AdView) findViewById(R.id.adViewPrometheanWeps2);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);

        
        ImageButton boltshot = (ImageButton) (findViewById(R.id.boltshot));
        ImageButton binaryRifle = (ImageButton) (findViewById(R.id.binaryRifle));
        ImageButton incinerationCannon = (ImageButton) (findViewById(R.id.incinerationCannon));

        boltshot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(PrometheanWeaponsActivity2.this, R.raw.h5_boltshot_1);
                mp.start();
            }
        });

        binaryRifle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(PrometheanWeaponsActivity2.this, R.raw.h5_binary_1);
                mp.start();
            }
        });

        incinerationCannon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(PrometheanWeaponsActivity2.this, R.raw.h5_ic_alt_1);
                mp.start();
            }
        });

        Button prometh2Left = (Button) findViewById(R.id.promethPage2Left);
        prometh2Left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goLeft = new Intent(view.getContext(), PrometheanWeaponsActivity.class);
                startActivity(goLeft);
            }
        });


    }


}

