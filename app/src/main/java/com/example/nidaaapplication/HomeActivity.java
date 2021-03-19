package com.example.nidaaapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.example.nidaaapplication.ui.history.HistoryFragment;
import com.example.nidaaapplication.ui.home.HomeFragment;
import com.example.nidaaapplication.ui.medicalhistory.MedicalHistoryFragment;
import com.example.nidaaapplication.ui.myprofile.MyProfileFragment;
import com.example.nidaaapplication.ui.notifications.NotificationsFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomeActivity extends AppCompatActivity {

    private BottomNavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        initUI();
        switchFragments(new HomeFragment());
    }

    private void initUI(){
        navigationView = findViewById(R.id.nav_menu);
        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                switch (menuItem.getItemId()){
                    case R.id.navigation_notifications:
                        switchFragments(new NotificationsFragment());
                        break;
                    case R.id.navigation_home:
                        switchFragments(new HomeFragment());
                        Log.d("SWITCH_MENU","Switching");
                        break;
                    case R.id.navigation_medical_history:
                        switchFragments(new MedicalHistoryFragment());
                        break;
                    case R.id.navigation_profile:
                        switchFragments(new MyProfileFragment());
                        break;
                    case R.id.navigation_history:
                        switchFragments(new HistoryFragment());
                        break;

                }
                return true;
            }
        });
    }

    private void switchFragments(Fragment myFragment){

          getSupportFragmentManager().beginTransaction()
                  .replace(R.id.nav_host_fragment,myFragment)
                  .addToBackStack(null)
                  .commit();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.options_menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        switch (id){
            case R.id.item1:
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
