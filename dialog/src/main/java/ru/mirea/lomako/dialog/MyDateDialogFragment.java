package ru.mirea.lomako.dialog;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.text.format.DateUtils;
import android.widget.DatePicker;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;

import java.util.Calendar;

public class MyDateDialogFragment extends DialogFragment {
    TextView currentDateTime;
    private DatePickerDialog.OnDateSetListener listener;

    Calendar dateAndTime = Calendar.getInstance();
    public void TimePickerFragment(TimePickerDialog.OnTimeSetListener listener) {
        this.listener = (DatePickerDialog.OnDateSetListener) listener;
    }
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        return new DatePickerDialog(getActivity(), listener, dateAndTime.get(Calendar.YEAR), dateAndTime.get(Calendar.MONTH),dateAndTime.get(Calendar.DAY_OF_MONTH));
    }

    private void setInitialDateTime() {

        currentDateTime.setText(DateUtils.formatDateTime(getActivity(),
                dateAndTime.getTimeInMillis(),
                DateUtils.FORMAT_SHOW_DATE | DateUtils.FORMAT_SHOW_YEAR
                        | DateUtils.FORMAT_SHOW_TIME));
    }

    DatePickerDialog.OnDateSetListener d = new DatePickerDialog.OnDateSetListener() {
        public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
            dateAndTime.set(Calendar.YEAR, year);
            dateAndTime.set(Calendar.MONTH, monthOfYear);
            dateAndTime.set(Calendar.DAY_OF_MONTH, dayOfMonth);
            setInitialDateTime();
        }
    };
}


