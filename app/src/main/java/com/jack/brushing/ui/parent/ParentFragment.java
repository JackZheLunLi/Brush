package com.jack.brushing.ui.parent;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.jack.brushing.databinding.FragmentParentBinding;

public class ParentFragment extends Fragment {

    private FragmentParentBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ParentViewModel galleryViewModel =
                new ViewModelProvider(this).get(ParentViewModel.class);

        binding = FragmentParentBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textParent;
        galleryViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}