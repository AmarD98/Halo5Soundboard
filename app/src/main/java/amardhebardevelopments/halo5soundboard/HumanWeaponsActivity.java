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

public class HumanWeaponsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_human_weapon);


        AdView adView = (AdView) findViewById(R.id.adViewHumanWep1);
        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice("B9F67AE6EA87F6D9C2361F8CB749E9CC")
                .build();
        adView.loadAd(adRequest);


        ImageButton assaultRifle = (ImageButton) findViewById(R.id.assaultrifle);
        ImageButton battleRifle = (ImageButton) (findViewById(R.id.battlerifle));
        ImageButton dmr = (ImageButton) (findViewById(R.id.dmr));

        assaultRifle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(HumanWeaponsActivity.this, R.raw.h5_ar_3);
                mp.start();
            }
        });

        battleRifle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(HumanWeaponsActivity.this, R.raw.h5_br_1);
                mp.start();
            }
        });

        dmr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(HumanWeaponsActivity.this, R.raw.h5_dmr_2);
                mp.start();
            }
        });

        Button left = (Button) findViewById(R.id.page1left);
        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), WeaponsActivity.class);
                startActivity(intent);
            }
        });

        Button right = (Button)findViewById(R.id.page1right);
        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), HumanWeaponsActivity2.class);
                startActivity(intent);
            }
        });


    }


}
