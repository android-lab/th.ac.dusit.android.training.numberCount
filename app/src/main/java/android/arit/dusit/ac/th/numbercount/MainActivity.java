package android.arit.dusit.ac.th.numbercount;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public RadioButton radioButton;
    public RadioButton radioButton2;
    public Button button;
    public TextView textView;
    public int n = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioButton = (RadioButton) findViewById(R.id.radioButton);
        radioButton2 = (RadioButton) findViewById(R.id.radioButton2);
        textView = (TextView) findViewById(R.id.textView);
        button = (Button) findViewById(R.id.button);


        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                if(radioButton.isChecked()){

                    textView.setText(""+n);
                    if(n>9){
                        Toast.makeText(getApplicationContext(), "มากไป",
                                Toast.LENGTH_SHORT).show();
                    }else{
                        n++;
                    }
                }
                if(radioButton2.isChecked()){

                    textView.setText(""+n);
                    if(n<-9){
                        Toast.makeText(getApplicationContext(), "น้อยไป",
                                Toast.LENGTH_SHORT).show();
                    }else{
                        n--;
                    }
                }
            }
        });



    }
}
