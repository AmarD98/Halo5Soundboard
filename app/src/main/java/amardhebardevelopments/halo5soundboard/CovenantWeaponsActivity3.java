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

public class CovenantWeaponsActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_covenant_weapons3);

        AdView adView = (AdView) findViewById(R.id.adViewCovenantWep3);
        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice("B9F67AE6EA87F6D9C2361F8CB749E9CC")
                .build();
        adView.loadAd(adRequest);

        ImageButton stormRifle = (ImageButton) findViewById(R.id.stormRifle);
        ImageButton needler = (ImageButton) findViewById(R.id.needler);
        ImageButton brutePlasmaRifle = (ImageButton) findViewById(R.id.brutePlasmaRifle);

        stormRifle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(CovenantWeaponsActivity3.this, R.raw.h5_storm_4);
                mp.start();
            }
        });

        needler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(CovenantWeaponsActivity3.this, R.raw.h5_needler_4);
                mp.start();
            }
        });

        brutePlasmaRifle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(CovenantWeaponsActivity3.this, R.raw.h5_brute_plasma_rifle_4);
                mp.start();
            }
        });

        Button covPage3Left = (Button) findViewById(R.id.covPage3Left);

        covPage3Left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goLeft = new Intent(view.getContext(), CovenantWeaponsActivity2.class);
                startActivity(goLeft);
            }
        });



    }
}
