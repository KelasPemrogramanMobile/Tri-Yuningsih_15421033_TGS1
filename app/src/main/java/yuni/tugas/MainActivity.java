package yuni.tugas;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle b) {
        super.onCreate(b);
        setContentView(R.layout.activity_main);

        TextView txtText;
        final EditText edEditText;
        final Button btnButton;

        txtText = (TextView) findViewById(R.id.txtText);
        edEditText = (EditText) findViewById(R.id.edEdittext);
        btnButton = (Button) findViewById(R.id.btnButton);

        final LinearLayout linear1 = (LinearLayout) findViewById(R.id.linear1);


        Button btnTambahEditText = (Button) findViewById(R.id.btnButton);
        btnTambahEditText.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                LinearLayout.LayoutParams linearParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
                TextView et = new TextView(MainActivity.this);
                et.setText(edEditText.getText());
                et.setLayoutParams(linearParams);
                linear1.addView(et);

                EditText et1=(EditText) findViewById(R.id.edEdittext);
                et1.setText("");}


        });


    }}
