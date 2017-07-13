package amardhebardevelopments.halo5soundboard;

import android.app.ActionBar;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import static android.graphics.Color.BLACK;

public class PrometheanWeaponsActivity extends AppCompatActivity {

    private MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_promethean_weapons);
        android.support.v7.app.ActionBar bar = getSupportActionBar();
        bar.setBackgroundDrawable(new ColorDrawable(BLACK));
        AdView adView = (AdView) findViewById(R.id.adViewPrometheanWeps1);
        AdRequest adRequest = new AdRequest.Builder()

                .build();

        adView.loadAd(adRequest);

        ImageButton lightRifle = (ImageButton) (findViewById(R.id.lightRifle));
        ImageButton scattershot = (ImageButton) (findViewById(R.id.scattershot));
        ImageButton suppressor = (ImageButton) (findViewById(R.id.suppressor));

        lightRifle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mp != null)
                    mp.release();
                mp = MediaPlayer.create(PrometheanWeaponsActivity.this, R.raw.h5_light_reg_1);
                mp.start();
                
            }
        });

        scattershot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mp != null)
                    mp.release();
                mp = MediaPlayer.create(PrometheanWeaponsActivity.this, R.raw.h5_scattershot_3);
                mp.start();
                
            }
        });

        suppressor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mp != null)
                    mp.release();
                mp = MediaPlayer.create(PrometheanWeaponsActivity.this, R.raw.h5_suppressor_6);
                mp.start();
                
            }
        });

        Button prometh1Left = (Button) findViewById(R.id.promethPage1Left);
        prometh1Left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goLeft = new Intent(view.getContext(), WeaponsActivity.class);
                startActivity(goLeft);
            }
        });

        Button prometh1Right = (Button) findViewById(R.id.promethPage1Right);
        prometh1Right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goRight = new Intent(view.getContext(), PrometheanWeaponsActivity2.class);
                startActivity(goRight);
            }
        });

    }
}
