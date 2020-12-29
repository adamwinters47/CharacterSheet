package com.winter.charactersheet.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.winter.charactersheet.R;
import com.winter.charactersheet.enums.ClazzEnum;
import com.winter.charactersheet.enums.RaceEnum;
import com.winter.charactersheet.models.PlayerCharacter;

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

        EditText characterName = view.findViewById(R.id.edit_text_text_character_name);

        Spinner characterClazzSpinner = view.findViewById(R.id.spinner_character_clazz);
        List<String> characterClazzList = new ArrayList<>();
        for(ClazzEnum clazz : ClazzEnum.values()){
            characterClazzList.add(clazz.getClazzName());
        }
        ArrayAdapter<String> clazzAdapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_spinner_dropdown_item, characterClazzList);
        characterClazzSpinner.setAdapter(clazzAdapter);

        Spinner characterRaceSpinner = view.findViewById(R.id.spinner_character_race);
        List<String> characterRaceList = new ArrayList<>();
        for(RaceEnum race : RaceEnum.values()){
            characterRaceList.add(race.getRaceName());
        }
        ArrayAdapter<String> raceAdapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_spinner_dropdown_item, characterRaceList);
        characterRaceSpinner.setAdapter(raceAdapter);

        view.findViewById(R.id.btn_main_menu).setOnClickListener(view1 -> NavHostFragment.findNavController(CreateCharacterFragment.this)
                .navigate(R.id.action_create_character_to_landing));

        EditText characterAdditionalInfo = view.findViewById(R.id.edit_text_additional_character_info);
        Button saveCharacterButton = view.findViewById(R.id.button_save_character);
        saveCharacterButton.setOnClickListener(v -> {
            PlayerCharacter c = new PlayerCharacter();
            c.setClazz(characterClazzSpinner.getSelectedItem().toString());
            c.setRace(characterRaceSpinner.getSelectedItem().toString());
            c.setName(characterName.getText().toString());
            c.setAddlInfo(characterAdditionalInfo.getText().toString());
            characterAdditionalInfo.setText(c.toString());
        });
    }
}