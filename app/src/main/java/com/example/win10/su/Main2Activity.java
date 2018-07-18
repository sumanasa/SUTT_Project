package com.example.win10.su;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;


public class Main2Activity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private DrawerLayout DrLt;
    private ActionBarDrawerToggle mToggle;

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {

            case R.id.mediaplayernavigator:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new MPFragment()).commit();
                break;
            case R.id.contactsnavigator:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new ContactsFragment()).commit();
                break;
            case R.id.coffeenav:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new cofshopfragment()).commit();
                break;
            case R.id.homenavigator:
                Intent Intent = new Intent(this, MainActivity.class);
                startActivity(Intent);
                break;
        }
        DrLt.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        DrLt = (DrawerLayout) findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        mToggle = new ActionBarDrawerToggle(this, DrLt, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        DrLt.addDrawerListener(mToggle);
        mToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (mToggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}

