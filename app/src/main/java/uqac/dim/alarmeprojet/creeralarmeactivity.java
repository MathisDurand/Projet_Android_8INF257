package uqac.dim.alarmeprojet;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class creeralarmeactivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.creeralarme);
    }
    public void creeralarme(View activity_main) {
        Intent intent = new Intent(creeralarmeactivity.this, creeralarmeactivity.class);
        startActivity(intent);
    }
    public void alarme(View activity_main) {
        Intent intent = new Intent(creeralarmeactivity.this, MainActivity.class);
        startActivity(intent);
    }
    public void parametre(View parametre) {
        Intent intent = new Intent(creeralarmeactivity.this, parametre.class);
        startActivity(intent);
    }
    public void choixsonnerie(View choixsonnerie) {
        Intent intent = new Intent(creeralarmeactivity.this, choixsonnerieactivity.class);
        startActivity(intent);
    }
    public void desactivation(View desactivation) {
        Intent intent = new Intent(creeralarmeactivity.this, desactivationactivity.class);
        startActivity(intent);
    }

}