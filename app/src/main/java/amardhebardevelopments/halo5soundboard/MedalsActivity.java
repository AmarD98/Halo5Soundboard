package amardhebardevelopments.halo5soundboard;

import android.app.ActionBar;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import static android.graphics.Color.BLACK;

public class MedalsActivity extends AppCompatActivity {

    private MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medals);
        android.support.v7.app.ActionBar bar = getSupportActionBar();
        bar.setBackgroundDrawable(new ColorDrawable(BLACK));
        AdView adView = (AdView) findViewById(R.id.adViewMedalsPage1);
        AdRequest adRequest = new AdRequest.Builder()

                .build();
        adView.loadAd(adRequest);

        ImageButton doubleKill = (ImageButton) findViewById(R.id.doubleKill);
        ImageButton tripleKill = (ImageButton) findViewById(R.id.tripleKill);
        ImageButton overKill = (ImageButton) findViewById(R.id.overkill);
        ImageButton killtacular = (ImageButton) findViewById(R.id.killtacular);
        ImageButton killtrocity = (ImageButton) findViewById(R.id.killtrocity);
        ImageButton killimanjaro = (ImageButton) findViewById(R.id.killimanjaro);
        ImageButton killtastrophe = (ImageButton) findViewById(R.id.killtastrophe);
        ImageButton killpocalypse = (ImageButton) findViewById(R.id.killpocalypse);
        ImageButton killionaire = (ImageButton) findViewById(R.id.killionaire);

        doubleKill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mp != null)
                    mp.release();
                mp = MediaPlayer.create(MedalsActivity.this,  R.raw.doublekill);
                mp.start();
                
            }
        });

        tripleKill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mp != null)
                    mp.release();
                mp = MediaPlayer.create(MedalsActivity.this,  R.raw.triplekill);
                mp.start();
                
            }
        });

        overKill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mp != null)
                    mp.release();
                mp = MediaPlayer.create(MedalsActivity.this,  R.raw.overkill);
                mp.start();
                
            }
        });

        killtacular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mp != null)
                    mp.release();
                mp = MediaPlayer.create(MedalsActivity.this,  R.raw.killtacular);
                mp.start();
                
            }
        });

        killtrocity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mp != null)
                    mp.release();
                mp = MediaPlayer.create(MedalsActivity.this,  R.raw.killtrocity);
                mp.start();
            }
        });

        killimanjaro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mp != null)
                    mp.release();
                mp = MediaPlayer.create(MedalsActivity.this,  R.raw.killimanjaro);
                mp.start();
            }
        });

        killtastrophe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mp != null)
                    mp.release();
                mp = MediaPlayer.create(MedalsActivity.this,  R.raw.killtastrophe);
                mp.start();
            }
        });

        killpocalypse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mp != null)
                    mp.release();
                mp = MediaPlayer.create(MedalsActivity.this,  R.raw.killpocalypse);
                mp.start();
            }
        });

        killionaire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mp != null)
                    mp.release();
                mp = MediaPlayer.create(MedalsActivity.this,  R.raw.killionaire);
                mp.start();
            }
        });


    }
}
