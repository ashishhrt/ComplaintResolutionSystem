package com.mask.activity.moderator;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.mask.R;

public class ModAssignFragment extends Fragment {

    ListView listViewModAssignedComplaint;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.activity_mod_assign, container, false);
        listViewModAssignedComplaint = (ListView)view.findViewById(R.id.listViewModAssignedComplaint);
        return view;
    }
}
