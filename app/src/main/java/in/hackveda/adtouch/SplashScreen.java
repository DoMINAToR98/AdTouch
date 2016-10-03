package in.hackveda.adtouch;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SplashScreen extends AppCompatActivity {
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        tv1=(TextView)findViewById(R.id.textView);
        Typeface mycustomfont=Typeface.createFromAsset(getAssets(),"caviar.ttf");
        tv1.setTypeface(mycustomfont);
        Thread thread=new Thread(){
            @Override
            public void run() {
                try {
                    sleep(5000);
                    Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(intent);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        thread.start();
    }
}
