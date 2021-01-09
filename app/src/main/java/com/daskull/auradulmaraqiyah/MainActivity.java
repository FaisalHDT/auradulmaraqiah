package com.daskull.auradulmaraqiyah;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import com.daskull.auradulmaraqiyah.Fragment.DoaFragment;
import com.daskull.auradulmaraqiyah.Fragment.FragmentSejarah;
import com.daskull.auradulmaraqiyah.Fragment.HomeFragment;
import com.daskull.auradulmaraqiyah.Fragment.RadioFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView = findViewById(R.id.bottom_navigation);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle("");

        //view
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            Fragment fragment =null;
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                /*

                 */
                if (item.getItemId()==R.id.home)
                    fragment=new HomeFragment();
                else if (item.getItemId()== R.id.doa)
                    fragment =new DoaFragment();
                else if (item.getItemId()== R.id.radio)
                    fragment =new RadioFragment();
                return loadFragment(fragment);
            }
        });

        bottomNavigationView.setSelectedItemId(R.id.home);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.toolbar_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        return super.onOptionsItemSelected(item);
    }

    private boolean loadFragment(Fragment fragment) {
        if (fragment!=null){

            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,fragment)
                    .commit();
            return true;
        }
        return false;

    }
}
