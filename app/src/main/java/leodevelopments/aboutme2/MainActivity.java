package leodevelopments.aboutme2;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageButton featuresNew;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton buttonAndroid = (ImageButton) findViewById(R.id.imageButton);
        featuresNew = (ImageButton)findViewById(R.id.secondViewTestText);
        buttonAndroid.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);
            }
        });



        String[] array = this.getResources().getStringArray(R.array.my_skill);
        TextView textView = (TextView)findViewById(R.id.arrayView);

        StringBuilder sBuilder = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            sBuilder.append(array[i] + "\n");
        }

        textView.setText(sBuilder.toString());
    }
}
