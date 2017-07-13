package amardhebardevelopments.halo5soundboard;

import android.app.ActionBar;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import static android.graphics.Color.BLACK;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        android.support.v7.app.ActionBar bar = getSupportActionBar();
        bar.setBackgroundDrawable(new ColorDrawable(BLACK));
        AdView adView = (AdView) findViewById(R.id.adViewMainPage);
        AdRequest adRequest = new AdRequest.Builder()

                .build();
        adView.loadAd(adRequest);


        Button weapons = (Button) findViewById(R.id.weapons);
        weapons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext() , WeaponsActivity.class);
                startActivity(intent);
            }
        });

        Button medals = (Button) findViewById(R.id.medals);
        medals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), MedalsActivity.class);
                startActivity(intent);
            }
        });

    }
}
