package com.creative.share.apps.sheari.activities_fragments.home_activity.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.creative.share.apps.sheari.R;
import com.creative.share.apps.sheari.activities_fragments.home_activity.HomeActivity;
import com.creative.share.apps.sheari.databinding.FragmentHomeBinding;
import com.creative.share.apps.sheari.preferences.Preferences;

import java.util.Locale;

import io.paperdb.Paper;

public class Fragment_Home extends Fragment {
    private FragmentHomeBinding binding;
    private HomeActivity activity;
    private String lang;
    private Preferences preferences;

    public static Fragment_Home newInstance() {
        return new Fragment_Home();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false);
        View view = binding.getRoot();
        initView();
        return view;
    }

    private void initView() {
        preferences = Preferences.newInstance();
        activity = (HomeActivity) getActivity();
        Paper.init(activity);
        lang = Paper.book().read("lang", Locale.getDefault().getLanguage());




    }


}
