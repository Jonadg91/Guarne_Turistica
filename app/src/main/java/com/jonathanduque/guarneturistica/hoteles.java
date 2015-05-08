package com.jonathanduque.guarneturistica;

import android.app.AlertDialog;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class hoteles extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoteles);
    }
    public void HotelSantamaria(View view){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Hotel Santa Maria");
        builder.setMessage("Restaurante, Habilitado Acceso a Wifi, Baño Privado con ducha, Dirección: calle 52 #52b 203");
        builder.setPositiveButton("OK",null);
        builder.create();
        builder.show();
    }
    public void HotelLaCastellana(View view){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Hotel La Castellana");
        builder.setMessage("Habitaciones Economicas, Dirección: Calle 52 # 52-14");
        builder.setPositiveButton("OK",null);
        builder.create();
        builder.show();
    }
    public void HotelElCacique(View view){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Hotel El Cacique ");
        builder.setMessage("Ubicado en el Parque Principal");
        builder.setPositiveButton("OK",null);
        builder.create();
        builder.show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_aboutus, menu);
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
