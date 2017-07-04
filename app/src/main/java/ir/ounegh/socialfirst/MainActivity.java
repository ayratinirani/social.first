package ir.ounegh.socialfirst;

import android.support.annotation.IdRes;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.FrameLayout;

import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabSelectListener;

public class MainActivity extends AppCompatActivity {
   UserId user_id;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       user_id=new UserId(this);
        Toolbar toolbar= (Toolbar) findViewById(R.id.mytoolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setTitle("برنامه من");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        FrameLayout fl= (FrameLayout) findViewById(R.id.container);
   if(user_id.GetID()==1){
         getSupportFragmentManager().beginTransaction().replace(R.id.container,new LoginFragment()).commit();
    }else {

       setupBottom();

   }
    }

    private void setupBottom() {
        BottomBar bottomBar = (BottomBar) findViewById(R.id.bottomBar);
        bottomBar.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelected(@IdRes int tabId) {
                if (tabId == R.id.home) {
                    // The tab with id R.id.tab_favorites was selected,
                    // change your content accordingly.
                    getSupportFragmentManager().beginTransaction().replace(R.id.container,new HomeFragment()).commit();
                }
                if (tabId == R.id.profile) {
                    // The tab with id R.id.tab_favorites was selected,
                    // change your content accordingly.
                    getSupportFragmentManager().beginTransaction().replace(R.id.container,new ProfileFragment()).commit();
                }
                if (tabId == R.id.new_post) {
                    // The tab with id R.id.tab_favorites was selected,
                    // change your content accordingly.
                    getSupportFragmentManager().beginTransaction().replace(R.id.container,new NewPostFragment()).commit();
                }
                if (tabId == R.id.latest) {
                    // The tab with id R.id.tab_favorites was selected,
                    // change your content accordingly.
                    getSupportFragmentManager().beginTransaction().replace(R.id.container,new LatestActivitiesFragment()).commit();
                }
                if (tabId == R.id.search) {
                    // The tab with id R.id.tab_favorites was selected,
                    // change your content accordingly.
                    getSupportFragmentManager().beginTransaction().replace(R.id.container,new SearchFragment()).commit();
                }
            }
        });
    }
}
