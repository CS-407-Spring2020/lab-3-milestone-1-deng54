package com.example.lab3milestone1;

import androidx.appcompat.app.AppCompatDialogFragment;
import android.app.*;
import android.os.*;
import android.content.*;
import android.view.*;

public class ExampleDialog extends AppCompatDialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Information")
                .setMessage("This is a dialog")
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                @Override
                        public void onClick(DialogInterface dialogInterface, int i){

                }
            });
        return builder.create();

    }

}


