package ru.mirea.lomako.dialog;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;

import java.util.Calendar;

public class MyProgressDialogFragment extends DialogFragment {
    private ProgressDialog listener;
    public void TimePickerFragment(TimePickerDialog.OnTimeSetListener listener) {
        this.listener = (ProgressDialog) listener;
    }
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        return new ProgressDialog(getActivity() );
    }
}
