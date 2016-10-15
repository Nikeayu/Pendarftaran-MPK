package id.sch.smktelkom_mlg.learn.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etNama;
    Button bOk;
    TextView tvHasil;
    RadioButton rblk, rbpr;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rblk = (RadioButton) findViewById(R.id.rblk);
        rbpr = (RadioButton) findViewById(R.id.rbpr);

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

        findViewById(R.id.buttonok).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doClick();
            }
        });
    }

    private void doClick() {
        String hasil = null;

        if(rblk.isChecked())
        {
            hasil = rblk.getText().toString();
        }

        else if(rbpr.isChecked())
        {
            hasil = rbpr.getText().toString();
        }
        if (hasil==null)
        {
            tvHasil.setText("Belum memilih jenis kelamin");
        }
        else {
            tvHasil.setText("Jenis Kelamin :" + hasil);
        }
    }

}
