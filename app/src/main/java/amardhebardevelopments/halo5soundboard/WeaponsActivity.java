package amardhebardevelopments.halo5soundboard;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;


public class WeaponsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weapons);

        AdView adView = (AdView) findViewById(R.id.adViewWeps);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);

        Button humanWeapons = (Button)findViewById(R.id.humanWeapons);
        humanWeapons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), HumanWeaponsActivity.class);
                startActivity(intent);
            }
        });

        Button covWeapons = (Button) findViewById(R.id.covWeapons);
        covWeapons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), CovenantWeaponsActivity.class);
                startActivity(intent);
            }
        });

        Button promethWeapons = (Button) findViewById(R.id.promethWeapons);
        promethWeapons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), PrometheanWeaponsActivity.class);
                startActivity(intent);
            }
        });
    }
}
