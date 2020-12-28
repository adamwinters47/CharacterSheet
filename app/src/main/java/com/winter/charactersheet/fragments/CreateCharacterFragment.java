package com.winter.charactersheet.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.winter.charactersheet.R;
import com.winter.charactersheet.enums.ClazzEnum;

import java.util.ArrayList;
import java.util.List;

public class CreateCharacterFragment extends Fragment {

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.create_character_fragment, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Spinner characterClazzSpinner = view.findViewById(R.id.spinner_character_clazz);

        List<String> characterClazzList = new ArrayList<>();
        for(ClazzEnum clazz : ClazzEnum.values()){
            characterClazzList.add(clazz.getClazzName());
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_spinner_dropdown_item, characterClazzList);
        characterClazzSpinner.setAdapter(adapter);
        view.findViewById(R.id.btn_main_menu).setOnClickListener(view1 -> NavHostFragment.findNavController(CreateCharacterFragment.this)
                .navigate(R.id.action_create_character_to_landing));
    }
}