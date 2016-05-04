package leodevelopments.aboutme2;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    AlertDialog.Builder ad;
    Context context;
    String actionCat1 = "5 апреля 1986г.";
    String actionCat2 = "город Москва";
    String actionCat3 = "компания KupiVip";
    String menuClickText = "Тут должны были быть Настройки, но пока я их не сделал. Соррян :)";
  //  String[] mySkillsList = getResources().getStringArray(R.array.my_skill); <--- Падает второе
  // активити(приложение) при нажатии на imageButton
    String[] mySkillsList = {"Начинающий Android разработчик", "C/AL", "Microsoft Dynamics NAV",
          "Серверы и сети", "Настройка Windows", "Active directory", "Тех.поддержка", "Java"};


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);

        ListView list = (ListView) findViewById(R.id.list);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, mySkillsList);

        assert list != null;
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View itemClicked, int position,
                                    long id) {
                Toast.makeText(getApplicationContext(), ((TextView) itemClicked).getText(),
                        Toast.LENGTH_SHORT).show();
            }
        });

        context = SecondActivity.this;
        String title = "Это моё приложение";
        String message = "Оцените моё приложение";
        String button1String = "Ну норм";
        String button2String = "Слабоватенько";

        ad = new AlertDialog.Builder(context);
        ad.setTitle(title);
        ad.setMessage(message);
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
        switch (id) {
            case R.id.action_cat1:
                assert infoTextView != null;
                infoTextView.setText(actionCat1);
                return true;
            case R.id.action_cat2:
                assert infoTextView != null;
                infoTextView.setText(actionCat2);
                return true;
            case R.id.action_cat3:
                assert infoTextView != null;
                infoTextView.setText(actionCat3);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void onSettingsMenuClick(MenuItem item) {
        TextView infoTextView = (TextView) findViewById(R.id.secondViewTestText);
        assert infoTextView != null;
        infoTextView.setText(menuClickText);
    }
}



