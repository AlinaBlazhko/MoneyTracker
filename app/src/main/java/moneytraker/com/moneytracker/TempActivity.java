package moneytraker.com.moneytracker;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

public class TempActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_activity);

        final TextView add = (TextView) findViewById(R.id.add);

        final EditText name = (EditText) findViewById(R.id.name);
        final EditText price = (EditText) findViewById(R.id.price);

        name.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                String s1 = name.getText().toString();
                String s2 = price.getText().toString();

                if ((s1.equals("")) && (s2.equals(""))) {
                    add.setEnabled(false);
                }
                if ((!s1.equals("")) && (s2.equals(""))) {
                    add.setEnabled(false);
                }
                if ((s1.equals("")) && (!s2.equals(""))) {
                    add.setEnabled(false);
                }
                if ((!s1.equals("")) && (!s2.equals(""))) {
                    add.setEnabled(true);
                }


            }

            @Override
            public void afterTextChanged(Editable s) {

            }

        });

        price.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                String s1 = name.getText().toString();
                String s2 = price.getText().toString();

                if ((s1.equals("")) && (s2.equals(""))) {
                    add.setEnabled(false);
                }
                if ((!s1.equals("")) && (s2.equals(""))) {
                    add.setEnabled(false);
                }
                if ((s1.equals("")) && (!s2.equals(""))) {
                    add.setEnabled(false);
                }
                if ((!s1.equals("")) && (!s2.equals(""))) {
                    add.setEnabled(true);
                }


            }

            @Override
            public void afterTextChanged(Editable s) {

            }

        });
    }
}
