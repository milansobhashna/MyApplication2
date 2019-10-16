package com.example.myapplication;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.tb1);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = findViewById(R.id.dl1);
        NavigationView navigationView = findViewById(R.id.nv1);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem menuItem)
    {
        int id = menuItem.getItemId();
        if (id == R.id.a) {
            Intent intent=new Intent(this,Main2Activity.class);
            startActivity(intent);
        }
        DrawerLayout drawer = findViewById(R.id.dl1);
        drawer.closeDrawer(GravityCompat.START);
        return true;

    }
}