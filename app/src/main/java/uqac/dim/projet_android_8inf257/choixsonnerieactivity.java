package uqac.dim.projet_android_8inf257;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class choixsonnerieactivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choixsonnerie);
    }
    public void choixsonnerie(View creeralarme) {
        Intent intent = new Intent(choixsonnerieactivity.this, choixsonnerieactivity.class);
        startActivity(intent);
    }

    public void alarme(View activity_main) {
        Intent intent = new Intent(choixsonnerieactivity.this, MainActivity.class);
        startActivity(intent);
    }
    public void parametre(View parametre) {
        Intent intent = new Intent(choixsonnerieactivity.this, parametre.class);
        startActivity(intent);
    }

}