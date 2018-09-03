package app.rstone.com.myapp2;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Context ctx = MainActivity.this;

        findViewById(R.id.plusBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText num1 = findViewById(R.id.num1);
                String sNum1 = num1.getText().toString();
                EditText num2 = findViewById(R.id.num2);
                String sNum2 = num2.getText().toString();
                TextView result = findViewById(R.id.result);
                
                sResult= String.valueOf(Integer.parseInt(sNum1) + Integer.parseInt(sNum2)) ;
                Toast.makeText(ctx, "입력값 : "+sResult, Toast.LENGTH_LONG).show();
            }
        });

        findViewById(R.id.minusBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sNum1 = findViewById(R.id.num1).getText().toString();
                String sNum2 = findViewById(R.id.num2).getText().toString();

                sResult= String.valueOf(Integer.parseInt(sNum1) - Integer.parseInt(sNum2)) ;
                Toast.makeText(ctx, "입력값 : "+sResult, Toast.LENGTH_LONG).show();
            }
        });
    }
}
