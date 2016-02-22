package org.geekteam.nplyon2016.nplyon2016.activities;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import org.geekteam.nplyon2016.nplyon2016.R;
import org.geekteam.nplyon2016.nplyon2016.fragments.DetailFragment;

/**
 * Created by Spider on 08/05/15.
 */
public class DetailFragmentActivity extends FragmentActivity{

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_detail);

        android.app.FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransacton = fragmentManager.beginTransaction();

        DetailFragment detailFragment = new DetailFragment();

        Bundle b = new Bundle();
        b.putSerializable("tip", getIntent().getSerializableExtra("tip"));
        detailFragment.setArguments(b);

        fragmentTransacton.add(R.id.details_fragment_container, detailFragment);
        fragmentTransacton.commit();
    }
}
