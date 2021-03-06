package moneytraker.com.moneytracker;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        final TabLayout tabs = (TabLayout) findViewById(R.id.tabs);
        final ViewPager pages = (ViewPager) findViewById(R.id.pages);

        pages.setAdapter(new MainPagerAdapter());
        tabs.setupWithViewPager(pages);


        //        final RecyclerView items = (RecyclerView) findViewById(R.id.items);
        //        items.setAdapter(new ItemsAdapter());

    }


    private class MainPagerAdapter extends FragmentPagerAdapter {
        private final String[] titles;

        MainPagerAdapter() {
            super(getSupportFragmentManager());
            titles = getResources().getStringArray(R.array.main_pager_titles);
        }

        @Override
        public Fragment getItem(int position) {
            final ItemsFragment fragment = new ItemsFragment();
            Bundle args = new Bundle();


            args.putString(ItemsFragment.ARG_TYPE, Item.TYPE_EXPENSE);
            fragment.setArguments(args);
            return fragment;

        }


        @Override
        public CharSequence getPageTitle(int position) {
            return titles[position];
        }

        @Override
        public int getCount() {
            return titles.length;
        }


    }
}
