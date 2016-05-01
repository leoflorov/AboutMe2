package leodevelopments.aboutme2;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;


public class SecondActivity extends AppCompatActivity {

    AlertDialog.Builder ad;
    Context context;
    String actionCat1 = "5 апреля 1986г.";
    String actionCat2 = "город Москва";
    String actionCat3 = "компания KupiVip";
    String menuClickText = "Тут должны были быть Настройки, но пока я их не сделал. Соррян :)";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);

        context = SecondActivity.this;
        String title = "Это моё приложение";
        String message = "Оцените моё приложение";
        String button1String = "Ну норм";
        String button2String = "Слабоватенько";

        ad = new AlertDialog.Builder(context);
        ad.setTitle(title);  // заголовок
        ad.setMessage(message); // сообщение
        ad.setPositiveButton(button1String, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int arg1) {
                Toast.makeText(context, "Спасибо на добром слове, оно будет ещё лучше",
                        Toast.LENGTH_LONG).show();
            }
        });
        ad.setNegativeButton(button2String, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int arg1) {
                Toast.makeText(context, "Я сделаю это приложение клёвым!", Toast.LENGTH_LONG)
                        .show();
            }
        });
        ad.setCancelable(true);
        ad.setOnCancelListener(new DialogInterface.OnCancelListener() {
            public void onCancel(DialogInterface dialog) {
                Toast.makeText(context, "Да, Нет, Отмена?",
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
                infoTextView.setText(actionCat1);
                return true;
            case R.id.action_cat2:
                infoTextView.setText(actionCat2);
                return true;
            case R.id.action_cat3:
                infoTextView.setText(actionCat3);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    public void onSettingsMenuClick(MenuItem item) {
        TextView infoTextView = (TextView) findViewById(R.id.secondViewTestText);
        infoTextView.setText(menuClickText);
    }
}


