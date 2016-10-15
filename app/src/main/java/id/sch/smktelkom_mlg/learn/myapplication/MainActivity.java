package id.sch.smktelkom_mlg.learn.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etNama;
    Button bOk;
    TextView tvHasil;
    CheckBox Paski,PMR,PA,Medsan;
    RadioButton rblk, rbpr;
    Spinner spKls;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spKls = (Spinner) findViewById(R.id.spinnerkls);

        Paski = (CheckBox) findViewById(R.id.checkBoxPaski);
        PA = (CheckBox) findViewById(R.id.checkBoxPalwaga);
        PMR = (CheckBox) findViewById(R.id.checkBoxPMR);
        Medsan = (CheckBox) findViewById(R.id.checkBoxMedsan);

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
        String sub ="\n";
        int startlen = sub.length();
        if(Paski.isChecked()) sub +=Paski.getText()+"\n";
        if(PA.isChecked()) sub +=PA.getText()+"\n";
        if(PMR.isChecked()) sub +=PMR.getText()+"\n";
        if(Medsan.isChecked()) sub +=Medsan.getText()+"\n";


        String nama = etNama.getText().toString();
        boolean valid = true;

        if(nama.isEmpty())
        {
            etNama.setError("Nama belum diisi");
            valid = false;
        }

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
            tvHasil.setText("nama :\n"+ nama + "\nJenis Kelamin :\n" + hasil + "\nKelas :\n"+ spKls.getSelectedItem().toString()
                    +"\nSub organisasi yang anda pilih :" + sub );
        }
    }

}
