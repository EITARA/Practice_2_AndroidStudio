package ru.mirea.lomako.dialog;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.app.TimePickerDialog;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickShowDialog(View view) {
        AlertDialogFragment dialogFragment = new AlertDialogFragment();
        dialogFragment.show(getSupportFragmentManager(), "mirea");
    }
    public void onOkClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"Иду дальше\"!",
                Toast.LENGTH_LONG).show();
    }
    public void onCancelClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"Нет\"!",
                Toast.LENGTH_LONG).show();
    }
    public void onNeutralClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"На паузе\"!",
                Toast.LENGTH_LONG).show();
    }
    TimePickerDialog.OnTimeSetListener mTimeSetListener =
            new TimePickerDialog.OnTimeSetListener() {
                @Override
                public void onTimeSet(android.widget.TimePicker view,
                                      int hourOfDay, int minute) {
                    Log.i("",""+hourOfDay+":"+minute);
                }
            };
    public void onClickTimePickerDialog(View view) {
        DialogFragment timeFragment = new MyTimeDialogFragment();
        timeFragment.show(getSupportFragmentManager(), "timePicker");
    }
    public void  onClickDatePickerDialog(View view) {
        DialogFragment dateFragment = new MyDateDialogFragment();
        dateFragment.show(getSupportFragmentManager(), "datePicker");
    }
    public void  onClickProgressDialog(View view) {
        DialogFragment progressFragment = new MyProgressDialogFragment();
        progressFragment.show(getSupportFragmentManager(), "progress");
    }
}