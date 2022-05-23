package com.jack.brushing.ui.set;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.jack.brushing.databinding.FragmentSetBinding;

public class SetFragment extends Fragment {

    private FragmentSetBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        SetViewModel slideshowViewModel =
                new ViewModelProvider(this).get(SetViewModel.class);

        binding = FragmentSetBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textSet;
        slideshowViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}