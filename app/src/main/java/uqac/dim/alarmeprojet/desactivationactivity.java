package uqac.dim.alarmeprojet;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class desactivationactivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.desactivation);
    }
    public void desactivation(View creeralarme) {
        Intent intent = new Intent(desactivationactivity.this, choixsonnerieactivity.class);
        startActivity(intent);
    }
    public void alarme(View activity_main) {
        Intent intent = new Intent(desactivationactivity.this, MainActivity.class);
        startActivity(intent);
    }
    public void parametre(View parametre) {
        Intent intent = new Intent(desactivationactivity.this, parametre.class);
        startActivity(intent);
    }

}