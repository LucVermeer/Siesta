package vermeer.luc.siesta;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);


        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.action_timer:
                        Intent timerIntent = new Intent(SettingsActivity.this, MainActivity.class);
                        startActivity(timerIntent);
                        break;
                    case R.id.action_achievements:
                        Intent achievementIntent = new Intent(SettingsActivity.this, AchievementsActivity.class);
                        startActivity(achievementIntent);
                        break;
                    case R.id.action_statistics:
                        Intent statisticsIntent = new Intent(SettingsActivity.this, StatisticsActivity.class);
                        startActivity(statisticsIntent);
                        break;
                    case R.id.action_settings:
                        break;
                }
                return true;
            }
        });
    }
}
