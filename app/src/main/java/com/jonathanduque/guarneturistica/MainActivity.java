package com.jonathanduque.guarneturistica;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
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

        FragmentManager fragmentManager= getFragmentManager();
        FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();

        //noinspection SimplifiableIfStatement
        if (id==R.id.bares_menu){
            Bares2 fragment=new Bares2();
            fragmentTransaction.replace(android.R.id.content, fragment).commit();
        }
        if (id==R.id.autor_menu){
            AboutUs fragment=new AboutUs();
            fragmentTransaction.replace(android.R.id.content,fragment).commit();
        }
        if (id==R.id.hoteles_menu){
            Hoteles2 fragment=new Hoteles2();
            fragmentTransaction.replace(android.R.id.content, fragment).commit();
        }
        if (id==R.id.guarne_menu){
            AboutGuarne fragment=new AboutGuarne();
            fragmentTransaction.replace(android.R.id.content, fragment).commit();
        }
        if (id==R.id.sitios_menu){
            Sitios fragment=new Sitios();
            fragmentTransaction.replace(android.R.id.content, fragment).commit();
        }


        return super.onOptionsItemSelected(item);
    }
}
