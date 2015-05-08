package com.jonathanduque.guarneturistica;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void OpenBar(View view){
            Intent t = new Intent(this,Bares.class);
            startActivity(t);
    }
    public void OpenHoteles(View view){
        Intent t = new Intent(this,hoteles.class);
        startActivity(t);
    }
    public void OpenSitios(View view){
        Intent t = new Intent(this,Sitios.class);
        startActivity(t);
    }
    public void OpenAcercaGuarne(View view){
        Intent t = new Intent(this,AboutGuarne.class);
        startActivity(t);
    }
    public void OpenAcercaAutor(View view){
        Intent t = new Intent(this,AboutUs.class);
        startActivity(t);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
