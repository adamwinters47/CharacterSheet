package com.winter.charactersheet.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.winter.charactersheet.R;

public class LandingFragment extends Fragment {

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.landing_fragment, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.button_create).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(LandingFragment.this)
                        .navigate(R.id.action_landing_to_create_character);
            }
        });
    }
    /*
    Reference for how to load list of fileNames
                  String[] files = getContext().fileList();
                StringBuilder fileList = new StringBuilder();
                for(String file : files){
                    fileList.append(file + "\n");
                }
                characterAdditionalInfo.setText(fileList);
      Reference for retrieving the JSON from a specific filename
      private String fetchFileContents() throws FileNotFoundException {
        FileInputStream fis = getContext().openFileInput("Adam");
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
     */
}