package picodiploma.dicoding.tablayoutdenganfragment;

import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private AppBarLayout appBarLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        tabLayout = findViewById( R.id.tabLayout_id );
        appBarLayout = findViewById( R.id.appbar_id );
        viewPager = findViewById( R.id.viewpager_id );

        ViewPagerAdapter adapter = new ViewPagerAdapter( getSupportFragmentManager());
//        adding fragments
        adapter.AddFragment( new FragmentQuiz(),"Quiz" );
        adapter.AddFragment( new ExploreFragment(),"Explore" );
        adapter.AddFragment( new FragmentStore(),"Store" );
//        adpter Setup
        viewPager.setAdapter( adapter );
        tabLayout.setupWithViewPager( viewPager );
    }
}
