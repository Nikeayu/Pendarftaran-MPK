package id.sch.smktelkom_mlg.learn.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etNama;
    Button bOk;
    TextView tvHasil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNama = (EditText) findViewById(R.id.editTextname);
        bOk = (Button) findViewById(R.id.buttonok);
        tvHasil = (TextView) findViewById(R.id.textView3);


        bOk.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nama = etNama.getText().toString();

                tvHasil.setText("nama "+nama );
            }
        });

    }

}
