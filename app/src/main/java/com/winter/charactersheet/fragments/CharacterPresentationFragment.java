package com.winter.charactersheet.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.winter.charactersheet.R;
import com.winter.charactersheet.models.PlayerCharacter;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CharacterPresentationFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CharacterPresentationFragment extends Fragment {

    public CharacterPresentationFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment CharacterPresentationFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static CharacterPresentationFragment newInstance(String param1, String param2) {
        CharacterPresentationFragment fragment = new CharacterPresentationFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        String fileName = requireArguments().getString("fileName");
        PlayerCharacter c = null;
        try {
            c = parseCharacterFile(fileName);
        } catch (FileNotFoundException e) {
            //TODO: More meaningful exception handling
            e.printStackTrace();
        }
        fillCharacterSheet(c);
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_character_presentation, container, false);
    }

    private void fillCharacterSheet(PlayerCharacter c){
        //TODO: Get fields & populate
    }

    private PlayerCharacter parseCharacterFile(String fileName) throws FileNotFoundException {
        String json = getCharacterJson(fileName);
    }

    private String getCharacterJson(String fileName) throws FileNotFoundException {
        FileInputStream fis = getContext().openFileInput(fileName);
        InputStreamReader inputStreamReader = new InputStreamReader(fis, StandardCharsets.UTF_8);
        StringBuilder stringBuilder = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(inputStreamReader)) {
            String line = reader.readLine();
            while (line != null) {
                stringBuilder.append(line);
                line = reader.readLine();
            }
        } catch (IOException e) {
            // Error occurred when opening raw file for reading.
        }
        return stringBuilder.toString();
    }
}