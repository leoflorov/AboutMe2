package leodevelopments.aboutme2;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class SecondActivity extends AppCompatActivity {

    AlertDialog.Builder ad;
    Context context;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);

        context = SecondActivity.this;
        String title = "Выбор есть всегда";
        String message = "Выбери пищу";
        String button1String = "Вкусная пища";
        String button2String = "Здоровая пища";

        ad = new AlertDialog.Builder(context);
        ad.setTitle(title);  // заголовок
        ad.setMessage(message); // сообщение
        ad.setPositiveButton(button1String, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int arg1) {
                Toast.makeText(context, "Вы сделали правильный выбор",
                        Toast.LENGTH_LONG).show();
            }
        });
        ad.setNegativeButton(button2String, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int arg1) {
                Toast.makeText(context, "Возможно вы правы", Toast.LENGTH_LONG)
                        .show();
            }
        });
        ad.setCancelable(true);
        ad.setOnCancelListener(new DialogInterface.OnCancelListener() {
            public void onCancel(DialogInterface dialog) {
                Toast.makeText(context, "Вы ничего не выбрали",
                        Toast.LENGTH_LONG).show();
            }
        });
    }

    public void onClick(View v) {
        ad.show();
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


