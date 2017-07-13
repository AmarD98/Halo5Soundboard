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

public class HumanWeaponsActivity4 extends AppCompatActivity {

    private MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_human_weapons4);

        AdView adView = (AdView) findViewById(R.id.adViewHumanWep4);
        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice("B9F67AE6EA87F6D9C2361F8CB749E9CC")
                .build();
        adView.loadAd(adRequest);

        ImageButton saw = (ImageButton) (findViewById(R.id.saw));
        ImageButton rocketLauncher = (ImageButton) (findViewById(R.id.rocketlauncher));
        ImageButton sniperRifle = (ImageButton) (findViewById(R.id.sniperrifle));

        saw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mp != null)
                    mp.release();
                mp = MediaPlayer.create(HumanWeaponsActivity4.this, R.raw.h5_saw_3);
                mp.start();
                
            }
        });

        rocketLauncher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mp != null)
                    mp.release();
                mp = MediaPlayer.create(HumanWeaponsActivity4.this, R.raw.h5_r_launcher_2);
                mp.start();
                

            }
        });

        sniperRifle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mp != null)
                    mp.release();
                mp = MediaPlayer.create(HumanWeaponsActivity4.this, R.raw.h5_sniper_1);
                mp.start();
                
            }
        });

        Button page4Left = (Button) findViewById(R.id.page4left);
        page4Left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goLeft = new Intent(view.getContext(), HumanWeaponsActivity3.class);
                startActivity(goLeft);
            }
        });

        Button page4Right = (Button) findViewById(R.id.page4right);
        page4Right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goRight = new Intent(view.getContext(), HumanWeaponsActivity5.class);
                startActivity(goRight);
            }
        });


    }
}