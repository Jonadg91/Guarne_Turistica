package com.jonathanduque.guarneturistica;

import android.app.AlertDialog;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class Bares extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bares);
    }
    public void CupulaBar(View view){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("La Cupula Bar Cafe");
        builder.setMessage("Licores nacionales y Productos Varios\n" +
                "\nOfrece la mejor rumba crossover, ubicada en el centro de comercio");
        builder.setPositiveButton("OK",null);
        builder.create();
        builder.show();
    }
    public void BarraBar(View view){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Barra Bar");
        builder.setMessage("Variedad de Licores Nacionales.\n" +
                "\n" +"Barra Bar ofrece un lugar para el disfrute del buen Rock, ubicado en la Zona Rosa");
        builder.setPositiveButton("OK",null);
        builder.create();
        builder.show();
    }
    public void FondaMezcal(View view){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Fonda Mezcal");
        builder.setMessage("Licores nacionales\n" +
                "\n" + "Mezcal ofrece la mejor rumba crossover con artistas de gran nivel, ubicada en la Zona Rosa");
        builder.setPositiveButton("OK",null);
        builder.create();
        builder.show();
    }
    public void GotchaBar(View view){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Licorera Bar Gotcha");
        builder.setMessage("Licores nacionales e importados.\n" +
                "\n" +"GOTCHA ofrece la mejor rumba crossover, ubicada en la Zona Rosa");
        builder.setPositiveButton("OK",null);
        builder.create();
        builder.show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_bares, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
