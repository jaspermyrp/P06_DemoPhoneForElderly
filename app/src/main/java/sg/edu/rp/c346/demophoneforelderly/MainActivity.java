package sg.edu.rp.c346.demophoneforelderly;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2, btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.buttonCallSon);
        btn2 = findViewById(R.id.buttonCallDaughter);
        btn3 = findViewById(R.id.button3);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentCall = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+92240336));
                startActivity(intentCall);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentCall = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+89675543));
                startActivity(intentCall);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent. ACTION_VIEW, Uri.parse("http://www.amazon.com"));
                startActivity(intent);

            }
        });




    }
}
