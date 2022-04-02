package uqac.dim.projet_android_8inf257;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.concurrent.TimeUnit;

public class LoadingScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        waitSomeSeconds(10);

    }


    private void waitSomeSeconds(int i){
        try {
            TimeUnit.SECONDS.sleep(i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}