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

public class CovenantWeaponsActivity2 extends AppCompatActivity {

    private MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_covenant_weapons2);

        AdView adView = (AdView) findViewById(R.id.adViewCovenantWep2);
        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice("B9F67AE6EA87F6D9C2361F8CB749E9CC")
                .build();
        adView.loadAd(adRequest);

        ImageButton plasmaCaster = (ImageButton) findViewById(R.id.plasmaCaster);
        ImageButton plasmaPistol = (ImageButton) findViewById(R.id.plasmaPistol);
        ImageButton fuelRodCannon = (ImageButton) findViewById(R.id.fuelRod);

        plasmaCaster.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mp != null)
                    mp.release();
                mp = MediaPlayer.create(CovenantWeaponsActivity2.this, R.raw.h5_p_caster_reg_2);
                mp.start();
                
            }
        });

        plasmaPistol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mp != null)
                    mp.release();
                mp = MediaPlayer.create(CovenantWeaponsActivity2.this, R.raw.h5_p_pistol_reg_1);
                mp.start();
                
            }
        });

        fuelRodCannon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mp != null)
                    mp.release();
                mp = MediaPlayer.create(CovenantWeaponsActivity2.this, R.raw.h5_fuel_rod_2);
                mp.start();
                
            }
        });

        Button covPage2Right = (Button) findViewById(R.id.covPage2Right);
        Button covPage2Left = (Button) findViewById(R.id.covPage2Left);

        covPage2Left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goLeft = new Intent(view.getContext(), CovenantWeaponsActivity.class);
                startActivity(goLeft);
            }
        });

        covPage2Right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goRight = new Intent(view.getContext(), CovenantWeaponsActivity3.class);
                startActivity(goRight);
            }
        });

    }
}
