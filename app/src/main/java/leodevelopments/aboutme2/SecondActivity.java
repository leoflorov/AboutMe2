package leodevelopments.aboutme2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        TextView infoTextView = (TextView) findViewById(R.id.secondViewTestText);
        switch(id) {
            case R.id.action_cat1:
                infoTextView.setText("5 апреля 1986г.");
                return true;
            case R.id.action_cat2:
                infoTextView.setText("город Москва");
                return true;
            case R.id.action_cat3:
                infoTextView.setText("компания KupiVip");
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }

    public void onSettingsMenuClick(MenuItem item) {
        TextView infoTextView = (TextView) findViewById(R.id.secondViewTestText);
        infoTextView.setText("Вы нажали настройки, но лучше бы нажали что-то другое ;)");
    }
}


